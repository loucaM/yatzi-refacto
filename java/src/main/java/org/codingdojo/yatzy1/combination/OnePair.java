package org.codingdojo.yatzy1.combination;

import org.codingdojo.yatzy1.YatzyUtil;
import org.codingdojo.yatzy1.contract.ScoreCalculator;

import java.util.List;
import java.util.Map;

public class OnePair implements ScoreCalculator {

    @Override
    public Integer get(List<Integer> dices) {
        final Map<Integer, Integer> diceMap = YatzyUtil.toMap(dices);

        return diceMap.entrySet()
            .stream()
            .filter(e -> e.getValue() == 2)
            .max(Map.Entry.comparingByKey())
            .stream()
            .mapToInt(es -> es.getKey() * 2)
            .sum();
    }
}
