package com.vn.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
    public static void main(String[] args) {
        getSessionFactory();
        System.out.println("Connected");
    }

    public static SessionFactory getSessionFactory() {
        //1. load hibernate.cfg.xml
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        return config.buildSessionFactory();
    }
}
