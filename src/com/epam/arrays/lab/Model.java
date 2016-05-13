package com.epam.arrays.lab;

import java.util.*;

/**
 * Different methods for work with arrays.
 */
public class Model {

    private static final int MIN = -100;
    private static final int MAX = 100;

    /**
     * Finds sum of array elements.
     *
     * @param arr Input array of integers.
     * @return Sum of array elements.
     */
    public int findSum(int arr[]) {
        int sum = 0;

        for (int i : arr) {
            sum += i;
        }

        return sum;
    }

    /**
     * Finds array's max element and its index.
     *
     * @param arr Input array of integers.
     * @return Map.Entry, where key is max element's index
     * and value is max element's value.
     */
    public Map.Entry<Integer, Integer> findMax(int arr[]) {
        int max = arr[0];
        int index = 0;
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                index = i;
            }
        }

        return new HashMap.SimpleEntry(index, max);
    }

    /**
     * Finds array's min element and its index.
     *
     * @param arr Input array of integers.
     * @return Map.Entry, where key is min element's index
     * and value is min element's value.
     */
    public Map.Entry<Integer, Integer> findMin(int arr[]) {
        int min = arr[0];
        int index = 0;
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                index = i;
            }
        }

        return new HashMap.SimpleEntry(index, min);
    }

    /**
     * Finds average value of array's elements.
     *
     * @param arr Input array of integers.
     * @return Average value of array's elements.
     */
    public int findAverage(int arr[]) {
        return findSum(arr) / arr.length;
    }

    /**
     * Counts number of elements that equal given value.
     *
     * @param arr Input array of integers.
     * @param value Value to search in array.
     * @return Number of elements that equal given value.
     */
    public int countEqualElements(int arr[], int value) {
        int counter = 0;

        for (int i : arr) {
            if (i == value) {
                counter++;
            }
        }

        return counter;
    }

    /**
     * Counts number of elements that equal zero.
     *
     * @param arr Input array of integers.
     * @return Number of elements that equal zero.
     */
    public int countEqualZero(int arr[]) {
        return countEqualElements(arr, 0);
    }

    /**
     * Counts number of elements that are bigger than zero.
     *
     * @param arr Input array of integers.
     * @return Number of elements that are bigger than zero.
     */
    public int countMoreThanZero(int arr[]) {
        return countMoreThanValue(arr, 0);
    }

    /**
     * Multiplies all elements of array by given number.
     *
     * @param arr Input array of integers.
     * @param multiplier Number to multiply elements by.
     */
    public void multiplyElements(int arr[], int multiplier) {
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            arr[i] *= multiplier;
        }
    }

    /**
     * Adds to all elements of array their index.
     *
     * @param arr Input array of integers.
     */
    public void addIndexToElements(int arr[]) {
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            arr[i] += i;
        }
    }

    /**
     * Sets all array elements with even value to zero.
     *
     * @param arr Input array of integers.
     */
    public void setEvenElementsZero(int arr[]) {
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            if ((arr[i] % 2) == 0) {
                arr[i] = 0;
            }
        }
    }

    /**
     * Sets all array elements with odd index to zero.
     *
     * @param arr Input array of integers.
     */
    public void setOddElementsZero(int arr[]) {
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            if ((i % 2) != 0) {
                arr[i] = 0;
            }
        }
    }

    /**
     * Finds first positive element in array.
     *
     * @param arr Input array of integers.
     * @return Map.Entry, where key is element's index
     * and value is element's value. If there are no positive elements
     * in array, returns null.
     */
    public Map.Entry<Integer, Integer> findFirstPositiveElement(int arr[]) {
        Map.Entry positiveElement = null;
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            if (arr[i] > 0) {
                positiveElement = new HashMap.SimpleEntry(i, arr[i]);

                break;
            }
        }

        return positiveElement;
    }

    /**
     * Finds last negative element in array.
     *
     * @param arr Input array of integers.
     * @return Map.Entry, where key is element's index
     * and value is element's value. If there are no negative elements
     * in array, returns null.
     */
    public Map.Entry<Integer, Integer> findLastNegativeElement(int arr[]) {
        Map.Entry negativeElement = null;
        int length = arr.length - 1;

        for (int i = length; i >= 0; i--) {
            if (arr[i] < 0) {
                negativeElement = new HashMap.SimpleEntry(i, arr[i]);

                break;
            }
        }

        return negativeElement;
    }

    /**
     * Finds occurrence indexes of element in array.
     *
     * @param arr Input array of integers.
     * @param value Value to search in array.
     * @return List with all occurrence indexes of element in array.
     * If there is no such value in array, returns empty list.
     */
    public List findElementIndexes(int arr[], int value) {
        int length = arr.length;
        List indexes = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            if (arr[i] == value) {
                indexes.add(i);
            }
        }

        return indexes;
    }

    /**
     * Checks if array elements are ordered ascending.
     *
     * @param arr Input array of integers.
     * @return boolean.
     */
    public boolean checkAscendingOrder(int arr[]) {
        int length = arr.length - 1;

        for (int i = 0; i < length; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }

        return true;
    }

    /**
     * Checks if array elements are ordered descending.
     *
     * @param arr Input array of integers.
     * @return boolean.
     */
    public boolean checkDescendingOrder(int arr[]) {
        int length = arr.length - 1;

        for (int i = 0; i < length; i++) {
            if (arr[i] < arr[i + 1]) {
                return false;
            }
        }

        return true;
    }

    /**
     * Cyclically shifts array elements by k- positions right.
     *
     * @param arr Input array of integers.
     * @param shift Number of steps to shift elements.
     */
    public void shiftArray(int arr[], int shift) {
        int length = arr.length;
        int[] result = new int[shift];

        for (int i = 0; i < shift; i++) {
            result[i] = arr[length - shift + i];
        }

        System.arraycopy(arr, 0, arr, shift, length - shift);

        for (int i = 0; i < shift; i++) {
            arr[i] = result[i];
        }
    }

    /**
     * Finds elements in array, values of which equal values of other elements.
     *
     * @param arr Input array of integers.
     * @return Map with all elements that have duplicates. Each MapEntry's
     * key is index of element and value is value of element.
     * If there are no such values in array, returns empty map.
     */
    public Map findEqualElements(int arr[]) {
        int length = arr.length;
        Map equalElements = new HashMap<>();

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if ((arr[i] == arr[j])) {
                    equalElements.put(i, arr[i]);
                    equalElements.put(j, arr[j]);
                }
            }
        }

        return equalElements;
    }

    /**
     * Counts number of elements that are bigger than average value of
     * array elements.
     *
     * @param arr Input array of integers.
     * @return Number of elements that are bigger than average value of
     * array elements.
     */
    public int countMoreThanAverage(int arr[]) {
        return countMoreThanValue(arr, findAverage(arr));
    }

    /**
     * Finds elements in array, values of which are unique.
     *
     * @param arr Input array of integers.
     * @return Map with all elements that are unique. Each MapEntry's
     * key is index of element and value is value of element.
     * If there are no such values in array, returns empty map.
     */
    public Map findUniqueElements(int arr[]) {
        int length = arr.length;
        boolean unique = true;
        Map uniqueElements = new HashMap<Integer, Integer>();

        for (int i = 0; i < length; i++) {
            unique = true;

            for (int j = 0; j < length; j++) {
                if ((arr[i] == arr[j]) && (i != j)) {
                    unique = false;

                    break;
                }
            }

            if (unique) {
                uniqueElements.put(i, arr[i]);
            }
        }

        return uniqueElements;
    }

    /**
     * Finds elements of first array that do not have duplicates in second array.
     *
     * @param arr1 First array.
     * @param arr2 Second array.
     * @return Map with all elements from first array that do not have duplicates.
     * Each MapEntry's key is index of element and value is value of element.
     * If there are no such values in array, returns empty map.
     */
    public Map findUniqueElements(int arr1[], int arr2[]) {
        int length = arr1.length;
        Map uniqueElements = new HashMap<Integer, Integer>();

        Arrays.sort(arr2);

        for (int i = 0; i < length; i++) {
            if (!binarySearch(arr2, arr1[i])) {
                uniqueElements.put(i, arr1[i]);
            }
        }

        return uniqueElements;
    }

    /**
     * Counts number of elements that equal to the value of first array element.
     *
     * @param arr Input array of integers.
     * @return Number of elements that equal to the value of first array element.
     */
    public int countElementsEqualFirst(int[] arr) {
        int counter = 0;
        int length = arr.length;

        for (int i = 1; i < length; i++) {
            if (arr[i] == arr[0]) {
                counter++;
            }
        }

        return counter;
    }

    /**
     * Merges two sorted arrays in sorted one, without sorting it separately.
     *
     * @param arr1 First sorted array.
     * @param arr2 Second sorted array.
     * @return Sorted array that is result of merging two given arrays.
     */
    public int[] mergeSortedArrays(int[] arr1, int arr2[]) {
        int i = 0;
        int j = 0;
        int k = 0;
        int length1 = arr1.length;
        int length2 = arr2.length;
        int[] result = new int[length1 + length2];

        while ((i < length1) && (j < length2)) {
            if (arr1[i] <= arr2[j]) {
                result[k++] = arr1[i++];
            } else { // (arr1[i] > arr2[j])
                result[k++] = arr2[j++];
            }
        }

        while (i < length1) {
            result[k++] = arr1[i++];
        }

        while (j < length2) {
            result[k++] = arr2[j++];
        }

        return result;
    }

    /**
     * Rearranges elements in array - swaps positive and negative numbers.
     *
     * @param arr  Input array of integers.
     */
    public void rearrangeArray(int arr[]) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            while (arr[low] < 0) {
                low++;
            }

            while (arr[high] > 0) {
                high--;
            }

            if (low < high) {
                swap(arr, low, high);
            }
        }
    }

    /**
     * Generates an array of random integers with length n.
     *
     * @param n The length of the array to generate.
     * @return Array of random integers with length n.
     */
    public int[] generateRandomNumbers(int n) {
        int[] result = new int[n];
        Random random = new Random();

        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(MAX + 1 - MIN) + MIN;
        }

        return result;
    }

    // Helper methods

    /**
     * Swaps two values of array elements.
     *
     * @param arr Input array of integers.
     * @param firstIndex Index of first element to swap with.
     * @param secondIndex Index of second element to swap with.
     */
    private void swap(int arr[], int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }

    /**
     * Counts number of elements that are bigger than given value.
     *
     * @param arr Input array of integers.
     * @param value Value to compare with.
     * @return Number of elements that are bigger than given value.
     */
    private int countMoreThanValue(int arr[], int value) {
        int counter = 0;

        for (int i : arr) {
            if (i > value) {
                counter++;
            }
        }

        return counter;
    }

    /**
     * Binary search algorithm.
     *
     * @param arr  Input sorted array of integers.
     * @param value Value to search in array.
     * @return boolean.
     */
    private static boolean binarySearch(int arr[], int value){
        int length = arr.length;
        int low = 0;
        int high = length - 1;

        while (high >= low) {
            int middle = (low + high) / 2;

            if (arr[middle] == value) {
                return true;
            } else if(arr[middle] < value) {
                low = middle + 1;
            } else { // data[middle] > value
                high = middle - 1;
            }
        }

        return false;
    }
}
