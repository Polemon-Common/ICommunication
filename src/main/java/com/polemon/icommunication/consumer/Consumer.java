package com.polemon.icommunication.consumer;

import com.polemon.icommunication.models.Event;

/**
 * Author: Polemon
 * Creation date: 24/12/2022
 */
public interface Consumer {

    Event getNext();

    Event getById(String id);

    void subscribe(String source);

}
