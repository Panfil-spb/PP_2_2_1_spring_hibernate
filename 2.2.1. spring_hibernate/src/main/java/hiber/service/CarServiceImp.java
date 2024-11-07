package hiber.service;

import hiber.dao.CarDaoImp;
import hiber.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImp implements CarService{


    public CarDaoImp carDaoImp;

    @Autowired
    public CarServiceImp(CarDaoImp carDaoImp) {
        this.carDaoImp = carDaoImp;
    }

    @Override
    public void add(Car car) {
        carDaoImp.addCar(car);
    }

    @Override
    public List<Car> listCars() {
        return carDaoImp.getListCars();
    }

    @Override
    public Car getCar(String model) {
        return carDaoImp.getCar(model);
    }
}
