package tr.com.example.cohortshw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tr.com.example.cohortshw.data.HomeData;
import tr.com.example.cohortshw.service.HomeService;

import java.util.Scanner;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        Scanner scanner = new Scanner(System.in);
        HomeService service = new HomeService();
        int numberOfRoom =0, numberOfHall=0;

        System.out.println("Evlerin toplam fiyatı: " + service.totalPrice(HomeData.getApartmentList()));
        System.out.println("Villaların toplam fiyatı: " + service.totalPrice(HomeData.getVillaList()));
        System.out.println("Yazlıkların toplam fiyatı: " + service.totalPrice(HomeData.getSummerHouseList()));
        System.out.println("Tüm evlerin toplam fiyatı: " + service.totalPrice(HomeData.getAllHome()));

        System.out.println("Evlerin ortalama metrekaresi: " + service.averageSquareMeters(HomeData.getApartmentList()));
        System.out.println("Villaların ortalama metrekaresi: " + service.averageSquareMeters(HomeData.getVillaList()));
        System.out.println("Yazlıkların ortalama metrekaresi: " + service.averageSquareMeters(HomeData.getSummerHouseList()));
        System.out.println("Tüm evlerin ortalama metrekaresi: " + service.averageSquareMeters(HomeData.getAllHome()));

        while((numberOfRoom < 2 || numberOfRoom > 7 ) || (numberOfHall < 1 || numberOfHall > 3)) {
            System.out.print("Oda sayısı giriniz(2'den küçük 7'den büyük olamaz) :");
            numberOfRoom = scanner.nextInt();
            System.out.print("Salon sayısı giriniz(1'den küçük 3'den büyük olamaz):");
            numberOfHall = scanner.nextInt();
        }



        System.out.println(numberOfRoom + " oda " + numberOfHall + " salon evler");
        service.filterByRoomHall(numberOfRoom, numberOfHall).forEach(home -> System.out.println(home.getType() + " ---> " + home.getPrice()));
    }



}
