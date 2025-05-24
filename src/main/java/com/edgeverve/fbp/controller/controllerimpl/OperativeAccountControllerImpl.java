package com.edgeverve.fbp.controller.controllerimpl;

import com.edgeverve.fbp.controller.OperativeAccountController;
import com.edgeverve.fbp.entity.OperativeAccount;
import com.edgeverve.fbp.model.OperativeAccountDto;
import com.edgeverve.fbp.service.OperativeAccountService;
import com.edgeverve.fbp.service.serviceimpl.OperativeAccountServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
public class OperativeAccountControllerImpl implements OperativeAccountController {
    @Autowired
    private OperativeAccountService operativeAccountService;

    public ResponseEntity<String> ping() {
        return ResponseEntity.ok("Success");
    }

    public OperativeAccountDto createOperativeAccount(@RequestBody OperativeAccountDto operativeAccountDto) {
        return operativeAccountService.createOperativeAccount(operativeAccountDto);
    }
    public OperativeAccountDto findAccountDetailsByAccountNumber(@PathVariable("accountId") Long accountId) {
        return operativeAccountService.findAccountById(accountId);
    }
    public List<OperativeAccountDto> getAllOperativeAccounts(){
        return operativeAccountService.fetchAllBankAccounts();
    }
}
