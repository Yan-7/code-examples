package JWT.auth;

import JWT.enteties.User;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
@Component
public class JwtUtil extends JwtUtilAbstract<User,Integer> {
    @Override
    public String generateToken(User user) {
        Map<String,Object> claims = new HashMap<>();
        claims.put("id",user.getId());
        claims.put("email",user.getName());
        return this.createToken(claims, user.getId());
    }

    @Override
    public User extractUser(String token) throws JwtException {
        Claims claims = this.extractAllClaims(token);
        int id = Integer.parseInt(claims.getSubject());
        String name = claims.get("name", String.class);

        User user = new User(id,name,"1234");
        return user;
    }
}
