package com.anggaari.learnspring;

import com.anggaari.learnspring.configurations.BarConfiguration;
import com.anggaari.learnspring.configurations.FooConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
    FooConfiguration.class,
    BarConfiguration.class,
})
public class MainConfiguration {
}
