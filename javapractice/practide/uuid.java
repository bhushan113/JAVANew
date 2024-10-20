package javapractice.practide;

import java.util.UUID;

public class uuid {
    public static void main(String[] args) {
        // Generate a UUID
        String uuid = UUID.randomUUID().toString();

        // Remove hyphens to get only alphanumeric characters
        uuid = uuid.replace("-", "");

        // Pick a random character from the UUID
        int randomIndex = (int) (Math.random() * uuid.length());
        char randomChar = uuid.charAt(randomIndex);

        System.out.println("Random Character from UUID: " + randomChar);
    }
}

