package app.invest.service;

import app.invest.model.UserRecord;
import app.invest.model.Users;
import app.invest.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public List<Users> getUser(){

        return userRepository.findAll().stream().toList();
    }

    @Transactional
    public void  add(UserRecord userRecord){
        Users users = new Users();
        users.setUserName(userRecord.userName());
        users.setMobile(userRecord.mobile());
        users.setEmail(userRecord.email());
        users.setPassword(userRecord.password());
        users.setFirstName(userRecord.firstName());
        users.setLastName(userRecord.lastName());

        userRepository.save(users);



    }

}
