package net.bashammmakh.POSales.Repos.Products;

import net.bashammmakh.POSales.Models.Products.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    /*
    @Query("SELECT * FROM customer WHERE lastname = :lastname")
List<Customer> findAllByLastname(@Param("lastname") String
lastname);
@Query("SELECT firstname, lastname FROM Customer WHERE
lastname = ?1")
Customer findFirstByLastname(String lastname);
     */


}
