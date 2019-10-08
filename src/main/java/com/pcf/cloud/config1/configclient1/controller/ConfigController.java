package com.pcf.cloud.config1.configclient1.controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ConfigController {

    @Value("${spring.bms.keyQuark}")
    private String keyQuark;

    @Value("${bms.config.apiKey}")
    private String bmsCommon;

    @RequestMapping(value = "/getProperty" )
    public String getMessage() {
        return "Common Message: "+ bmsCommon  + " -- Gravity Message:: " +keyQuark;
    }
}

