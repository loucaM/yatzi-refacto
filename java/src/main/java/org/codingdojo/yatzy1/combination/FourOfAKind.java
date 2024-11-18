package org.codingdojo.yatzy1.combination;

import org.codingdojo.yatzy1.contract.ScoreCalculator;

import java.util.List;

public class FourOfAKind extends OfAKindCombinaison implements ScoreCalculator {

    public FourOfAKind() {
        super(4);
    }

    @Override
    public Integer get(List<Integer> dices) {
        return ofAKindScore(dices);
    }
}
