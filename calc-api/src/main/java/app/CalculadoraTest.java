import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import ../Soma.java;
public class CalculadoraTest {

    public CalculadoraTest() {
        }
        @BeforeClass
        public static void setUpClass() throws Exception {
        }
        @AfterClass
        public static void tearDownClass() throws Exception {
        }
        @Before
        public void setUp() {
        }
        @After
        public void tearDown() {
        }
     
        @Test
        public void testSomar() {
            System.out.println("somar");
            int n1 = 5;
            int n2 = 5;
            Calculadora instance = new Soma();
            double expResult = 10.0;
            double result = instance.Soma(n1, n2);
            assertEquals(expResult, result, 0);
        }
    
        @Test
        public void testRaizQuadrada() {
            System.out.println("raiz quadrada");
            String op = "25";
            RaizQuadrada instance = new RaizQuadrada();
            double expResult = 5.0;
            double result = instance.rotaRaizQuadrada(op);
            assertEquals(expResult, result, 0);
        }
}
}
