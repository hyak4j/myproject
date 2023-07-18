package com.hyak4j.lottery;

import java.util.HashSet;
import java.util.Set;

public abstract class NumberGame {
    Set<Integer> numbers = new HashSet<>();
    int numberCount = 0;

    // 統一功能介面
    public abstract void generate();

    public boolean validate(){
        if (numbers.size() == numberCount)
            return true;
        else
            return false;
    }
}
