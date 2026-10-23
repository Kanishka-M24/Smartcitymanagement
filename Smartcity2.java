class SmartCity
{
    public static String city = "Coimbatore";
    private static String slogan = "Smart City, Bright Future";
    public static void report()
    {
        System.out.println("=================================");
        System.out.println("     SMART CITY MANAGEMENT");
        System.out.println("=================================");
    }
    public static void report(String area)
    {
        System.out.println("Area Name : " + area);
    }
    public static void report(int streetLights, int hospitals)
    {
        System.out.println("Street Lights : " + streetLights);
        System.out.println("Hospitals     : " + hospitals);
    }
    public static void report(double rating)
    {
        System.out.println("City Rating : " + rating + "/10");
    }
    public static void displaySlogan()
    {
        System.out.println("Slogan : " + slogan);
    }
}
public class Smartcity2
{
    public static void main(String[] args)
    {
        SmartCity.report();
        System.out.println("City Name : " + SmartCity.city);
        SmartCity.report("Gandhipuram");
        SmartCity.report(2500, 15);
        SmartCity.report(9.8);
        SmartCity.displaySlogan();
    }
}
