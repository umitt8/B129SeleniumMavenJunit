package day07_Junit;

import org.junit.*;

public class C04_BeforeClassAfterClass {
    /*
    @beforeClass ve @AfterClass her test methodlari sadece static methodlarla calisir
     */

    @BeforeClass
    public static void beforeClass() throws Exception {
        System.out.println("Classtaki tum testlerden once bir kez calisir");
    }

    @AfterClass
    public static void afterClass() throws Exception {
        System.out.println("Classtaki tum testlerden sonra bir kez calisir");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("HEr test methodundan once bir kez calisir");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("HEr test methodundan sonra bir kez calisir");
    }

    @Test
    public void test01() {
        System.out.println("ilk test");
    }

    @Test
    public void test02() {
        System.out.println("ikinci test");
    }
}
