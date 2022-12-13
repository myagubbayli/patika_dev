package InsuranceOperations;

import java.util.Date;

public class CarInsurance extends Insurance {

    public CarInsurance(String insuranceType) {
        super("Car Insurance", new Date(), new Date());
        calculate(insuranceType);
    }

    @Override
    public void calculate(String insuranceType) {
        double price = 1299.90;
        if (insuranceType.equals("Individual")) {
            setPrice(price);
        } 

        if (insuranceType.equals("Enterprise")) {
            setPrice(price * 0.9);
        }
    }

}