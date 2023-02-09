package JWT.controllers;


import JWT.auth.UserCredentials;
import JWT.enteties.User;
import JWT.repositories.UserRepository;
import JWT.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class UserController {

    @Autowired
    private AuthService authService;

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public String login(@RequestBody UserCredentials userCredentials) throws Exception {

        try {
            return authService.login(userCredentials);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, e.getMessage());
        }
    }

    // TODO: 26/01/2023
//    @GetMapping("/getUser")
//    public User showUserDetails() {
//
//    }

}
