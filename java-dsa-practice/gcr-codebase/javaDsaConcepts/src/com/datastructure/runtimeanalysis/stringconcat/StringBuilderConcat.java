package com.datastructure.runtimeanalysis.stringconcat;
public class StringBuilderConcat {

    public static void concatenate(int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append("hello");
        }
    }
}
