package ru.yandex.practicum.smarthome.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TemperatureSensor {

    private Long id;

    private double currentTemperature;

    private LocalDateTime lastUpdated;
}
