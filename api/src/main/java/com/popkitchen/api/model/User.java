package com.popkitchen.api.model;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class User {
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private String password;
    private Date dateOfBirth;
    private String phoneNumber;


}
