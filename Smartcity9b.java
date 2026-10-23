import java.lang.*;
class Smart9 implements Runnable {
    public void run() {
        System.out.println("Smart City Management System");
        System.out.println("----------------------------");
        System.out.println("Traffic System: Signal status is normal");
        System.out.println("Street Lights: Lights are functioning properly");
        System.out.println("Water Supply: Water level is sufficient");
        System.out.println("Waste Collection: Collection vehicles are active");
        System.out.println("Security System: CCTV cameras are active");
        System.out.println("Emergency System: Emergency services are ready");
        System.out.println("All City Services are Operational");
    }
}
class Smartcity9b {
    public static void main(String[] args) {
        System.out.println("City Control Center Started");
        Smart9 city = new Smart9();
        System.out.println("Connecting to City Services...");
        Thread t = new Thread(city);
        t.start();
        System.out.println("Monitoring process started");
    }
}
