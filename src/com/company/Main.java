package com.company;

import java.sql.SQLOutput;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {
	// лямбда выражения (Java 8)
// если какой-то метод требует на вход аргумент интерфейса или абстрактного класса, и в этом интерфейсе/абстрактном
// классе только один нериализованный метод, то вместо передачи объектов этого типа можно указать лямбда-выражение
        //  лямбда - выражение в  Java :
        // (<arg1>, <arg2>,...) -> {...тело метода...}
        // если метод не принимает никаких аргументов () (круглые скобки) обязательны
        // (a,b,...)-> {...} (типы аргументов можно опустить либо все, либо не опускать вовсе)
        // если в теле лямбды указанно только одно выражение и результат этого выражения совподает
        // с типом возвращаемого значения лямбды, то фигурные скобки и ключевое слово return можно опустить
        LinkedList <Integer> list= new LinkedList<>();
        list.add(4);
        list.add(2);
        list.add(5);
        list.add(7);
        Collections.sort(list, Comparator.comparingInt(a -> a));
        Collections.sort(list,(a,b)->a+b);
        System.out.println(list);
        Test t = new Test();
        Collections.sort(list, t::diff);// (a,b)->t.diff(a,b)==t::diff
        Collections.sort(list, Test::diff2);// если лямбда метод - статический
        Collections.sort(list,Integer::compare);
        list.stream().forEach(System.out::println);
        // потоки

    }
}
