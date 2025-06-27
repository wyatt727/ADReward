package com.my.target;

/* loaded from: classes4.dex */
public class s5 {

    /* renamed from: a, reason: collision with root package name */
    public final int f4122a;
    public final String b;

    public s5() {
        this.f4122a = -1;
        this.b = "none";
    }

    public s5(String str, int i) {
        this.b = str;
        this.f4122a = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.my.target.s5 a(java.lang.String r4) {
        /*
            r4.hashCode()
            r4.hashCode()
            int r0 = r4.hashCode()
            r1 = 1
            r2 = 0
            r3 = -1
            switch(r0) {
                case 3387192: goto L28;
                case 729267099: goto L1d;
                case 1430647483: goto L12;
                default: goto L10;
            }
        L10:
            r0 = r3
            goto L32
        L12:
            java.lang.String r0 = "landscape"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L1b
            goto L10
        L1b:
            r0 = 2
            goto L32
        L1d:
            java.lang.String r0 = "portrait"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L26
            goto L10
        L26:
            r0 = r1
            goto L32
        L28:
            java.lang.String r0 = "none"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L31
            goto L10
        L31:
            r0 = r2
        L32:
            switch(r0) {
                case 0: goto L39;
                case 1: goto L3a;
                case 2: goto L37;
                default: goto L35;
            }
        L35:
            r4 = 0
            return r4
        L37:
            r1 = r2
            goto L3a
        L39:
            r1 = r3
        L3a:
            com.my.target.s5 r0 = new com.my.target.s5
            r0.<init>(r4, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.target.s5.a(java.lang.String):com.my.target.s5");
    }

    public static s5 b() {
        return new s5();
    }

    public int a() {
        return this.f4122a;
    }

    public String toString() {
        return this.b;
    }
}
