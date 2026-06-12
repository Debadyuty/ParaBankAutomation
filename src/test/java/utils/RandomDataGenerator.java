package utils;

public class RandomDataGenerator {

    public static String getUsername() {

        return "User" +
                System.currentTimeMillis();
    }
}