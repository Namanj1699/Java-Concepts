package StaticFinal;

class TataPunch
{
    static Long exShowroom = 550000l;

    static long onRoad(String city)
    {
        if(city == "delhi" || city == "haryana")
        {
            return 630000l;
        }
        else if(city == "mumbai" || city == "kolkata")
        {
            return 640000l;
        }
        else {
            return 670000l;
        }
    }
}

public class CarsDemo {
    public static void main(String[] args) {
        System.out.println(TataPunch.exShowroom);

        System.out.println(TataPunch.onRoad("delhi"));
    }
}

