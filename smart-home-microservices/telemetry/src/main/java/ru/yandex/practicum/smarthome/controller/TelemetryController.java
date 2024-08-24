package ru.yandex.practicum.smarthome.controller;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.yandex.practicum.smarthome.entity.TemperatureSensor;
import ru.yandex.practicum.smarthome.service.TelemetryService;

import java.util.List;

@RestController
@RequestMapping("/telemetry")
@RequiredArgsConstructor
public class TelemetryController {

    private final TelemetryService telemetryService;

    private static final Logger logger = LoggerFactory.getLogger(TelemetryController.class);

    @GetMapping("/{sensor_id}/latest")
    public ResponseEntity<TemperatureSensor> getLatestTelemetry(@PathVariable("sensor_id") Long id) {
        logger.info("Fetching last telemetry record for sensor with id {} ", id);
        return ResponseEntity.ok(telemetryService.getLastTelemetry(id));
    }

    @GetMapping("/{sensor_id}")
    public ResponseEntity<List<TemperatureSensor>> getTelemetryHystory(@PathVariable("sensor_id") Long id) {
        logger.info("Fetching telemetry records for sensor with id {}", id);
        return ResponseEntity.ok(telemetryService.getTelemetryHistory(id));
    }
}
