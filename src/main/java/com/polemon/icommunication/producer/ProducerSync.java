package com.polemon.icommunication.producer;

import com.polemon.icommunication.models.Event;

/**
 * Author: Polemon
 * Creation date: 31/12/2022
 */
public interface ProducerSync {

    Event send(Event event);
}
