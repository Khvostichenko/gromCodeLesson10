package lesson10.abstractorder;

import java.util.Date;

public class ElectronicsOrder extends Order{
    private int guaranteeMonths;

    public ElectronicsOrder(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrice,
                            Customer customerOwned, int guaranteeMonths) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
        this.guaranteeMonths = guaranteeMonths;
    }

    @Override
    public void validateOrder() {
        if((getShipFromCity() == "Киев" || getShipFromCity() == "Одесса" || getShipFromCity() == "Днепр" || getShipFromCity() == "Харьков") &&
                (getShipToCity() == "Киев" || getShipToCity() == "Одесса" || getShipToCity() == "Днепр" || getShipToCity() == "Харьков")){
                if(getBasePrice() >= 100){
                    if(getCustomerOwned() != null) {
                        if (getCustomerOwned().getGender() == "Женский") {
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
        if(getBasePrice() <= 1000) {
            if (getShipToCity() != "Киев" || getShipToCity() == "Одесса") {
                setTotalPrice(getBasePrice() + getBasePrice() * 0.15);
                if(getDateConfirmed() != null) {
                    System.out.println("Итоговая сумма заказа равна: " + getTotalPrice());
                }
            } else {
                setTotalPrice(getBasePrice() + getBasePrice() * 0.10);
                if(getDateConfirmed() != null) {
                    System.out.println("Итоговая сумма заказа равна: " + getTotalPrice());
                }
            }
        } else{
            if (getShipToCity() != "Киев" || getShipToCity() == "Одесса") {
                double result = getBasePrice() + getBasePrice() * 0.15;
                setTotalPrice(result - result*0.05);
                if(getDateConfirmed() != null) {
                    System.out.println("Итоговая сумма заказа равна: " + getTotalPrice());
                }
            } else {
                double result = getBasePrice() + getBasePrice() * 0.10;
                setTotalPrice(result - result*0.05);
                if(getDateConfirmed() != null) {
                    System.out.println("Итоговая сумма заказа равна: " + getTotalPrice());
                }
            }
        }
    }

    public int getGuaranteeMonths() {
        return guaranteeMonths;
    }
}
