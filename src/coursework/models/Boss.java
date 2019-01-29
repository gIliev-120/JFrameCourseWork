package coursework.models;

import java.math.BigDecimal;

public class Boss extends Staff {
    private BigDecimal bonusSalary;


    @Override
    public BigDecimal Earnings() {
        BigDecimal sum = super.Earnings().add(bonusSalary);
        return sum;
    }

    public Boss(String firstName, String lastName, BigDecimal salary, BigDecimal bonusSalary) {
        super(firstName, lastName, salary);
        this.bonusSalary = bonusSalary;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "bonusSalary=" + bonusSalary +
                '}';
    }
}
