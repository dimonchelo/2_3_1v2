package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {
    @Override
    public List<Car> carList(Integer count) {
        List<Car> carLists;
        {
            carLists = new ArrayList<>();
            carLists.add(new Car(1, "11", 111));
            carLists.add(new Car(2, "22", 222));
            carLists.add(new Car(3, "33", 333));
            carLists.add(new Car(4, "44", 444));
            carLists.add(new Car(5, "55", 555));
        }

        return carLists.stream().limit(count).collect(Collectors.toList());
    }
}
