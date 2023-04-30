package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;
import java.util.ArrayList;
import java.util.List;

@Component
public class CarDao {
    public static List<Car> cars;

    private static int CAR_COUNT;

    {
        cars = new ArrayList<>();
        cars.add(new Car(CAR_COUNT++, "mitcubici", 123));
        cars.add(new Car(CAR_COUNT++, "nokia", 456));
        cars.add(new Car(CAR_COUNT++, "volvo", 789));
        cars.add(new Car(CAR_COUNT++, "pejo", 012));
        cars.add(new Car(CAR_COUNT++, "volksvagen", 023));
    }
}
