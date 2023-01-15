package net.bashammmakh.POSales.Repos.Stores;

import net.bashammmakh.POSales.Models.Stores.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, Long> {
}
