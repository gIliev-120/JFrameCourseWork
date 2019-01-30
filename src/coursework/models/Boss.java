package coursework.models;

import java.math.BigDecimal;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Boss boss = (Boss) o;
        return Objects.equals(bonusSalary, boss.bonusSalary);
    }


}
