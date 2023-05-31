package com.example.jft_pr10_1;

import org.springframework.stereotype.Component;

@Component
public class MergeSort implements SortingAlgorithm{
    @Override
    public void doSort() {
        System.out.println("Doing Merge sort!");
    }
}
