package com.madhu.BirthdayEmail.controller;

import com.madhu.BirthdayEmail.Service.BirthdayEmailService;
import com.madhu.BirthdayEmail.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//generate rest controller birthday email controller class with request mapping /birthday-email
@RestController
@RequestMapping("/birthday-email")
public class BirthdayEmailController {

    // Autowire birthday email service
    @Autowired
    private BirthdayEmailService birthdayEmailService;

    // Generate get mapping /send
    @GetMapping("/send")
    public ResponseEntity<String> sendBirthdayEmail() {
        // Call send birthday email method from birthday email service
        birthdayEmailService.sendEmail();
        // Return response entity with message
        return ResponseEntity.ok("Birthday Email Sent Successfully");
    }

    //generate get mapping /all  to get all user details and return user details
    @GetMapping("/allUserDetails")
    public ResponseEntity<List<User>> getAllUserDetails() {
        // Call get all user details method from birthday email service
        List<User> userDetails = birthdayEmailService.getAllUsers();
        // Return response entity with user details
        return ResponseEntity.ok(userDetails);
    }

    //create post mapping /addUser to add user details and return nothing
    @PostMapping("/addUser")
    public ResponseEntity<Void> addUser(@RequestBody User user) {
        // Call add user method from birthday email service
        birthdayEmailService.addUser(user);
        // Return response entity with message
        return ResponseEntity.ok().build();
    }

    //create get mapping /user/birthdayDay to get user details by birthday day and return user details
    @GetMapping("/user/birthdayToday")
    public ResponseEntity<List<User>> getUserByBirthdayDay() {
        // Call get user by birthday day method from birthday email service
        List<User> userDetails = birthdayEmailService.getBirthdayToday();
        // Return response entity with user details
        return ResponseEntity.ok(userDetails);
    }

}
