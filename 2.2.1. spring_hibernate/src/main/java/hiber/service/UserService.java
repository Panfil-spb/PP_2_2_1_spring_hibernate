package hiber.service;

import hiber.model.Car;
import hiber.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    List<User> listUsers();
    public User getUser(String model, int series);
}
