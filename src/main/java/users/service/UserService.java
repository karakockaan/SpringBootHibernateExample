package users.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import users.model.User;
import users.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getUserList(){
        List<User> userList = new ArrayList<>();
        userRepository.findAll().forEach(user -> userList.add(user));
        return userList;
    }
}
