package com.edgeverve.fbp.controller;

import com.edgeverve.fbp.entity.OperativeAccount;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@OpenAPIDefinition(info = @Info(
        title = "Operative Account Service",
        description = "This Service is Used to Create Operative Account",
        version = "1.0"
))
@RequestMapping("/operative-account/")
public interface OperativeAccountController {
    @Operation(description = "Api Used to Check Service is running or Not")
    @ApiResponses(
            @ApiResponse(
                    responseCode = "200",
                    description = "Return Success Message if Server is Running"
            )
    )
    @GetMapping("ping")
    ResponseEntity<String> ping();
    @Operation(description = "Api used to create Operative Account")
    @PostMapping("create-account")
    OperativeAccount createOperativeAccount(@RequestBody OperativeAccount operativeAccount);
    @Operation(description = "Api used to fetch the Account Details based on Account Number")
    @GetMapping("get-account/{accountId}")
    OperativeAccount findAccountDetailsByAccountNumber(@PathVariable("accountNumber") Long accountNumber);
    @Operation(description = "Api used to fetch all Operative Accounts")
    @GetMapping
    List<OperativeAccount> getAllOperativeAccounts();
}
