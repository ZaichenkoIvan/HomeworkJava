package ua.mycompany.builder;

public class Main {
    public static void main(String[] args) {
        User user = new User.Builder()
                .withName("Vania")
                .withCode(1007)
                .build();

        System.out.println(user);
    }

}
