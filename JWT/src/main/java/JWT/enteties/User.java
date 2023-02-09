package JWT.enteties;

import javax.persistence.Entity;

@Entity
public class User {

    private int id;
    private String name;
    private String password;
}
