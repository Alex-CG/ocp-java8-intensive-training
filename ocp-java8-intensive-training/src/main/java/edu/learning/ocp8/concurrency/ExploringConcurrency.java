package edu.learning.ocp8.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.atomic.AtomicInteger;

public class ExploringConcurrency {

    public static void main(String... args) {
        printPeekAndForeach();
    }

    private static void printPeekAndForeach() {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(15);

        list.stream()
                .peek(System.out::print)
                .parallel()
                .forEach(System.out::print);
    }

    private static void printAtomic() {
        int val = 10;
        int x;

    }

    static class Sample {
        int val = 10;
        int x;
        private AtomicInteger value = new AtomicInteger(val);

        Sample(int i) { val = i; }

        public static void main(String... args) {
            Sample sam = new Sample(5);
            System.out.print(sam.value.decrementAndGet());
        }
    }

}



class Sum extends RecursiveAction {
    static final int MAX = 50000;
    int low;
    int high;
    int[] array;
    Sum(int[] arr, int lo, int hi) {
        array = arr;
        low = lo;
        high = hi;
    }

    @Override
    protected void compute() {

    }
}