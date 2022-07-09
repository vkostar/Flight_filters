package com.gridnine.testing.filters;

import com.gridnine.testing.model.Flight;

public interface Filter {
    Boolean doFiltering(Flight flight);

}
