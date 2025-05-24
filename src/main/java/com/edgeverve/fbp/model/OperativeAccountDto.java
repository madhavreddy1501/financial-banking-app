package com.edgeverve.fbp.model;

import java.util.UUID;
public class OperativeAccountDto {
    private UUID accountId;
    private String accountName;
    private AccountDetailsDto accountDetails;

    public OperativeAccountDto(UUID accountId, String accountName,AccountDetailsDto accountDetails) {
        this.accountId = accountId;
        this.accountName = accountName;
        this.accountDetails = accountDetails;
    }

    public OperativeAccountDto() {
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

    public AccountDetailsDto getAccountDetails() {
        return accountDetails;
    }

    public void setAccountDetails(AccountDetailsDto accountDetails) {
        this.accountDetails = accountDetails;
    }

}
