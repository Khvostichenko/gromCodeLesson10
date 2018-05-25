package lesson10.abstractorder;

import java.util.Date;

public class FurnitureOrder extends Order{
    private String furnitureCode;

    public FurnitureOrder(String itemName, Date dateCreated, String shipFromCity, String shipToCity,
                          int basePrice, Customer customerOwned, String furnitureCode) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
        this.furnitureCode = furnitureCode;
    }

    @Override
    public void validateOrder() {
        if(getShipFromCity() == "Киев" || getShipFromCity() == "Львов"){
            if(getBasePrice() >= 500){
                if(getCustomerOwned() != null) {
                    if (getCustomerOwned().getName() != "Тест") {
                        setDateConfirmed(new Date());
                        System.out.println("Поздравляем валидация прошла успешно.");
                        System.out.println("Заказ принят к исполнению: " + getDateConfirmed());
                        return;
                    }
                }
            }
        }
        System.out.println("Заказ не прошел валидацию.");
    }

    @Override
    public void calculatePrice() {
        if(getBasePrice() < 5000) {
                setTotalPrice(getBasePrice() + getBasePrice() * 0.05);
            if(getDateConfirmed() != null) {
                System.out.println("Итоговая сумма заказа равна: " + getTotalPrice());
            }
        } else{
            setTotalPrice(getBasePrice() + getBasePrice() * 0.02);
            if(getDateConfirmed() != null) {
                System.out.println("Итоговая сумма заказа равна: " + getTotalPrice());
            }
        }
    }

    public String getFurnitureCode() {
        return furnitureCode;
    }
}
