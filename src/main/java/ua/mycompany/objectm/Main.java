package ua.mycompany.objectm;

import com.sun.media.sound.InvalidDataException;

public class Main {
    public static void main(String[] args) throws InvalidDataException {

        Address address = new Address("Uman", 20300);
        User user = new User("v","w", 20,true, address);

        System.out.println(user);

        address.setCity("Kiev");
        System.out.println(user);

        System.out.println();

        User user1 = new User("v","w", 20,true, address);
        User user2 = new User("v","v", 20,true, address);

        boolean equalsSprite = user1.equals(user2);
        System.out.println("This object is equals. Its "+ equalsSprite);

        boolean hashCode = user1.hashCode() == user2.hashCode();
        System.out.println("This object has similar hashcode. Its "+ hashCode);

    }

}
