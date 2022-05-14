package command_pattern0;

public class DecreseTemperature implements Command{
    AirCondition airCondition;

    public DecreseTemperature(AirCondition airCondition) {
        this.airCondition = airCondition;
    }


    @Override
    public void execute() {
        this.airCondition.decreaseTemperature();
    }
}
