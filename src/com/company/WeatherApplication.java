package com.company;

public class WeatherApplication extends ApplicationAndroid {
    /**
     * Create Weather application.
     */
    @Override
    public void onCreate() {
        System.out.println("create Weather");
    }

    /**
     * Start Weather application.
     */
    @Override
    public void onStart() {
        System.out.println("start Weather");
    }

    /**
     * Resume Weather application.
     */
    @Override
    public void onResume() {
        System.out.println("resume Weather");
    }
}
