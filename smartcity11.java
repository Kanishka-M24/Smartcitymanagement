class SmartCity {

    Object trafficLock = new Object();
    Object waterLock = new Object();

    void manageTraffic() {

        synchronized (trafficLock) {

            System.out.println("Traffic Thread: Got Traffic lock");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            System.out.println("Traffic Thread: Waiting for Water lock");

            synchronized (waterLock) {
                System.out.println("Traffic Thread: Got Water lock");
            }
        }
    }

    void manageWater() {

        synchronized (waterLock) {

            System.out.println("Water Thread: Got Water lock");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            System.out.println("Water Thread: Waiting for Traffic lock");

            synchronized (trafficLock) {
                System.out.println("Water Thread: Got Traffic lock");
            }
        }
    }
}

public class smartcity11 {
    public static void main(String[] args) {

        SmartCity city = new SmartCity();

        Thread trafficThread = new Thread() {
            public void run() {
                city.manageTraffic();
            }
        };

        Thread waterThread = new Thread() {
            public void run() {
                city.manageWater();
            }
        };

        trafficThread.start();
        waterThread.start();
    }
}