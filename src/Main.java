import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Car car=new Car(1,56);
        Car car1=new Car(2,77);
        CarData carData=new CarData(2023,"BMW",78000,"white");
        CarData carData1=new CarData(2022,"Mersedes",81000,"Black");

        HashMap <Car,CarData> hashMap=new HashMap<>();


        entrySet(hashMap,car,carData);
        System.out.println(hashMap);



    }




    public static void entrySet(HashMap<Car,CarData>hashMap,Car car,CarData carData){
        hashMap.put(car,carData);

    }
}