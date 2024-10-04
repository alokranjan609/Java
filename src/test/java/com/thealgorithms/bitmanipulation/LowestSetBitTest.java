package com.thealgorithms.bitmanipulation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LowestSetBitTest {

    private final LowestSetBit lsb = new LowestSetBit();

    @Test
    void testIsolateLowestSetBit() {
        // Regular positive integers
        assertEquals(1, lsb.isolateLowestSetBit(5));   // 0101 -> Lowest set bit is 1
        assertEquals(2, lsb.isolateLowestSetBit(6));   // 0110 -> Lowest set bit is 2
        assertEquals(8, lsb.isolateLowestSetBit(10));  // 1010 -> Lowest set bit is 2
        assertEquals(1, lsb.isolateLowestSetBit(9));   // 1001 -> Lowest set bit is 1

        // Edge cases
        assertEquals(0, lsb.isolateLowestSetBit(0));   // 0 has no set bits
        assertEquals(1, lsb.isolateLowestSetBit(1));   // 1 has one set bit

        // Powers of two
        assertEquals(1, lsb.isolateLowestSetBit(2));   // 2 -> 10 -> Lowest set bit is 1
        assertEquals(2, lsb.isolateLowestSetBit(4));   // 4 -> 100 -> Lowest set bit is 4
        assertEquals(8, lsb.isolateLowestSetBit(16));  // 16 -> 10000 -> Lowest set bit is 16

        // Numbers with all bits set
        assertEquals(1, lsb.isolateLowestSetBit(15));  // 15 -> 1111 -> Lowest set bit is 1
        assertEquals(1, lsb.isolateLowestSetBit(31));  // 31 -> 11111 -> Lowest set bit is 1

        // Negative integers
        assertEquals(2, lsb.isolateLowestSetBit(-6));  // -6 -> 1010 (in two's complement) -> Lowest set bit is 2
        assertEquals(1, lsb.isolateLowestSetBit(-1));  // -1 has all bits set -> Lowest set bit is 1
    }

    @Test
    void testClearLowestSetBit() {
        // Regular positive integers
        assertEquals(4, lsb.clearLowestSetBit(5));  // 0101 -> Clears the lowest set bit (1)
        assertEquals(4, lsb.clearLowestSetBit(6));  // 0110 -> Clears the lowest set bit (2)
        assertEquals(10, lsb.clearLowestSetBit(11)); // 1011 -> Clears the lowest set bit (1)

        // Edge cases
        assertEquals(0, lsb.clearLowestSetBit(0));   // 0 remains 0 after clearing
        assertEquals(0, lsb.clearLowestSetBit(1));   // 1 becomes 0 after clearing

        // Powers of two
        assertEquals(0, lsb.clearLowestSetBit(2));   // 2 -> 10 -> Clears the lowest set bit (2)
        assertEquals(0, lsb.clearLowestSetBit(4));   // 4 -> 100 -> Clears the lowest set bit (4)
        assertEquals(0, lsb.clearLowestSetBit(16));  // 16 -> 10000 -> Clears the lowest set bit (16)

        // Numbers with all bits set
        assertEquals(14, lsb.clearLowestSetBit(15));  // 15 -> 1111 -> Clears the lowest set bit (1)
        assertEquals(30, lsb.clearLowestSetBit(31));  // 31 -> 11111 -> Clears the lowest set bit (1)

        // Negative integers
        assertEquals(-7, lsb.clearLowestSetBit(-6));  // -6 -> 1010 (in two's complement) -> Clears the lowest set bit (2)
        assertEquals(-2, lsb.clearLowestSetBit(-1));  // -1 has all bits set -> Clears the lowest set bit (1)
    }
}
