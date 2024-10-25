import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExampleAssertTest {

    @Test
    void objSame(){
        Object obj1 = new Object();
        Object obj2 = new Object();
        Assertions.assertSame(obj1,obj2,"Объекты не равны: ");
    }
    @Test
    void objNotSame(){
        Object obj1 = new Object();
        Object obj2 = new Object();
        Assertions.assertNotSame(obj1,obj2, "Объекты равны: ");
    }
    @Test
    void stringEquals(){
        String strOne = "One";
        String strTwo = "one";
        Assertions.assertEquals(strOne,strTwo, "Строки не совпадают: ");
    }
    @Test
    void stringNotEquals(){
        String strOne = "One";
        String strTwo = "one";
        Assertions.assertNotEquals(strOne,strTwo, "Строки одинаковые: ");
    }
    @Test
    void arraytEquals(){
        int[] arrOne = new int[] {1,2};
        int[] arrTwo = new int[] {1,4};
        Assertions.assertArrayEquals(arrOne,arrTwo, "Массивы не одинаковые: ");
    }
    @Test
    void iterableEquals(){
        Iterable<Integer> arrListOne = new ArrayList<>(Arrays.asList(1,2,3));
        Iterable<Integer> arrListTwo = new ArrayList<>(Arrays.asList(1,2,3));
        Assertions.assertIterableEquals(arrListOne,arrListTwo, "Коллекции не одинаковые: ");
    }
    @Test
    void arrayListEquals(){
        ArrayList<String> arrListOne = new ArrayList<>(Arrays.asList("One","Two","Three"));
        ArrayList<String> arrListTwo = new ArrayList<>(Arrays.asList("One","Two","Three"));
        Assertions.assertLinesMatch(arrListOne,arrListTwo, "Коллекции не одинаковые: ");
    }

    @Test
    void objIsNull(){
        Object obj = new Object();
        Assertions.assertNull(obj, "Объект не null: ");
    }

    @Test
    void objIsNotNull(){
        Object obj = null;
        Assertions.assertNotNull(obj, "Объект является null: ");
    }
    @Test
    void methodIsTrue(){
        boolean res = true;
        Assertions.assertTrue(res, "Вернулось false: ");
    }

    @Test
    void methodIsFalse(){
        boolean res = true;
        Assertions.assertFalse(res, "Вернулось true: ");
    }
    @Test
    void timeSpeed(){
        // Данный метода отличается тем, что не прерывает выполнение если
        // выходит за указанные временные рамки
        Assertions.assertTimeout(Duration.ofMillis(500),()->{
            System.out.println("Start");
            Thread.sleep(501);
            System.out.println(5+2);
            System.out.println("Finish");
            }, "Превысило время выполнения: ");
    }

    @Test
    void timeoutSpeed(){
        // Данный метода отличается тем, что прерывает выполнение если
        // выходит за указанные временные рамки
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(500),()->{
            System.out.println("Start");
            Thread.sleep(501);
            System.out.println(5+2);
            System.out.println("Finish");
        }, "Превысило время выполнения: ");
    }

    @Test
    void isGetThrows(){
        // Данный метода отличается тем, что прерывает выполнение если
        // выходит за указанные временные рамки
        Assertions.assertThrows(NullPointerException.class,()->{
            throw new NullPointerException();
        },"Исключение не вызвано: ");
    }

    @Test
    void methodFail(){
        Assertions.fail(); // заставляет упасть тест
    }
}
