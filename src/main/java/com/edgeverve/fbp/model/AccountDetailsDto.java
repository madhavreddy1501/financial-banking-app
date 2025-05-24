package com.edgeverve.fbp.model;

import com.edgeverve.fbp.utils.constants.AccountActiveStatus;
import com.edgeverve.fbp.utils.constants.AccountType;

import java.time.LocalDate;
public class AccountDetailsDto {
    private String accountNumber;
    private AccountActiveStatus accountActiveStatus;
    private AccountType accountType;
    private String createdBy;
    private LocalDate createdAt;
    private String lastModifiedBy;
    private LocalDate lastModifiedAt;

    public AccountDetailsDto(String accountNumber, AccountActiveStatus accountActiveStatus, AccountType accountType, String createdBy, LocalDate createdAt, String lastModifiedBy, LocalDate lastModifiedAt) {
        this.accountNumber = accountNumber;
        this.accountActiveStatus = accountActiveStatus;
        this.accountType = accountType;
        this.createdBy = createdBy;
        this.createdAt = createdAt;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedAt = lastModifiedAt;
    }

    public AccountDetailsDto() {
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public AccountActiveStatus getAccountActiveStatus() {
        return accountActiveStatus;
    }

    public void setAccountActiveStatus(AccountActiveStatus accountActiveStatus) {
        this.accountActiveStatus = accountActiveStatus;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public LocalDate getLastModifiedAt() {
        return lastModifiedAt;
    }

    public void setLastModifiedAt(LocalDate lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }
}
