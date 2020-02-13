import junit.framework.TestCase;

public class MainTest extends TestCase {

    public void testMain() {
    }

    public void testGenerateRandomInt() {
        // number is not null
        assertNotNull(Main.generateRandomInt());
     }

    public void testDevinerunchiffre() {

     }

    public void testVérifierlareponse() {
        // verifier la reponse
        assertNotNull(Main.vérifierlareponse(0,1));
        assertEquals(Main.vérifierlareponse(8,8),"félicitations");
        assertEquals(Main.vérifierlareponse(5,2),"trop grand");
        assertEquals(Main.vérifierlareponse(2,8),"trop petit");
        assertEquals(Main.vérifierlareponse(-1,0),"Exit");



    }
}
