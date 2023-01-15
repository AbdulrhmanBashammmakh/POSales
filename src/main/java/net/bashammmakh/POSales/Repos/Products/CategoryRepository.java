package net.bashammmakh.POSales.Repos.Products;

import net.bashammmakh.POSales.Models.Products.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
