package com.company.singleresp;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.fasterxml.jackson.databind.ObjectMapper;

//Handles incoming JSON requests that work on User resource/entity
public class UserController {

    private final UserPersistenceService userPersistenceService = new UserPersistenceService();

    //Create a new user
    public String createUser(String userJson) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        User user = mapper.readValue(userJson, User.class);

        UserValidator validator = new UserValidator();
        Boolean valid = validator.validateUser(user);

        if (Boolean.FALSE.equals(valid)) {
            return "ERROR";
        }

        userPersistenceService.saveUser(user);

        return "SUCCESS";
    }


}