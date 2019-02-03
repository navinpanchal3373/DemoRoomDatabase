package com.roomdb.persistdb.serviceimpli;

import android.content.Context;

import com.roomdb.persistdb.AppDatabase;
import com.roomdb.persistdb.dao.UserDao;
import com.roomdb.persistdb.entity.User;

import java.util.List;

public class UserServiceImpl implements UserService {

    UserDao userDao;

    public UserServiceImpl(Context context) {
        userDao = AppDatabase.getInstance(context).getUserDao();
    }

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }

    @Override
    public void insertAll(User users) {
        userDao.insertAll(users);
    }
}
