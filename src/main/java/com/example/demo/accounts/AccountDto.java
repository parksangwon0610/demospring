package com.example.demo.accounts;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class AccountDto {

    @Data
    public static class Create {
        @NotBlank
        @Size(min = 5)
        private String username;

        @NotBlank
        @Size(min = 5)
        private String password;
    }
}
