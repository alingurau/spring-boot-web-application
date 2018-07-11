package com.fortech;


import entity.License;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/license")
public interface LicenseController {

    @GetMapping
    List<License> readAllLicenses();

    @GetMapping("/{licenseId}")
    License readOneLicense(@PathVariable Long licenseId);

    @PostMapping
    ResponseEntity<Object> addLicense(@RequestBody License input);
}
