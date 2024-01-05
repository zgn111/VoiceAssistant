package edu.njnu.voiceassistantbe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("edu.njnu.voiceassistantbe.controller")
@ComponentScan("edu.njnu.voiceassistantbe.service")
@ComponentScan("edu.njnu.voiceassistantbe.listener")
@ComponentScan("edu.njnu.voiceassistantbe.utils")
@ComponentScan("edu.njnu.voiceassistantbe.mapper")
@ComponentScan("edu.njnu.voiceassistantbe.cors")
public class VoiceAssistantBeApplication {

    public static void main(String[] args) {
        SpringApplication.run(VoiceAssistantBeApplication.class, args);
    }

}
