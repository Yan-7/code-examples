package JWT.services;

import JWT.auth.JwtUtil;
import JWT.auth.UserCredentials;
import JWT.enteties.User;
import JWT.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private UserRepository userRepository;

    public String register (User user) {
        // business logic comes here - check user values
        this.userRepository.saveAndFlush(user);
        return this.jwtUtil.generateToken(user);
    }

    public String login(UserCredentials userCredentials) throws Exception {
        User user = userRepository.findByName(userCredentials.getName());
        String token = jwtUtil.generateToken(user);
        return token;
    }
}
