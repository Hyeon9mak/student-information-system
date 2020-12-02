public class PawnTest extends junit.framework.TestCase {

    public void testCreate() {
        final String firstPawnColor = "black";
        final String secondPawnColor = "white";

        Pawn firstPawn = new Pawn(firstPawnColor);
        assertEquals(firstPawn.getColor(), firstPawnColor);

        Pawn secondPawn = new Pawn(secondPawnColor);
        assertEquals(secondPawn.getColor(), secondPawnColor);

        Pawn thridPawn = new Pawn();
    }
}
