package SnakeAndLadder_LLD;

import java.util.Random;
import java.util.List;

public class Player {
    private String name;
    private int id = 1;

    Player(String name) {
        this.name = name;
        this.id = setId();
    }
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int setId() {
        return id++;
    }
}
