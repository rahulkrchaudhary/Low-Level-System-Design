package withStrategyPattern;
import withStrategyPattern.Strategy.SportDriveStrategy;
public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle() {

        super(new SportDriveStrategy());
    }
}
