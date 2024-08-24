package ru.yandex.practicum.smarthome.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.yandex.practicum.smarthome.entity.TemperatureSensor;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TelemetryServiceImpl implements TelemetryService {

    //private final TemperatureSensorRepository temperatureSensorRepository;
    //TODO add kafka consumer here
    @Override
    public TemperatureSensor getLastTelemetry(Long id) {
//        TemperatureSensor temperatureSensor = temperatureSensorRepository.findById(id)
//                .orElseThrow(() -> new RuntimeException("TemperatureSensor not found"));
        return TemperatureSensor.builder()
                .id(1L)
                .currentTemperature(24.6)
                .lastUpdated(LocalDateTime.now())
                .build();
    }

    @Override
    public List<TemperatureSensor> getTelemetryHistory(Long id) {
//        TemperatureSensor temperatureSensor = temperatureSensorRepository.findById(id)
//                .orElseThrow(() -> new RuntimeException("TemperatureSensor not found"));
        return Arrays.asList(TemperatureSensor.builder()
                .id(1L)
                .currentTemperature(24.6)
                .lastUpdated(LocalDateTime.now())
                .build());
    }
}