import java.util.Objects;

public class RPGGame extends ComputerGame {

    private String gameWorld;

    public RPGGame(String title, String producer, String gameWorld) {
        super(title, producer);
        this.gameWorld = gameWorld;
    }

    public String getGameWorld() { return gameWorld; }
    public void setGameWorld(String gameWorld) { this.gameWorld = gameWorld; }

    @Override
    public String toString() {
        return String.format("RPG [%s, Świat: %s]",
                super.toString(), gameWorld);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        if (!super.equals(obj)) return false;

        RPGGame rpgGame = (RPGGame) obj;
        return gameWorld.equals(rpgGame.gameWorld);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), gameWorld);
    }
}
