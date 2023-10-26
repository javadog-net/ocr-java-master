package net.javadog.ocr;

import net.javadog.ocr.main.MainContainer;
import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 启动类
 *
 * @author javadog
 */
public class Application {

    public static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        // 初始化
        init();
        // 窗口
        new MainContainer();
        // 打印信息
        info();
    }

    static void init(){
        BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.generalNoTranslucencyShadow;
        try {
            BeautyEyeLNFHelper.launchBeautyEyeLNF();
        } catch (Exception e) {
            log.info("启动异常,{}",e.getMessage(),e);
            e.printStackTrace();
        }
    }

    static void info() {
        log.info("\n----------------------------------------------------------\n\t" +
                "欢迎访问  \thttps://www.javadog.net\n\t" +
                "当前程序【" + "javadog-百度ocr图片识别" + "】环境已启动! 地址如下:\n\t" +
                "----------------------------------------------------------");
    }

}
