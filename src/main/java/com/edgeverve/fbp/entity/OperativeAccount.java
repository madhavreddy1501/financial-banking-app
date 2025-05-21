package com.edgeverve.fbp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class OperativeAccount {
    @Id
    private long accountId;
    private String accountNumber;

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
