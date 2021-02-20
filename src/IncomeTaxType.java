import java.math.BigDecimal;

public class IncomeTaxType extends TaxType {
    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {

        BigDecimal multiply = amount.multiply(BigDecimal.valueOf(0.13));
        return multiply;


    }
}
