package io.prediction;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.joda.time.DateTime;

import java.util.List;
import java.util.Map;

/**
 * Event class for PredictionIO Event objects.
 *
 * @author The PredictionIO Team (<a href="http://prediction.io">http://prediction.io</a>)
 * @version 0.8.3
 * @since 0.8.0
 */

public class AteEvent extends Event {

    private String eventId;

    /**
     * Instantiate an event object.
     */
    public AteEvent() {
    }

    /**
     * Returns the name of the event.
     */
    public String getEventId() {
        return eventId;
    }

    // builder methods for convenience



    @Override
    public String toString() {
        // handle DateTime separately
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(DateTime.class, new DateTimeAdapter());
        Gson gson = gsonBuilder.create();
        return gson.toJson(this); // works when there are no generic types
    }
}
