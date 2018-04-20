package com.example.music.dto;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by Administrator on 2018/4/7 0007.
 */
public class User {
    @NotEmpty(message="用户名不能为空")
    private String userName;

    @NotEmpty(message="密码不能为空")
    @Length(min=6, message="密码长度不能少于六位")
    private String passowrd;


    public String getUserName() {
        return userName;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassowrd() {
        return passowrd;
    }

    public void setPassowrd(String passowrd) {
        this.passowrd = passowrd;
    }
}
