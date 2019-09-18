package ua.mycompany.objectm;

import javax.xml.bind.ValidationException;

public class Address {
    private String city;
    private int code;

    public Address(String city, int code) throws ValidationException {
        if (code < 0)
            throw new IllegalArgumentException("Code must be positive");
        if (city == null)
            throw new ValidationException("City can't be null");

        this.city = city;
        this.code = code;
    }

    public String getCity() {
        return city;
    }

    public Address setCity(String city) throws ValidationException {
        return new Address(city, code);
    }

    public int getCode() {
        return code;
    }

    public Address setCode(int code) throws ValidationException {
        if (code < 0)
            throw new IllegalArgumentException("Code must be positive");

        return new Address(city, code);
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", code=" + code +
                '}';
    }
}
