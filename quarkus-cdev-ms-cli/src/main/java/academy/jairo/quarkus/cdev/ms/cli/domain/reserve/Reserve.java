package academy.jairo.quarkus.cdev.ms.cli.domain.reserve;

import academy.jairo.quarkus.cdev.ms.cli.domain.client.Client;

public class Reserve {

    private long id;
    private long idClient;

    private Reserve(long id, long idClient) {
        this.id = id;
        this.idClient = idClient;
    }

    public static Reserve of(long id, long idClient) {
        return new Reserve(id, idClient);
    }

    public long getIdClient() {
        return idClient;
    }

    public void setIdClient(long idClient) {
        this.idClient = idClient;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
