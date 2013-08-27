package com.github.fedcuit.datatank.controller;

import org.apache.commons.io.IOUtils;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class CallbackController {
    @RequestMapping(value = "/jinshuju/callback", method = POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public void callback(@RequestBody String formData) throws URISyntaxException, IOException {
        FileWriter writer = new FileWriter(new File(getClass().getResource("/application.json").toURI()));
        IOUtils.write(formData, writer);

        IOUtils.closeQuietly(writer);
    }
}
