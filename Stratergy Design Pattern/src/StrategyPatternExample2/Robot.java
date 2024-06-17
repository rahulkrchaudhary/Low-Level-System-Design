package StrategyPatternExample2;

public class Robot {
    IBehaviour behaviour;
    String name;

    public Robot(String name) {
        this.name = name;
    }

    public void setBehaviour(IBehaviour behaviour) {
        this.behaviour = behaviour;
    }

    public IBehaviour getBehaviour() {
        return behaviour;
    }
    public void move(){
        System.out.println(this.name + ": based on current postion" +
                "the behaviour object decide the next move");
        int command = behaviour.moveCommand();
        System.out.println("\t the result returned by behaviour object" +
                "is sent to the movement mechanisms " +
                "for the robot "+this.name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
