package entity;


import dto.LicenseDto;

import javax.persistence.*;
@Entity
@Table(name="License")
public class License {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String generatedKey;

    @Column
    private String validationKey;

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    @Override
    public String toString(){
        return String.format("License[id=%d, validationKey='%s', generatedKey='%s']", id, validationKey, generatedKey);
    }

    public LicenseDto toDto(){
        LicenseDto dto = new LicenseDto();
        dto.setGeneratedKey(this.generatedKey);
        dto.setValidationKey(this.validationKey);
        return dto;
    }
}
