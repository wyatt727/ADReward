package com.bykv.vk.openvk.preload.a.d;

import com.bykv.vk.openvk.preload.a.b.a.e;
import com.bykv.vk.openvk.preload.a.b.f;
import com.bykv.vk.openvk.preload.a.p;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: JsonReader.java */
/* loaded from: classes2.dex */
public class a implements Closeable {
    private final Reader c;
    private long i;
    private int j;
    private String k;
    private int[] l;
    private int m;
    private String[] n;
    private int[] o;

    /* renamed from: a, reason: collision with root package name */
    public boolean f1357a = false;
    private final char[] d = new char[1024];
    private int e = 0;
    private int f = 0;
    private int g = 0;
    private int h = 0;
    int b = 0;

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.l = iArr;
        this.m = 0;
        this.m = 0 + 1;
        iArr[0] = 6;
        this.n = new String[32];
        this.o = new int[32];
        this.c = reader;
    }

    public void a() throws IOException {
        int iQ = this.b;
        if (iQ == 0) {
            iQ = q();
        }
        if (iQ == 3) {
            a(1);
            this.o[this.m - 1] = 0;
            this.b = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + f() + r());
        }
    }

    public void b() throws IOException {
        int iQ = this.b;
        if (iQ == 0) {
            iQ = q();
        }
        if (iQ == 4) {
            int i = this.m - 1;
            this.m = i;
            int[] iArr = this.o;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
            this.b = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + f() + r());
    }

    public void c() throws IOException {
        int iQ = this.b;
        if (iQ == 0) {
            iQ = q();
        }
        if (iQ == 1) {
            a(3);
            this.b = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + f() + r());
        }
    }

    public void d() throws IOException {
        int iQ = this.b;
        if (iQ == 0) {
            iQ = q();
        }
        if (iQ == 2) {
            int i = this.m - 1;
            this.m = i;
            this.n[i] = null;
            int[] iArr = this.o;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
            this.b = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + f() + r());
    }

    public boolean e() throws IOException {
        int iQ = this.b;
        if (iQ == 0) {
            iQ = q();
        }
        return (iQ == 2 || iQ == 4) ? false : true;
    }

    public b f() throws IOException {
        int iQ = this.b;
        if (iQ == 0) {
            iQ = q();
        }
        switch (iQ) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return b.STRING;
            case 12:
            case 13:
            case 14:
                return b.NAME;
            case 15:
            case 16:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    final int q() throws IOException {
        int iA;
        int[] iArr = this.l;
        int i = this.m;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int iA2 = a(true);
            if (iA2 != 44) {
                if (iA2 != 59) {
                    if (iA2 == 93) {
                        this.b = 4;
                        return 4;
                    }
                    throw b("Unterminated array");
                }
                u();
            }
        } else {
            if (i2 == 3 || i2 == 5) {
                iArr[i - 1] = 4;
                if (i2 == 5 && (iA = a(true)) != 44) {
                    if (iA != 59) {
                        if (iA == 125) {
                            this.b = 2;
                            return 2;
                        }
                        throw b("Unterminated object");
                    }
                    u();
                }
                int iA3 = a(true);
                if (iA3 == 34) {
                    this.b = 13;
                    return 13;
                }
                if (iA3 == 39) {
                    u();
                    this.b = 12;
                    return 12;
                }
                if (iA3 == 125) {
                    if (i2 != 5) {
                        this.b = 2;
                        return 2;
                    }
                    throw b("Expected name");
                }
                u();
                this.e--;
                if (a((char) iA3)) {
                    this.b = 14;
                    return 14;
                }
                throw b("Expected name");
            }
            if (i2 == 4) {
                iArr[i - 1] = 5;
                int iA4 = a(true);
                if (iA4 != 58) {
                    if (iA4 == 61) {
                        u();
                        if (this.e < this.f || b(1)) {
                            char[] cArr = this.d;
                            int i3 = this.e;
                            if (cArr[i3] == '>') {
                                this.e = i3 + 1;
                            }
                        }
                    } else {
                        throw b("Expected ':'");
                    }
                }
            } else if (i2 == 6) {
                if (this.f1357a) {
                    x();
                }
                this.l[this.m - 1] = 7;
            } else if (i2 == 7) {
                if (a(false) == -1) {
                    this.b = 17;
                    return 17;
                }
                u();
                this.e--;
            } else if (i2 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iA5 = a(true);
        if (iA5 == 34) {
            this.b = 9;
            return 9;
        }
        if (iA5 == 39) {
            u();
            this.b = 8;
            return 8;
        }
        if (iA5 != 44 && iA5 != 59) {
            if (iA5 == 91) {
                this.b = 3;
                return 3;
            }
            if (iA5 != 93) {
                if (iA5 == 123) {
                    this.b = 1;
                    return 1;
                }
                this.e--;
                int iG = g();
                if (iG != 0) {
                    return iG;
                }
                int iS = s();
                if (iS != 0) {
                    return iS;
                }
                if (!a(this.d[this.e])) {
                    throw b("Expected value");
                }
                u();
                this.b = 10;
                return 10;
            }
            if (i2 == 1) {
                this.b = 4;
                return 4;
            }
        }
        if (i2 == 1 || i2 == 2) {
            u();
            this.e--;
            this.b = 7;
            return 7;
        }
        throw b("Unexpected value");
    }

    private int g() throws IOException {
        int i;
        String str;
        String str2;
        char c = this.d[this.e];
        if (c == 't' || c == 'T') {
            i = 5;
            str = com.json.mediationsdk.metadata.a.g;
            str2 = "TRUE";
        } else if (c == 'f' || c == 'F') {
            i = 6;
            str = "false";
            str2 = "FALSE";
        } else {
            if (c != 'n' && c != 'N') {
                return 0;
            }
            i = 7;
            str = AbstractJsonLexerKt.NULL;
            str2 = "NULL";
        }
        int length = str.length();
        for (int i2 = 1; i2 < length; i2++) {
            if (this.e + i2 >= this.f && !b(i2 + 1)) {
                return 0;
            }
            char c2 = this.d[this.e + i2];
            if (c2 != str.charAt(i2) && c2 != str2.charAt(i2)) {
                return 0;
            }
        }
        if ((this.e + length < this.f || b(length + 1)) && a(this.d[this.e + length])) {
            return 0;
        }
        this.e += length;
        this.b = i;
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x008f, code lost:
    
        if (a(r14) == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0091, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0093, code lost:
    
        if (r9 != 2) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0095, code lost:
    
        if (r10 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x009b, code lost:
    
        if (r11 != Long.MIN_VALUE) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x009d, code lost:
    
        if (r13 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a3, code lost:
    
        if (r11 != 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a5, code lost:
    
        if (r13 != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00a7, code lost:
    
        if (r13 == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00aa, code lost:
    
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ab, code lost:
    
        r18.i = r11;
        r18.e += r8;
        r18.b = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b6, code lost:
    
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00b7, code lost:
    
        if (r9 == 2) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00ba, code lost:
    
        if (r9 == 4) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00bd, code lost:
    
        if (r9 != 7) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00c0, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00c2, code lost:
    
        r18.j = r8;
        r18.b = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00c8, code lost:
    
        return 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int s() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.preload.a.d.a.s():int");
    }

    private boolean a(char c) throws IOException {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        u();
        return false;
    }

    public String h() throws IOException {
        String strB;
        int iQ = this.b;
        if (iQ == 0) {
            iQ = q();
        }
        if (iQ == 14) {
            strB = t();
        } else if (iQ == 12) {
            strB = b('\'');
        } else if (iQ == 13) {
            strB = b('\"');
        } else {
            throw new IllegalStateException("Expected a name but was " + f() + r());
        }
        this.b = 0;
        this.n[this.m - 1] = strB;
        return strB;
    }

    public String i() throws IOException {
        String str;
        int iQ = this.b;
        if (iQ == 0) {
            iQ = q();
        }
        if (iQ == 10) {
            str = t();
        } else if (iQ == 8) {
            str = b('\'');
        } else if (iQ == 9) {
            str = b('\"');
        } else if (iQ == 11) {
            str = this.k;
            this.k = null;
        } else if (iQ == 15) {
            str = Long.toString(this.i);
        } else if (iQ == 16) {
            str = new String(this.d, this.e, this.j);
            this.e += this.j;
        } else {
            throw new IllegalStateException("Expected a string but was " + f() + r());
        }
        this.b = 0;
        int[] iArr = this.o;
        int i = this.m - 1;
        iArr[i] = iArr[i] + 1;
        return str;
    }

    public boolean j() throws IOException {
        int iQ = this.b;
        if (iQ == 0) {
            iQ = q();
        }
        if (iQ == 5) {
            this.b = 0;
            int[] iArr = this.o;
            int i = this.m - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iQ == 6) {
            this.b = 0;
            int[] iArr2 = this.o;
            int i2 = this.m - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return false;
        }
        throw new IllegalStateException("Expected a boolean but was " + f() + r());
    }

    public void k() throws IOException {
        int iQ = this.b;
        if (iQ == 0) {
            iQ = q();
        }
        if (iQ == 7) {
            this.b = 0;
            int[] iArr = this.o;
            int i = this.m - 1;
            iArr[i] = iArr[i] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + f() + r());
    }

    public double l() throws IOException, NumberFormatException {
        int iQ = this.b;
        if (iQ == 0) {
            iQ = q();
        }
        if (iQ == 15) {
            this.b = 0;
            int[] iArr = this.o;
            int i = this.m - 1;
            iArr[i] = iArr[i] + 1;
            return this.i;
        }
        if (iQ == 16) {
            this.k = new String(this.d, this.e, this.j);
            this.e += this.j;
        } else if (iQ == 8 || iQ == 9) {
            this.k = b(iQ == 8 ? '\'' : '\"');
        } else if (iQ == 10) {
            this.k = t();
        } else if (iQ != 11) {
            throw new IllegalStateException("Expected a double but was " + f() + r());
        }
        this.b = 11;
        double d = Double.parseDouble(this.k);
        if (!this.f1357a && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new d("JSON forbids NaN and infinities: " + d + r());
        }
        this.k = null;
        this.b = 0;
        int[] iArr2 = this.o;
        int i2 = this.m - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return d;
    }

    public long m() throws IOException, NumberFormatException {
        int iQ = this.b;
        if (iQ == 0) {
            iQ = q();
        }
        if (iQ == 15) {
            this.b = 0;
            int[] iArr = this.o;
            int i = this.m - 1;
            iArr[i] = iArr[i] + 1;
            return this.i;
        }
        if (iQ == 16) {
            this.k = new String(this.d, this.e, this.j);
            this.e += this.j;
        } else if (iQ == 8 || iQ == 9 || iQ == 10) {
            if (iQ == 10) {
                this.k = t();
            } else {
                this.k = b(iQ == 8 ? '\'' : '\"');
            }
            try {
                long j = Long.parseLong(this.k);
                this.b = 0;
                int[] iArr2 = this.o;
                int i2 = this.m - 1;
                iArr2[i2] = iArr2[i2] + 1;
                return j;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected a long but was " + f() + r());
        }
        this.b = 11;
        double d = Double.parseDouble(this.k);
        long j2 = (long) d;
        if (j2 != d) {
            throw new NumberFormatException("Expected a long but was " + this.k + r());
        }
        this.k = null;
        this.b = 0;
        int[] iArr3 = this.o;
        int i3 = this.m - 1;
        iArr3[i3] = iArr3[i3] + 1;
        return j2;
    }

    private String b(char c) throws IOException {
        char[] cArr = this.d;
        StringBuilder sb = null;
        while (true) {
            int i = this.e;
            int i2 = this.f;
            int i3 = i;
            while (true) {
                if (i3 < i2) {
                    int i4 = i3 + 1;
                    char c2 = cArr[i3];
                    if (c2 == c) {
                        this.e = i4;
                        int i5 = (i4 - i) - 1;
                        if (sb == null) {
                            return new String(cArr, i, i5);
                        }
                        sb.append(cArr, i, i5);
                        return sb.toString();
                    }
                    if (c2 == '\\') {
                        this.e = i4;
                        int i6 = (i4 - i) - 1;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max((i6 + 1) * 2, 16));
                        }
                        sb.append(cArr, i, i6);
                        sb.append(w());
                    } else {
                        if (c2 == '\n') {
                            this.g++;
                            this.h = i4;
                        }
                        i3 = i4;
                    }
                } else {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max((i3 - i) * 2, 16));
                    }
                    sb.append(cArr, i, i3 - i);
                    this.e = i3;
                    if (!b(1)) {
                        throw b("Unterminated string");
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
    
        u();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String t() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r0
        L3:
            int r3 = r6.e
            int r4 = r3 + r2
            int r5 = r6.f
            if (r4 >= r5) goto L4e
            char[] r4 = r6.d
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L5c
            r4 = 10
            if (r3 == r4) goto L5c
            r4 = 12
            if (r3 == r4) goto L5c
            r4 = 13
            if (r3 == r4) goto L5c
            r4 = 32
            if (r3 == r4) goto L5c
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5c
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5c
            r4 = 58
            if (r3 == r4) goto L5c
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5c;
                case 92: goto L4a;
                case 93: goto L5c;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r6.u()
            goto L5c
        L4e:
            char[] r3 = r6.d
            int r3 = r3.length
            if (r2 >= r3) goto L5e
            int r3 = r2 + 1
            boolean r3 = r6.b(r3)
            if (r3 == 0) goto L5c
            goto L3
        L5c:
            r0 = r2
            goto L7e
        L5e:
            if (r1 != 0) goto L6b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L6b:
            char[] r3 = r6.d
            int r4 = r6.e
            r1.append(r3, r4, r2)
            int r3 = r6.e
            int r3 = r3 + r2
            r6.e = r3
            r2 = 1
            boolean r2 = r6.b(r2)
            if (r2 != 0) goto L2
        L7e:
            if (r1 != 0) goto L8a
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.d
            int r3 = r6.e
            r1.<init>(r2, r3, r0)
            goto L95
        L8a:
            char[] r2 = r6.d
            int r3 = r6.e
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L95:
            int r2 = r6.e
            int r2 = r2 + r0
            r6.e = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.preload.a.d.a.t():java.lang.String");
    }

    private void c(char c) throws IOException {
        char[] cArr = this.d;
        while (true) {
            int i = this.e;
            int i2 = this.f;
            while (true) {
                if (i < i2) {
                    int i3 = i + 1;
                    char c2 = cArr[i];
                    if (c2 == c) {
                        this.e = i3;
                        return;
                    }
                    if (c2 == '\\') {
                        this.e = i3;
                        w();
                        break;
                    } else {
                        if (c2 == '\n') {
                            this.g++;
                            this.h = i3;
                        }
                        i = i3;
                    }
                } else {
                    this.e = i;
                    if (!b(1)) {
                        throw b("Unterminated string");
                    }
                }
            }
        }
    }

    public int n() throws IOException, NumberFormatException {
        int iQ = this.b;
        if (iQ == 0) {
            iQ = q();
        }
        if (iQ == 15) {
            long j = this.i;
            int i = (int) j;
            if (j != i) {
                throw new NumberFormatException("Expected an int but was " + this.i + r());
            }
            this.b = 0;
            int[] iArr = this.o;
            int i2 = this.m - 1;
            iArr[i2] = iArr[i2] + 1;
            return i;
        }
        if (iQ == 16) {
            this.k = new String(this.d, this.e, this.j);
            this.e += this.j;
        } else if (iQ == 8 || iQ == 9 || iQ == 10) {
            if (iQ == 10) {
                this.k = t();
            } else {
                this.k = b(iQ == 8 ? '\'' : '\"');
            }
            try {
                int i3 = Integer.parseInt(this.k);
                this.b = 0;
                int[] iArr2 = this.o;
                int i4 = this.m - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected an int but was " + f() + r());
        }
        this.b = 11;
        double d = Double.parseDouble(this.k);
        int i5 = (int) d;
        if (i5 != d) {
            throw new NumberFormatException("Expected an int but was " + this.k + r());
        }
        this.k = null;
        this.b = 0;
        int[] iArr3 = this.o;
        int i6 = this.m - 1;
        iArr3[i6] = iArr3[i6] + 1;
        return i5;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.b = 0;
        this.l[0] = 8;
        this.m = 1;
        this.c.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a3, code lost:
    
        u();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:61:0x009d. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.preload.a.d.a.o():void");
    }

    private void a(int i) {
        int i2 = this.m;
        int[] iArr = this.l;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.l = Arrays.copyOf(iArr, i3);
            this.o = Arrays.copyOf(this.o, i3);
            this.n = (String[]) Arrays.copyOf(this.n, i3);
        }
        int[] iArr2 = this.l;
        int i4 = this.m;
        this.m = i4 + 1;
        iArr2[i4] = i;
    }

    private boolean b(int i) throws IOException {
        int i2;
        int i3;
        char[] cArr = this.d;
        int i4 = this.h;
        int i5 = this.e;
        this.h = i4 - i5;
        int i6 = this.f;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.f = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.f = 0;
        }
        this.e = 0;
        do {
            Reader reader = this.c;
            int i8 = this.f;
            int i9 = reader.read(cArr, i8, cArr.length - i8);
            if (i9 == -1) {
                return false;
            }
            i2 = this.f + i9;
            this.f = i2;
            if (this.g == 0 && (i3 = this.h) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.e++;
                this.h = i3 + 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    private int a(boolean z) throws IOException {
        char[] cArr = this.d;
        int i = this.e;
        int i2 = this.f;
        while (true) {
            if (i == i2) {
                this.e = i;
                if (!b(1)) {
                    if (!z) {
                        return -1;
                    }
                    throw new EOFException("End of input" + r());
                }
                i = this.e;
                i2 = this.f;
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c == '\n') {
                this.g++;
                this.h = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.e = i3;
                    if (i3 == i2) {
                        this.e = i3 - 1;
                        boolean zB = b(2);
                        this.e++;
                        if (!zB) {
                            return c;
                        }
                    }
                    u();
                    int i4 = this.e;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.e = i4 + 1;
                        if (!a("*/")) {
                            throw b("Unterminated comment");
                        }
                        i = this.e + 2;
                        i2 = this.f;
                    } else {
                        if (c2 != '/') {
                            return c;
                        }
                        this.e = i4 + 1;
                        v();
                        i = this.e;
                        i2 = this.f;
                    }
                } else if (c == '#') {
                    this.e = i3;
                    u();
                    v();
                    i = this.e;
                    i2 = this.f;
                } else {
                    this.e = i3;
                    return c;
                }
            }
            i = i3;
        }
    }

    private void u() throws IOException {
        if (!this.f1357a) {
            throw b("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void v() throws IOException {
        char c;
        do {
            if (this.e >= this.f && !b(1)) {
                return;
            }
            char[] cArr = this.d;
            int i = this.e;
            int i2 = i + 1;
            this.e = i2;
            c = cArr[i];
            if (c == '\n') {
                this.g++;
                this.h = i2;
                return;
            }
        } while (c != '\r');
    }

    private boolean a(String str) throws IOException {
        int i;
        int length = str.length();
        while (true) {
            if (this.e + length > this.f && !b(length)) {
                return false;
            }
            char[] cArr = this.d;
            int i2 = this.e;
            if (cArr[i2] != '\n') {
                while (i < length) {
                    i = this.d[this.e + i] == str.charAt(i) ? i + 1 : 0;
                }
                return true;
            }
            this.g++;
            this.h = i2 + 1;
            this.e++;
        }
    }

    public String toString() {
        return getClass().getSimpleName() + r();
    }

    final String r() {
        return " at line " + (this.g + 1) + " column " + ((this.e - this.h) + 1) + " path " + p();
    }

    public String p() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.m;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.l[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append(AbstractJsonLexerKt.BEGIN_LIST);
                sb.append(this.o[i2]);
                sb.append(AbstractJsonLexerKt.END_LIST);
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String[] strArr = this.n;
                if (strArr[i2] != null) {
                    sb.append(strArr[i2]);
                }
            }
        }
        return sb.toString();
    }

    private char w() throws IOException {
        int i;
        int i2;
        if (this.e == this.f && !b(1)) {
            throw b("Unterminated escape sequence");
        }
        char[] cArr = this.d;
        int i3 = this.e;
        int i4 = i3 + 1;
        this.e = i4;
        char c = cArr[i3];
        if (c == '\n') {
            this.g++;
            this.h = i4;
        } else if (c != '\"' && c != '\'' && c != '/' && c != '\\') {
            if (c == 'b') {
                return '\b';
            }
            if (c == 'f') {
                return '\f';
            }
            if (c == 'n') {
                return '\n';
            }
            if (c == 'r') {
                return '\r';
            }
            if (c == 't') {
                return '\t';
            }
            if (c == 'u') {
                if (i4 + 4 > this.f && !b(4)) {
                    throw b("Unterminated escape sequence");
                }
                char c2 = 0;
                int i5 = this.e;
                int i6 = i5 + 4;
                while (i5 < i6) {
                    char c3 = this.d[i5];
                    char c4 = (char) (c2 << 4);
                    if (c3 < '0' || c3 > '9') {
                        if (c3 >= 'a' && c3 <= 'f') {
                            i = c3 - 'a';
                        } else {
                            if (c3 < 'A' || c3 > 'F') {
                                throw new NumberFormatException("\\u" + new String(this.d, this.e, 4));
                            }
                            i = c3 - 'A';
                        }
                        i2 = i + 10;
                    } else {
                        i2 = c3 - '0';
                    }
                    c2 = (char) (c4 + i2);
                    i5++;
                }
                this.e += 4;
                return c2;
            }
            throw b("Invalid escape sequence");
        }
        return c;
    }

    private IOException b(String str) throws IOException {
        throw new d(str + r());
    }

    private void x() throws IOException {
        a(true);
        int i = this.e - 1;
        this.e = i;
        if (i + 5 <= this.f || b(5)) {
            char[] cArr = this.d;
            if (cArr[i] == ')' && cArr[i + 1] == ']' && cArr[i + 2] == '}' && cArr[i + 3] == '\'' && cArr[i + 4] == '\n') {
                this.e += 5;
            }
        }
    }

    static {
        f.f1342a = new f() { // from class: com.bykv.vk.openvk.preload.a.d.a.1
            @Override // com.bykv.vk.openvk.preload.a.b.f
            public final void a(a aVar) throws IOException {
                if (aVar instanceof e) {
                    e eVar = (e) aVar;
                    eVar.a(b.NAME);
                    Map.Entry entry = (Map.Entry) ((Iterator) eVar.g()).next();
                    eVar.a(entry.getValue());
                    eVar.a(new p((String) entry.getKey()));
                    return;
                }
                int iQ = aVar.b;
                if (iQ == 0) {
                    iQ = aVar.q();
                }
                if (iQ == 13) {
                    aVar.b = 9;
                    return;
                }
                if (iQ == 12) {
                    aVar.b = 8;
                } else {
                    if (iQ == 14) {
                        aVar.b = 10;
                        return;
                    }
                    throw new IllegalStateException("Expected a name but was " + aVar.f() + aVar.r());
                }
            }
        };
    }
}
