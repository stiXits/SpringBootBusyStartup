package com.example.demo;

import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class Runner implements ApplicationRunner {

    private final InhibitAutostartLifecycleProcessor lifecycleProcessor;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("Runner...");

        Thread.sleep(10000);
        log.info("...Runner");
        lifecycleProcessor.clear();
        lifecycleProcessor.start();
    }
}
