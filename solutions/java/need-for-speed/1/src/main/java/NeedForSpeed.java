class NeedForSpeed {
    private static final int INITIAL_BATTERY_LEVEL = 100;
    private int speed;
    private int batteryDrain;
    private int battery;
    private int distanceDriven;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.battery = INITIAL_BATTERY_LEVEL;
        this.distanceDriven = 0;
    }

    public boolean batteryDrained() {
        return this.battery < this.batteryDrain;
    }

    public int distanceDriven() {
        return this.distanceDriven;
    }

    public void drive() {
        if(!batteryDrained()){
            this.battery -= this.batteryDrain;
            this.distanceDriven += this.speed; 
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50,4);
    }

    public boolean HasEnoughBattery(int meters){
        int autonomy = ((int) battery/batteryDrain)*speed;
        return autonomy>=meters;
    }
}

class RaceTrack {
    private int distance;
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        return car.HasEnoughBattery(this.distance);
    }
}
