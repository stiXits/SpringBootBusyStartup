package com.example.demo;

import com.google.common.collect.ImmutableList;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Slf4j
@Component
public class Config {

    @Bean
    public InhibitAutostartLifecycleProcessor lifecycleProcessor() {
        InhibitAutostartLifecycleProcessor inhibitAutostartLifecycleProcessor = new
            InhibitAutostartLifecycleProcessor();
        inhibitAutostartLifecycleProcessor.disableAutostart(ImmutableList.of("inputBindingLifecycle"));
        return inhibitAutostartLifecycleProcessor;
    }
}
