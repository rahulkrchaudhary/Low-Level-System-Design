package withStrategyPattern;
import withStrategyPattern.Strategy.NormalDriveStrategy;
public class GoodsVehicle extends Vehicle{
    GoodsVehicle(){
        super(new NormalDriveStrategy());
    }
}
