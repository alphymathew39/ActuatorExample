package com.example.ActuatorExample.endpoints;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class ServiceBHealthIndicator
        implements HealthIndicator {

    private final String message_key = "Service B";

    @Override
    public Health health() {
        if (!isRunningServiceB()) {
            return Health.down().withDetail(message_key, "Not Available").build();
        }

        return Health.up().withDetail(message_key, "Available").build();
    }

    private Boolean isRunningServiceB() {
        Boolean isRunning = false;
        // Logic Skipped

        return isRunning;
    }
}
