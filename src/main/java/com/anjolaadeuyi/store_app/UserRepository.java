package com.anjolaadeuyi.store_app;

public interface UserRepository {
    void save(User user);
    User findByEmail(String email);
}
