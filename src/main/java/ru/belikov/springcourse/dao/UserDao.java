package ru.belikov.springcourse.dao;


import ru.belikov.springcourse.model.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();

    User findById(Long id);

    void save(User user);

    void update(User user);

    void delete(Long id);
}
