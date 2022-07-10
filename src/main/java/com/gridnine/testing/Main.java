package com.gridnine.testing;

import com.gridnine.testing.filters.filterImpl.ArrivesAfterDeparts;
import com.gridnine.testing.filters.filterImpl.DepartsAfterNow;
import com.gridnine.testing.filters.filterImpl.LandingTimeNotMoreThenTwoHours;
import com.gridnine.testing.model.Flight;

import java.util.List;

import static com.gridnine.testing.Util.FilterUtil.filterByDeterminedRule;
import static com.gridnine.testing.Util.FlightBuilder.createFlights;


public class Main {
    public static void main(String[] args) {
        List<Flight> flightList = createFlights();
        filterByDeterminedRule(flightList, new DepartsAfterNow()).forEach(System.out::println);
        System.out.println();
        filterByDeterminedRule(flightList, new ArrivesAfterDeparts()).forEach(System.out::println);
        System.out.println();
        filterByDeterminedRule(flightList, new LandingTimeNotMoreThenTwoHours()).forEach(System.out::println);
    }
}
