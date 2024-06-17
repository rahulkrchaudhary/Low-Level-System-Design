package withStrategyPattern.Strategy;

public class SportDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("sport drive strategy");
    }
}
