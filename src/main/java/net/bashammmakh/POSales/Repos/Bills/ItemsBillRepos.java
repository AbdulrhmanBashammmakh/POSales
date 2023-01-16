package net.bashammmakh.POSales.Repos.Bills;

import net.bashammmakh.POSales.Models.Bills.ItemsBill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemsBillRepos extends JpaRepository<ItemsBill, Long> {
}
