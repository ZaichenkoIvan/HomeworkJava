package ua.mycompany.objectm;

public class Main {
    public static void main(String[] args) {

        Sprite sprite1 = new Sprite("glask", 30, 15.0);
        Sprite sprite2 = new Sprite("glass", 30, 15.0);

        boolean equalsSprite = sprite1.equals(sprite2);
        System.out.println("This object is equals. Its "+ equalsSprite);

        boolean hashCode = sprite1.hashCode() == sprite2.hashCode();
        System.out.println("This object has similar hashcode. Its "+ hashCode);
    }

}
