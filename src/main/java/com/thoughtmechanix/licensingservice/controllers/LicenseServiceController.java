package com.thoughtmechanix.licensingservice.controllers;

import com.thoughtmechanix.licensingservice.config.TransportProperties;
import com.thoughtmechanix.licensingservice.config.WordPressProperties;
import com.thoughtmechanix.licensingservice.model.Country;
import com.thoughtmechanix.licensingservice.model.License;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by Antony Genil on 2019-06-26 at 19 35 for licensing-service
 **/
@RestController
@RequestMapping("/v1/orgs/{orgId}/licenses")

public class LicenseServiceController {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private WordPressProperties wordPressProperties;

    @Autowired
    private TransportProperties transportProperties;

    @RequestMapping(value = "/{licenseId}", method = RequestMethod.GET)
    public License getLicenses(@PathVariable("orgId") String orgId, @PathVariable("licenseId") String licenseId) {
        logger.info("Menus ."+ wordPressProperties.getMenus());
        logger.info("Countries "+transportProperties.getCountries());
        Map<String, Country> countryMap = transportProperties.getCountryMap();

        logger.info("Map object for India "+countryMap.get("India"));
        return new License().withLicenseId(licenseId).withProductName("Maverico");
    }
}
