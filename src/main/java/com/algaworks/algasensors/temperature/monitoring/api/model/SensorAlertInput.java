package com.algaworks.algasensors.temperature.monitoring.api.model;

import lombok.Getter;

@Getter
public class SensorAlertInput {

    private Double maxTemperature;
    private Double minTemperature;

}
