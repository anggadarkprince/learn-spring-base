package com.anggaari.learnspring;

import com.anggaari.learnspring.data.Connection;
import com.anggaari.learnspring.data.Server;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifecycleTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @AfterEach
    void tearDown() {
        //applicationContext.close();
    }

    @Test
    void testConnection() {
        applicationContext.getBean(Connection.class);
    }

    @Test
    void testServer() {
        applicationContext.getBean(Server.class);
    }
}
