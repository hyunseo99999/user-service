package com.example.userservice.vo;


import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class RequestLogin {

    @NotNull(message = "Eamil cannot be null")
    @Size(min = 2, message = "Eamil not be less then two characters")
    @Email
    private String email;

    @NotNull(message = "Password cannot be null")
    @Size(min = 8, message = "Password not equals or grater than 8 characters")
    private String password;

}
