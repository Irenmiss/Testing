package com.example.testing;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class UserTest {
    private static String login;
    private static String email;
    private static User user;

    @BeforeAll
    public static void shouldInitParams() {
        login = "test login";
        email = "test@email.com";
        user = new User(login, email);
    }

    @Test
    void shouldTestUserCreationWithParameters() {
        Assertions.assertEquals(login, user.getLogin());
        Assertions.assertEquals(email, user.getEmail());
    }

    @Test
    void shouldTestUserCreationWithoutParameters() {
        User user = new User();
        Assertions.assertNull(user.getLogin());
        Assertions.assertNull(user.getEmail());
    }

    @Test
    void shouldCheckEmailFormat() {
        email = "InvalidEmail";
        Assertions.assertThrows(IllegalArgumentException.class, () -> new User(login, email));
    }

    @Test
    void shouldCheckLoginAndEmailAreNotEqual() {
        login = "equal_test@test.com";
        email = "equal_test@test.com";
        Assertions.assertThrows(IllegalArgumentException.class, () -> new User(login, email));
    }

    @AfterAll
    public static void shouldPrintMessageAboutTestsCompletion() {
        System.out.println("Тестирование завершено");
    }
}
