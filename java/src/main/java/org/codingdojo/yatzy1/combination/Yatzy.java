package org.codingdojo.yatzy1.combination;

import org.codingdojo.yatzy1.YatzyUtil;
import org.codingdojo.yatzy1.contract.ScoreCalculator;

import java.util.List;

public class Yatzy extends OfAKindCombinaison implements ScoreCalculator {

    public Yatzy() {
        super(5);
    }

    @Override
    public Integer get(List<Integer> dices) {
       return YatzyUtil.toMap(dices).containsValue(5) ? 50 : 0 ;
    }
}

