package org.example;

public class Triangle {
    public static String classify(int a, int b, int c) {
        if (!(1 <= a && a <= 100) || !(1 <= b && b <= 100) || !(1 <= c && c <= 100)) {
            return "输入错误";
        } else if (a + b <= c || a + c <= b || b + c <= a) {
            return "非三角形";
        } else if (a == b && b == c) {
            return "等边三角形";
        } else if (a == b || b == c || a == c) {
            return "等腰三角形";
        } else {
            return "一般三角形";
        }

    }
}
