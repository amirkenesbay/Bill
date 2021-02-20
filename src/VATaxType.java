import java.math.BigDecimal;

public class VATaxType extends TaxType {
    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        BigDecimal multiply = amount.multiply(BigDecimal.valueOf(0.18));
        return multiply;
    }
}
