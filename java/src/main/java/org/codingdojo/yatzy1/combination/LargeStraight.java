package org.codingdojo.yatzy1.combination;

import org.codingdojo.yatzy1.contract.ScoreCalculator;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LargeStraight implements ScoreCalculator {

    private final static Set<Integer> lARGE_STRAIGHT_1 = Set.of(1, 2, 3, 4, 5);
    private final static Set<Integer> LARGE_STRAIGHT_2 = Set.of(2, 3, 4, 5, 6);
    @Override
    public Integer get(List<Integer> dices) {

        Set<Integer> diceSet = new HashSet<>(dices);
        if (diceSet.containsAll(lARGE_STRAIGHT_1) || diceSet.containsAll(LARGE_STRAIGHT_2)) {
            return 20;
        } else
            return 0;
    }
}
