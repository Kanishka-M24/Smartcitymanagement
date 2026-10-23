import java.util.*;
class SmartCity
{
    int city_id;
    String city_name,area;
    double population,temperature,water_level,electricity_usage;
}
class InvalidPopulationException extends Exception
{
    InvalidPopulationException(String message)
    {
        super(message);
    }
}
class InvalidTemperatureException extends Exception
{
    InvalidTemperatureException(String message)
    {
        super(message);
    }
}
class InvalidWaterLevelException extends Exception
{
    InvalidWaterLevelException(String message)
    {
        super(message);
    }
}
class InvalidElectricityException extends Exception
{
    InvalidElectricityException(String message)
    {
        super(message);
    }
}
class Snartcityex
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        SmartCity city=new SmartCity();
        try
        {
            System.out.println("Enter City ID:");
            city.city_id=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter City Name:");
            city.city_name=sc.nextLine();
            System.out.println("Enter Area:");
            city.area=sc.nextLine();
            System.out.println("Enter Population:");
            city.population=sc.nextDouble();
            if(city.population<=0)
            {
                throw new InvalidPopulationException(
                    "Invalid Population: Population must be greater than 0");
            }
            System.out.println("Enter Temperature:");
            city.temperature=sc.nextDouble();
            if(city.temperature<-50 || city.temperature>60)
            {
                throw new InvalidTemperatureException(
                    "Invalid Temperature: Temperature must be between -50 and 60 degree Celsius");
            }
            System.out.println("Enter Water Level:");
            city.water_level=sc.nextDouble();
            if(city.water_level<0 || city.water_level>100)
            {
                throw new InvalidWaterLevelException(
                    "Invalid Water Level: Water level must be between 0 and 100%");
            }
            System.out.println("Enter Electricity Usage:");
            city.electricity_usage=sc.nextDouble();
            if(city.electricity_usage<0)
            {
                throw new InvalidElectricityException(
                    "Invalid Electricity Usage: Usage must be a positive value");
            }
        }
        catch(InvalidPopulationException e)
        {
            System.out.println(e.getMessage());
        }
        catch(InvalidTemperatureException e)
        {
            System.out.println(e.getMessage());
        }
        catch(InvalidWaterLevelException e)
        {
            System.out.println(e.getMessage());
        }
        catch(InvalidElectricityException e)
        {
            System.out.println(e.getMessage());
        }
    }
}