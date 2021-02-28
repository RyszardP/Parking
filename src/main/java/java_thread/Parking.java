package java_thread;

import java.util.concurrent.Semaphore;

public class Parking {
    public static Semaphore parkingPlace = new Semaphore(10);

}
