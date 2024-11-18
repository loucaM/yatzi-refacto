package org.codingdojo.yatzy1.combination;

import org.codingdojo.yatzy1.contract.ScoreCalculator;

import java.util.List;

public class ThreeOfAKind extends OfAKindCombinaison implements ScoreCalculator  {

    public ThreeOfAKind() {
        super(3);
    }

    @Override
    public Integer get(List<Integer> dices) {
        return ofAKindScore(dices);
    }
}
