package com.example.jft_pr10_1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext10.xml");

        SortingAlgorithm insertion = context.getBean("insertionSort", SortingAlgorithm.class);
        SortingAlgorithm merge = context.getBean("mergeSort", SortingAlgorithm.class);
        SortingAlgorithm quick = context.getBean("quickSort", SortingAlgorithm.class);

        insertion.doSort();
        merge.doSort();
        quick.doSort();
    }
}
