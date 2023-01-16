package net.bashammmakh.POSales.Repos.Bills;

import net.bashammmakh.POSales.Models.Bills.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepos extends JpaRepository<Orders, Long> {
}
