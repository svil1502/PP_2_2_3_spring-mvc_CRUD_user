package web.service;

import web.models.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {

    public static List<Car> index(int count, List<Car> cars) {
        List<Car> carsNumber = new ArrayList<>();
        if (count > 5) {
            return cars;
        } else {
            for (int i = 0; i < count; i++) {
                carsNumber.add(cars.get(i));
            }
            return carsNumber;
        }
    }

}
