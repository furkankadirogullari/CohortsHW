package tr.com.example.cohortshw.service;

import org.springframework.stereotype.Service;
import tr.com.example.cohortshw.data.HomeData;
import tr.com.example.cohortshw.model.Home;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HomeService {

    // Calculate Total Price for all houses
    public int totalPrice(List<Home> homes) {
        return homes.stream().mapToInt(Home::getPrice).sum();
    }

    // Calculate Average Square Meters for all houses
    public double averageSquareMeters(List<Home> homes) {
        return homes.stream().mapToInt(Home::getSquareMeters).average().orElse(0);
    }
    //Filter by Room and Hall
    public List<Home> filterByRoomHall(int room, int hall) {
        return HomeData.getAllHome().stream()
                .filter(e -> e.getNumberOfRoom() == room && e.getNumberOfHall() == hall)
                .collect(Collectors.toList());
    }

    public List<Home> getApartments() {
        return HomeData.getApartmentList();
    }

    public List<Home> getVillas() {
        return HomeData.getVillaList();
    }

    public List<Home> getSummerHouses() {
        return HomeData.getSummerHouseList();
    }

    public List<Home> getAllHome() {
        return HomeData.getAllHome();
    }

}
