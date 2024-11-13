package org.example.pp_3_1_1_1.dao;


import org.example.pp_3_1_1_1.model.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);
    void deleteUser(Long id);
    void editUser(User user);
    User getUserById(Long id);
    List<User> getAllUsers();
}
