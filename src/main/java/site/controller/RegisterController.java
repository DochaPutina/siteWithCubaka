package site.controller;

import com.tej.JooQDemo.jooq.sample.model.tables.pojos.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import site.services.UsersService;


@Controller
public class RegisterController {

    @Autowired
    private UsersService usersService;

    @PostMapping("/registration")
    public String addUser(Users users){
        if(usersService.getUsers().contains(users)){
            return "registration";
        }
        usersService.insertUsers(users);
        return "redirect:/login";
    }


}
