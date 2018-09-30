package edu.learning.ocp8.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

public class ExploringLambdas {

    public static void main(String... args) {

        Supplier sup = () -> {return "new";};
        Supplier sup1 = () ->  "new";

        //method1();
        method2();
    }

    private static void method1() {
        Stream<Double> dbls = Stream.of(100.0, 200.1, 300.2);
        ToIntFunction<Double> lif = d -> d.intValue();
        //ToIntFunction<Double> lif2 = Double::intValue;
        Stream<Integer> ints = dbls.mapToInt(lif).boxed();
        ints.forEach(System.out::print);
    }

    private static void methodConsumer() {
        //Consumer cons = a -> { System.out.println(a) };
        Consumer cons1 = a -> System.out.print(a);
        //Consumer cons2 = a -> a==null;
    }

    private static void method2() {
        List<Integer> ins = new ArrayList<>();
        ins.add(3);
        ins.add(10);
        ins.add(11);
        ins.add(5);
        Predicate<Integer> p = i -> i>5;
        Predicate<Integer> p2 = p.and(i -> i<10);
        System.out.println(ins.removeIf(p2));
    }

}
