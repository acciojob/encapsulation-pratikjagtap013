package com.driver.test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import com.driver.RWOnly;

public class TestCases {
    private RWOnly obj = new RWOnly();

    @Test
    public final void testprintHelloWorld() {
        obj.setName("Ritik");
        assertEquals("Ritik", obj.getName());
    }

    @Test
    public final void testprintHelloWorld2() {
        obj.setName("Ritik");
        assertNotEquals("Rithik", obj.getName());
        // assertEquals("Method is overridden in Extendend class B", obj.getName());
    }
}

