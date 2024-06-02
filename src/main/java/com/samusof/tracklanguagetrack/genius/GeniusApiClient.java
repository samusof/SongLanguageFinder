package com.samusof.tracklanguagetrack.genius;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GeniusApiClient {
    private static final Logger LOGGER = LoggerFactory.getLogger(GeniusApiClient.class);
    public void logSomething() {
        this.logger().info("Hello world");
    }

    public Logger logger() {
        return LOGGER;
    }
}
