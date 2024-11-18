package org.codingdojo.yatzy1;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class YatzyUtil {

    public static Map<Integer, Integer> toMap(List<Integer> dices) {
        return dices.stream()
                .collect(Collectors.groupingBy(Function.identity(),
                    Collectors.collectingAndThen(Collectors.counting(), Long::intValue)));
    }
}
