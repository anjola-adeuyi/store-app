package com.anjolaadeuyi.store_app.common;

public interface UserRepository {
    void save(User user);
    User findByEmail(String email);
}
