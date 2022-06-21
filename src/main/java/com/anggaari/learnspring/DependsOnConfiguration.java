package com.anggaari.learnspring;

import com.anggaari.learnspring.data.Bar;
import com.anggaari.learnspring.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.*;

@Configuration
@Slf4j
public class DependsOnConfiguration {

    @Lazy
    @Bean
    @DependsOn({
        "bar"
    })
    public Foo foo() {
        log.info("Create new foo");
        return new Foo();
    }

    @Bean
    public Bar bar() {
        log.info("Create new bar");
        return new Bar();
    }
}
