package com.anggaari.learnspring;

import com.anggaari.learnspring.data.Bar;
import com.anggaari.learnspring.data.Foo;
import com.anggaari.learnspring.scope.DoubletonScope;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@Slf4j
public class ScopeConfiguration {

    @Bean
    @Scope("prototype") // default singleton, prototype is always create when accessed
    public Foo foo() {
        log.info("Create new foo");
        return new Foo();
    }

    @Bean
    public CustomScopeConfigurer customScopeConfigurer() {
        CustomScopeConfigurer configurer = new CustomScopeConfigurer();
        configurer.addScope("doubleton", new DoubletonScope());
        return configurer;
    }

    @Bean
    @Scope("doubleton")
    public Bar bar() {
        log.info("Create new Bar");
        return new Bar();
    }
}
