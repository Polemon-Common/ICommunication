package com.polemon.icommunication.producer;

import com.polemon.icommunication.models.Event;

/**
 * Author: Polemon
 * Creation date: 24/12/2022
 */
public interface Producer {

    void send(Event event);

}
