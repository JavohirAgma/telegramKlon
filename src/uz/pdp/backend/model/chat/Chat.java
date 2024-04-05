package uz.pdp.backend.model.chat;

import uz.pdp.backend.model.BaseModel;


public class Chat extends BaseModel {
    private String userName;
    private Integer number;
    private String texts;

    public Chat(String userName, Integer number) {
        this.userName = userName;
        this.number = number;
        this.texts="";
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getTexts() {
        return texts;
    }

    public void setTexts(String texts) {
        this.texts = texts;
    }
}
