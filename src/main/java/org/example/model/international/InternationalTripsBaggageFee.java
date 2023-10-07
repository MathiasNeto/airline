package org.example.model.international;

import org.example.interfaces.BaggageFee;

public class InternationalTripsBaggageFee implements BaggageFee {
    @Override
    public double getBaggageFee() {
        return 0.10;
    }
}
