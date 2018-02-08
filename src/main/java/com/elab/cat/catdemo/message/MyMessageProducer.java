package com.elab.cat.catdemo.message;

import com.dianping.cat.message.Event;
import com.dianping.cat.message.internal.DefaultMessageProducer;

/**
 * @author Liukx
 * @create 2018-02-08 18:00
 * @email liukx@elab-plus.com
 **/
public class MyMessageProducer extends DefaultMessageProducer {


    @Override
    public void logEvent(String type, String name, String status, String nameValuePairs) {
        String author = "";
        if ("ERROR".equals(status)) {
            int startIndex = nameValuePairs.indexOf("[");
            int endIndex = nameValuePairs.indexOf("]");
            if (startIndex >= 0 && endIndex > 0) {
                author = nameValuePairs.substring(startIndex, endIndex + 1) + " - ";
            }
        }
        Event event = newEvent(type, author + name);


        if (nameValuePairs != null && nameValuePairs.length() > 0) {
            event.addData(nameValuePairs);
        }

        event.setStatus(status);
        event.complete();
    }
}
