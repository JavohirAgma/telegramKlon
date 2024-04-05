package uz.pdp.backend.model.user;

import uz.pdp.backend.model.BaseModel;

public class User extends BaseModel {
    private String userName;
    private Integer password;
    private Integer number;

    public User (String userName, Integer number,Integer password) {
        this.userName = userName;
        this.number = number;
        this.password = password;
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

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }
}
