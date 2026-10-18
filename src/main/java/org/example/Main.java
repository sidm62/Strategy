package org.example;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();
        int size = 30;
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }

        int [] arrayCopy = array.clone();
        int [] array1 = arrayCopy.clone();
        Sorting bubbleSort = new Bubble();
        long start1 = System.nanoTime();
        bubbleSort.sort(array1);
        long end1 = System.nanoTime();
        System.out.println("Bubble Sort: " + (end1 - start1) + " ns");
        printArray(array1);




        int[] array2 = arrayCopy.clone();
        Sorting insertionSort = new Insertion();
        long start2 = System.nanoTime();
        insertionSort.sort(array2);
        long end2 = System.nanoTime();
        System.out.println("Insertion Sort: " + (end2 - start2) + " ns");
        printArray(array2);

        int[] array3 = arrayCopy.clone();
        Sorting mergeSort = new Merge();
        long start3 = System.nanoTime();
        mergeSort.sort(array3);
        long end3 = System.nanoTime();
        System.out.println("Merge Sort: " + (end3 - start3) + " ns");
        printArray(array3);
    }


    private static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    }
