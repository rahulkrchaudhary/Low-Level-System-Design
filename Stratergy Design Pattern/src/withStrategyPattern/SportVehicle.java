package withStrategyPattern;
import withStrategyPattern.Strategy.SportDriveStrategy;
public class SportVehicle extends Vehicle{
    SportVehicle(){
        super(new SportDriveStrategy());
    }

}
