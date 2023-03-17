package pbo.pertemuan2.App;

import pbo.pertemuan2.Abstract.City;

public class AppLocation {
    public static void main(String[] args) {

        // var location = new location (); //ERROR
        var city = new City();
        city.name = "Jakarta";

        System.out.println(city.name);
    }
}
