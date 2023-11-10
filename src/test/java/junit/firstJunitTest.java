package junit;

import org.junit.jupiter.api.*;

public class firstJunitTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("Это метод @beforeAll");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Это метод @afterAll");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("    Это метод @BeforeEach");
    }

    @AfterEach
    void afterEach() {
        System.out.println("    Это метод @AfterEach");
    }

    @Test
    void firstTest() {
        System.out.println("        Это firstTest");
        Assertions.assertTrue(3 > 2);
    }

    @Test
    void secondTest() {
        System.out.println("        Это secondTest");
        Assertions.assertTrue(3 > 2);
    }
}
