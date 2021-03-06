import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
package app;
public class CalculadoraTest {

    public CalculadoraTest() {

        Soma instance = new Soma();

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
        /**
         * Test of somar method, of class Calculadora.
         */
        @Test
        public void testSoma() {
            System.out.println("soma");
            double n1 = 5.0;
            double n2 = 5.0;
            double expResult = 10.0;
            double result = instance.Soma(n1, n2);
            assertEquals(expResult, result,0);
        }

        @Test
            public void testSoma_invalido(){
                assertThrows(IllegalArgumentException.class, {}=> (
                    instance.Soma("a","2");
                ));
            }
        @Test
            public void testSoma_invalido(){
                assertThrows(IllegalArgumentException.class, {}=> (
                    instance.Soma("1","b");
                ));
            }
    }
}