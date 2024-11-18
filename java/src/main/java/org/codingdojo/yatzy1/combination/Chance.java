package org.codingdojo.yatzy1.combination;

import org.codingdojo.yatzy1.contract.ScoreCalculator;

import java.util.List;

public class Chance implements ScoreCalculator {
    @Override
    public Integer get(List<Integer> dices) {
        return dices.stream()
            .reduce(0, Integer::sum);
    }
}
