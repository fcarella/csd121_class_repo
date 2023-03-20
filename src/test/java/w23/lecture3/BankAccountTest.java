package w23.lecture3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    BankAccount ba;
    BankAccount ba2;
    @BeforeEach
    void setUp() {
        ba=new BankAccount();
        ba2=new BankAccount(1000);
    }

    @Test
    void deposit() {
    }

    @Test
    void withdraw() {
    }

    @Test
    void getBalance() {
        assertEquals(ba.getBalance(), 100);
        assertEquals(ba2.getBalance(), 1000);
    }
}