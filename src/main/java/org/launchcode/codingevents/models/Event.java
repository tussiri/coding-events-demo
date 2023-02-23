package org.launchcode.codingevents.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;

public class Event {

    @NotBlank(message="Name is required")
    @Size(min = 3, max = 20, message = "Name must be between 3 and 50 characters")
    private String name;

    @Size(max = 500, message = "Description exceeds the maximum length")
    private String description;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email address. Try again")
    private String contactEmail;

    private int id;
    private static int nextId = 1;

    public Event(String name, String description, String contactEmail) {
        this.name = name;
        this.contactEmail = contactEmail;
        this.description = description;
        this.id = nextId;
        nextId++;
    }

    public Event (){}

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Event)) return false;
        Event event = (Event) o;
        return getId() == event.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
