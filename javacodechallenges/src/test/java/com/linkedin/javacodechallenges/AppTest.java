package com.linkedin.javacodechallenges;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void shouldCheckEvenNumber(){
        assertEquals(false, App.isEven(5));
    }

    @Test 
    public void shouldVerifyPassword(){
        assertEquals(true, App.verifyPassword("1PaleWis"));
        assertEquals(true, App.verifyPassword("5POSETDet"));
        assertEquals(true, App.verifyPassword("P3TidET"));
        assertEquals(true, App.verifyPassword("elenSeem4"));
        assertEquals(true, App.verifyPassword("525T87s0"));
        assertEquals(true, App.verifyPassword("5POSETDeT"));
        


    }
}
