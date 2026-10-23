import java.util.*;
abstract class SmartCity {
    String cityName, cityType;
    String location;
    int population;
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter City Name:");
        cityName = sc.nextLine();
        System.out.println("Enter City Type:");
        cityType = sc.nextLine();
        System.out.println("Enter Location:");
        location = sc.nextLine();
        System.out.println("Enter Population:");
        population = sc.nextInt();
        sc.nextLine();
    }
    void cityInfo() {
        System.out.println("===================================");
        System.out.println("        SMART CITY DETAILS");
        System.out.println("===================================");
        System.out.println("City Name : " + cityName);
        System.out.println("City Type : " + cityType);
        System.out.println("Location  : " + location);
        System.out.println("Population: " + population);
    }
    abstract void inputServiceDetails();
    abstract void display();
}
class TrafficManagement extends SmartCity {
    int vehicles;
    String trafficStatus;
    void inputServiceDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Vehicles:");
        vehicles = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Traffic Status:");
        trafficStatus = sc.nextLine();
    }
    void display() {
        cityInfo();
        System.out.println("Vehicles      : " + vehicles);
        System.out.println("Traffic Status: " + trafficStatus);
    }
    void updateTraffic(TrafficManagement t) {
        t.vehicles = t.vehicles + 10;
    }
}
public class Smartcity6a {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TrafficManagement city = new TrafficManagement();
        city.input();
        city.inputServiceDetails();
        System.out.println("\n--- CITY DETAILS ---");
        city.display();
        city.updateTraffic(city);
        System.out.println("\n--- AFTER TRAFFIC UPDATE ---");
        city.display();
    }
}