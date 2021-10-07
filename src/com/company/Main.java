package com.company;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

    Customer customer1 = new Customer(1, "Engin" , "Demiroğ" , LocalDate.of(1985 , 1 , 6) ,28861499108L );
    Customer customer2 = new Customer(1, "Gurban" , "Alizada" , LocalDate.of(1985 , 1 , 6) ,28861499108L );
    BaseCustomerManager nero = new NeroCustomerManager();
    BaseCustomerManager starbucks = new StarbucksCustomerManager(new MernisServiceAdapter());
        System.out.print("Sturbucks =>    ");
        starbucks.save(customer1);
        System.out.print("Nero =>         ");
        nero.save(customer1);

        System.out.print("Sturbucks =>    ");
        starbucks.save(customer2);
        System.out.print("Nero =>         ");
        nero.save(customer2);


    }
}
