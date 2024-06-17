package StrategyPatternExample2;

public class Main {
    public static void main(String[] args) {
        Robot r1 = new Robot("big robot");
        Robot r2 = new Robot("George v.2.1");
        Robot r3 = new Robot("R2");

        r1.setBehaviour(new AgressiveBehaviour());
        r2.setBehaviour(new DefensiveBehaviour());
        r3.setBehaviour(new NormalBehaviour());

        r1.move();
        r2.move();
        r3.move();
    }
}
