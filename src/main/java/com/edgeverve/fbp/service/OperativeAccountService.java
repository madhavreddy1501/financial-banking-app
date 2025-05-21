package com.edgeverve.fbp.service;

import com.edgeverve.fbp.entity.OperativeAccount;

import java.util.List;

public interface OperativeAccountService {
    OperativeAccount saveBankAccount(OperativeAccount operativeAccount);
    OperativeAccount findAccountById(Long id);
    List<OperativeAccount> fetchAllBankAccounts();
}
