package org.inheritance;

class Game {

    private String name;
    private int maxPlayers;

    public Game(String name, int maxPlayers) {
        this.name = name;
        this.maxPlayers = maxPlayers;
    }

    public String getName() {
        return name;
    }

    public void start() {
        System.out.println("Starting game...");
    }
}

class BoardGame extends Game {

    private String boardType;

    public BoardGame(String name, int maxPlayers, String boardType) {
        super(name, maxPlayers);
        this.boardType = boardType;
    }

    @Override
    public void start() {
        System.out.println("Starting board game...");
    }

    public void setUpBoard() {
        System.out.println(super.getName() + " board set up with type " + boardType);
    }
}

class VideoGame extends Game {
    String platform;

    public VideoGame(String name, int maxPlayers, String platform) {
        super(name, maxPlayers);
        this.platform = platform;
    }

    public void connectToPlatform() {
        System.out.println(super.getName() + " connecting to platform " + platform);
    }
}

public class GameBox {
    public static void main(String[] args) {

        Game boardGame = new BoardGame("Board", 10, "Game");
        Game videoGame = new VideoGame("Video", 10, "PC");

        boardGame.start();
        videoGame.start();
    }
}
