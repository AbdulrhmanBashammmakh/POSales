package net.bashammmakh.POSales.Repos.Invoices;

import net.bashammmakh.POSales.Models.Invoices.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepos extends JpaRepository<Customer, Long> {
}
