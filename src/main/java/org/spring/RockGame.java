package org.spring;

public class RockGame {
    private int value;
    private String player;

    public RockGame(int value, String player) {
        this.value = value;
        this.player = player;
    }

    public int getValue() {
        return value;
    }

    public String getPlayer() {
        return player;
    }

}
