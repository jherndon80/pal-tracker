package io.pivotal.pal.tracker;

import org.springframework.boot.actuate.endpoint.annotation.DeleteOperation;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "backingServiceFailure")
public class BackingServiceFailure {
    private boolean simulateFailure;

    @WriteOperation
    public void set() {
        System.out.println("Set failure to true");
        simulateFailure = true;
    }

    @DeleteOperation
    public void unset() {
        System.out.println("Set failure to false");
        simulateFailure = false;
    }

    @ReadOperation
    public boolean isSimulateFailure() {
        System.out.println("Failure is " + simulateFailure);
        return simulateFailure;
    }
}
