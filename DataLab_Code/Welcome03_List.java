/*
 * Arrays of objects
 */
 
import core.data.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Welcome03_List {
   public static void main(String[] args) {
      DataSource ds = DataSource.connect("http://weather.gov/xml/current_obs/index.xml").load();
      ArrayList<WeatherStation> allstns = ds.fetchList("WeatherStation", "station/station_name", 
             "station/station_id", "station/state",
             "station/latitude", "station/longitude");
      System.out.println("Total stations: " + allstns.size());

      String lowestLat = "";
      double lowestLatNum = 100000000;
      for(WeatherStation stat : allstns){
         if (stat.getLat() < lowestLatNum){
            lowestLat = stat.getName();
            lowestLatNum = stat.getLat();
            System.out.println(lowestLat);
            System.out.println(lowestLatNum);
         }
      }
      System.out.println("Final ans: ");
      System.out.println(lowestLat);
      System.out.println(lowestLatNum);
      
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a state abbreviation: ");
      String state = sc.next();
      System.out.println("Stations in " + state);

      int count = 0;

      for (WeatherStation ws : allstns) {
         if (ws.isLocatedInState(state)) {
            System.out.println("  " + ws.getId() + ": " + ws.getName());
            count ++;
         }
      }

      System.out.println(count);
   }
}

