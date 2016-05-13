package com.epam.arrays.lab;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Created by Asus on 12.05.2016.
 */
public class View {

    public static final String GREETING = "This lab contains different methods of work with arrays.";
    public static final String ARRAY_ELEMENT = "arr[%d]=%d";
    public static final String INPUT_ARRAY = "Input array is: ";
    public static final String FIRST_ARRAY = "First array is: ";
    public static final String SECOND_ARRAY = "Second array is: ";
    public static final String SUM = "Task 1: Sum of array elements: ";
    public static final String MAX = "Task 2: Array max element: ";
    public static final String MIN = "Task 3: Array min element: ";
    public static final String AVERAGE = "Task 4: Average value of array elements: ";
    public static final String EQUAL_NUMBER = "Task 5: Number of elements equal to %d: %d";
    public static final String EQUAL_ZERO = "Task 6: Number of elements equal to 0: ";
    public static final String MORE_ZERO = "Task 7: Number of elements more than 0: ";
    public static final String MULTIPLY = "Task 8: Array after multiplication of each element by ";
    public static final String ADD_INDEX = "Task 9: Array after adding to each element its index ";
    public static final String SET_EVEN_ZERO = "Task 10: Array after all its elements with even values " +
            "were set to zero ";
    public static final String SET_ODD_ZERO = "Task 11: Array after all its elements with odd indexes " +
            "were set to zero ";
    public static final String FIRST_POS = "Task 12: First positive element in array: ";
    public static final String LAST_NEG = "Task 13: Last negative element in array: ";
    public static final String INDEXES_OF_VALUE = "Task 14: All occurrence indexes in array of number ";
    public static final String ASC_ORDER = "Task 15: Array elements are ordered ascending: ";
    public static final String DESC_ORDER = "Task 16: Array elements are ordered descending: ";
    public static final String SHIFT = "Task 17: Array after cyclic shift right by ";
    public static final String DUPLICATES = "Task 18: Elements in array that have duplicates ";
    public static final String MORE_AVERAGE = "Task 19: Number of elements bigger than average value: ";
    public static final String UNIQUE = "Task 20: Elements in array that are unique ";
    public static final String UNIQUE_ARRAYS = "Task 21: Elements from first array that do not have " +
            "duplicates in second array.";
    public static final String EQUAL_FIRST = "Task 22: Number of elements equal to the value of first " +
            "array element in first array: ";
    public static final String MERGE = "Task 23: Merge of two sorted arrays in sorted one, without sorting " +
            "it separately ";
    public static final String REARRANGE = "Task 24: First array after swapping positive and negative numbers ";
    public static final String NOT_FOUND = "Such elements were not found.";
    public static final String SEPARATOR = "***";

    public void printMessage(String... messages) {
        for (String message : messages) {
            System.out.println(message);
        }
    }

    public void printMessageAndTwoNumbers(String message, int num1, int num2) {
        printMessage(String.format(message, num1, num2));
    }

    public void printIntArray(int[] arr) {
        printMessage(Arrays.toString(arr));
    }

    public void printMap(Map map) {
        if (!map.isEmpty()) {
            map.forEach((k, v) -> System.out.print("a[" + k + "]=" + v + "\t"));
            printMessage("");
        } else {
            printMessage(NOT_FOUND);
        }
    }

    public void printList(List list) {
        if (!list.isEmpty()) {
            printMessage(list.toString());
        } else {
            printMessage(NOT_FOUND);
        }
    }
}
