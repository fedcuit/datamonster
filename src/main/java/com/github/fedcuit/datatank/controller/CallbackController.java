package com.github.fedcuit.datatank.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class CallbackController {
    private static final Logger LOGGER = LoggerFactory.getLogger(CallbackController.class);

    @RequestMapping(value = "/jinshuju/callback", method = POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public
    @ResponseBody
    String callback(@RequestBody String formData) {
        LOGGER.info("data pushed from jinshuju" + formData);
        return formData;
    }
}
