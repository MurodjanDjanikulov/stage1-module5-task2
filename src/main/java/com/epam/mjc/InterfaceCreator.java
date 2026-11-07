package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<List<Integer>> divideBy(Integer divider) {
        return inputList -> {
            List<Integer> result = new ArrayList<>();
            for (Integer value : inputList) {
                result.add(value / divider);
            }
            return result;
        };
    }
}
