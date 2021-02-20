import java.math.BigDecimal;

public class ProgressiveTaxType extends TaxType {
    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        BigDecimal oneHundredDecimal = new BigDecimal(100000);

        if (amount.compareTo(oneHundredDecimal) <= 0) {
            BigDecimal multiply = amount.multiply(BigDecimal.valueOf(0.1));
            return multiply;
        } else {
            BigDecimal multiply = amount.multiply(BigDecimal.valueOf(0.15));
            return multiply;
        }

    }
}
