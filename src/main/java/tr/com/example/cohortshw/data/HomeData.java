package tr.com.example.cohortshw.data;

import tr.com.example.cohortshw.model.Home;

import java.util.ArrayList;
import java.util.List;

public class HomeData {

    public static List<Home> getApartmentList() {
        List<Home> apartments = new ArrayList<>();
        apartments.add(new Home("Apartment", 1000000, 120, 3, 1));
        apartments.add(new Home("Apartment", 1200000, 130, 2, 1));
        apartments.add(new Home("Apartment", 1100000, 110, 4, 1));
        return apartments;
    }

    public static List<Home> getVillaList() {
        List<Home> villas = new ArrayList<>();
        villas.add(new Home("Villa", 3000000, 250, 5, 2));
        villas.add(new Home("Villa", 3200000, 270, 6, 2));
        villas.add(new Home("Villa", 3500000, 300, 7, 3));
        return villas;
    }

    public static List<Home> getSummerHouseList() {
        List<Home> summerHouse = new ArrayList<>();
        summerHouse.add(new Home("Summer House", 1500000, 140, 3, 1));
        summerHouse.add(new Home("Summer House", 1700000, 160, 4, 1));
        summerHouse.add(new Home("Summer House", 1800000, 180, 4, 2));
        return summerHouse;
    }

    public static List<Home> getAllHome() {
        List<Home> allHome = new ArrayList<>();
        allHome.addAll(getApartmentList());
        allHome.addAll(getVillaList());
        allHome.addAll(getSummerHouseList());
        return allHome;
    }
}
