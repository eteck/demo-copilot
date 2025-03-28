package com.example.demo.domain.model;

    import jakarta.validation.constraints.*;
    import lombok.Data;

    @Data
    public class Transaction {
        @NotNull
        private String transactionId;

        @NotNull
        private String accountId;

        @Positive
        private double amount;

        @NotBlank
        private String description;

        @NotNull
        private String timestamp;

        @NotBlank
        private String transactionType;
    }