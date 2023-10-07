package org.example.model.international;

import org.example.interfaces.BaggageFee;
import org.example.interfaces.BoardingTax;

public class InternationalTripsBoardingTax implements BoardingTax {

    @Override
    public double getBoardingTax() {
        return 0.05;
    }
}
