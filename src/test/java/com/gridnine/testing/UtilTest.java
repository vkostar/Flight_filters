package com.gridnine.testing;

import com.gridnine.testing.filters.filterImpl.ArrivesAfterDeparts;
import com.gridnine.testing.filters.filterImpl.DepartsAfterNow;
import com.gridnine.testing.filters.filterImpl.LandingTimeNotMoreThenTwoHours;
import com.gridnine.testing.model.Flight;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.gridnine.testing.Util.FilterUtil.filterByDeterminedRule;
import static com.gridnine.testing.Util.FlightBuilder.createFlights;


public class UtilTest {

    List<Flight> initializedFlightList;

    @BeforeEach
    void setUp() {
        initializedFlightList = createFlights();
    }

    @AfterEach
    void tearDown() {
        initializedFlightList = null;
    }

    @Test
    void ArrivesAfterDeparts() {
        List<Flight> afterFilteringList=filterByDeterminedRule(initializedFlightList, new ArrivesAfterDeparts());
        Assertions.assertEquals(afterFilteringList.size(),5);

    }

    @Test
    void DepartsAfterNow() {
        List<Flight> afterFilteringList=filterByDeterminedRule(initializedFlightList, new DepartsAfterNow());
        Assertions.assertEquals(afterFilteringList.size(),5);
    }

    @Test
    void LandingTimeNotMoreThenTwoHours() {
        List<Flight> afterFilteringList=filterByDeterminedRule(initializedFlightList, new LandingTimeNotMoreThenTwoHours());
        Assertions.assertEquals(afterFilteringList.size(),4);
    }

}

