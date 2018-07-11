package dto;

import entity.License;

public class LicenseDto {

private Long id;
private String generatedKey;
private String validationKey;

    LicenseDto(String generatedKey, String validationKey) {
        this.generatedKey = generatedKey;
        this.validationKey = validationKey;
    }

    LicenseDto(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGeneratedKey() {
        return generatedKey;
    }

    public void setGeneratedKey(String generatedKey) {
        this.generatedKey = generatedKey;
    }

    public String getValidationKey() {
        return validationKey;
    }

    public void setValidationKey(String validationKey) {
        this.validationKey = validationKey;
    }

    public License toEntity() {
        LicenseEntity licenseEntity= new LicenseEntity();

        licenseEntity.setId(this.getId());
        licenseEntity.setGeneratedKey(this.getGeneratedKey());
        licenseEntity.setValidationKey(this.getValidationKey());

        return licenseEntity;
    }
}
