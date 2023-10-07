package org.example;

import lombok.Data;
import org.example.interfaces.BaggageFee;
import org.example.interfaces.BoardingTax;
import org.example.interfaces.CalculationFactory;
@Data
public class Ticket {

    double valor;
    BaggageFee baggageFee;
    BoardingTax boardingTax;

    public Ticket(double valor, CalculationFactory calculationFactory) {
        this.valor = valor;
        this.baggageFee = calculationFactory.calculationBaggageFee();
        this.boardingTax = calculationFactory.calculationBoardingTax();
    }


    public double calculationBaggageFee(){
        return this.valor * this.baggageFee.getBaggageFee();
    }

    public double calculationBoardingTax(){
        return this.valor * this.boardingTax.getBoardingTax();
    }

    public double calculationPrice(){
        this.valor = this.valor + calculationBaggageFee() + calculationBoardingTax();
        return this.valor;
    }
}
