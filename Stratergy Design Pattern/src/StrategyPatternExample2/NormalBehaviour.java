package StrategyPatternExample2;

public class NormalBehaviour implements IBehaviour{
    @Override
    public int moveCommand() {
        System.out.println("\t normal behaviour: if find another " +
                "robot ignore it");
        return 0;
    }
}
