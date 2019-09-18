package ua.mycompany.objectm;

import javax.xml.bind.ValidationException;

public class Main {
    public static void main(String[] args) throws ValidationException {

        Address address = new Address("Uman", 20300);
        User user = new User("v","w", 20,true, address);

        System.out.println(user);

        address.setCity("Kiev");
        System.out.println(user);

        System.out.println();

        User user1 = new User("v","w", 20,true, address);
        User user2 = new User("v","v", 20,true, address);

        boolean equalsUser = user1.equals(user2);
        System.out.println("This object is equals. Its "+ equalsUser);

        boolean hashCode = user1.hashCode() == user2.hashCode();
        System.out.println("This object has similar hashcode. Its "+ hashCode);

        System.out.println(null == null);
        String str = null;
        System.out.println(str.equals(null));

    }

}
