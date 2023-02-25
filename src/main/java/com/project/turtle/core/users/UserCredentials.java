package com.project.turtle.core.users;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserCredentials {

    @Getter @Setter
    private String email;

    @Getter @Setter
    private String pass;
    
}
