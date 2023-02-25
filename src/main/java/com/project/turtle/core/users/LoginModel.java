package com.project.turtle.core.users;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class LoginModel {

    @Getter @Setter
    private String msg;

    @Getter @Setter
    private int sessionUserId;

    @Getter @Setter
    private int count_user_store;

    @Getter @Setter
    private int store_id;

    @Getter @Setter
    private int errorMsg;

    
}
