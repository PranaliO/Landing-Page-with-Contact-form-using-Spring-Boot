package com.example.landingpage;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class Landingpagecontroller {
    
    @PostMapping("/contact")
    public String receiveContact(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String message
    ) {

        System.out.println("------ Contact Form Data ------");
        System.out.println("Name    : " + name);
        System.out.println("Email   : " + email);
        System.out.println("Message : " + message);
        System.out.println("--------------------------------");

        return "Message received successfully!";
    }
}
