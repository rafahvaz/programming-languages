package src.models;

public class CondoDoorman extends Person{

    private final Double wage;

    public CondoDoorman(int id, String name, String cpf, Double wage) {
        super(id, name, cpf);
        this.wage = wage;
    }

    public Double getWage() {
        return wage;
    }
}
