public class PawnTest extends junit.framework.TestCase {

    public void testCreate() {
        Pawn firstPawn = new Pawn(firstPawnColor);
        assertEquals(firstPawn.getColor(), firstPawnColor);

        Pawn secondPawn = new Pawn(secondPawnColor);
        assertEquals(secondPawn.getColor(), secondPawnColor);

        Pawn thridPawn = new Pawn();
    }
}
