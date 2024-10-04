package com.thealgorithms.bitmanipulation;
public class LowestSetBit {

    /**
     * Isolates the lowest set bit of the given integer.
     *
     * @param n the integer from which to isolate the lowest set bit.
     * @return the value of the lowest set bit.
     */
    public int isolateLowestSetBit(int n) {
        return n & -n;  // Isolates the lowest set bit using two's complement
    }

    /**
     * Clears the lowest set bit of the given integer.
     *
     * @param n the integer from which to clear the lowest set bit.
     * @return the integer after clearing the lowest set bit.
     */
    public int clearLowestSetBit(int n) {
        return n & (n - 1);  // Clears the lowest set bit
    }

    /**
     * Public method to demonstrate the functionality.
     * 
     * @param n the integer to operate on.
     * @return a formatted string showing results.
     */
    public String operate(int n) {
        int isolated = isolateLowestSetBit(n);
        int cleared = clearLowestSetBit(n);
        return String.format("Input: %d, Isolated Bit: %d, Cleared Bit: %d", n, isolated, cleared);
    }
}

