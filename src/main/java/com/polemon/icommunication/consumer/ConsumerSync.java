package com.polemon.icommunication.consumer;

import com.polemon.icommunication.models.Event;

/**
 * Author: Polemon
 * Creation date: 31/12/2022
 */
public interface ConsumerSync {

    Event getNext();

    Event getById(String id);

    void sendResponse(Event event, String id);

    void subscribe(String source);

}
