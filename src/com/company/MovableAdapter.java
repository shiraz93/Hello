package com.company;

public class MovableAdapter implements SpeedKPH {
    SpeedMPH speedMPH;

    /**
     * Create constructor.
     *
     * @param speedMPH type speed measurment.
     */
    public MovableAdapter(SpeedMPH speedMPH) {
        this.speedMPH = speedMPH;
    }

    /**
     * @return speed KPH of car Dodge .
     */
    @Override
    public double getSpeed() {
        return convertMPHtoMKH(speedMPH.getSpeed());
    }

    /**
     * Convert speed  MPH to KPH.
     *
     * @param mph speed.
     * @return speed KPH.
     */
    private double convertMPHtoMKH(double mph) {
        return mph * 1.60934;
    }
}
