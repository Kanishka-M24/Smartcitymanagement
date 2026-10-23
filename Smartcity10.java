import java.lang.*;
class SmartCity {
    String traffic = "Not Checked";
    String water = "Low";
    String waste = "Not Collected";
    String electricity = "Off";
    synchronized void checkTraffic() {
        System.out.println("Control Room is checking traffic...");
        if (traffic.equals("Not Checked")) {
            System.out.println("Traffic status is not available");
            System.out.println("Waiting for traffic update...");
            try {
                wait();
            }
            catch(Exception e) {
            }
        }
        System.out.println("Traffic status: Normal");
        System.out.println("Control Room can manage the city");
        notify();
    }
    synchronized void trafficUpdate() {
        try {
            Thread.sleep(2000);
        }
        catch(Exception e) {
        }
        traffic = "Normal";
        System.out.println("Traffic update received");
        notify();
    }
    synchronized void checkWater() {
        try {
            wait();
        }
        catch(Exception e) {
        }
        if(traffic.equals("Normal")) {
            System.out.println("Checking water supply...");
            water = "Sufficient";
            System.out.println("Water supply is sufficient");
            notify();
        }
    }
    synchronized void collectWaste() {
        try {
            wait();
        }
        catch(Exception e) {
        }
        System.out.println("Waste collection is started...");
        waste = "Collected";
        if(waste.equals("Collected")) {
            System.out.println("Waste collected successfully");
            notify();
        }
        else {
            System.out.println("Waste is not collected");
        }
    }
    synchronized void restoreElectricity() {
        try {
            wait();
        }
        catch(Exception e) {
        }

        if(waste.equals("Collected")) {
            System.out.println("Restoring electricity...");
            electricity = "On";
            System.out.println("Electricity restored successfully");
        }
        else {
            System.out.println("Waste collection is not completed");
            System.out.println("Electricity cannot be restored");
        }
    }
}
class Smartcity10 {
    public static void main(String[] args) {
        SmartCity s = new SmartCity();
        new Thread() {
            public void run() {
                s.checkTraffic();
            }
        }.start();
        new Thread() {
            public void run() {
                s.trafficUpdate();
            }
        }.start();
        new Thread() {
            public void run() {
                s.checkWater();
            }
        }.start();
        new Thread() {
            public void run() {
                s.collectWaste();
            }
        }.start();
        new Thread() {
            public void run() {
                s.restoreElectricity();
            }
        }.start();
    }
}