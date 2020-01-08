package com.company;

public class ShazamApplication extends ApplicationAndroid {
    /**
     * Create Shazam application.
     */
    @Override
    public void onCreate() {
        System.out.println("create Shazam");
    }

    /**
     * Start Shazam application.
     */
    @Override
    public void onStart() {
        System.out.println("start Shazam");
    }

    /**
     * Resume Shazam application.
     */
    @Override
    public void onResume() {
        System.out.println("resume Shazam");
    }
}
