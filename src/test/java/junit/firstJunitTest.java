package junit;

import org.junit.jupiter.api.*;

public class firstJunitTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("��� ����� @beforeAll");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("��� ����� @afterAll");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("    ��� ����� @BeforeEach");
    }

    @AfterEach
    void afterEach() {
        System.out.println("    ��� ����� @AfterEach");
    }

    @Test
    void firstTest() {
        System.out.println("        ��� firstTest");
        Assertions.assertTrue(3 > 2);
    }

    @Test
    void secondTest() {
        System.out.println("        ��� secondTest");
        Assertions.assertTrue(3 > 2);
    }
}
