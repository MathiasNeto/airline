package org.example.model.National;

import org.example.interfaces.BaggageFee;
import org.example.interfaces.BoardingTax;
import org.example.interfaces.CalculationFactory;

public class NationalTrips implements CalculationFactory {
    @Override
    public BaggageFee calculationBaggageFee() {
        return new NationalTripsBaggageFee();
    }

    @Override
    public BoardingTax calculationBoardingTax() {
        return new NationalTripsBoardingTax();
    }
}
