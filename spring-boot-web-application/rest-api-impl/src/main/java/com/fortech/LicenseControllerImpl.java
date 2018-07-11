package com.fortech;

import entity.License;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import repository.LicenseRepository;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin
@RestController
public class LicenseControllerImpl implements LicenseController {

    private LicenseRepository licenseRepository;

    @Autowired
    LicenseControllerImpl(LicenseRepository licenseRepository) {
        this.licenseRepository = licenseRepository;
    }

    public List<License> readAllLicenses() {


        return this.licenseRepository.findAll();
    }

    @Override
    public License readOneLicense(Long licenseId) {
        return null;
    }

    @Override
    public ResponseEntity<Object> addLicense(License input) {
        return null;
    }


}
