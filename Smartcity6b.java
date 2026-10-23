import java.util.*;
interface Citizen
{
    void inputCitizen();
    void displayCitizen();
}
interface Service
{
    void serviceDetails();
}
interface Complaint
{
    void inputComplaint();
}
class SmartCity implements Citizen, Service, Complaint
{
    String name, email, mobile;
    int citizen_id, age;
    String service_name, service_status;
    String complaint_type, complaint_status;
    Scanner sc = new Scanner(System.in);
    public void inputCitizen()
    {
        System.out.println("Enter Citizen ID:");
        citizen_id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Citizen Name:");
        name = sc.nextLine();
        System.out.println("Enter Age:");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Email ID:");
        email = sc.nextLine();
        System.out.println("Enter Mobile Number:");
        mobile = sc.nextLine();
    }
    public void serviceDetails()
    {
        System.out.println("Enter Smart City Service:");
        service_name = sc.nextLine();
        System.out.println("Enter Service Status (Active/Inactive):");
        service_status = sc.nextLine();
        if(service_status.equalsIgnoreCase("Active"))
        {
            service_status = "Active";
        }
        else if(service_status.equalsIgnoreCase("Inactive"))
        {
            service_status = "Inactive";
        }
        else
        {
            System.out.println("Invalid Service Status");
        }
    }
    public void inputComplaint()
    {
        System.out.println("Enter Complaint Type:");
        complaint_type = sc.nextLine();
        System.out.println("Enter Complaint Status (Pending/Resolved):");
        complaint_status = sc.nextLine();
        if(complaint_status.equalsIgnoreCase("Pending"))
        {
            complaint_status = "Pending";
        }
        else if(complaint_status.equalsIgnoreCase("Resolved"))
        {
            complaint_status = "Resolved";
        }
        else
        {
            System.out.println("Invalid Complaint Status");
        }
    }
    public void displayCitizen()
    {
        System.out.println("\n===================================");
        System.out.println("       SMART CITY DETAILS");
        System.out.println("===================================");
        System.out.println("Citizen ID       : " + citizen_id);
        System.out.println("Citizen Name     : " + name);
        System.out.println("Age              : " + age);
        System.out.println("Email ID         : " + email);
        System.out.println("Mobile Number    : " + mobile);
        System.out.println("\n======== CITY SERVICE DETAILS ========");
        System.out.println("Service Name     : " + service_name);
        System.out.println("Service Status   : " + service_status);
        System.out.println("\n======== COMPLAINT DETAILS ========");
        System.out.println("Complaint Type   : " + complaint_type);
        System.out.println("Complaint Status : " + complaint_status);
    }
}
public class Smartcity6b
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("===================================");
        System.out.println("     SMART CITY MANAGEMENT SYSTEM");
        System.out.println("===================================");
        System.out.println("Enter Number of Citizens:");
        int n = sc.nextInt();
        sc.nextLine();
        SmartCity[] city = new SmartCity[n];
        for(int i = 0; i < n; i++)
        {
            city[i] = new SmartCity();
            Citizen c = city[i];
            Service s = city[i];
            Complaint com = city[i];
            System.out.println("\n========== CITIZEN " + (i + 1) + " ==========");
            c.inputCitizen();
            s.serviceDetails();
            com.inputComplaint();
        }
        System.out.println("\n\n===================================");
        System.out.println("       SMART CITY REPORT");
        System.out.println("===================================");
        for(int i = 0; i < n; i++)
        {
            Citizen c = city[i];
            c.displayCitizen();
        }
    }
}