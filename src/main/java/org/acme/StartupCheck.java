package org.acme;

import io.quarkus.runtime.StartupEvent;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

@ApplicationScoped
public class StartupCheck {
    void onStart(@Observes StartupEvent ev) {
        throw new IllegalStateException("Should not arrive here from unit test");
    }
}