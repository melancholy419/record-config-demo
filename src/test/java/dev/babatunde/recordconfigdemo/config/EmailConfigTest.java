package dev.babatunde.recordconfigdemo.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmailConfigTest {

    @Autowired
    private EmailConfig emailConfig;


    @Test
    public void verifyEmailConfig(){
        String senderEmail = emailConfig.senderEmail();
        String senderName = emailConfig.senderName();

        assertEquals("test@test.com",senderEmail);
        assertEquals("Test Test",senderName);
    }

}