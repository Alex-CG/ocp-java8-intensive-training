package edu.learning.ocp8.collections;

import java.util.*;
import java.util.stream.Stream;

public class ExploringTreeMap {

    public static void main(String... args){
//        printOutPut();
//        printOutPut2();
//        printOutPut3();
        printOutPut4();
    }

    private static void printOutPut(){
        TreeMap<String, String> m = new TreeMap<String, String>();
        m.put("a", "ant");
        m.put("e", "elephant");
        m.put("g", "gecko");

        SortedMap<String, String> sm = m.subMap("a", "e");
        sm.put("b", "bull");
        sm.put("f", "fish");
        m.put("c", "caterpillar");
        m.remove("a");

        System.out.println(sm);
        System.out.println(m);
    }

    private static void printOutPut2(){
        ArrayDeque<String> dq = new ArrayDeque<>();
        dq.add("a");
        dq.add("c");
        dq.add("b");
        dq.add("a");
        dq.removeLastOccurrence("a");
        System.out.println(dq);
    }

    private static void printOutPut3(){
        Stream<String> st = Stream.of("A", "AB", "ABC", "ABCD", "AB");
        String o = st
                .filter(s->s.length()>2)
                .filter(s->s.indexOf("C")>-1)
                .findAny()
                .orElse("None");
        System.out.println(o);
    }

    private static void printOutPut4(){
        Stream<String> st = Stream.of("a", "b", "c", "d");
        System.out.println(
            st.peek(System.out::print).findAny().orElse("na")
        );
    }

}

class claseA implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return 0;
    }
}

class claseB implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}