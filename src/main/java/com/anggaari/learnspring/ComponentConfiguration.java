package com.anggaari.learnspring;

import com.anggaari.learnspring.data.MultiFoo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {
    "com.anggaari.learnspring.services",
    "com.anggaari.learnspring.repositories",
    "com.anggaari.learnspring.configurations",
})
@Import(MultiFoo.class)
public class ComponentConfiguration {
}
