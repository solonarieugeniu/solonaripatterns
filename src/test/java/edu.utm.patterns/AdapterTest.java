package edu.utm.patterns;

import edu.utm.patterns.structural.adapter.HondaCrv;
import edu.utm.patterns.structural.adapter.CarSpeed;
import edu.utm.patterns.structural.adapter.CarSpeedAdapter;
import edu.utm.patterns.structural.adapter.CarSpeedAdapterImplementation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdapterTest {
    //convert mph to kmh

    @Test
    public void adapterTest() {
        CarSpeed hondaCrv = new HondaCrv();
        CarSpeedAdapter bugattiVeyronAdapter = new CarSpeedAdapterImplementation(hondaCrv);

        assertEquals(144.8406, bugattiVeyronAdapter.getSpeed());
    }
}
