package java_thread.util;

import java_thread.Car;

import java.util.concurrent.TimeUnit;

public class CarUtil extends Thread {
    private int carsQuantity;

    public CarUtil(int carsQuantity) {
        this.carsQuantity = carsQuantity;
    }
    @Override
    public void run() {
        for (int i = 0; i < carsQuantity; i++) {
            Car car = new Car("Car #" + (i + 1));
            car.start();
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
