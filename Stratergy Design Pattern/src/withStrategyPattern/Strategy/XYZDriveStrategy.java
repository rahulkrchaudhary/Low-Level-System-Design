package withStrategyPattern.Strategy;

public class XYZDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("xyz drive capability");
    }
}
