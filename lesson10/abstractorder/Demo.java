package lesson10.abstractorder;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Марина", "Харьков", "Женский");
        ElectronicsOrder electronicsOrder1 = new ElectronicsOrder("Phone",new Date(),"Киев","Харьков",200, customer1,12);

        Customer customer2 = new Customer("Лариса", "Харьков", "Женский");
        ElectronicsOrder electronicsOrder2 = new ElectronicsOrder("TV",new Date(),"Киев","Кривой Рог",500, customer2,24);

        Customer customer3 = new Customer("Наташа", "Черновцы", "Женский");
        FurnitureOrder furnitureOrder1 = new FurnitureOrder("Chair", new Date(),"Черновцы", "Киев",501,customer3,"12478124");


        Customer customer4 = new Customer("Валентина", "Кривой Рог", "Женский");
        FurnitureOrder furnitureOrder2 = new FurnitureOrder("Sofa", new Date(),"Львов", "Кривой Рог",900,customer4,"987451442");

        Customer customer5 = new Customer("Евгений", "Кривой Рог", "Мужской");
        ElectronicsOrder electronicsOrder3 = new ElectronicsOrder("TV",new Date(),"Киев","Харьков",500, customer5,24);

        Customer customer6 = new Customer("Тест", "Кривой Рог", "Женский");
        FurnitureOrder furnitureOrder3 = new FurnitureOrder("Sofa", new Date(),"Львов", "Кривой Рог",900,customer6,"987451442");

        Customer customer7 = new Customer(null, null, null);
        ElectronicsOrder electronicsOrder4 = new ElectronicsOrder("Phone",new Date(),"Киев","Харьков",200, customer7,12);


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
        System.out.println("electronicsOrder3: ");
        electronicsOrder3.validateOrder();
        electronicsOrder3.calculatePrice();
        electronicsOrder3.confirmShipping();
        System.out.println("----------------------------------------");

        System.out.println("electronicsOrder4: ");
        electronicsOrder4.validateOrder();
        electronicsOrder4.calculatePrice();
        electronicsOrder4.confirmShipping();
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

        System.out.println();
        System.out.println("furnitureOrder3: ");
        furnitureOrder3.validateOrder();
        furnitureOrder3.calculatePrice();
        furnitureOrder3.confirmShipping();
        System.out.println("----------------------------------------");
    }
}
