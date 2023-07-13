package com.ithema.studentsystem;


public class User {
    private String username;
    private String password;
    private String cardId;
    private String phoneNo;

    public User() {
    }

    public User(String username, String password, String cardId, String phoneNo) {
        this.username = username;
        this.password = password;
        this.cardId = cardId;
        this.phoneNo = phoneNo;
    }

    /**
     * 获取
     *
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     *
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     *
     * @return cardId
     */
    public String getCardId() {
        return cardId;
    }

    /**
     * 设置
     *
     * @param cardId
     */
    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    /**
     * 获取
     *
     * @return phoneNo
     */
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * 设置
     *
     * @param phoneNo
     */
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String toString() {
        return "User{username = " + username + ", password = " + password + ", cardId = " + cardId + ", phoneNo = " + phoneNo + "}";
    }
}
