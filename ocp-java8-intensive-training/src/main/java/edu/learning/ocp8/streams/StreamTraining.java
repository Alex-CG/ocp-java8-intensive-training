package edu.learning.ocp8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.ObjIntConsumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTraining {

    public static void main(String... args) {
        test01();
        printNewLine();
        test02();
        printNewLine();
        test03();
        printNewLine();
        test04();
        printNewLine();
        test05();
        printNewLine();
        test06();
        printNewLine();
        test07();
        printNewLine();
        test08();
        printNewLine();
        test09();
    }

    private static void printNewLine() {
        System.out.println();
        System.out.println("----------------------");
    }

    private static void test01() {
        Stream<String> stream = Stream.of("123", "234", "345");
        Stream<String> out = stream.map((String s)-> s.substring(0,1));
        out.forEach(System.out::print);
    }

    private static void test02() {
        List<String> list = Arrays.asList("1Z0-809", "1Z0-810", "1Z1-811", "1Z0-803");
        List<String> list2 = list.stream()
                .flatMap(e -> Stream.of(e.split("-"))) // 1Z0 809 1Z0 810 1Z1 811 1Z0 803
                .distinct() // 1Z0 809 810 1Z1 811 803
                .sorted()
                .collect(Collectors.toList());
        System.out.print(list2);
    }

    private static void test03() {
        Stream<Double> stream = Stream.of(2.2, 2.8, 2.5);
        // Stream<Integer> out = stream.mapToInt(Double::intValue);
        IntStream out = stream.mapToInt(Double::intValue);
        System.out.print(out.distinct().count());
    }

    private static void test04() {
        LongStream longs = LongStream.of(12, 10, 64, -12);
        longs.average();
    }

    private static void test05() {
        Stream stream = Stream.of(10, 20, "30");
        boolean out = stream.allMatch(in -> in instanceof Number);
        System.out.println(out);
    }

    private static void test06() {
        Stream.of("10", "20", "30").anyMatch(s -> s.length()>2);
        Optional.empty();

        Stream<Integer> s = Stream.of(12, 40, 11, 22);
        Optional<Integer> min = s.filter((Integer p) -> p%2==0)
                //.mapToDouble(Double::valueOf)
                .min((a,b)->a-b);
        ObjIntConsumer cons = (Object I, int i) -> System.out.println(i+1);
    }

    private static void test07() {
        Stream<Double> dbls = Stream.of(10.0, 20.1, 30.2);
        ToIntFunction<Double> lif = d -> d.intValue();
        Stream<Integer> ints = dbls.mapToInt(lif).boxed();
        ints.forEach(System.out::print);
    }

    private static void test08() {
        Stream<String> stream = Stream.iterate("", (s) -> s + "1");
        System.out.println(stream.limit(2).map(x -> x + "2"));
    }

    private static void test09() {
        Predicate<? super String> predicate = s -> s.length() > 3;
        Stream<String> stream = Stream.iterate("-", (s) -> s + s);
        boolean b1 = stream.noneMatch(predicate);
        boolean b2 = stream.anyMatch(predicate);
        System.out.println(b1 + " " + b2);
    }

    final void a(){

    }

}
