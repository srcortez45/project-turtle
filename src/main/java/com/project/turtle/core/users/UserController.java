package com.project.turtle.core.users;

import java.util.Map;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@RequestMapping(path="/user")
public class UserController {

    
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @CrossOrigin
    @RequestMapping(value = "/verifyAccount", method = RequestMethod.POST,consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE,
        MediaType.MULTIPART_FORM_DATA_VALUE}, produces = MediaType.APPLICATION_JSON_VALUE)
    public LoginModel verifyAccount(@RequestParam Map<String, String> user){
        UserCredentials userCredentials = new UserCredentials(user.get("username"),user.get("password"));
        log.error(userCredentials.toString());
        return userService.verifyAccount(userCredentials);
    }

}
