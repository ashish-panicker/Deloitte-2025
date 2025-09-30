package org.inheritance;

import java.io.Serializable;

// interfaces are pure abstract structures
// by default all methods are public and abstract unless specified otherwise
// use extends to inherit from another interface
interface Vehicle extends Serializable {

    void start();

    void stop();

    void operationEfficiency();

    // from java v8 we can have methods with body in an interface

    default void gpsTracking() {
        // default methods allows method body
        // it is not mandatory to override them
    }
}

class TruckBS6 implements Vehicle, Serializable {

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void operationEfficiency() {

    }

    @Override
    public void gpsTracking() {
        // call the default implementation from the interface
        Vehicle.super.gpsTracking();
    }
}

// use implements keyword to inherit from an interface
// interfaces can support multiple inheritance
class TruckBS4 implements Vehicle, Serializable {

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void operationEfficiency() {

    }

}

public class VehicleMain {
    public static void main(String[] args) {

    }
}
