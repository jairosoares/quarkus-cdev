package academy.jairo.quarkus.cdev.app.cli.domain.reserve;

import academy.jairo.quarkus.cdev.app.cli.domain.client.Client;

public class Reserve {

    private long id;
    private Client client;

    private Reserve(long id, Client client) {
        this.id = id;
        this.client = client;
    }

    public static Reserve of(long id, Client client) {
        return new Reserve(id, client);
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
