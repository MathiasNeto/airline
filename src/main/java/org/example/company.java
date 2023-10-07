package org.example;

import org.example.interfaces.CalculationFactory;

public class company {

    public void generateTicket(double valor, CalculationFactory calculationFactory) {
        Ticket ticket = new Ticket(valor, calculationFactory);
        System.out.println("Taxa de embarque R$: " + ticket.calculationBoardingTax() );
        System.out.println("Taxa de Bagagem R$: "+ ticket.calculationBaggageFee());
        System.out.println("Valor da Viagem: "+ ticket.calculationPrice());
    }
}