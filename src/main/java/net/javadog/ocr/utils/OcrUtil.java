package net.javadog.ocr.utils;

import okhttp3.*;
import org.json.JSONObject;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Base64;

/**
 * 百度ocr识别工具
 *
 * @author: javadog
 **/
public class OcrUtil {

    /**
     * 百度OCR API_KEY
     * 替换成你自己的API_KEY，在百度云上可以免费申请
     */
    private static final String API_KEY = "xxx";

    /**
     * 百度OCR SECRET_KEY
     * 替换成你自己的SECRET_KEY，在百度云上可以免费申请
     */
    private static final String SECRET_KEY = "xxx";

    /**
     * OkHttpClient
     */
    private static final OkHttpClient HTTP_CLIENT = new OkHttpClient().newBuilder().build();

    /**
     * 识别
     */
    public static String ocrSense(BufferedImage targetImage){
        MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
        Request request = null;
        String text = "";
        try {
            final String s = bufferedImageToBase64(targetImage);
            RequestBody body = RequestBody.create(mediaType, "image=" + s);
            request = new Request.Builder()
                    .url("https://aip.baidubce.com/rest/2.0/ocr/v1/general_basic?access_token=" + getAccessToken())
                    .method("POST", body)
                    .addHeader("Content-Type", "application/x-www-form-urlencoded")
                    .addHeader("Accept", "application/json")
                    .build();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Response response = null;
        try {
            response = HTTP_CLIENT.newCall(request).execute();
            text = response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }

    /**
     * BufferedImage 编码转换为 base64
     * @param bufferedImage
     * @return
     */
    private static String bufferedImageToBase64(BufferedImage bufferedImage) throws UnsupportedEncodingException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            ImageIO.write(bufferedImage, "jpg", baos);
        } catch (IOException e) {
            e.printStackTrace();
        }
        byte[] bytes = baos.toByteArray();
        String base64 = Base64.getEncoder().encodeToString(bytes);
        base64 = URLEncoder.encode(base64, "utf-8");
        return base64;
    }

    /**
     * 从用户的AK，SK生成鉴权签名（Access Token）
     *
     * @return 鉴权签名（Access Token）
     * @throws IOException IO异常
     */
    static String getAccessToken() throws IOException {
        MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
        RequestBody body = RequestBody.create(mediaType, "grant_type=client_credentials&client_id=" + API_KEY
                + "&client_secret=" + SECRET_KEY);
        Request request = new Request.Builder()
                .url("https://aip.baidubce.com/oauth/2.0/token")
                .method("POST", body)
                .addHeader("Content-Type", "application/x-www-form-urlencoded")
                .build();
        Response response = HTTP_CLIENT.newCall(request).execute();
        return new JSONObject(response.body().string()).getString("access_token");
    }

}
