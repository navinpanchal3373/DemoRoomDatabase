package com.roomdb.persistdb.serviceimpli;

import com.roomdb.persistdb.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAll();

    void insertAll(User users);
}
