package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import kotlin.io.encoding.Base64;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.Utf8;
import org.objectweb.asm.signature.SignatureVisitor;

/* compiled from: SameBase64Tool.java */
/* loaded from: classes4.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    private static final String f3000a = "x";
    private static Map<Character, Character> b;
    private static Map<Character, Character> c;
    private static byte[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, Utf8.REPLACEMENT_BYTE, 52, 53, 54, 55, 56, 57, 58, 59, 60, Base64.padSymbol, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};
    private static char[] e = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', AbstractJsonLexerKt.UNICODE_ESC, 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', SignatureVisitor.EXTENDS, '/'};

    static {
        HashMap map = new HashMap();
        b = map;
        map.put('v', 'A');
        b.put('S', 'B');
        b.put('o', 'C');
        b.put('a', 'D');
        b.put('j', 'E');
        b.put('c', 'F');
        b.put('7', 'G');
        b.put('d', 'H');
        b.put('R', 'I');
        b.put('z', 'J');
        b.put('p', 'K');
        b.put('W', 'L');
        b.put('i', 'M');
        b.put('f', 'N');
        b.put('G', 'O');
        b.put('y', 'P');
        b.put('N', 'Q');
        b.put('x', 'R');
        b.put('Z', 'S');
        b.put('n', 'T');
        b.put('V', 'U');
        b.put('5', 'V');
        b.put('k', 'W');
        b.put(Character.valueOf(SignatureVisitor.EXTENDS), 'X');
        b.put('D', 'Y');
        b.put('H', 'Z');
        b.put('L', 'a');
        b.put('Y', 'b');
        b.put('h', 'c');
        b.put('J', 'd');
        b.put('4', 'e');
        b.put('6', 'f');
        b.put('l', 'g');
        b.put('t', 'h');
        b.put('0', 'i');
        b.put('U', 'j');
        b.put('3', 'k');
        b.put('Q', 'l');
        b.put('r', 'm');
        b.put('g', 'n');
        b.put('E', 'o');
        b.put(Character.valueOf(AbstractJsonLexerKt.UNICODE_ESC), 'p');
        b.put('q', 'q');
        b.put('8', 'r');
        b.put('s', 's');
        b.put('w', 't');
        b.put('/', Character.valueOf(AbstractJsonLexerKt.UNICODE_ESC));
        b.put('X', 'v');
        b.put('M', 'w');
        b.put('e', 'x');
        b.put('B', 'y');
        b.put('A', 'z');
        b.put('T', '0');
        b.put('2', '1');
        b.put('F', '2');
        b.put('b', '3');
        b.put('9', '4');
        b.put('P', '5');
        b.put('1', '6');
        b.put('O', '7');
        b.put('I', '8');
        b.put('K', '9');
        b.put('m', Character.valueOf(SignatureVisitor.EXTENDS));
        b.put('C', '/');
        HashMap map2 = new HashMap();
        c = map2;
        map2.put('A', 'v');
        c.put('B', 'S');
        c.put('C', 'o');
        c.put('D', 'a');
        c.put('E', 'j');
        c.put('F', 'c');
        c.put('G', '7');
        c.put('H', 'd');
        c.put('I', 'R');
        c.put('J', 'z');
        c.put('K', 'p');
        c.put('L', 'W');
        c.put('M', 'i');
        c.put('N', 'f');
        c.put('O', 'G');
        c.put('P', 'y');
        c.put('Q', 'N');
        c.put('R', 'x');
        c.put('S', 'Z');
        c.put('T', 'n');
        c.put('U', 'V');
        c.put('V', '5');
        c.put('W', 'k');
        c.put('X', Character.valueOf(SignatureVisitor.EXTENDS));
        c.put('Y', 'D');
        c.put('Z', 'H');
        c.put('a', 'L');
        c.put('b', 'Y');
        c.put('c', 'h');
        c.put('d', 'J');
        c.put('e', '4');
        c.put('f', '6');
        c.put('g', 'l');
        c.put('h', 't');
        c.put('i', '0');
        c.put('j', 'U');
        c.put('k', '3');
        c.put('l', 'Q');
        c.put('m', 'r');
        c.put('n', 'g');
        c.put('o', 'E');
        c.put('p', Character.valueOf(AbstractJsonLexerKt.UNICODE_ESC));
        c.put('q', 'q');
        c.put('r', '8');
        c.put('s', 's');
        c.put('t', 'w');
        c.put(Character.valueOf(AbstractJsonLexerKt.UNICODE_ESC), '/');
        c.put('v', 'X');
        c.put('w', 'M');
        c.put('x', 'e');
        c.put('y', 'B');
        c.put('z', 'A');
        c.put('0', 'T');
        c.put('1', '2');
        c.put('2', 'F');
        c.put('3', 'b');
        c.put('4', '9');
        c.put('5', 'P');
        c.put('6', '1');
        c.put('7', 'O');
        c.put('8', 'I');
        c.put('9', 'K');
        c.put(Character.valueOf(SignatureVisitor.EXTENDS), 'm');
        c.put('/', 'C');
    }

    private x() {
    }

    public static String a(String str) {
        return ae.a(str);
    }

    public static String b(String str) {
        return TextUtils.isEmpty(str) ? "" : ae.b(str);
    }
}
