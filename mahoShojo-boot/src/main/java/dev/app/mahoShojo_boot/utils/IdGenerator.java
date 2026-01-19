package dev.app.mahoShojo_boot.utils;

import java.util.Random;

public class IdGenerator {

    public static String generateUserId() {
        Random random = new Random();
        String idValue = String.valueOf(1000 + random.nextInt(9000));

        return "U"+idValue;
    }
}
