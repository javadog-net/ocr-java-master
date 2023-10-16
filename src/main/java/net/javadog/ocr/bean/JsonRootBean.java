package net.javadog.ocr.bean;

import java.util.List;

/**
 * 百度ocr-JsonRootBean
 *
 * @author: javadog
 **/
public class JsonRootBean {
    private List<Words_result> words_result;
    private int words_result_num;
    private long log_id;
    public void setWords_result(List<Words_result> words_result) {
        this.words_result = words_result;
    }
    public List<Words_result> getWords_result() {
        return words_result;
    }

    public void setWords_result_num(int words_result_num) {
        this.words_result_num = words_result_num;
    }
    public int getWords_result_num() {
        return words_result_num;
    }

    public void setLog_id(long log_id) {
        this.log_id = log_id;
    }
    public long getLog_id() {
        return log_id;
    }

    public class Words_result {

        private String words;
        public void setWords(String words) {
            this.words = words;
        }
        public String getWords() {
            return words;
        }
    }
}


