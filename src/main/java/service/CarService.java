package service;

import model.Car;
import java.util.ArrayList;
import java.util.List;

public class CarService {

    public List<Car> getCar(String count){
        List<Car> listCar = new ArrayList<>();
        listCar.add(new Car("car1",123,180));
        listCar.add(new Car("car2",456,220));
        listCar.add(new Car("car3",789,180));
        listCar.add(new Car("car4",548,220));
        listCar.add(new Car("car5",223,180));
        List<Car> newListCar = new ArrayList<>();
        try{
            int count1 = Integer.valueOf(count);
            if(count1>listCar.size()){
                return listCar;
            }else {
                for (int i = 0; i < count1; i++) {
                    newListCar.add(listCar.get(i));
                }
                return newListCar;
            }
        } catch (NumberFormatException e) {
            return listCar;
        }
    }
}
