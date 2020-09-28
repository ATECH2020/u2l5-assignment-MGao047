import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
      
        double beginLat;
        double beginLong;
        double endLat;
        double endLong;
        double distance;
        Scanner theScanner = new Scanner (System.in);


        System.out.println( "Enter the latitude of the starting location: ");
        beginLat= theScanner.nextDouble();
        System.out.println("Enter the longitude of the starting location: ");
        beginLong = theScanner.nextDouble();
        System.out.println("Enter the latitude of the ending location: ");
        endLat= theScanner.nextDouble();
        System.out.println("Enter the longitude of the ending location: ");
        endLong= theScanner.nextDouble();


        GeoLocation beginLoc = new GeoLocation(beginLat,beginLong);
        GeoLocation endLoc = new GeoLocation (endLat,endLong);

        distance = beginLoc.distanceFrom(endLoc);
        System.out.println("The distance is " + distance + " miles");



    }
}