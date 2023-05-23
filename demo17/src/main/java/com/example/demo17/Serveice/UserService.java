package com.example.demo17.Serveice;


import java.util.List;

import com.example.demo17.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserService userRepository;

    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    public User addUser(User user) {
        return userRepository.addUser(user);
    }

    public User updateUser(User user) {
        return userRepository.updateUser(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteUser(id);
    }

    public User getUserByUsernameAndPassword(String username, String password) {
        return userRepository.getUserByUsernameAndPassword(username, password);
    }

    public User getUserByEmail(String email) {
        return userRepository.getUserByEmail(email);
    }

    public List<User> getUsersByRole(String role) {
        return userRepository.getUsersByRole(role);
    }

    public List<User> getUsersByAge(Integer age) {
        return userRepository.getUsersByAge(age);
    }
}