package hr.taxes;

import hr.personnel.Employee;
import hr.personnel.FullTimeEmployee;
import hr.personnel.Intern;
import hr.personnel.PartTimeEmployee;

public class TaxCalculatorFactory {
    public static TaxCalculator create(Employee e) {
        if (e instanceof FullTimeEmployee) {
            return new FullTimeTaxCalculator();
        }

        if (e instanceof PartTimeEmployee) {
            return new PartTimeTaxCalculator();
        }

        if (e instanceof Intern) {
            return new InternTaxCalculator();
        }

        throw new RuntimeException("Invalid employee type");
    }
}
