package org.codingdojo.yatzy1.combination;

import org.codingdojo.yatzy1.YatzyUtil;
import org.codingdojo.yatzy1.contract.ScoreCalculator;

import java.util.List;
import java.util.Map;

public class FullHouse implements ScoreCalculator {

    @Override
    public Integer get(List<Integer> dices) {

        final Map<Integer, Integer> diceMap = YatzyUtil.toMap(dices);

        if (diceMap.containsValue(2) && diceMap.containsValue(3)){
            return dices.stream().mapToInt(Integer::intValue).sum();
        }

        return 0 ;
    }
}
