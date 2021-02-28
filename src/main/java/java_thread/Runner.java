package java_thread;

import java_thread.util.CarUtil;

public class Runner {
    public static void main(String[] args) {
        CarUtil carUtil = new CarUtil(15);
        carUtil.start();
    }
}
