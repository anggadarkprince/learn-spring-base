package com.anggaari.learnspring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
    "com.anggaari.learnspring.configurations"
})
public class ScanConfiguration {
}
