package com.openapi.builder2;

import com.openapi.builder.Address;

import java.time.LocalDate;
import java.time.Period;

//Product class
public class UserDTO {

    private String name;
    private String address;
    private String age;

    public String name() {
        return name;
    }

    public String address() {
        return address;
    }

    public String age() {
        return age;
    }

    private void setAge(String age) {
        this.age = age;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    private void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    // Get builder instance
    public static UserDTOBuilder builder() {
        return new UserDTOBuilder();
    }

    // Builder
    public static class UserDTOBuilder{

        private String firstName;
        private String lastName;
        private String age;
        private String address;
        private UserDTO userDTO;

        public UserDTOBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserDTOBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserDTOBuilder withBirthday(LocalDate date) {
            age = Integer.toString(Period.between(date, LocalDate.now()).getYears());
            return this;
        }

        public UserDTOBuilder withAddress(Address address) {
            this.address = address.getHouseNumber() + ", " + address.getStreet() + ", " + address.getCity() +
                    "\n" + address.getState() + ", " + address.getZipcode();
            return this;
        }

        public UserDTO build(){
            this.userDTO = new UserDTO();
            userDTO.setAge(age);
            userDTO.setAddress(address);
            userDTO.setName(firstName + " " + lastName);
            return this.userDTO;
        }

        public UserDTO getUserDTO() {
            return this.userDTO;
        }
    }
}
