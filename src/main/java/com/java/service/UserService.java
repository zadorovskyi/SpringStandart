package com.java.service;

import com.java.dao.UserDao;
import com.java.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.*;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Transactional
    public void addUser() {
        User user = new User("Taras", "Taras");
        userDao.addUser(user);

        int i = 10 / 0;

        File file = new File("C:\\Users\\taras\\Desktop\\Spring IOC\\SpringStandart\\src\\main\\resources\\file.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
