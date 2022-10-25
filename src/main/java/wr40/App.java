package wr40;

import wr40.parser.JsonMapperImpl;
import wr40.parser.JsonParser;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        testClass.prop1 = "value1";
        testClass.prop2 = 42;
        testClass.prop3 = 3.14;
        testClass.prop4 = true;
        testClass.prop5 = null;
        testClass.prop6 = new ArrayList<>();
        testClass.prop6.add("value1");
        testClass.prop6.add("value1");
        testClass.prop6.add("value3");
        testClass.prop7 = new LinkedList<>();
        testClass.prop7.add(1.2);
        testClass.prop7.add(2.3);
        testClass.prop7.add(3.4);
        testClass.prop8 = new Integer[] {10, 11, 12};

        JsonParser parser = new JsonMapperImpl();

        System.out.println(parser.toJson(testClass));
        System.out.println(parser.toJson(testClass.prop6));


    }

    public static class TestClass {
        String prop1;
        int prop2;
        double prop3;
        boolean prop4;
        String prop5;
        Collection<String> prop6;
        Collection<Double> prop7;
        Integer[] prop8;
    }
}
