package com.madhu.BirthdayEmail.Scheduler;
//add the required imports
import com.madhu.BirthdayEmail.Service.BirthdayEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Component
public class JobSchedular {
//auto-wire the service class
    @Autowired
    private BirthdayEmailService birthdayEmailService;

    // generate a cron expression is run every 1 min
    @Scheduled(cron = "0 0/1 * 1/1 * ?")
    public void scheduleTaskWithCronExpression() {
        // call service method sendEmail
        System.out.println("Cron Task :: Execution Start Time - " + LocalDateTime.now());
        birthdayEmailService.sendEmail();
        System.out.println("Cron Task :: Execution End Time - " + LocalDateTime.now());
    }
}
