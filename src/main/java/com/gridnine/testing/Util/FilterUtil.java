package com.gridnine.testing.Util;

import com.gridnine.testing.filters.Filter;
import com.gridnine.testing.model.Flight;

import java.util.List;
import java.util.stream.Collectors;

public class FilterUtil {
    public static List<Flight> filterByDeterminedRule(List<Flight> flights, Filter filter) {
        return flights.stream().filter(filter::doFiltering).collect(Collectors.toList());
    }
}
