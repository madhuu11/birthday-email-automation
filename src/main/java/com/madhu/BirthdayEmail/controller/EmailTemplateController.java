package com.madhu.BirthdayEmail.controller;

//generate rest controller email template controller class with request mapping /email-template
import com.madhu.BirthdayEmail.Service.EmailTemplateService;
import com.madhu.BirthdayEmail.entity.EmailTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/email-template")
public class EmailTemplateController {

    // Autowire email template service
    @Autowired
    private EmailTemplateService emailTemplateService;

    // Generate get mapping /all to get all email template details and return email template details
    @GetMapping("/all")
    public ResponseEntity<List<EmailTemplate>> getAllEmailTemplateDetails() {
        // Call get all email template details method from email template service
        List<EmailTemplate> emailTemplateDetails = emailTemplateService.getAllEmailTemplates();
        // Return response entity with email template details
        return ResponseEntity.ok(emailTemplateDetails);
    }

    // Create post mapping /add to add email template details and return nothing
    @PostMapping("/addEmailTemplate")
    public ResponseEntity<Void> addEmailTemplate(@RequestBody EmailTemplate emailTemplate) {
        // Call add email template method from email template service
        emailTemplateService.addEmailTemplate(emailTemplate);
        // Return response entity with message
        return ResponseEntity.ok().build();
    }

    // Create get mapping /get-by-id to get email template details by id and return email template details
    @GetMapping("/get-by-id/{id}")
    public ResponseEntity<EmailTemplate> getEmailTemplateById(@PathVariable int id) {
        // Call get email template by id method from email template service
        EmailTemplate emailTemplate = emailTemplateService.getEmailTemplateById(id);
        // Return response entity with email template details
        return ResponseEntity.ok(emailTemplate);
    }

    // Create put mapping /update to update email template details and return nothing
    @PutMapping("/update")
    public ResponseEntity<Void> updateEmailTemplate(@RequestBody EmailTemplate emailTemplate) {
        // Call update email template method from email template service
        emailTemplateService.updateEmailTemplate(emailTemplate);
        // Return response entity with message
        return ResponseEntity.ok().build();
    }

    // Create delete mapping /delete to delete email template details and return nothing
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteEmailTemplate(@PathVariable int id) {
        // Call delete email template method from email template service
        emailTemplateService.deleteEmailTemplate(id);
        // Return response entity with message
        return ResponseEntity.ok().build();
    }

    //create get mapping /get-by-name to get email template details by name and return email template details
    @GetMapping("/get-by-name/{templateName}")
    public ResponseEntity<EmailTemplate> getEmailTemplateByName(@PathVariable String templateName) {
        // Call get email template by name method from email template service
        EmailTemplate emailTemplate = emailTemplateService.getEmailTemplateByName(templateName);
        // Return response entity with email template details
        return ResponseEntity.ok(emailTemplate);
    }

}