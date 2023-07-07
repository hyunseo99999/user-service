package com.example.userservice.domain;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.annotation.Rollback;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
@Rollback(value = false)
class UserEntityTest {

    @PersistenceContext
    private EntityManager em;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Test
    void save() {
        UserEntity userEntity = new UserEntity();
        userEntity.setEmail("test@naver.com");
        userEntity.setName("test");
        userEntity.setEncryptedPwd(passwordEncoder.encode("test"));
        userEntity.setUserId("test");

        em.persist(userEntity);
    }
}