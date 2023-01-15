package net.bashammmakh.POSales.Models.Stores;

import jakarta.persistence.*;

@Entity
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID ;


    @Column()
    private String StoreName;


}
