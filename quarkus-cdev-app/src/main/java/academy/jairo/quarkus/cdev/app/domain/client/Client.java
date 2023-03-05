package academy.jairo.quarkus.cdev.app.domain.client;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;

@Entity
public class Client extends PanacheEntity {

    public String name;

}
