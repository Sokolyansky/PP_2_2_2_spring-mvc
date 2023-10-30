package web.service;


import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    private final List<Car> cars; {
        cars = new ArrayList<>();
        cars.add(new Car("UAZ", 469, true));
        cars.add(new Car("VAZ", 21827, false));
        cars.add(new Car("URAL", 4320, true));
        cars.add(new Car("GAZ", 330202, false));
        cars.add(new Car("KAMAZ", 54901, false));
    }



    @Override
    public List<Car> getCars(Integer count) {
        if (count == null){
            return cars;
        }
        if (count > cars.size() | count < 0) {
            count = cars.size();
        }
        return cars.subList(0, count);
    }
}