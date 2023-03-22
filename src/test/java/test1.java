import org.example.Triangle;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class test1 {
    @ParameterizedTest
    @CsvSource({
            "2,3,4,一般三角形",
            "3,3,4,等腰三角形",
            "5,5,5,等边三角形",
            "2,2,4,非三角形",
            "2,4,2,非三角形",
            "4,2,2,非三角形",
            "-1,1,2,输入错误",
            "101,102,103,输入错误"
    })
    void testWithCsvSource(int a,int b,int c,String expected) {
        assertEquals(expected, Triangle.classify(a,b,c));
    }
}
