package task_1;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import org.junit.Test;

public class ParabolaTest {

    @Test
    public void testCalculateY() {
        double expected = 0;
        Parabola parabola = new Parabola(1, -2, 1);
        double root = parabola.calculateY(1);
        assertEquals(expected, root, 0.001);
    }

    @Test
    public void testCalculateX() throws Exception {
        double[] expected = new double[]{2, -2};
        Parabola parabola = new Parabola(1, 0, -4);
        double[] roots = parabola.calculateX(0);
        assertArrayEquals(expected, roots, 1e-6);
    }

    @Test
    public void testNoRealRoots() {
        Parabola parabola = new Parabola(1, 0, 4);
        assertThrows(Exception.class, () -> parabola.calculateX(0));
    }
}
