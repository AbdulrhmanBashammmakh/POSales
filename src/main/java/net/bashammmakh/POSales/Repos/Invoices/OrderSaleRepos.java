package net.bashammmakh.POSales.Repos.Invoices;

import net.bashammmakh.POSales.Models.Invoices.OrderInvoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderSaleRepos extends JpaRepository<OrderInvoice, Long> {
}
