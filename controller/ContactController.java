package com.example.landingpage.controller;

import com.example.landingpage.entity.Contact;
import com.example.landingpage.repository.ContactRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ContactController {

    private final ContactRepository contactRepository;

    public ContactController(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    // TASK 2 - Save Contact (Already working)
    @PostMapping("/contact")
    public String saveContact(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String message) {

        Contact contact = new Contact();
        contact.setName(name);
        contact.setEmail(email);
        contact.setMessage(message);

        contactRepository.save(contact);

        return "redirect:/";
    }

    // ⭐ TASK 3 - GET ALL CONTACTS AS JSON
   @GetMapping("/contacts")
   @ResponseBody
   public List<Contact> getAllContacts() {
      return contactRepository.findAll();
    }
 
}
