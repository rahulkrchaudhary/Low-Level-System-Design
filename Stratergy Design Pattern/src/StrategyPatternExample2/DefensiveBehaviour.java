package StrategyPatternExample2;

public class DefensiveBehaviour implements IBehaviour{
    @Override
    public int moveCommand() {
        System.out.println("\t defensive behaviour: if find another" +
                "robot run from it");
        return -1;
    }
}
