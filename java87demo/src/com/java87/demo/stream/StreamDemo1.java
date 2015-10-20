package com.java87.demo.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Created by WY on 2015/10/20.
 */
public class StreamDemo1 {

    public static void main(String[] args) {

        List<String> fruits = Arrays.asList(new String[]{"apple", "orange", "pear", "ab"});

        //1.原始方法
        //for( ... ){ if( ... ) {count++} }

        //2.Stream方法
        long count = fruits.stream().filter(w -> Objects.nonNull(w) && w.startsWith("a")).count();
        System.out.println("count = " + count);

        //并行执行
        count = fruits.parallelStream().filter(w -> Objects.nonNull(w) && w.startsWith("a")).count();
        System.out.println("count = " + count);
        /*
         long size = fruits.stream().filter((w) -> {
            final boolean a = Objects.nonNull(w) && w.startsWith("a");
            return a;
        }).count();
         */

    }

}
