package com.anggaari.learnspring;

import com.anggaari.learnspring.listeners.LoginSuccessListener;
import com.anggaari.learnspring.listeners.SendEmailUserLoginListener;
import com.anggaari.learnspring.listeners.UserListener;
import com.anggaari.learnspring.services.AuthService;
import com.anggaari.learnspring.services.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

public class EventListenerTest {

    @Configuration
    @Import({
        UserService.class,
        LoginSuccessListener.class,
        SendEmailUserLoginListener.class,
        UserListener.class,
    })
    public static class TestConfiguration {

    }

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testEvent() {
        UserService userSer = applicationContext.getBean(UserService.class);
        userSer.login("angga", "anggaari");
        userSer.login("angga", "angga123");
    }
}
