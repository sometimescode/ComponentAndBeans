package com.example.example;

import java.util.HashMap;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

public class BeanTing extends ActionSupport {

    public BeanTing() {
        setUserModel(uModelGenerator(getUserId()));
    }

    public UModel uModelGenerator(int userId) {
        UModel tempUserModel = new UModel();
        Map<String, String> tempMap = new HashMap<String, String>();

        switch(userId) {
            case 0: {
                tempMap.put("Owner", "User0");
                tempMap.put("Description", "A quick brown fox");
                break;
            }
            case 1: {
                tempMap.put("Owner", "User1");
                tempMap.put("Description", "The lazy dog");
                break;
            }

            default: {
                tempMap.put("Owner", "NOT FOUND");
            }
        }

        tempUserModel.setId(userId);
        tempUserModel.setName("User" + userId);
        tempUserModel.setObjects(tempMap);

        return tempUserModel;

    }

    private int userId;
    private String valueStackCheck = "cHANGE val checker";
    private UModel userModel;
    
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getValueStackCheck() {
        return valueStackCheck;
    }

    public void setValueStackCheck(String valueStackCheck) {
        this.valueStackCheck = valueStackCheck;
    }

    public UModel getUserModel() {
        return userModel;
    }

    public void setUserModel(UModel userModel) {
        this.userModel = userModel;
    }

    

    

    

    
    
}
