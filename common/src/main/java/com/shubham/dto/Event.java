package com.shubham.dto;

import java.util.UUID;

public class Event {
    String id;
    String correlationId;
    String originService;
    String destinationService;
    EventPayload payload;

    public Event() {
        id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCorrelationId() {
        return correlationId;
    }

    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }

    public String getOriginService() {
        return originService;
    }

    public void setOriginService(String originService) {
        this.originService = originService;
    }

    public String getDestinationService() {
        return destinationService;
    }

    public void setDestinationService(String destinationService) {
        this.destinationService = destinationService;
    }

    public EventPayload getPayload() {
        return payload;
    }

    public void setPayload(EventPayload payload) {
        this.payload = payload;
    }
}
