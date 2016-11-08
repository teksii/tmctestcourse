
import fi.helsinki.cs.tmc.edutestutils.Points;
import org.junit.Test;
import static org.junit.Assert.*;

@Points("trivial.1")
public class A_TrivialTest {
    @Test
    public void testF() {
        Trivial t = new Trivial();
        assertEquals(1, t.f());
    }
}
