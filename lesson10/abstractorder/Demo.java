package lesson10.abstractorder;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Олег", "Харьков", "Мужской");
        ElectronicsOrder electronicsOrder1 = new ElectronicsOrder("Phone",new Date(),"Киев","Харьков",200, customer1,12);

        Customer customer2 = new Customer("Евгений", "Львов", "Мужской");
        ElectronicsOrder electronicsOrder2 = new ElectronicsOrder("TV",new Date(),"Киев","Краматорск",500, customer2,24);

        Customer customer3 = new Customer("Наташа", "Черновцы", "Женский");
        FurnitureOrder furnitureOrder1 = new FurnitureOrder("Chair", new Date(),"Черновцы", "Киев",501,customer3,"12478124");


        Customer customer4 = new Customer("Валентина", "Кривой Рог", "Женский");
        FurnitureOrder furnitureOrder2 = new FurnitureOrder("Sofa", new Date(),"Кривой Рог", "Львов",120,customer4,"987451442");

        System.out.println("electronicsOrder1: ");
        electronicsOrder1.validateOrder();
        electronicsOrder1.calculatePrice();
        electronicsOrder1.confirmShipping();
        System.out.println("----------------------------------------");

        System.out.println();
        System.out.println("electronicsOrder2: ");
        electronicsOrder2.validateOrder();
        electronicsOrder2.calculatePrice();
        electronicsOrder2.confirmShipping();
        System.out.println("----------------------------------------");

        System.out.println();
        System.out.println("furnitureOrder1: ");
        furnitureOrder1.validateOrder();
        furnitureOrder1.calculatePrice();
        furnitureOrder1.confirmShipping();
        System.out.println("----------------------------------------");

        System.out.println();
        System.out.println("furnitureOrder2: ");
        furnitureOrder2.validateOrder();
        furnitureOrder2.calculatePrice();
        furnitureOrder2.confirmShipping();
        System.out.println("----------------------------------------");
    }
}
