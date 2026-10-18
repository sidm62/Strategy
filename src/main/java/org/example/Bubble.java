package org.example;

public class Bubble extends Sorting {
    @Override
    public void sort(int[] array) {
        int n = array.length;
       boolean flag = true;

        for (int i = 0; i < n - 1; i++) {

            flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    flag = true;
                }
            }

            if (!flag) {
                break;
            }
        }
    }
}
