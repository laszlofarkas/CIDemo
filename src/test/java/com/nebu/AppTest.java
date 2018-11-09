package com.nebu;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void addShouldadd() {
        assertEquals("Add sould return the correct value", 5, App.add(2, 3));
    }
}
