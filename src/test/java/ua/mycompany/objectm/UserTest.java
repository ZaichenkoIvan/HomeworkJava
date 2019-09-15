package ua.mycompany.objectm;

import com.sun.media.sound.InvalidDataException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {
    User user1;
    User user2;
    User user3;

    @Before
    public void setUp() throws InvalidDataException {
        Address address = new Address("Uman", 20300);
        user1 = new User("v","o", 20,true, address);
        user2 = new User("v","v", 20,true, address);
        user3 = new User("v","o", 20,true, address);
    }

    @Test
    public void shouldReturnEqualsObjects() {
        boolean equalsUser = user1.equals(user2);
        assertFalse(equalsUser);

        equalsUser = user1.equals(user3);
        assertTrue(equalsUser);
    }

    @Test
    public void shouldReturnHashCode() {
        boolean hashCode = user1.hashCode() == user2.hashCode();
        assertTrue(hashCode);

        hashCode = user2.hashCode() == user3.hashCode();
        assertTrue(hashCode);
    }
}