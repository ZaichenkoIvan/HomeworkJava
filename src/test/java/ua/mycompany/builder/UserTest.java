package ua.mycompany.builder;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void shouldReturnEmailOfBuilder() {
        User user = new User.Builder()
                .withName("Petro")
                .withSurname("Petrovich")
                .withEmail("petr@gmail.com")
                .withPassword("1234")
                .withCode(228)
                .build();

        assertEquals("Petro", user.getName());
        assertEquals("Petrovich", user.getSurname());
        assertEquals("petr@gmail.com", user.getEmail());
        assertEquals("1234", user.getPassword());
        assertEquals(228, user.getCode());
    }

    @Test
    public void shouldReturnNullOfEmptyFieldBuilder() {
        User user = new User.Builder()
                .withSurname("Petrovich")
                .withPassword("1234")
                .withCode(228)
                .build();

        assertNull(user.getName());
        assertEquals("Petrovich", user.getSurname());
        assertNull(user.getEmail());
        assertEquals("1234", user.getPassword());
        assertEquals(228, user.getCode());
    }

    @Test(expected = IllegalArgumentException.class)
    public void throwIllegalArgumentExceptionUserCodeNegative() {
        new User.Builder()
                .withCode(-1000)
                .build();
    }

}