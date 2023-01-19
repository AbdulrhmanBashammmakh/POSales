package net.bashammmakh.POSales.Config.Data;

import net.bashammmakh.POSales.Models.Bills.Vendor;
import net.bashammmakh.POSales.Models.Drawers.Drawer;
import net.bashammmakh.POSales.Models.Invoices.Customer;
import net.bashammmakh.POSales.Models.Products.Category;
import net.bashammmakh.POSales.Models.Products.UnitName;
import net.bashammmakh.POSales.Models.Stores.Store;
import net.bashammmakh.POSales.Repos.Bills.VendorRepos;
import net.bashammmakh.POSales.Repos.Drawers.DrawersRepos;
import net.bashammmakh.POSales.Repos.Invoices.CustomerRepos;
import net.bashammmakh.POSales.Repos.Products.CategoryRepository;
import net.bashammmakh.POSales.Repos.Products.UnitNameRepository;
import net.bashammmakh.POSales.Repos.Stores.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader  implements CommandLineRunner {

    @Autowired
    private CategoryRepository categoryRepository;

    // unit
    @Autowired
    private UnitNameRepository unitNameRepository;


    //store
    @Autowired
    private StoreRepository storeRepository;

    //drawer
    @Autowired
    private DrawersRepos drawersRepos;
    //vendor
    @Autowired
    private VendorRepos vendorRepos;
    //customer

    @Autowired
    private CustomerRepos customerRepos;


    @Override
    public void run(String... args) throws Exception {

        loadUnitData();
        loadCategoryData();
        loadStore();

        loadDrawer();
      loadVendorData();
        loadCustomer();


    }

    private void loadCategoryData() {
        if(categoryRepository.count()==0){
            Category category1 = new Category("Normal");
            Category category2 = new Category("Part of cloths");
            Category category3 = new Category("part of food");

            categoryRepository.save(category1);
            categoryRepository.save(category2);
            categoryRepository.save(category3);
            System.out.println(categoryRepository.count());
        }



    }
    private void loadUnitData() {

        if(unitNameRepository.count()==0){
            UnitName unitName1 = new UnitName("once");
            UnitName unitName2 = new UnitName("couple");
            UnitName unitName3 = new UnitName("darzon");

            unitNameRepository.save(unitName1);
            unitNameRepository.save(unitName2);
            unitNameRepository.save(unitName3);
            System.out.println(unitNameRepository.count());
        }

    }

    private void loadStore(){
        if(storeRepository.count()==0){
            Store store=new Store("main");
            storeRepository.save(store);
            System.out.println(storeRepository.count());
        }

    }


    private void loadVendorData() {

        if(vendorRepos.count()==0){
            Vendor obj = new Vendor("vendor","vendor company ","777777777","haven't");
            vendorRepos.save(obj);
            System.out.println(vendorRepos.count());
        }

    }

     private void loadCustomer(){
        if(customerRepos.count()==0){
            Customer obj = new Customer("General customers","000","none");
            customerRepos.save(obj);
            System.out.println(customerRepos.count());
        }

    }


    private void loadDrawer(){
        if(drawersRepos.count()==0){
            Drawer obj = new Drawer(0.0,"100100",true);
            drawersRepos.save(obj);
            System.out.println(drawersRepos.count());
        }

    }

}
