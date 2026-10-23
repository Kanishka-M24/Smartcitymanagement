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
class Smartcity4a extends City
{
    int schools;
    int college;
    void input2()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no.of schools : ");
        schools=sc.nextInt();
        System.out.println("Enter no.of college : ");
        college=sc.nextInt();
    }
    void display2()
    {
        display1();
        System.out.println("Schools : "+schools);
        System.out.println("College : "+college);
    }
    public static void main(String [] args)
    {
        Smartcity4a s=new Smartcity4a();
        s.input1();
        s.input2();
        s.display2();

    }
    
}