package ua.mycompany.objectm;

import com.sun.media.sound.InvalidDataException;
import org.junit.Before;
import org.junit.Test;

import javax.xml.bind.ValidationException;

import static org.junit.Assert.*;

public class UserTest {
    private User user1;
    private User user2;
    private User user3;

    @Before
    public void setUp() throws ValidationException {
        Address address = new Address("Uman", 20300);
        user1 = new User(null,"o", 20,true, address);
        user2 = new User(null,"o", 20,true, address);
        user3 = new User("v","o", 20,true, address);
    }

    @Test
    public void shouldReturnEqualsObjects() {
        boolean equalsUser = user1.equals(user2);
        assertTrue(equalsUser);

        equalsUser = user1.equals(user3);
        assertFalse(equalsUser);
    }

    @Test
    public void shouldReturnHashCode() {
        boolean hashCode = user1.hashCode() == user2.hashCode();
        assertTrue(hashCode);

        hashCode = user2.hashCode() == user3.hashCode();
        assertTrue(hashCode);
    }
}