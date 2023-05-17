package example1;

public class SavedGameProxy implements SavedGame {

    private String name;
    private SavedGame sg;
    @Override
    public void initialize() {
        this. name = "Save Game - " + String.valueOf(System.currentTimeMillis());
    }

    @Override
    public void loadGame() {
        // w rzeczywistym przypadku ładujemy tylko jeden wybrany save gry
        sg = new SavedGameFull();
        sg.initialize();
        sg.loadGame();
    }

    @Override
    public String getName() {

        return this.name;
    }
}
