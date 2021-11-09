package com.example.demo;

import com.example.demo.accounts.Account;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class DemoApplicationTests {
    @Test
    public void getterSetter() {
        Account account = new Account();
        account.setUsername("swpark");
        account.setPassword("password");
        assertThat(account.getUsername(), is("swpark"));
    }
}
