package com.epam.arrays.lab;

import java.util.Arrays;
import java.util.Map;

/**
 * Created by Asus on 12.05.2016.
 */
public class Controller {

    private static final int SIZE = 15;
    private static final int NUM = 7;

    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    // The work method
    public void processUser() {
        view.printMessage(View.GREETING);
        printMenu();
    }

    // Utility methods
    private void printMenu() {
        Map.Entry<Integer, Integer> entry;

        int[] arr1 = model.generateRandomNumbers(SIZE);
        int[] arr2 = model.generateRandomNumbers(SIZE);
        int[] temp = model.generateRandomNumbers(SIZE);

        view.printMessage(View.INPUT_ARRAY);
        view.printIntArray(arr1);
        view.printMessage(View.SEPARATOR);
        view.printMessage(View.SUM + model.findSum(arr1));
        view.printMessage(View.SEPARATOR);

        entry = model.findMax(arr1);

        view.printMessageAndTwoNumbers(View.MAX + View.ARRAY_ELEMENT, entry.getKey(), entry.getValue());
        view.printMessage(View.SEPARATOR);

        entry = model.findMin(arr1);

        view.printMessageAndTwoNumbers(View.MIN + View.ARRAY_ELEMENT, entry.getKey(), entry.getValue());
        view.printMessage(View.SEPARATOR);
        view.printMessage(View.AVERAGE + model.findAverage(arr1));
        view.printMessage(View.SEPARATOR);

        view.printMessageAndTwoNumbers(View.EQUAL_NUMBER, NUM, model.countEqualElements(arr1, NUM));
        view.printMessage(View.SEPARATOR);
        view.printMessage(View.EQUAL_ZERO + model.countEqualZero(arr1));
        view.printMessage(View.SEPARATOR);
        view.printMessage(View.MORE_ZERO + model.countMoreThanZero(arr1));
        view.printMessage(View.SEPARATOR);

        model.multiplyElements(temp, NUM);
        view.printMessage(View.MULTIPLY + NUM);
        view.printIntArray(temp);
        view.printMessage(View.SEPARATOR);

        model.addIndexToElements(temp);
        view.printMessage(View.ADD_INDEX);
        view.printIntArray(temp);
        view.printMessage(View.SEPARATOR);

        model.setEvenElementsZero(temp);
        view.printMessage(View.SET_EVEN_ZERO);
        view.printIntArray(temp);
        view.printMessage(View.SEPARATOR);

        model.setOddElementsZero(temp);
        view.printMessage(View.SET_ODD_ZERO);
        view.printIntArray(temp);
        view.printMessage(View.SEPARATOR);

        view.printMessage(View.FIRST_POS);
        entry = model.findFirstPositiveElement(temp);
        if (entry != null) {
            view.printMessageAndTwoNumbers(View.ARRAY_ELEMENT, entry.getKey(), entry.getValue());
        } else {
            view.printMessage(View.NOT_FOUND);
        }
        view.printMessage(View.SEPARATOR);

        view.printMessage(View.LAST_NEG);
        entry = model.findLastNegativeElement(temp);
        if (entry != null) {
            view.printMessageAndTwoNumbers(View.ARRAY_ELEMENT, entry.getKey(), entry.getValue());
        } else {
            view.printMessage(View.NOT_FOUND);
        }
        view.printMessage(View.SEPARATOR);

        view.printMessage(View.INDEXES_OF_VALUE + NUM);
        view.printList(model.findElementIndexes(temp, NUM));
        view.printMessage(View.SEPARATOR);

        view.printMessage(View.ASC_ORDER + model.checkAscendingOrder(temp));
        view.printMessage(View.DESC_ORDER + model.checkDescendingOrder(temp));
        view.printMessage(View.SEPARATOR);

        model.shiftArray(temp, NUM);
        view.printMessage(View.SHIFT + NUM);
        view.printIntArray(temp);
        view.printMessage(View.SEPARATOR);

        view.printMessage(View.DUPLICATES);
        view.printMap(model.findEqualElements(temp));
        view.printMessage(View.SEPARATOR);

        view.printMessage(View.MORE_AVERAGE + model.countMoreThanAverage(temp));
        view.printMessage(View.SEPARATOR);

        view.printMessage(View.UNIQUE);
        view.printMap(model.findUniqueElements(temp));
        view.printMessage(View.SEPARATOR);
        view.printMessage(View.SEPARATOR);

        view.printMessage(View.FIRST_ARRAY);
        view.printIntArray(arr1);
        view.printMessage(View.SECOND_ARRAY);
        view.printIntArray(arr2);
        view.printMessage(View.SEPARATOR);

        view.printMessage(View.UNIQUE_ARRAYS);
        view.printMap(model.findUniqueElements(arr1, arr2));
        view.printMessage(View.SEPARATOR);

        view.printMessage(View.EQUAL_FIRST + model.countElementsEqualFirst(arr1));
        view.printMessage(View.SEPARATOR);

        temp = Arrays.copyOf(arr1, SIZE);
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        view.printMessage(View.MERGE);
        view.printIntArray(model.mergeSortedArrays(arr1, arr2));
        view.printMessage(View.SEPARATOR);

        model.rearrangeArray(temp);
        view.printMessage(View.REARRANGE);
        view.printIntArray(temp);
        view.printMessage(View.SEPARATOR);
    }
}
