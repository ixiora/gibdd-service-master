package ru.android_studio.gibdd_servis.gibdd;

public class NotFoundResult extends RuntimeException {
    public NotFoundResult(String message) {
        super(message);
    }
}
