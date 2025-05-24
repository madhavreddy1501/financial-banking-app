package com.edgeverve.fbp.service;

import com.edgeverve.fbp.model.OperativeAccountDto;

import java.util.List;

public interface OperativeAccountService {
    OperativeAccountDto createOperativeAccount(OperativeAccountDto operativeAccount);
    OperativeAccountDto findAccountById(Long id);
    List<OperativeAccountDto> fetchAllBankAccounts();
}
