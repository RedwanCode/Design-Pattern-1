package command_pattern0;

public class TogglePower implements Command{
    AirCondition airCondition;

    public TogglePower(AirCondition airCondition) {
        this.airCondition = airCondition;
    }


    @Override
    public void execute() {
        this.airCondition.switchToggle();
    }
}
