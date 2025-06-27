package org.jacoco.core.runtime;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
final class CommandLineSupport {
    private static final char BLANK = ' ';
    private static final int M_ESCAPED = 2;
    private static final int M_PARSE_ARGUMENT = 1;
    private static final int M_STRIP_WHITESPACE = 0;
    private static final char QUOTE = '\"';
    private static final char SLASH = '\\';

    static String quote(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c == '\"' || c == '\\') {
                sb.append('\\');
            }
            sb.append(c);
        }
        if (str.indexOf(32) != -1 || str.indexOf(34) != -1) {
            sb.insert(0, '\"').append('\"');
        }
        return sb.toString();
    }

    static String quote(List<String> list) {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        for (String str : list) {
            if (z) {
                sb.append(BLANK);
            }
            sb.append(quote(str));
            z = true;
        }
        return sb.toString();
    }

    static List<String> split(String str) {
        if (str == null || str.length() == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        char c = ' ';
        char c2 = 0;
        for (char c3 : str.toCharArray()) {
            if (c2 != 0) {
                if (c2 != 1) {
                    if (c2 == 2) {
                        if (c3 == '\"' || c3 == '\\') {
                            sb.setCharAt(sb.length() - 1, c3);
                        } else if (c3 == c) {
                            addArgument(arrayList, sb);
                        } else {
                            sb.append(c3);
                        }
                        c2 = 1;
                    }
                } else if (c3 == c) {
                    addArgument(arrayList, sb);
                    c2 = 0;
                } else if (c3 == '\\') {
                    sb.append('\\');
                    c2 = 2;
                } else {
                    sb.append(c3);
                }
            } else if (!Character.isWhitespace(c3)) {
                if (c3 == '\"') {
                    c = '\"';
                } else {
                    sb.append(c3);
                    c = ' ';
                }
                c2 = 1;
            }
        }
        addArgument(arrayList, sb);
        return arrayList;
    }

    private static void addArgument(List<String> list, StringBuilder sb) {
        if (sb.length() > 0) {
            list.add(sb.toString());
            sb.setLength(0);
        }
    }

    private CommandLineSupport() {
    }
}
