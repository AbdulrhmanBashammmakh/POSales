package net.bashammmakh.POSales.Models.Drawers;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Paymants {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID ;
}
