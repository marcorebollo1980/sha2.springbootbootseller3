package service;

import model.User;

import java.util.Optional;

public interface IUserService{


    User saveUser(User user);


    Optional<User> findByUsername(String userName);

    void makeAdmin(String userName);
}
