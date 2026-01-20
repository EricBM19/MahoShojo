package dev.app.mahoShojo_boot.utils;

import java.util.Random;

public class IdGenerator {

    public static String generateUserId() {
        Random random = new Random();
        String idValue = String.valueOf(10000 + random.nextInt(90000));

        return "U"+idValue;
    }

    public static String generateEnemyId() {
        Random random = new Random();
        String idValue = String.valueOf(10000 + random.nextInt(90000));

        return "EN"+idValue;
    }
}
