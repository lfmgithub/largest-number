package com.lf.largestnumber.number;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberImpl implements Number {

    private final String[] numbersArray;

    public NumberImpl(String[] numbersArray) {
        this.numbersArray = numbersArray;
    }

    @Override
    public String findLargestNumber() {
        List<Integer> numberList = Arrays.stream(numbersArray)
                .map(Integer::parseInt)
                .filter(n -> n >= 0)
                .collect(Collectors.toList());

        if (numberList.stream().allMatch(n -> n == 0)) {
            return "0";
        }

        return numberList.stream()
                .map(Object::toString)
                .sorted((n1, n2) -> (n2 + n1).compareTo(n1 + n2))
                .collect(Collectors.joining());
    }
}
