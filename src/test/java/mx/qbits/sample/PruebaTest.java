package mx.qbits.sample;

import static org.junit.Assert.assertTrue;

/*
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;*/
import org.junit.Test;


public class PruebaTest {
    private Prueba p = new Prueba();
    
    @Test
    public void factTest() {
        assertTrue("Prueba 1:", condition(5,120));
    }
    private boolean condition(int a, int b) {
        return p.fact(a)==b;
    }
}
