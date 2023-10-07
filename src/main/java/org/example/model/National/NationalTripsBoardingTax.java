package org.example.model.National;

import org.example.interfaces.BoardingTax;

public class NationalTripsBoardingTax implements BoardingTax {
    @Override
    public double getBoardingTax() {
        return 0.03;
    }
}
