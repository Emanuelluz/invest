package app.invest.controller;

import app.invest.model.UserRecord;
import app.invest.model.Users;
import app.invest.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {

    final
    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<Users> getAll(){
        return userService.getUser();
    }

    @PostMapping
    public void addUser (UserRecord userRecord){
        userService.add(userRecord);

    }


}
