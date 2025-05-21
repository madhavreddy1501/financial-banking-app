package com.edgeverve.fbp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class OperativeAccount {
    @Id
    @UuidGenerator
    private UUID accountId;
    @Column(nullable = false)
    private String accountName;
    @Column(nullable = false)
    private String accountNumber;
}
