package src.controllers;

import java.util.concurrent.atomic.AtomicLong;

public class ControllerTemplate {
    protected final AtomicLong counter = new AtomicLong();

    private String getClassName() {
        return this.getClass().getSimpleName();
    }

}
