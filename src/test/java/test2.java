import org.example.Triangle;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class test2 {
    @ParameterizedTest
    @CsvSource({
            "2,3,4,一般三角形",
            "100,100,100,等边三角形",
            "1,2,3,非三角形",
            "1,1,2,非三角形",
            "0,1,2,输入错误",
            "101,102,103,输入错误"
    })
    void testWithCsvSource(int a,int b,int c,String expected) {
        assertEquals(expected, Triangle.classify(a,b,c));
    }
}
