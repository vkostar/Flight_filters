package com.gridnine.testing.filters.filterImpl;

import com.gridnine.testing.filters.Filter;
import com.gridnine.testing.model.Flight;

import java.time.LocalDateTime;


public class DepartsAfterNow implements Filter {

    @Override
    public Boolean doFiltering(Flight flight) {
        return flight.getSegments().get(0).getDepartureDate().isAfter(LocalDateTime.now());
    }
}

