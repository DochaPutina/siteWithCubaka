package site;

import com.tej.JooQDemo.jooq.sample.model.tables.pojos.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import site.services.UsersService;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/users")
public class ServingWebContentApplication {

    @Autowired
    private UsersService service;

    @PostMapping
    public String addUser(@RequestBody Users users) {
        service.insertUsers(users);
        return "user added";
    }

    @GetMapping
    public List<Users> getUsers() {
        return service.getUsers();
    }

    public static void main(String[] args) {
        SpringApplication.run(ServingWebContentApplication.class, args);
    }
}
