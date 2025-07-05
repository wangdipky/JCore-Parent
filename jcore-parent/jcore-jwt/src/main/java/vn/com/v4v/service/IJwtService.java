package vn.com.v4v.service;

import java.util.Map;

/**
 * Name: IJwtService
 * Author: QuangDK
 * Version: 1.0.0
 * CreatedDate: 05/07/2025
 */
public interface IJwtService {

    /**
     * This function uses generate token by authKey ex: Username, Email.
     * @param authKey {{@link String}, {@link Map}}
     * @return {{@link String}}
     * Author: QuangDK
     * */
    public String generateToken(String authKey, Map<String, String> claims);
}