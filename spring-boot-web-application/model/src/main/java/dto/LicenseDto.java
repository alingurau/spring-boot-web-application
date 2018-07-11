package dto;

import entity.License;

public class LicenseDto {
    private String validationKey;
    private String generatedKey;


    public License toEntity(){
        License entity=new License();
        entity.setValidationKey(this.validationKey);
        entity.setGeneratedKey(this.generatedKey);
        return entity;
    }



    public void setValidationKey(String validationKey) {
        this.validationKey = validationKey;
    }

    public void setGeneratedKey(String generatedKey) {
        this.generatedKey = generatedKey;
    }
}
