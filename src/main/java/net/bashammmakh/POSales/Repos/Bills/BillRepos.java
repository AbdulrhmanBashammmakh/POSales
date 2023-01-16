package net.bashammmakh.POSales.Repos.Bills;

import net.bashammmakh.POSales.Models.Bills.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepos extends JpaRepository<Bill, Long> {
}
