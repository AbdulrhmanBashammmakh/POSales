package net.bashammmakh.POSales.Models.Drawers;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class DrawerLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID ;


    @ManyToOne(optional=false)
    @JoinColumn(name="DrawerId", nullable=false, updatable=false)
    private Drawer drawer;

    @Column()
    private boolean IsWithdrw;
    @Column()
    private double Amount;
    @Column()
    private Date postDate;
    /*
    - TypeTrans
	- Amount
	- Date
     */
}
