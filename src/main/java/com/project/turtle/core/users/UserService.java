package com.project.turtle.core.users;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public LoginModel verifyAccount(UserCredentials user){
        Optional<Integer> loginTry =  userRepository.findByEmail(user.getEmail(),user.getPass());
        LoginModel login = new LoginModel();
        if (loginTry.isEmpty()){
            login.setMsg("Error Invalid Username Password");
        }else{
            login.setMsg("Login Successfull");
            login.setSessionUserId(1);
            login.setCount_user_store(1);
            login.setStore_id(1);
        }
        return login;
    }

    
}
