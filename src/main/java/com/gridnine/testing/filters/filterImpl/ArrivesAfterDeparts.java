package com.gridnine.testing.filters.filterImpl;

import com.gridnine.testing.filters.Filter;
import com.gridnine.testing.model.Flight;

public class ArrivesAfterDeparts implements Filter {
    @Override
    public Boolean doFiltering(Flight flight) {
        return flight.getSegments().stream().allMatch(segment -> segment.getArrivalDate()
                .isAfter(segment.getDepartureDate()));
    }
}
