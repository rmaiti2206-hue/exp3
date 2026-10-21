
package com.electricity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testBillFor100Units() {
        assertEquals(
            300.0,
            App.calculateBill(100),
            0.001
        );
    }

    @Test
    void testBillFor150Units() {
        assertEquals(
            550.0,
            App.calculateBill(150),
            0.001
        );
    }

    @Test
    void testBillFor250Units() {
        assertEquals(
            1150.0,
            App.calculateBill(250),
            0.001
        );
    }

    @Test
    void testNegativeUnits() {
        assertThrows(
            IllegalArgumentException.class,
            () -> App.calculateBill(-1)
        );
    }
}
