package com.github.fedcuit.datatank.controller;

import org.apache.commons.io.IOUtils;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.io.InputStream;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class ApplicationController {

    @RequestMapping(value = "/application", method = GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String applicationDetail() throws IOException {
        InputStream inputStream = getClass().getResourceAsStream("/application.json");
        String formData = IOUtils.toString(inputStream);
        IOUtils.closeQuietly(inputStream);

        return formData;
    }
}
