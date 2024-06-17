package StrategyPatternExample2;

public class AgressiveBehaviour implements IBehaviour{
    @Override
    public int moveCommand() {
        System.out.println("\t agressive behaviour: if find another" +
                "another robot attack it");
        return 1;
    }
}
