package com.java.dao;

import com.java.domain.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    public void addUser(User user) {
        this.sessionFactory.getCurrentSession().save(user);
    }
}
