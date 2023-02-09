package JWT.controllers;

import JWT.enteties.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.net.http.HttpHeaders;

@RestController
@RequestMapping("/api")
public class GeneralApi {

    @GetMapping(path = "/greet", headers = {HttpHeaders.A})
    public String greet(HttpServletRequest req) {
        User user = (User) req.getAttribute("user");
        return user.getName();
    }
}
