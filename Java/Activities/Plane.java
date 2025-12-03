package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Plane {
    private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;

    public Plane(int maxPassengers) {
        this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>();
    }

    public void onboard(String passengerName) {
        if (passengers.size() < maxPassengers) {
            passengers.add(passengerName);
        }
    }

    public Date takeOff() {
        lastTimeTookOf = new Date();
        return lastTimeTookOf;
    }

    public void land() {
        lastTimeLanded = new Date();
        passengers.clear();
    }

    public Date getLastTimeLanded() {
        return lastTimeLanded;
    }

    public List<String> getPassengers() {
        return passengers;
    }
}