package org.example.model.National;

import org.example.interfaces.BaggageFee;

public class NationalTripsBaggageFee implements BaggageFee {
    @Override
    public double getBaggageFee() {
        return 0.05;
    }
}
