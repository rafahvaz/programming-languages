package src.models;

public class Resident extends Person{

    private final Integer numeroApt;
    private Boolean contaPaga;

    public Resident(Long id, String name, String cpf, Integer numeroApt) {
        super(id, name, cpf);
        this.numeroApt = numeroApt;
    }

    public Integer getNumeroApt() {
        return numeroApt;
    }

    public Boolean getContaPaga() {
        return contaPaga;
    }

    public void setContaPaga(Boolean contaPaga) {
        this.contaPaga = contaPaga;
    }
}
