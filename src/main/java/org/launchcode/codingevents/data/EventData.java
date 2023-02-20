package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.Event;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EventData {

    //class design
    // TODO: need a place to store event data
    private static final Map<Integer, Event> events = new HashMap<>();

    //map is an interface that allows you to store data in key/value pairs. Here the integers are the ids, and the Event is the event name. It gets run when the class is first loaded into memory


    //TODO: application should be able to get All events

    public static Collection<Event> getAll(){ //Collection is an interface that extends the iterable interface, which allows us to loop over the interface.
        return events.values();
    }

    //TODO: be able to get a single event

    public static Event getById(int id) {
        return events.get(id);
    }

    //TODO: be able to add an event to our collection

    public static void add(Event event) {
        events.put(event.getId(), event);
    }

    //TODO: remove an event from our collection

    public static void remove(int id) {
        events.remove(id);
    }

}
