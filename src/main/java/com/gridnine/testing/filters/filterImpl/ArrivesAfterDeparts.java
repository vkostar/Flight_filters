package com.gridnine.testing.filters.filterImpl;

import com.gridnine.testing.filters.Filters;
import com.gridnine.testing.model.Flight;

public class ArrivesAfterDeparts implements Filters {
    @Override
    public Boolean doFiltering(Flight flight) {
        return flight.getSegments().stream().allMatch(segment -> segment.getArrivalDate()
                .isAfter(segment.getDepartureDate()));
    }
}
