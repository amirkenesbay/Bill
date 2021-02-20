import java.math.BigDecimal;

public class BillMain {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        TaxType taxType = new TaxType();
        Bill[] payments = new Bill[]{
                //TODO создать платежи с различными типами налогооблажения
                new Bill(BigDecimal.valueOf(15000.5), new IncomeTaxType(), taxService),
                new Bill(BigDecimal.valueOf(4000.3), new VATaxType(), taxService),
                new Bill(BigDecimal.valueOf(10000.7), new ProgressiveTaxType(), taxService)
        };

        for (int i = 0; i < payments.length; i++) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}
