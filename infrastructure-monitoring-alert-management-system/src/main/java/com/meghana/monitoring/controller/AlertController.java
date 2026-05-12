package com.meghana.monitoring.controller;

import com.meghana.monitoring.entity.Alert;
import com.meghana.monitoring.service.AlertService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/alerts")
public class AlertController {
    private final AlertService alertService;

    public AlertController(AlertService alertService) {
        this.alertService = alertService;
    }

    @PostMapping
    public Alert createAlert(@RequestBody Alert alert) {
        return alertService.createAlert(alert);
    }

    @GetMapping("/active")
    public List<Alert> getActiveAlerts() {
        return alertService.getAllAlerts();
    }
}
