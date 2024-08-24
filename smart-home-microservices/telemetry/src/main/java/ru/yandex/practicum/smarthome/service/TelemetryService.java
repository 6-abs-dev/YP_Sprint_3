package ru.yandex.practicum.smarthome.service;

import ru.yandex.practicum.smarthome.entity.TemperatureSensor;

import java.util.List;

public interface TelemetryService {
    TemperatureSensor getLastTelemetry(Long id);
    List<TemperatureSensor> getTelemetryHistory(Long id);
}