class SmartCity
{
    String cityName;
    String areaName;
    int hospitals;
    int ambulances;
    int streetLights;
    int cctvCameras;
    int publicWiFiZones;
    SmartCity(String cityName, String areaName, int hospitals, int ambulances,
              int streetLights, int cctvCameras, int publicWiFiZones)
    {
        System.out.println("\n   SMART CITY MANAGEMENT SYSTEM     ");
        this.cityName = cityName;
        this.areaName = areaName;
        this.hospitals = hospitals;
        this.ambulances = ambulances;
        this.streetLights = streetLights;
        this.cctvCameras = cctvCameras;
        this.publicWiFiZones = publicWiFiZones;
    }
    void display()
    {
        System.out.println("\n======================================");
        System.out.println("        SMART CITY REPORT   ");
        System.out.println("======================================");
        System.out.println("City Name          : " + cityName);
        System.out.println("Area Name          : " + areaName);
        System.out.println("--------------------------------------");
        System.out.println("Hospitals          : " + hospitals);
        System.out.println("Ambulances         : " + ambulances);
        System.out.println("Street Lights      : " + streetLights);
        System.out.println("CCTV Cameras       : " + cctvCameras);
        System.out.println("Public Wi-Fi Zones : " + publicWiFiZones);
        System.out.println("======================================");
        System.out.println("      Smart City, Better Life");
        System.out.println("======================================");
    }
}
public class Smartcity1
{
    public static void main(String[] args)
    {
        SmartCity city = new SmartCity(
            "Coimbatore",
            "Gandhipuram",
            12,
            30,
            2500,
            850,
            120
        );
        city.display();
    }
}
