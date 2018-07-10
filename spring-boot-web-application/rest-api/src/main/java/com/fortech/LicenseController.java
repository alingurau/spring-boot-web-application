package com.fortech;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface LicenseController {

    @GetMapping
    List<LicenseDto> readAllLicenses();

    @GetMapping("/{licenseId}")
    LicenseDto readOneLicense(@PathVariable Long licenseId);

    @PostMapping
    ResponseEntity<Object> add(@RequestBody LicenseDto input);
}
