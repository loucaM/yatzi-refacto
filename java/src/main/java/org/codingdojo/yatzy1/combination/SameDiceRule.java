package org.codingdojo.yatzy1.combination;

import org.codingdojo.yatzy1.contract.ScoreCalculator;

import java.util.List;

public abstract class SameDiceRule implements ScoreCalculator {

    private final Integer scoretoHit ;

    protected SameDiceRule(Integer scoretoHit) {
        this.scoretoHit = scoretoHit;
    }

    @Override
    public Integer get(List<Integer> dices) {
        return dices.stream()
            .filter(dice -> dice.equals(scoretoHit))
            .reduce(0, Integer::sum);
    }
}
