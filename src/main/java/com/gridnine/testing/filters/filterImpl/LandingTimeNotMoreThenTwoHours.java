package com.gridnine.testing.filters.filterImpl;

import com.gridnine.testing.filters.Filter;
import com.gridnine.testing.model.Flight;
import com.gridnine.testing.model.Segment;


import java.time.temporal.ChronoUnit;
import java.util.List;

public class LandingTimeNotMoreThenTwoHours implements Filter {
    @Override
    public Boolean doFiltering(Flight flight) {
        List<Segment> segmentList = flight.getSegments();
        long totalTimeOnTheTheGround = 0;
        for (int i = 1; i < segmentList.size(); i++) {
            totalTimeOnTheTheGround += ChronoUnit.HOURS.between(segmentList.get(i - 1).getArrivalDate(),segmentList.get(i)
                    .getDepartureDate());
        }
        return totalTimeOnTheTheGround <= 2;
    }

}

