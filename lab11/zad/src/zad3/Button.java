package zad3;

public class Button {
    private String label;
    public Button(String label) {
        this.label = label;
    }
    public void onClick(Action action) {
        System.out.println("\nKliknięto przycisk: " + label);
        try {
            action.execute();
        } catch (Exception e) {
            action.handleError();
        }
    }
}
