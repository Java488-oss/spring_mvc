package service;

import model.Car;
import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {
    private List<Car> listCar = new ArrayList<>();

    {
        listCar.add(new Car("car1",123,180));
        listCar.add(new Car("car2",456,220));
        listCar.add(new Car("car3",789,180));
        listCar.add(new Car("car4",548,220));
        listCar.add(new Car("car5",223,180));
        }

    public List<Car> getCar(int count){
        List<Car> newListCar = new ArrayList<>();
        try{
            if(count>listCar.size()){
                return listCar;
            }else {
                for (int i = 0; i < count; i++) {
                    newListCar.add(listCar.get(i));
                }
                return newListCar;
            }
        } catch (NumberFormatException e) {
            return listCar;
        }
    }
}
