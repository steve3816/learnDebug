package com.steve.learnHowToRun.service;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ShowService {
    String z;

    @Value("${steve.name}")
    String steveName;

    @Value("${java.version}")
    String javaVersion;

    @Value("${java.home}")
    String javaHome;

    @Value("${STEVE_SECOND_NAME}")
    String steveSecondName;

    @Value("${steve.third.name}")
    String steveThirdName;

    @Autowired
    Environment environment;

    @PostConstruct
    public void init(){
        log.info("steve name: {}", steveName);
        log.info("java version: {}", javaVersion);
        log.info("java home: {}", javaHome);
        log.info("steve second name: {}", steveSecondName);
        log.info("steve third name: {}", steveThirdName);
        log.info("用environment抓：" + environment.getProperty("steve.name"));
    }
}
