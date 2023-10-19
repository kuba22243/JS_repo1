package org.example;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!\n");
        System.out.printf("------------------------------\n");
        class Customer{
            int customerNumber;
            String name;
            String surname;
            Boolean status;
            public Customer(){}
            public Customer(String name, String surname){
                this.name = name;
                this.surname = surname;
            }
            public Customer(int customerNumber, String name, String surname, Boolean status){
                this.customerNumber = customerNumber;
                this.name = name;
                this.surname = surname;
                this.status = status;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Customer customer = (Customer) o;
                return customerNumber == customer.customerNumber && Objects.equals(name, customer.name) && Objects.equals(surname, customer.surname) && Objects.equals(status, customer.status);
            }

            @Override
            public int hashCode() {
                return Objects.hash(customerNumber, name, surname, status);
            }
        }

        ArrayList customerNameList = new ArrayList();

        Customer customer1 = new Customer(1,"Andzej","Miły",true);
        Customer customer2 = new Customer(2,"Sebastian","Pogoda",true);
        Customer customer3 = new Customer(3,"Maciej","Lampa",true);
        Customer customer4 = new Customer(4,"Krzysztof","Czas",true);
        Customer customer5 = new Customer(5,"Przemysław","Śnieg",true);

        customerNameList.add(customer1.name);
        customerNameList.add(customer2.name);
        customerNameList.add(customer3.name);
        customerNameList.add(customer4.name);
        customerNameList.add(customer5.name);

        HashMap<Integer, String> customerMap = new HashMap<>();

        customerMap.put(customer1.customerNumber, customer1.name+" "+customer1.surname);
        customerMap.put(customer2.customerNumber, customer2.name+" "+customer2.surname);
        customerMap.put(customer3.customerNumber, customer3.name+" "+customer3.surname);
        customerMap.put(customer4.customerNumber, customer4.name+" "+customer4.surname);
        customerMap.put(customer5.customerNumber, customer5.name+" "+customer5.surname);

        System.out.println("Twoi klienci to: " + customerNameList);
        System.out.println("Podaj numer klienta, który Cię interesuje");
        Scanner scan = new Scanner(System.in);
        int cNumber = scan.nextInt();
        System.out.println(customerMap.get(cNumber));
    }
}