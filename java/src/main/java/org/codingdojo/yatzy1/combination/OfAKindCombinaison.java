package org.codingdojo.yatzy1.combination;

import org.codingdojo.yatzy1.YatzyUtil;

import java.util.List;
import java.util.Map;

public abstract class OfAKindCombinaison {

    private final Integer numberToHit;

    public OfAKindCombinaison(Integer occurence) {
        this.numberToHit = occurence;
    }

    protected Integer ofAKindScore(List<Integer> dices) {
        Map<Integer, Integer> scoreMap = YatzyUtil.toMap(dices);
        return scoreMap.entrySet()
            .stream()
            .filter(e -> e.getValue() >= numberToHit)
            .mapToInt(entry -> entry.getKey() * numberToHit)
            .sum();
    }
}
