package factory;

import entity.Temperature;
import org.junit.Test;

import static org.junit.Assert.*;

public class TempFactoryTest {

    @Test
    public void buildTemperature(){
        Temperature ta = TempFactory.buildTemperature(37.2, 37.3);

        System.out.println(ta);

    }

}