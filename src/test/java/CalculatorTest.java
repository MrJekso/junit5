import org.junit.jupiter.api.*;


@DisplayName("Калькулятор")
public class CalculatorTest {

    @BeforeAll
    static void beforeAll(){
        System.out.println("@BeforeAll");
    }

    @BeforeEach
    void before(){
        System.out.println("@BeforeEach");
    }

    @Test
    @DisplayName("Рассчет комиссии")
    void test1Sum(){
        System.out.println("@sum");
    }

    @Test
    void test2Sub(){
        System.out.println("@sub");
    }

    @AfterEach
    void after(){
        System.out.println("@AfterEach");
    }

    @Nested
    @TestInstance(TestInstance.Lifecycle.PER_CLASS) // для инициализации методово BeforeAll и AfterAll
    class InnerClass{
        @BeforeAll
        void beforeAll(){
            System.out.println("@BeforeAll inner class");
        }

        @BeforeEach
        void beforeEach(){
            System.out.println("@BeforeEach inner class");
        }

        @Test
        void test1Sum(){
            System.out.println("@sum inner class");
        }

        @Test
        @Disabled
        void test2Sub(){
            System.out.println("@sub inner class");
        }

        @AfterEach
        void afterEach(){
            System.out.println("@AfterEach inner class");
        }

        @AfterAll
        void afterAll(){
            System.out.println("@AfterAll inner class");
        }
    }

    @AfterAll
    static void afterAll(){
        System.out.println("@AfterAll");
    }
}
