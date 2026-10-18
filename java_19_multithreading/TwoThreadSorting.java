package java_19_multithreading;

import java.util.Arrays;

class SortingThread extends Thread {

    private int[] arr;
    private boolean useBubbleSort;
    private long sortingTime;

    SortingThread(int[] original, boolean useBubbleSort, String name) {
        super(name);
        this.arr = original.clone();
        this.useBubbleSort = useBubbleSort;
    }

    public void run() {
        long start = System.nanoTime();

        if (useBubbleSort) {
            bubbleSort();
        } else {
            indexSort();
        }

        sortingTime = System.nanoTime() - start;

        System.out.println(getName() + ": "
                + Arrays.toString(arr));

        System.out.println(getName() + " time: "
                + sortingTime + " nanoseconds");
    }

    private void bubbleSort() {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    private void indexSort() {
        int[] sorted = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int index = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < arr[i]
                        || (arr[j] == arr[i] && j < i)) {
                    index++;
                }
            }

            sorted[index] = arr[i];
        }

        arr = sorted;
    }

    public long getSortingTime() {
        return sortingTime;
    }
}

public class TwoThreadSorting {

    public static void main(String[] args)
            throws InterruptedException {

        int[] numbers = { 45, 12, 78, 3, 56, 23, 9, 67, 1, 34 };

        SortingThread t1 = new SortingThread(numbers, true, "BubbleSort");

        SortingThread t2 = new SortingThread(numbers, false, "IndexSort");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("\nComparison:");

        if (t1.getSortingTime() < t2.getSortingTime()) {
            System.out.println("Bubble Sort finished faster.");
        } else if (t2.getSortingTime() < t1.getSortingTime()) {
            System.out.println("Index Sort finished faster.");
        } else {
            System.out.println("Both took the same measured time.");
        }
    }
}
