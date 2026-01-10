package com.datastructure.runtimeanalysis.stringconcat;
public class StringBufferConcat {

    public static void concatenate(int n) {
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < n; i++) {
            sb.append("hello");
        }
    }
}
