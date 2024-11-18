package org.codingdojo.yatzy1.factory;

import org.codingdojo.yatzy1.combination.*;
import org.codingdojo.yatzy1.contract.ScoreCalculator;

import java.util.function.Supplier;

public enum CombinationFactory {

    CHANCE(Chance::new),
    YATZY(Yatzy::new),
    ONE_PAIR(OnePair::new),
    TWO_PAIR(TwoPairs::new),
    THREE_OF_A_KIND(ThreeOfAKind::new),
    FOUR_OF_A_KIND(FourOfAKind::new),
    SMALL_STRAIGHT(SmallStraight::new),
    LARGE_STRAIGHT(LargeStraight::new),
    FULL_HOUSE(FullHouse::new),
    ONES(Ones::new),
    TWOS(Twos::new),
    THREES(Threes::new),
    FOURS(Fours::new),
    FIVES(Fives::new),
    SIXES(Sixes::new);

    private final Supplier<ScoreCalculator> constructor;

    CombinationFactory(Supplier<ScoreCalculator> constructor) {
        this.constructor = constructor;
    }

    public ScoreCalculator create() {
        return constructor.get();
    }

}
