package org.example.model.international;

import org.example.interfaces.BaggageFee;
import org.example.interfaces.BoardingTax;
import org.example.interfaces.CalculationFactory;
import org.example.model.National.NationalTripsBaggageFee;

public class InternationalTrips implements CalculationFactory {
    @Override
    public BaggageFee calculationBaggageFee() {
        return new InternationalTripsBaggageFee();
    }

    @Override
    public BoardingTax calculationBoardingTax() {
        return new InternationalTripsBoardingTax();
    }
}
