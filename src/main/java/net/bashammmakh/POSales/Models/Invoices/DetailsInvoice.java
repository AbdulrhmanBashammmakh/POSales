package net.bashammmakh.POSales.Models.Invoices;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class DetailsInvoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID ;
}
