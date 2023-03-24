package w23.lecture3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person p;
    @BeforeEach
    void setUp() {
        p=new Person("Fred", "Carella", 99);
    }

    @Test
    void getFirstName() {
        assertEquals("Fred", p.getFirstName());
    }

    @Test
    void getLastName() {
    }

    @Test
    void setFirstName() {
    }

    @Test
    void setLastName() {
    }
}