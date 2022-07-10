package com.gridnine.testing.Util;

import com.gridnine.testing.filters.Filters;
import com.gridnine.testing.model.Flight;

import java.util.List;
import java.util.stream.Collectors;

public class FilterUtil {
    public static List<Flight> filterByDeterminedRule(List<Flight> flights, Filters implOfFilters) {

        return flights.stream().filter(implOfFilters::doFiltering).collect(Collectors.toList());
    }
}
