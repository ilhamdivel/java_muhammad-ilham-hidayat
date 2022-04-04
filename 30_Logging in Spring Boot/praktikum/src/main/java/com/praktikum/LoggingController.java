package com.praktikum;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class LoggingController {
    private static final Logger LOG = LoggerFactory.getLogger(LoggingController.class);

    @GetMapping
    public String index() {
        LOG.trace("A TRACE Message");
        LOG.debug("A DEBUG Message");
        LOG.info("An INFO Message");
        LOG.warn("A WARN Message");
        LOG.error("An INFO Message");

        return "Howdy! Check out the Logs to see the output...";
    }
}
