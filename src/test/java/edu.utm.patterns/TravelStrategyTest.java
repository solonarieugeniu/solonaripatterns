package edu.utm.patterns;

import edu.utm.patterns.behavioral.strategy.CarStrategy;
import edu.utm.patterns.behavioral.strategy.FlyStrategy;
import edu.utm.patterns.behavioral.strategy.TravelAgency;
import edu.utm.patterns.behavioral.strategy.Traveler;
import org.junit.jupiter.api.Test;

public class TravelStrategyTest {
    @Test
    public void travel() {
        TravelAgency travelAgency = new TravelAgency();

        Traveler travelerDiego = new Traveler("Diego", "CDTCKT001");
        Traveler travelerIniesta = new Traveler("Iniesta","CDTCKT001");

        travelAgency.bookATravel(travelerDiego);
        travelAgency.bookATravel(travelerIniesta);

        travelAgency.travel(new FlyStrategy("Air Moldova"));
        travelAgency.travel(new CarStrategy("Jason Statham", "Audi A8", "C 250", 5));

        travelAgency.quiteTravel(travelerDiego);
    }
}
