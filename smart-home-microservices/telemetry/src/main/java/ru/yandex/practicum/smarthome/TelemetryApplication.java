package ru.yandex.practicum.smarthome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableSwagger2
public class TelemetryApplication {
    public static void main(String[] args) {
        SpringApplication.run(TelemetryApplication.class, args);
    }
}
