package org.codingdojo.yatzy1;

import org.codingdojo.yatzy1.factory.CombinationFactory;

import java.util.Arrays;
import java.util.List;

public class Yatzy1 {

    public static int chance(int d1, int d2, int d3, int d4, int d5) {
        List<Integer> diceList = List.of(d1, d2, d3, d4, d5);
        return CombinationFactory.CHANCE.create().get(diceList);
    }

    public static int yatzy(int... dice){
        final var diceList = Arrays.stream(dice).boxed().toList();
        return CombinationFactory.YATZY.create().get(diceList);
    }

    public static int ones(int d1, int d2, int d3, int d4, int d5) {
        List<Integer> diceList = List.of(d1, d2, d3, d4, d5);
        return CombinationFactory.ONES.create().get(diceList);
    }

    public static int twos(int d1, int d2, int d3, int d4, int d5) {
        List<Integer> diceList = List.of(d1, d2, d3, d4, d5);
        return CombinationFactory.TWOS.create().get(diceList);
    }

    public static int threes(int d1, int d2, int d3, int d4, int d5) {
        List<Integer> diceList = List.of(d1, d2, d3, d4, d5);
        return CombinationFactory.THREES.create().get(diceList);
    }

    protected int[] dice;
    public Yatzy1() {}
    public Yatzy1(int d1, int d2, int d3, int d4, int _5)
    {
        this();
        dice = new int[5];
        dice[0] = d1;
        dice[1] = d2;
        dice[2] = d3;
        dice[3] = d4;
        dice[4] = _5;
    }

    public int fours(){
     final var diceList = Arrays.stream(dice).boxed().toList();
     return CombinationFactory.FOURS.create().get(diceList);
    }

    public int fives() {
        final var diceList = Arrays.stream(dice).boxed().toList();
        return CombinationFactory.FIVES.create().get(diceList);
    }

    public int sixes(){
        final var diceList = Arrays.stream(dice).boxed().toList();
        return CombinationFactory.SIXES.create().get(diceList);
    }

    public int score_pair(int d1, int d2, int d3, int d4, int d5) {
        List<Integer> diceList = List.of(d1, d2, d3, d4, d5);
        return CombinationFactory.ONE_PAIR.create().get(diceList);
    }

    public static int two_pair(int d1, int d2, int d3, int d4, int d5){
        List<Integer> diceList = List.of(d1, d2, d3, d4, d5);
        return CombinationFactory.TWO_PAIR.create().get(diceList);
    }

    public static int four_of_a_kind(int d1, int d2, int d3, int d4, int d5) {
        List<Integer> diceList = List.of(d1, d2, d3, d4, d5);
        return CombinationFactory.FOUR_OF_A_KIND.create().get(diceList);
    }

    public static int three_of_a_kind(int d1, int d2, int d3, int d4, int d5) {
        List<Integer> diceList = List.of(d1, d2, d3, d4, d5);
        return CombinationFactory.THREE_OF_A_KIND.create().get(diceList);
    }


    public static int smallStraight(int d1, int d2, int d3, int d4, int d5) {
        List<Integer> diceList = List.of(d1, d2, d3, d4, d5);
        return CombinationFactory.SMALL_STRAIGHT.create().get(diceList);
    }

    public static int largeStraight(int d1, int d2, int d3, int d4, int d5) {
        List<Integer> diceList = List.of(d1, d2, d3, d4, d5);
        return CombinationFactory.LARGE_STRAIGHT.create().get(diceList);
    }

    public static int fullHouse(int d1, int d2, int d3, int d4, int d5) {
        List<Integer> diceList = List.of(d1, d2, d3, d4, d5);
        return CombinationFactory.FULL_HOUSE.create().get(diceList);
    }
}



