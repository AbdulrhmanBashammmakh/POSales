package net.bashammmakh.POSales.Repos.Invoices;

import net.bashammmakh.POSales.Models.Invoices.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepos extends JpaRepository<Invoice, Long> {

}
