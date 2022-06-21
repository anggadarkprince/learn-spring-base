package com.anggaari.learnspring;

import com.anggaari.learnspring.application.FooApplication;
import com.anggaari.learnspring.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = FooApplication.class)
public class FooApplicationTest {
    
    @Autowired
    Foo foo;

    @Test
    void testSpringBootApp() {
        Assertions.assertNotNull(foo);
    }
}
