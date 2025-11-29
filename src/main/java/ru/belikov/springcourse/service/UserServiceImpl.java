package ru.belikov.springcourse.service;





import org.springframework.stereotype.Service;
import ru.belikov.springcourse.dao.UserDao;
import ru.belikov.springcourse.model.User;


import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.findAll();
    }

    @Override
    public User getUser(Long id) {
        return userDao.findById(id);
    }

    @Override
    public void saveUser(User user) {
        userDao.save(user);

    }

    @Override
    public void deleteUser(Long id) {
        userDao.delete(id);
    }

    @Override
    public void updateUser(User user) {
        userDao.update(user);
    }
}
