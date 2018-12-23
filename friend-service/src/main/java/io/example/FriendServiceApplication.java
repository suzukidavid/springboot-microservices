package io.example;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.annotation.Configuration;

/**
 * The microservice that manages domain data for friend requests.
 *
 * @author Kenny Bastani
 */
@SpringBootApplication
public class FriendServiceApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(FriendServiceApplication.class).web(WebApplicationType.REACTIVE).run(args);
    }

    /**
     * Configures a {@link Source} channel binding for emitting domain events
     * to a Spring Cloud Stream adapter.
     */
    @Configuration
    @EnableBinding(Source.class)
    class StreamConfig {
    }
}
