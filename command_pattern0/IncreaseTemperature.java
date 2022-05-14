package command_pattern0;

public class IncreaseTemperature implements Command{
    AirCondition airCondition;

    public IncreaseTemperature(AirCondition airCondition) {
        this.airCondition = airCondition;
    }


    @Override
    public void execute() {
        this.airCondition.increaseTemperature();
    }
}
