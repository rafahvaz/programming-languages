package src.models;

public class CondoManager extends Person{

    private String username = "admin";
    private String password = "123456";

    public CondoManager(int id, String name, String cpf) {
        super(id, name, cpf);
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
