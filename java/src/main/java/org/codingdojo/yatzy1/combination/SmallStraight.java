package org.codingdojo.yatzy1.combination;

import org.codingdojo.yatzy1.contract.ScoreCalculator;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SmallStraight implements ScoreCalculator {

    private final static Set<Integer> SMALL_STRAIGHT_1 = Set.of(1, 2, 3, 4);
    private final static Set<Integer> SMALL_STRAIGHT_2 = Set.of(5, 2, 3, 4);
    private final static Set<Integer> SMALL_STRAIGHT_3 = Set.of(5, 6, 3, 4);

    @Override
    public Integer get(List<Integer> dices) {
        Set<Integer> diceSet = new HashSet<>(dices);
        if (diceSet.containsAll(SMALL_STRAIGHT_1) || diceSet.containsAll(SMALL_STRAIGHT_2) || diceSet.containsAll(SMALL_STRAIGHT_3)) {
            return 15;
        } else
            return 0;
    }
}
