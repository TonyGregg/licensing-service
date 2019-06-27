package com.thoughtmechanix.licensingservice.controllers;

import com.thoughtmechanix.licensingservice.model.License;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Antony Genil on 2019-06-26 at 19 35 for licensing-service
 **/
@RestController
@RequestMapping("/v1/orgs/{orgId}/licenses")
public class LicenseServiceController {

    @RequestMapping(value = "/{licenseId}", method = RequestMethod.GET)
    public License getLicenses(@PathVariable("orgId") String orgId, @PathVariable("licenseId") String licenseId) {

        return new License().withLicenseId(licenseId).withProductName("Maverico");
    }
}
