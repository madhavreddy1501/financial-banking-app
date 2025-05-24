package com.edgeverve.fbp.entity;

import com.edgeverve.fbp.utils.constants.AccountActiveStatus;
import com.edgeverve.fbp.utils.constants.AccountType;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "account_details")
public class AccountDetails {
    @Id
    @Column(name = "account_number",nullable = false)
    private String accountNumber;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private AccountType accountType;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private AccountActiveStatus accountActiveStatus;
    private String createdBy;
    private LocalDate createdAt;
    private String lastModifiedBy;
    private LocalDate lastModifiedAt;

    @PrePersist
    public void onCreate() {
        createdAt = LocalDate.now();
        createdBy ="Kalyan";
        accountActiveStatus = AccountActiveStatus.ACTIVE;
    }

    @PreUpdate
    public void onUpdate() {
        lastModifiedAt = LocalDate.now();
        lastModifiedBy = "Pavan";
    }

    public AccountDetails(String accountNumber, AccountType accountType, AccountActiveStatus accountActiveStatus, String createdBy, LocalDate createdAt, String lastModifiedBy, LocalDate lastModifiedAt) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.accountActiveStatus = accountActiveStatus;
        this.createdBy = createdBy;
        this.createdAt = createdAt;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedAt = lastModifiedAt;
    }

    public AccountDetails() {
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public AccountActiveStatus getAccountActiveStatus() {
        return accountActiveStatus;
    }

    public void setAccountActiveStatus(AccountActiveStatus accountActiveStatus) {
        this.accountActiveStatus = accountActiveStatus;
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

    @Override
    public String toString() {
        return "AccountDetails{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountType=" + accountType +
                ", accountActiveStatus=" + accountActiveStatus +
                ", createdBy='" + createdBy + '\'' +
                ", createdAt=" + createdAt +
                ", lastModifiedBy='" + lastModifiedBy + '\'' +
                ", lastModifiedAt=" + lastModifiedAt +
                '}';
    }
}
