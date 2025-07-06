package vn.com.v4v.common.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.UUID;

/**
 * Name: CommonSecurityUtils
 * Author: QuangDK
 * Version: 1.0.0
 * CreatedDate: 06/07/2025
 */
public class CommonSecurityUtils {

    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    /**
     * This function uses generating UUID.
     * return {{@link String}}
     * Author: QuangDK
     * */
    public static String generateUUID() {

        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }

    /**
     * This function uses encrypting password.
     * param {{@link String}}
     * return {{@link String}}
     * Author: QuangDK
     * */
    public static String encryptPassword(String password) {
        return encoder.encode(password);
    }

    /**
     * This function uses comparing 2 password.
     * param {{@link String}, {@link String}}
     * return {{@link Boolean}}
     * Author: QuangDK
     * */
    public static boolean matchPassword(String password, String encodedPassword) {
        return encoder.matches(password, encodedPassword);
    }
}