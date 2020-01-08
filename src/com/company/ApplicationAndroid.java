package com.company;

public abstract class ApplicationAndroid {
    /**
     * Create application.
     */
    public abstract void onCreate();

    /**
     * Start application.
     */
    public abstract void onStart();

    /**
     * Resume application.
     */
    public abstract void onResume();

    /**
     * Play application.
     */
    public void play() {
        onCreate();
        onStart();
        onResume();
    }
}
