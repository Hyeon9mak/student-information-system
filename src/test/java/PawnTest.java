public class PawnTest extends junit.framework.TestCase {

    public void testCreate() {
        final String firstPawnColor = "black";
        final String secondPawnColor = "white";

        Pawn firstPawn = new Pawn(firstPawnColor);
        Pawn secondPawn = new Pawn(secondPawnColor);

        assertEquals(firstPawn.getColor(), firstPawnColor);
        assertEquals(secondPawn.getColor(), secondPawnColor);
    }
}
