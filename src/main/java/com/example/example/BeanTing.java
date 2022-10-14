package com.example.example;

import java.util.HashMap;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

public class BeanTing extends ActionSupport {

    public UModel uModelGenerator(int userId) {
        UModel tempUserModel = new UModel();
        Map<String, String> tempMap = new HashMap<String, String>();

        System.out.println("WE'RE IN uModelGenerator with userId val of :" + userId);

        switch(userId) {
            case 0: {
                System.out.println("You're in 0");
                tempMap.put("Owner", "User0");
                tempMap.put("Description", "A quick brown fox");
                break;
            }
            case 1: {
                System.out.println("You're in 1");
                tempMap.put("Owner", "User1");
                tempMap.put("Description", "The lazy dog");
                break;
            }

            default: {
                System.out.println("You're in DEFAULT");
                tempMap.put("Owner", "NOT FOUND");
            }
        }

        System.out.println("We're initializing.");

        tempUserModel.setId(userId);
        tempUserModel.setName("User" + userId);
        tempUserModel.setObjects(tempMap);

        return tempUserModel;

    }

    private int userId;
    private String valueStackCheck = "This is in the value stack.";
    private UModel userModel;
    
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        System.out.println("SET USER ID:" + getUserId());
        this.userId = userId;
        setUserModel(uModelGenerator(this.userId));
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
