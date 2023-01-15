package net.bashammmakh.POSales.Models.Drawers;

import jakarta.persistence.*;

@Entity
public class Drawer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID ;

    @Column()
    private double AmountCash;
    @Column()
    private String codeNumber;
    @Column()
    private boolean IsAvailable;


/*
	- codeNumber
	- AmountCash
	- IsAvailable

 */
}
