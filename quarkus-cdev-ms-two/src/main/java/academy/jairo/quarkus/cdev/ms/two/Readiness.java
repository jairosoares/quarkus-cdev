package academy.jairo.quarkus.cdev.ms.two;

import academy.jairo.quarkus.cdev.ms.two.domain.reserve.Reserve;
import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;

@org.eclipse.microprofile.health.Readiness
public class Readiness implements HealthCheck {

    @Override
    public HealthCheckResponse call() {
        if (Reserve.listAll().isEmpty()) {
            return HealthCheckResponse.up("Hi, I'm ready and go ahead!");
        } else {
            return HealthCheckResponse.up("I'm so sorry, I'm not ready.");
        }
    }

}
