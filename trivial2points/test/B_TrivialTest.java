
import fi.helsinki.cs.tmc.edutestutils.Points;
import org.junit.Test;
import static org.junit.Assert.*;

@Points("trivial.2")
public class B_TrivialTest {
    @Test
    public void testFF() {
        Trivial t = new Trivial();
        assertEquals(2, t.f());
    }
}
