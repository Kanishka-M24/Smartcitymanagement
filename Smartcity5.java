import java.util.*;
class City 
{
    String city_name;
    int pincode;
    void input1()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter city name : ");
        city_name=sc.nextLine();
        System.out.println("Enter pincode : ");
        pincode=sc.nextInt();
    }
    void display1()
    {
        System.out.println("City Name : "+city_name);
        System.out.println("Pincode : "+pincode);
    }
}
class Health extends City
{
    int ambulances;
    int smartdustbins;
    int hospitals;
    void input2()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no.of ambulance : ");
        ambulances=sc.nextInt();
        System.out.println("Enter no.of smart dust bins : ");
        smartdustbins=sc.nextInt();
        System.out.println("Enter no.of hospitals : ");
        hospitals=sc.nextInt();
    }
    void display1()
    {
        super.display1();
        System.out.println("Health Department Details");
    }
    void display2()
    {
        display1();
        System.out.println("Ambulances : "+ambulances);
        System.out.println("Smart Dustbins : "+smartdustbins);
        System.out.println("Hospitals : "+hospitals);
    }
}
class Education extends Health
{
    int schools;
    int college;
    void input3()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no.of schools : ");
        schools=sc.nextInt();
        System.out.println("Enter no.of college : ");
        college=sc.nextInt();
    }
    void display3()
    {
        display2();
        System.out.println("Schools : "+schools);
        System.out.println("College : "+college);
    }
}
class Smartcity5
{
    public static void main(String [] args)
    {
        Education e= new Education();
        e.input1();
        e.input2();
        e.input3();
        e.display3();

    }
}