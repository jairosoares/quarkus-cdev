package academy.jairo.quarkus.cdev.cli.domain.client;

public class Client {

    private long id;

    private String name;

    public Client(){

    }
    private Client(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public static Client of(long id, String name) {
        return new Client(id, name);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
