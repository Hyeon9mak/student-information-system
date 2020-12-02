public class Pawn {

    private String color;
    final String firstPawnColor = "black";
    final String secondPawnColor = "white";

    public Pawn(String color) {
        this.color = color;
    }

    public Pawn() {
        this.color = "white";
    }

    public String getColor() {
        return color;
    }
}
