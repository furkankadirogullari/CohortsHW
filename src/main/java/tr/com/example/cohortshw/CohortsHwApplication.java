package tr.com.example.cohortshw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tr.com.example.cohortshw.data.HomeData;
import tr.com.example.cohortshw.service.HomeService;

@SpringBootApplication
public class CohortsHwApplication {

    public static void main(String[] args) {
        SpringApplication.run(CohortsHwApplication.class, args);

        HomeService service = new HomeService();

        System.out.println("Evlerin toplam fiyatı: " + service.totalPrice(HomeData.getApartmentList()));
        System.out.println("Villaların toplam fiyatı: " + service.totalPrice(HomeData.getVillaList()));
        System.out.println("Yazlıkların toplam fiyatı: " + service.totalPrice(HomeData.getSummerHouseList()));
        System.out.println("Tüm evlerin toplam fiyatı: " + service.totalPrice(HomeData.getAllHome()));

        System.out.println("Evlerin ortalama metrekaresi: " + service.averageSquareMeters(HomeData.getApartmentList()));
        System.out.println("Villaların ortalama metrekaresi: " + service.averageSquareMeters(HomeData.getVillaList()));
        System.out.println("Yazlıkların ortalama metrekaresi: " + service.averageSquareMeters(HomeData.getSummerHouseList()));
        System.out.println("Tüm evlerin ortalama metrekaresi: " + service.averageSquareMeters(HomeData.getAllHome()));

        System.out.println("3 oda 1 salon evler:");
        service.filterByRoomHall(3, 1).forEach(home -> System.out.println(home.getType() + " ---> " + home.getPrice()));
    }



}
