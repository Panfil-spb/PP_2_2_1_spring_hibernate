package hiber.service;

import hiber.dao.UserDao;
import hiber.dao.UserDaoImp;
import hiber.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImp implements UserService {


   private UserDaoImp userDaoImp;

   @Autowired
   public UserServiceImp(UserDaoImp userDaoImp) {
      this.userDaoImp = userDaoImp;
   }

   @Transactional
   @Override
   public void add(User user) {
      userDaoImp.add(user);
   }

   @Transactional(readOnly = true)
   @Override
   public List<User> listUsers() {
      return userDaoImp.listUsers();
   }

   @Transactional
   @Override
   public User getUser(String model, int series) {
      return userDaoImp.getUser(model, series);
   }
}
