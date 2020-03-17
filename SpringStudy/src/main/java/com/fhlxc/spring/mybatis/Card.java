package com.fhlxc.spring.mybatis;

/**
* @author Xingchao Long
* @date 2020年2月9日 下午5:09:56
* @ClassName Card
* @Description 
*/

public class Card {
    
    private int id;
    private String cardNo;
    private String city;
    private String address;
    private int userId;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Card [id=" + id + ", cardNo=" + cardNo + ", city=" + city + ", address=" + address + ", userId=" + userId + "]";
    }
    
}
