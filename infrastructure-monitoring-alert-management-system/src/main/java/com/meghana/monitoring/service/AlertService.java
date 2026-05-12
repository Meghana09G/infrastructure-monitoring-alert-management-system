package com.meghana.monitoring.service;

import com.meghana.monitoring.entity.Alert;
import com.meghana.monitoring.repository.AlertRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AlertService {
    private final AlertRepository repository;

    public AlertService(AlertRepository repository) {
        this.repository = repository;
    }

    public Alert createAlert(Alert alert) {
        return repository.save(alert);
    }

    public List<Alert> getAllAlerts() {
        return repository.findAll();
    }
}
