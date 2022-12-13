package InsuranceOperations;

import java.util.Date;

public class ResidenceInsurance extends Insurance {

    public ResidenceInsurance(String insuranceType) {
        super("Residance Insurance", new Date(), new Date());
        calculate(insuranceType);
    }

    @Override
    public void calculate(String insuranceType) {
        double price = 2999.90;
        if (insuranceType.equals("Individual")) {
            setPrice(price);
        }
        if (insuranceType.equals("Enterprise")) {
            setPrice(price * 0.9);
        }
    }
}
