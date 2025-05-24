package com.edgeverve.fbp.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;
@Entity
@Table(name = "operative_account")
public class OperativeAccount {
    @Id
    @UuidGenerator
    private UUID accountId;
    @Column(nullable = false)
    private String accountName;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(nullable = false,referencedColumnName = "account_number",name = "account_number")
    private AccountDetails accountDetails;

    public OperativeAccount(UUID accountId, String accountName, AccountDetails accountDetails) {
        this.accountId = accountId;
        this.accountName = accountName;
        this.accountDetails = accountDetails;
    }

    public OperativeAccount() {
    }

    public UUID getAccountId() {
        return accountId;
    }

    public void setAccountId(UUID accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public AccountDetails getAccountDetails() {
        return accountDetails;
    }

    public void setAccountDetails(AccountDetails accountDetails) {
        this.accountDetails = accountDetails;
    }

    @Override
    public String toString() {
        return "OperativeAccount{" +
                "accountId=" + accountId +
                ", accountName='" + accountName + '\'' +
                ", accountDetails=" + accountDetails +
                '}';
    }
}
