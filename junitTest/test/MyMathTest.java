import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by dima on 14.05.17.
 */
class MyMathTest {

    MyMath myMath;

    @BeforeEach
    void setUp() {
        myMath = new MyMath();
    }

    @Test
    void testSquare() {
        assertEquals(16, myMath.square(4));
    }

    @Test
    void testSquareNegative() {
        assertEquals(16, myMath.square(-4));
    }

    @Test
    void testSum() {
        assertEquals(16, myMath.sum(15, 1));
    }

    @Test
    void testSumNegative() {
        assertEquals(16, myMath.sum(17, -1));
    }

    @Test
    void testDivision() {
        assertEquals(2, myMath.division(16, 8));
    }

    @Test
    void testDivisionNegative() {
        assertEquals(-2, myMath.division(-16, 8));
    }

}