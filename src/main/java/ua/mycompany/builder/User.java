package ua.mycompany.builder;

public class User {

    private final String name;
    private final String surname;
    private final String email;
    private final String password;
    private final int code;

    public User(Builder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.email = builder.email;
        this.password = builder.password;
        this.code = builder.code;
    }

    String getName() {
        return name;
    }

    String getSurname() {
        return surname;
    }

    String getEmail() {
        return email;
    }

    String getPassword() {
        return password;
    }

    int getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", code=" + code +
                '}';
    }

    public static class Builder {
        private String name;
        private String surname;
        private String email;
        private String password;
        private int code;

        Builder withName(String name) {
            this.name = name;
            return this;
        }

        Builder withSurname(String surname) {
            this.surname = surname;
            return this;
        }

        Builder withEmail(String email) {
            this.email = email;
            return this;
        }

        Builder withPassword(String password) {
            this.password = password;
            return this;
        }

        Builder withCode(int code) {
            if(code<0)
                throw new IllegalArgumentException("Code must be positive");
            this.code = code;
            return this;
        }

        User build() {
            return new User(this);
        }
    }
}
