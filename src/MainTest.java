import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class MainTest {

    @org.junit.jupiter.api.Test
    void _mintest() {
        int[] numbers = new int[]{2, 3, 4};
        assertEquals(2, Main._min(numbers, 3));
    }

    @org.junit.jupiter.api.Test
    void _maxtest() {
        int[] numbers = new int[]{2, 3, 4};
        assertEquals(4, Main._max(numbers, 3));

    }

    @org.junit.jupiter.api.Test
    void _sumtest() {
        int[] numbers = new int[]{2, 3, 4};
        assertEquals(9, Main._sum(numbers, 3));
    }

    @org.junit.jupiter.api.Test
    void _multtest() {
        int[] numbers = new int[]{2, 3, 4};
        assertEquals(24, Main._mult(numbers, 3));
    }

    @org.junit.jupiter.api.Test
    public void testStandalone_min() {
        long start, end;
        int[] numbers = new int[]{2, 3, 4};
        int result = Main._min(numbers, 3);
        start = System.nanoTime();
        for (int i = 0; i < 1e5; ++i) {
            assertEquals(2, result);
            assertEquals(2, result);
            assertEquals(2, result);
            assertEquals(2, result);
            assertEquals(2, result);
            assertEquals(2, result);
        }
        end = System.nanoTime();

        long duration = end - start;

        System.out.println("_min duration time:" + duration);

    }
    @org.junit.jupiter.api.Test
    public void testStandalone_max() {
        long start, end;
        int[] numbers = new int[]{2, 3, 4};
        int result = Main._max(numbers, 3);
        start = System.nanoTime();
        for (int i = 0; i < 1e5; ++i) {
            assertEquals(4, result);
            assertEquals(4, result);
            assertEquals(4, result);
            assertEquals(4, result);
            assertEquals(4, result);
            assertEquals(4, result);
        }
        end = System.nanoTime();

        long duration = end - start;

        System.out.println("_max duration time:" + duration);

    }
    @org.junit.jupiter.api.Test
    public void testStandalone_sum() {
        long start, end;
        int[] numbers = new int[]{2, 3, 4};
        int result = Main._sum(numbers, 3);
        start = System.nanoTime();
        for (int i = 0; i < 1e5; ++i) {
            assertEquals(9, result);
            assertEquals(9, result);
            assertEquals(9, result);
            assertEquals(9, result);
            assertEquals(9, result);
            assertEquals(9, result);
        }
        end = System.nanoTime();

        long duration = end - start;

        System.out.println("_sum duration time:" + duration);

    }
    @org.junit.jupiter.api.Test
    public void testStandalone_mult() {
        long start, end;
        int[] numbers = new int[]{2, 3, 4};
        int result = Main._mult(numbers, 3);
        start = System.nanoTime();
        for (int i = 0; i < 1e5; ++i) {
            assertEquals(24, result);
            assertEquals(24, result);
            assertEquals(24, result);
            assertEquals(24, result);
            assertEquals(24, result);
            assertEquals(24, result);
        }
        end = System.nanoTime();

        long duration = end - start;

        System.out.println("_mult duration time:" + duration);

    }
    @org.junit.jupiter.api.Test
    public void negative_test() {
        int[] numbers = new int[]{-2, -3, -4};
        assertEquals(-4, Main._min(numbers, 3));
        assertEquals(-2, Main._max(numbers, 3));
        assertEquals(-9, Main._sum(numbers, 3));
        assertEquals(-24, Main._mult(numbers, 3));




    }
}