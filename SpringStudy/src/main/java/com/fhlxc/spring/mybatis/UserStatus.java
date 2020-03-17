package com.fhlxc.spring.mybatis;

/**
* @author Xingchao Long
* @date 2020年2月5日 下午5:13:49
* @ClassName UserStatus
* @Description 
*/

public enum UserStatus {
    
    DISABLED(0),
    AVAILABLE(1);
    
    private int status;
    
    private UserStatus(int status) {
        this.status = status;
    }
    
    public int getStatus() {
        return status;
    }
    
    public static UserStatus fromValue(int value) {
        for(UserStatus userState:UserStatus.values()) {
            if(userState.status==value) {
                return userState;
            }
        }
        throw new IllegalArgumentException("Cannot create evalue from value: " + value + "!");
    }
    
}
