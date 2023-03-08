package academy.jairo.quarkus.cdev.ms.one;

import academy.jairo.quarkus.cdev.ms.one.domain.client.Client;
import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;

@org.eclipse.microprofile.health.Readiness
public class Readiness implements HealthCheck {

    @Override
    public HealthCheckResponse call() {
        if (Client.listAll().isEmpty()) {
            return HealthCheckResponse.up("Hi, I'm ready and go ahead!");
        } else {
            return HealthCheckResponse.up("I'm so sorry, I'm not ready.");
        }
    }

}
