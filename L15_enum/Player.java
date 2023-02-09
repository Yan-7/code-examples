package L15_enum;

import java.time.LocalDateTime;

public class Player {
    private String name;
    private LocalDateTime created = LocalDateTime.now();
    private Level level;

    public Player() {
    }

    public Player(String name, Level level) {
        this.name = name;
        this.level = level;
    }

    public Player(String name, LocalDateTime created, Level level) {
        this.name = name;
        this.created = created;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", created=" + created +
                ", level=" + level +
                '}';
    }
}
