package ru.belikov.springcourse.service;

import ru.belikov.springcourse.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUser (Long id);
    void saveUser(User user);
    void deleteUser(Long id);
    void updateUser(User user);
}
