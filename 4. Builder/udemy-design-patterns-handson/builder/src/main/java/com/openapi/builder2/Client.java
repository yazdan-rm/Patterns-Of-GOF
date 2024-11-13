package com.openapi.builder2;


import com.openapi.builder.User;

public class Client {

    public static void main(String[] args) {

        User user = createUser();

        UserDTO dto = directBuild(UserDTO.builder(), user);
        System.out.println(dto);

    }

     private static UserDTO directBuild(UserDTO.UserDTOBuilder builder, User user) {
        return builder
                .withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withBirthday(user.getBirthday())
                .withAddress(user.getAddress())
                .build();
     }

    public static User createUser() {
        return com.openapi.builder.Client.createUser();
    }
}
