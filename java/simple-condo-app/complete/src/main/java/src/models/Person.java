package src.models;

public class Person {
    private final Long id;
    private final String name;
    private final String cpf;

    public Person(Long id, String name, String cpf) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public Long getId() {
        return this.id;
    }
}
