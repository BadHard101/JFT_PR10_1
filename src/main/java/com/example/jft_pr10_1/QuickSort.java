package com.example.jft_pr10_1;

import org.springframework.stereotype.Component;

@Component
public class QuickSort implements SortingAlgorithm{
    @Override
    public void doSort() {
        System.out.println("Doing Quick sort!");
    }
}
