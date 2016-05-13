package com.epam.arrays.test;

import static org.junit.Assert.*;

import com.epam.arrays.lab.Model;
import org.junit.Test;

import java.util.*;

/**
 * Created by Asus on 13.05.2016.
 */
public class ModelTest {

    public static final int[] ARRAY_ZERO = {0, 2, 0, 3, 0};
    public static final int[] ARRAY_FIVE = {23, -75, 50, 17, -11};
    public static final int[] ARRAY_FIVE_EQUAL = {45, -75, 45, 17, 11};
    public static final int[] ARRAY_TEN = {81, -48, 90, 70, -84, 78, 62, -94, -91, -34};
    public static final int[] ARRAY_FIFTEEN = {53, 6, -64, 43, -9, -56, -75, -26, 29, 32, -66, 64, -98, 99, 66};

    Model model = new Model();

    @Test
    public void testFindSum() {
        assertEquals("Find sum of array elements", 30, model.findSum(ARRAY_TEN));
    }

    @Test
    public void testFindMax() {
        assertEquals("Find max element", new HashMap.SimpleEntry(2, 50), model.findMax(ARRAY_FIVE));
    }

    @Test
    public void testFindMin() {
        assertEquals("Find min element", new HashMap.SimpleEntry(12, -98), model.findMin(ARRAY_FIFTEEN));
    }

    @Test
    public void testFindAverage() {
        assertEquals("Find average value", 3, model.findAverage(ARRAY_TEN));
    }

    @Test
    public void testCountEqualElements() {
        assertEquals("Count number of elements equal to 29", 1, model.countEqualElements(ARRAY_FIFTEEN, 29));
    }

    @Test
    public void testCountEqualZero() {
        assertEquals("Count number of elements equal to 0", 3, model.countEqualZero(ARRAY_ZERO));
    }

    @Test
    public void testCountMoreThanZero() {
        assertEquals("Count number of elements more than 0", 3, model.countMoreThanZero(ARRAY_FIVE));
    }

    @Test
    public void testMultiplyElements() {
        int[] arr = Arrays.copyOf(ARRAY_ZERO, 5);
        model.multiplyElements(arr, 5);

        assertArrayEquals("Multiply each element by number 5", new int[]{0, 10, 0, 15, 0}, arr);
    }

    @Test
    public void testAddIndexToElements() {
        int[] arr = Arrays.copyOf(ARRAY_FIVE, 5);
        model.addIndexToElements(arr);

        assertArrayEquals("Add to each element its index", new int[]{23, -74, 52, 20, -7}, arr);
    }

    @Test
    public void testSetEvenElementsZero() {
        int[] arr = Arrays.copyOf(ARRAY_TEN, 10);
        model.setEvenElementsZero(arr);

        assertArrayEquals("Set even elements to zero", new int[]{81, 0, 0, 0, 0, 0, 0, 0, -91, 0}, arr);
    }

    @Test
    public void testSetOddElementsZero() {
        int[] arr = Arrays.copyOf(ARRAY_FIFTEEN, 15);
        model.setOddElementsZero(arr);

        assertArrayEquals("Set elements with odd index to zero",
                new int[]{53, 0, -64, 0, -9, 0, -75, 0, 29, 0, -66, 0, -98, 0, 66}, arr);
    }

    @Test
    public void testFindFirstPositiveElement() {
        assertEquals("First positive element", new HashMap.SimpleEntry(0, 81),
                model.findFirstPositiveElement(ARRAY_TEN));
    }

    @Test
    public void testFindLastNegativeElement() {
        assertEquals("Last negative element", new HashMap.SimpleEntry(9, -34),
                model.findLastNegativeElement(ARRAY_TEN));
    }

    @Test
    public void testFindElementIndexes() {
        List list = new ArrayList<>();
        list.add(3);

        assertEquals("Find all indexes in array of one element", list,
                model.findElementIndexes(ARRAY_TEN, 70));
    }

    @Test
    public void testCheckAscendingOrder() {
        int[] arr = Arrays.copyOf(ARRAY_FIFTEEN, 15);
        Arrays.sort(arr);

        assertTrue(model.checkAscendingOrder(arr));
    }

    @Test
    public void testCheckDescendingOrder() {
        int[] arr = Arrays.copyOf(ARRAY_FIFTEEN, 15);
        Arrays.sort(arr);


        assertFalse(model.checkDescendingOrder(arr));
    }

    @Test
    public void testShiftArray() {
        int[] arr = Arrays.copyOf(ARRAY_FIFTEEN, 15);

        model.shiftArray(arr, 4);
        assertArrayEquals("Shift array by 4 positions right",
                new int[]{64, -98, 99, 66, 53, 6, -64, 43, -9, -56, -75, -26, 29, 32, -66}, arr);
    }

    @Test
    public void testFindEqualElements() {
        Map map = new HashMap();
        map.put(0, 0);
        map.put(2, 0);
        map.put(4, 0);

        assertEquals("Find all unique elements", map, model.findEqualElements(ARRAY_ZERO));
    }

    @Test
    public void testCountMoreThanAverage() {
        assertEquals("Count number of elements bigger than average", 2, model.countMoreThanAverage(ARRAY_ZERO));
    }

    @Test
    public void testFindUniqueElements() {
        Map map = new HashMap();
        map.put(1, 2);
        map.put(3, 3);

        assertEquals("Find all unique elements", map, model.findUniqueElements(ARRAY_ZERO));
    }

    @Test
    public void testCountElementsEqualFirst() {
        assertEquals("Count elements that equal first element", 1,
                model.countElementsEqualFirst(ARRAY_FIVE_EQUAL));
    }

    @Test
    public void testFindUniqueElementsTwoArrays() {
        Map map = new HashMap();
        map.put(0, 23);
        map.put(2, 50);
        map.put(4, -11);

        assertEquals("Find all unique elements in first array", map,
                model.findUniqueElements(ARRAY_FIVE, ARRAY_FIVE_EQUAL));
    }

    @Test
    public void testMergeSortedArrays() {
        int[] arr1 = Arrays.copyOf(ARRAY_FIFTEEN, 15);
        int[] arr2 = Arrays.copyOf(ARRAY_TEN, 10);
        int[] concat = new int[arr1.length + arr2.length];

        System.arraycopy(arr1, 0, concat, 0, arr1.length);
        System.arraycopy(arr2, 0, concat, arr1.length, arr2.length);

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(concat);

        assertArrayEquals("Merge previously sorted arrays", concat, model.mergeSortedArrays(arr1, arr2));
    }

    @Test
    public void testRearrangeArray() {
        int[] arr = Arrays.copyOf(ARRAY_FIFTEEN, 15);
        model.rearrangeArray(arr);

        assertArrayEquals("Swap positive and negative numbers",
                new int[]{-98, -66, -64, -26, -9, -56, -75, 43, 29, 32, 6, 64, 53, 99, 66}, arr);
    }

}