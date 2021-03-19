package qwwer1.demo.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import qwwer1.demo.dao.UserRepository;
import qwwer1.demo.models.User;

@RestController
@AllArgsConstructor
public class MainController {
    private final UserRepository userRepository;

    @GetMapping("/hello")
    public String hello() {
        System.out.println("!!!!!!!!!!!");
        return "hello";
    }

    @GetMapping("/hi")
    public String hi() {
        System.out.println("!!!!!!!!!!!");
        return "hi";
    }

    @GetMapping("/user")
    public User getUser() {
        User user = new User();
        user.setName("kokos");
        return userRepository.save(user);
    }
}
