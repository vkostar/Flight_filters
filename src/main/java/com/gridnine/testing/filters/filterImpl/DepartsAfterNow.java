package com.gridnine.testing.filters.filterImpl;

import com.gridnine.testing.filters.Filters;
import com.gridnine.testing.model.Flight;

import java.time.LocalDateTime;


public class DepartsAfterNow implements Filters {

    @Override
    public Boolean doFiltering(Flight flight) {
        return flight.getSegments().get(0).getDepartureDate().isAfter(LocalDateTime.now());
    }
}

