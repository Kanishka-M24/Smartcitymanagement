import java.util.Scanner;
class SmartCity
{
    String cityName;
    String areaName;
    int streetLights;
    int cctvCameras;
    int hospitals;
    void getDetails()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter City Name: ");
        cityName = sc.nextLine();
        System.out.print("Enter Area Name: ");
        areaName = sc.nextLine();
        System.out.print("Enter Number of Street Lights: ");
        streetLights = sc.nextInt();
        System.out.print("Enter Number of CCTV Cameras: ");
        cctvCameras = sc.nextInt();
        System.out.print("Enter Number of Hospitals: ");
        hospitals = sc.nextInt();
    }
    void displayDetails()
    {
        System.out.println("\n========== SMART CITY MANAGEMENT ==========");
        System.out.println("City Name          : " + cityName);
        System.out.println("Area Name          : " + areaName);
        System.out.println("Street Lights      : " + streetLights);
        System.out.println("CCTV Cameras       : " + cctvCameras);
        System.out.println("Hospitals          : " + hospitals);
    }
}
class Smartcity3
{
    public static void main(String args[])
    {
        SmartCity s = new SmartCity();
        s.getDetails();
        s.displayDetails();
    }
}
