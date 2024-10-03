package com.madhu.BirthdayEmail.entity;
//define entity class for email template with id, templateName, subject, body and with required annotations
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EmailTemplate {
    //make the id field as primary key using generated value
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String templateName;
    private String subject;
    private String body;

    public EmailTemplate(int id, String templateName, String subject, String body) {
        this.id = id;
        this.templateName = templateName;
        this.subject = subject;
        this.body = body;
    }

    public int getId() {
        return id;
    }

    public void setId(){
        this.id = id;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    //getter and setter methods for body
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

}
