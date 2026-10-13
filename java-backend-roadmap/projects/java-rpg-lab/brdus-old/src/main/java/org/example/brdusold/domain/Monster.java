package org.example.brdusold.domain;

public class Monster {

    private long id;
    private String name;
    private long health;
    private long attact;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getHealth() {
        return health;
    }

    public void setHealth(long health) {
        this.health = health;
    }

    public long getAttact() {
        return attact;
    }

    public void setAttact(long attact) {
        this.attact = attact;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", health=" + health +
                ", attact=" + attact +
                '}';
    }
}
