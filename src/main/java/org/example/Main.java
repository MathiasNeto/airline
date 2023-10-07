package org.example;

import org.example.interfaces.CalculationFactory;
import org.example.model.National.NationalTrips;
import org.example.model.international.InternationalTrips;

public class Main {
    public static void main(String[] args) {
        var company = new company();
        System.out.println("-------Viagem Nacional--------------");
        company.generateTicket(100, new NationalTrips());
        System.out.println("-------Viagem Internacional---------");
        company.generateTicket(100, new InternationalTrips());
    }
}