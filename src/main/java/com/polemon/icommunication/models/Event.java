package com.polemon.icommunication.models;

/**
 * Author: Polemon
 * Creation date: 24/12/2022
 */
public class Event {

    private Header header;

    private Payload payload;

    public Event() {
    }

    public Event(Header header, Payload payload) {
        this.header = header;
        this.payload = payload;
    }

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public Payload getPayload() {
        return payload;
    }

    public void setPayload(Payload payload) {
        this.payload = payload;
    }

    public String getId() {
        return header.getId();
    }

    public String getDestination() {
        return header.getDestination();
    }

    public String getHeaderValue(String key) {
        return header.getValue(key);
    }

}
