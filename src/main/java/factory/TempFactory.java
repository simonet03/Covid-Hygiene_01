package factory;

import entity.Temperature;

public class TempFactory {

    public static Temperature buildTemperature(double enteringTemp, double exitingTemp){
    return new Temperature.Builder()
            .setEnteringTemp(enteringTemp)
            .setExitingTemp(exitingTemp)
            .build();
    }
}
