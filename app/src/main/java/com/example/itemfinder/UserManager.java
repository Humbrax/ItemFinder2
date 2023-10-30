package com.example.itemfinder;

import java.util.ArrayList;

public class UserManager {
    private static UserManager instance;
    private ArrayList<User> userList;
    private User currentUser;  // Variable para rastrear el usuario actual

    private UserManager() {
        userList = new ArrayList<>();
    }

    public static synchronized UserManager getInstance() {
        if (instance == null) {
            instance = new UserManager();
        }
        return instance;
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public boolean isUserExists(String username) {
        for (User user : userList) {
            if (user.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    public boolean isValidUser(String username, String password) {
        for (User user : userList) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                // Al encontrar un usuario válido, establecerlo como el usuario actual
                currentUser = user;
                return true;
            }
        }
        return false;
    }

    public User getCurrentUser() {
        return currentUser;
    }
}
