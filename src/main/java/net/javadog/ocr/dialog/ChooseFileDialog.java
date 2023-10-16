package net.javadog.ocr.dialog;

import net.javadog.ocr.main.MainContainer;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import java.io.File;

/**
 * 选择文件弹出框
 *
 * @author: javadog
 **/
public class ChooseFileDialog {

    /**
     * 获取文件路径
     * @param mainContainer
     * @return String
     */
    public static String getFilePath(MainContainer mainContainer){
        String filePath = "";
        // 文件选择器
        JFileChooser fileChooser = new JFileChooser();
        if (filePath == null || filePath.length() == 0) {
            FileSystemView fsv = fileChooser.getFileSystemView();
            // 设置桌面为当前文件路径
            fileChooser.setCurrentDirectory(fsv.getHomeDirectory());
        } else {
            // 设置上一次选择路径为当前文件路径
            File file = new File(filePath);
            File parentFile = file.getParentFile();
            if (parentFile == null) {
                fileChooser.setCurrentDirectory(file);
            } else {
                fileChooser.setCurrentDirectory(parentFile);
            }
        }
        // 可选文件夹和文件-默认文件
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        // 设置多选-默认false
        fileChooser.setMultiSelectionEnabled(false);
        // 不显示所有文件的下拉选
        fileChooser.removeChoosableFileFilter(fileChooser.getAcceptAllFileFilter());
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("选择图片", "TIFF", "JPG", "GIF", "PNG", "BMP"));
        int result = fileChooser.showOpenDialog(mainContainer);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            filePath = selectedFile.getAbsolutePath();
        }
        return filePath;
    }
}
