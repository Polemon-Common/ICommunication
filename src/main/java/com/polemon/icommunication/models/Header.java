package com.polemon.icommunication.models;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Polemon
 * Creation date: 24/12/2022
 */
public class Header {

    private String id;

    private String destination;

    private Map<String, String> keyValues;

    public Header() {
        this.keyValues = new HashMap<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Map<String, String> getKeyValues() {
        return keyValues;
    }

    public void addKeyValue(String key, String value) {
        this.keyValues.put(key, value);
    }

    public String getValue(String key) {
        return keyValues.get(key);
    }

    @Override
    public String toString() {
        return "Header{" +
                "id='" + id + '\'' +
                ", destination='" + destination + '\'' +
                ", keyValues=" + keyValues +
                '}';
    }

}
