public class Client {
    private String name;
    private String cpf;
    private Type type;
    private Choice choice;
    public enum Type{
        PRIORITY,
        COMMON;

    }

    public Type getType() {
        return type;
    }

    public Client(String name, String cpf, Type type, Choice choice) {
        this.name = name;
        this.cpf = cpf;
        this.type = type;
        this.choice = choice;
    }

    public Choice getChoice() {
        return choice;
    }

    @Override
    public String toString() {
        return "("+name+ " : " + cpf+ " : " + type+")";
    }
}
