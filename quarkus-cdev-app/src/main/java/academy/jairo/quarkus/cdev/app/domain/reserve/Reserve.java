package academy.jairo.quarkus.cdev.app.domain.reserve;

import academy.jairo.quarkus.cdev.app.domain.client.Client;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@Entity
public class Reserve extends PanacheEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    public Client client;

}
