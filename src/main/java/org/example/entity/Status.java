package org.example.entity;
public enum Status {
    SENT("SENT"),
    CANCELED("CANCELED"),
    WAITING_FOR_PAYMENT("WAITING_FOR_PAYMENT"),
    IN_REPOSITORY("IN_REPOSITORY");
    private final String displayName;
    Status(String displayName) {
        this.displayName = displayName;
    }
    public String getDisplayName() {
        return displayName;
    }

}