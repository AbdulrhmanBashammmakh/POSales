package net.bashammmakh.POSales.Repos.Invoices;

import net.bashammmakh.POSales.Models.Invoices.DetailsInvoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailsInvoiceRepos extends JpaRepository<DetailsInvoice, Long> {
}
