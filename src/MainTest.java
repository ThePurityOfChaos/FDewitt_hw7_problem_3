import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MainTest {
        @Test
        public void autoComplete(){
                String[][] expected ={{"hello", "high", "hollow", "how"},{"seattle", "seatac", "see"},{"seattle", "seatac"},{"hollow", "how"},{},{"epstein didn't"}, {"khimself"}};
                String[][] actual = new String[expected.length][];
                        actual[0]=Main.autoComplete("h");
                        actual[1]=Main.autoComplete("se");
                        actual[2]=Main.autoComplete("sea");
                        actual[3]=Main.autoComplete("ho");
                        actual[4]=Main.autoComplete("xyz");
                        actual[5]=Main.autoComplete("e");
                        actual[6]=Main.autoComplete("k");
                        assertEquals(expected,actual);
                assertTrue(actual[5][0].equals("epstein didn't")); // comedy.
                assertTrue(actual[6][0].equals("khimself"));
        }
}
