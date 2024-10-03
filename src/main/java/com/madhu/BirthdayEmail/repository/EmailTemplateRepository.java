package com.madhu.BirthdayEmail.repository;

//generate email template repository interface which extends JPA repository
import com.madhu.BirthdayEmail.entity.EmailTemplate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailTemplateRepository extends JpaRepository<EmailTemplate, Integer> {
    EmailTemplate findEmailTemplateByTemplateName(String birthday);
}

