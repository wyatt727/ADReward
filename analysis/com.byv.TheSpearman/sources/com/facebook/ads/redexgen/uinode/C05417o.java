package com.facebook.ads.redexgen.uinode;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.AsyncTask;
import android.os.Looper;
import android.text.TextUtils;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.io.encoding.Base64;
import okio.Utf8;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.7o, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C05417o {
    public static byte[] A04;
    public static String[] A05 = {"qJOvsPrm5BQkhL6wLJahauzjA45r7dQz", "hfx8x2hkXgxq19RSFkkqiaOe1zMy03Qo", "bV5o7GaQth4ZZOPd4LFtWwXjKNVB8lua", "1EyYFmGpmEhL9EWyl0I1ptwRPtnJxpez", "F", CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, "plO80lk7YnGQvaXazMopbLIwOg8MB0TR", "EzLFA06L6a2SQhX4934tm7serJXXg4XA"};
    public static final String A06;
    public static final Lock A07;
    public static final Lock A08;
    public static final ReentrantReadWriteLock A09;
    public SQLiteOpenHelper A00;
    public final C1206Ym A01;
    public final C1204Yk A03 = new C1204Yk(this);
    public final C1205Yl A02 = new C1205Yl(this);

    public static String A05(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A05[3].charAt(0) != '1') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[0] = "6YOEgEHO6bjbd5au9bSAefu6W5tI3Dak";
            strArr[6] = "kgOgsYcmlOEy6T8oxoaixHiO6WRSp1D2";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 115);
            i4++;
        }
    }

    public static void A07() {
        A04 = new byte[]{-31, -2, -31, -81, -51, -81, -50, -11, 22, 40, 24, -67, -29, -17, -20, -22, -67, -44, -2, 3, -3, 2, -44, -108, -64, -67, -63, -67, -56, -108, -106, -59, -60, -106, -35, 12, 15, 1, 2, 15, -35, -1, 22, -35, -42, 9, -5, 10, -42, -98, -43, -58, -61, -48, -61, -98, -49, -43, -46, -58, 11, 3, -54, -52, 22, 52, 65, 65, 66, 71, -13, 54, 52, Utf8.REPLACEMENT_BYTE, Utf8.REPLACEMENT_BYTE, -13, 58, 56, 71, 23, 52, 71, 52, 53, 52, 70, 56, -13, 57, 69, 66, 64, -13, 71, 59, 56, -13, 40, 28, -13, 71, 59, 69, 56, 52, 55, -12, 33, 19, 26, 19, 17, 34, -18, 66, Base64.padSymbol, 57, 51, 60, 65, -4, 39, 34, 22, 19, 38, 23, -14, 43, 40, 59, 40, 41, 40, 58, 44, 71, 88, 71, 80, 86, 85, -9, -14, -18, -24, -15, -10};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A0J() {
        for (int i = 0; i < A0M().length; i++) {
        }
        SQLiteOpenHelper sQLiteOpenHelper = this.A00;
        if (sQLiteOpenHelper != null) {
            sQLiteOpenHelper.close();
            this.A00 = null;
        }
    }

    static {
        A07();
        StringBuilder sbAppend = new StringBuilder().append(A05(107, 14, 91)).append(C1204Yk.A02.A01);
        String strA05 = A05(58, 2, 51);
        StringBuilder sbAppend2 = sbAppend.append(strA05);
        String strA052 = A05(Opcodes.D2I, 6, 16);
        StringBuilder sbAppend3 = sbAppend2.append(strA052);
        String strA053 = A05(60, 1, 106);
        StringBuilder sbAppend4 = sbAppend3.append(strA053).append(C1204Yk.A01.A01).append(strA05);
        String strA054 = A05(136, 6, 111);
        A06 = sbAppend4.append(strA054).append(strA053).append(C1205Yl.A04.A01).append(strA05).append(strA054).append(strA053).append(C1205Yl.A05.A01).append(strA05).append(strA054).append(strA053).append(C1205Yl.A0A.A01).append(strA05).append(strA054).append(strA053).append(C1205Yl.A08.A01).append(strA05).append(strA054).append(strA053).append(C1205Yl.A07.A01).append(strA05).append(strA054).append(strA053).append(C1205Yl.A06.A01).append(strA05).append(strA054).append(strA053).append(C1205Yl.A03.A01).append(strA05).append(strA054).append(strA053).append(C1205Yl.A02.A01).append(A05(11, 6, 42)).append(strA054).append(A05(17, 6, 65)).append(strA052).append(A05(30, 4, 3)).append(strA054).append(strA053).append(C1205Yl.A09.A01).append(A05(0, 3, 78)).append(strA052).append(strA053).append(C1204Yk.A02.A01).append(A05(34, 10, 74)).append(strA054).append(strA053).append(C1205Yl.A08.A01).append(A05(7, 4, 98)).toString();
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        A09 = reentrantReadWriteLock;
        A07 = reentrantReadWriteLock.readLock();
        A08 = reentrantReadWriteLock.writeLock();
    }

    public C05417o(C1206Ym c1206Ym) {
        this.A01 = c1206Ym;
    }

    private synchronized SQLiteDatabase A00() {
        if (this.A00 == null) {
            final C1206Ym c1206Ym = this.A01;
            this.A00 = new SQLiteOpenHelper(c1206Ym, this) { // from class: com.facebook.ads.redexgen.X.7p
                public static byte[] A01;
                public static String[] A02 = {"JShIJu3JRfHt43ypO9GqFaXtQU", "Uet3LTw8rLJmru1DFWkYPrIPq9yjzQ4", "LBYTyoU1fD8w8O4ue", "ZxNu1nQjo2XkCjw5ERk40jWGoeLjYM9V", "VhJY3C97J7J84q76u4hEYHgB0g", "Ro8Wdk2EPx5GRn22XYsr1QjtSyjSX", "SdOPztDY16h0BPmxgfN82QFEWJhjV", "9YM807W9r6X84VXv6l9L7RtBJQk8UQ"};
                public static final String A03;
                public final C05417o A00;

                public static String A00(int i, int i2, int i3) {
                    byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
                    for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
                        bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 76);
                    }
                    return new String(bArrCopyOfRange);
                }

                public static void A02() {
                    A01 = new byte[]{17, 1, 101, 100, 103, 96, 116, 109, 117, 1, 17, 48, Base64.padSymbol, 37, 52, 35, 81, 37, 48, 51, Base64.padSymbol, 52, 81, 20, 7, 20, 31, 5, 2, 81, 48, 53, 53, 81, 50, 62, Base64.padSymbol, 36, 60, Utf8.REPLACEMENT_BYTE, 81, 90, Byte.MAX_VALUE, 95, 122, 111, 122, 121, 122, 104, 126, 83, 126, 119, 107, 126, 105, 59, 120, 122, 117, 59, 117, 116, 111, 59, 121, 126, 59, 117, 110, 119, 119, 33, 55, 42, 53, 69, 49, 36, 39, 41, 32, 69, 44, 35, 69, 32, Base64.padSymbol, 44, 54, 49, 54, 69, 6, 23, 4, 22, 13, 0, 22, 88, 90, 73, 79, 69, 73, 40, 110, 103, 122, 109, 97, 111, 102, 87, 99, 109, 113, 123, 40, 53, 40, 71, 70, 51, 124, 121, 110, 56, 110, 51, 121, Byte.MAX_VALUE};
                }

                static {
                    A02();
                    A03 = C05427p.class.getSimpleName();
                }

                {
                    super(c1206Ym, A01(c1206Ym), (SQLiteDatabase.CursorFactory) null, 4);
                    if (this != null) {
                        this.A00 = this;
                        return;
                    }
                    throw new IllegalArgumentException(A00(41, 32, 87));
                }

                public static String A01(C1206Ym c1206Ym2) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
                    Locale locale = Locale.US;
                    Object[] objArr = {A00(0, 0, 95)};
                    String processName = A00(126, 8, 81);
                    String str = String.format(locale, processName, objArr);
                    if (!C0796Ih.A2C(c1206Ym2)) {
                        return str;
                    }
                    String defaultDbName = c1206Ym2.getPackageName();
                    String processName2 = ProcessUtils.getProcessName(c1206Ym2);
                    if (!defaultDbName.equals(processName2) && !TextUtils.isEmpty(processName2)) {
                        String defaultDbName2 = '_' + processName2;
                        return String.format(Locale.US, processName, defaultDbName2);
                    }
                    return str;
                }

                @Override // android.database.sqlite.SQLiteOpenHelper
                public final void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
                    for (AbstractC05447s abstractC05447s : this.A00.A0M()) {
                        abstractC05447s.A07(sQLiteDatabase);
                    }
                }

                @Override // android.database.sqlite.SQLiteOpenHelper
                public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
                    for (AbstractC05447s abstractC05447s : this.A00.A0M()) {
                        abstractC05447s.A08(sQLiteDatabase);
                        abstractC05447s.A07(sQLiteDatabase);
                    }
                }

                @Override // android.database.sqlite.SQLiteOpenHelper
                public final void onOpen(SQLiteDatabase sQLiteDatabase) throws SQLException {
                    super.onOpen(sQLiteDatabase);
                    if (!sQLiteDatabase.isReadOnly()) {
                        sQLiteDatabase.execSQL(A00(101, 25, 68));
                    }
                }

                @Override // android.database.sqlite.SQLiteOpenHelper
                public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
                    if (i == 2 && i2 >= 3) {
                        String strA00 = A00(73, 28, 41);
                        if (A02[7].length() != 30) {
                            throw new RuntimeException();
                        }
                        A02[3] = "Uy0CZyDaBZXeJSQ63Y80hAJR5wsAelR7";
                        sQLiteDatabase.execSQL(strA00);
                    }
                    if (i <= 3 && i2 >= 4) {
                        C05407m c05407m = C1205Yl.A02;
                        sQLiteDatabase.execSQL(A00(11, 30, 61) + c05407m.A01 + A00(0, 1, 125) + c05407m.A02 + A00(1, 10, 109));
                    }
                }
            };
        }
        return this.A00.getWritableDatabase();
    }

    private synchronized SQLiteDatabase A01() {
        SQLiteException e = null;
        for (int i = 0; i < 10; i++) {
            try {
            } catch (SQLiteException e2) {
                e = e2;
                try {
                    Thread.sleep(100L);
                } catch (InterruptedException unused) {
                }
            }
        }
        this.A01.A07().A9a(A05(128, 8, 84), C8A.A0v, new C8B(e));
        throw e;
        return A00();
    }

    public final int A08(int i) {
        Lock lock = A08;
        lock.lock();
        try {
            int iDelete = A0E().delete(A05(136, 6, 111), C1205Yl.A02.A01 + A05(3, 4, 28), new String[]{String.valueOf(i - 1)});
            lock.unlock();
            return iDelete;
        } catch (Throwable th) {
            A08.unlock();
            throw th;
        }
    }

    public final Cursor A09() {
        Lock lock = A07;
        lock.lock();
        try {
            Cursor cursorA0B = this.A02.A0B();
            lock.unlock();
            return cursorA0B;
        } catch (Throwable th) {
            A07.unlock();
            throw th;
        }
    }

    public final Cursor A0A() {
        Lock lock = A07;
        lock.lock();
        try {
            Cursor cursorA0C = this.A02.A0C();
            lock.unlock();
            return cursorA0C;
        } catch (Throwable th) {
            A07.unlock();
            throw th;
        }
    }

    public final Cursor A0B() {
        Lock lock = A07;
        lock.lock();
        try {
            Cursor cursorA0B = this.A03.A0B();
            lock.unlock();
            return cursorA0B;
        } catch (Throwable th) {
            A07.unlock();
            throw th;
        }
    }

    public final Cursor A0C(int i) {
        Lock lock = A07;
        lock.lock();
        try {
            Cursor cursorRawQuery = A0E().rawQuery(A06 + A05(23, 7, 1) + String.valueOf(i), null);
            lock.unlock();
            return cursorRawQuery;
        } catch (Throwable th) {
            A07.unlock();
            throw th;
        }
    }

    public final Cursor A0D(String str) {
        Lock lock = A07;
        lock.lock();
        try {
            Cursor cursorA0D = this.A02.A0D(str);
            lock.unlock();
            return cursorA0D;
        } catch (Throwable th) {
            A07.unlock();
            throw th;
        }
    }

    public final SQLiteDatabase A0E() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return A01();
        }
        throw new IllegalStateException(A05(64, 43, 96));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7r != com.facebook.ads.internal.database.AdDatabaseQuery<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8t != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<T> */
    public final <T> AsyncTask A0F(final AbstractC05437r<T> abstractC05437r, final AbstractC05708t<T> abstractC05708t) {
        Executor executor = ExecutorC0879Lt.A07;
        final C1206Ym c1206Ym = this.A01;
        return AbstractC0876Lq.A00(executor, new AsyncTask<Void, Void, T>(c1206Ym, abstractC05437r, abstractC05708t) { // from class: com.facebook.ads.redexgen.X.7n
            public static byte[] A04;
            public static String[] A05 = {"65r9CRdv0GoLRVNVjbjXzJK5P2ycj7FG", "0CWnyuhck9HOQgwCfxzQ09GVkx", "IEC2mc7xTTQi8lqWDODmms9jEFByhoZx", "6exEWFSZK9oTcnxcvUurXohDGqhdlb0H", "22QzghXqrFZ4DBGtDF", "dbvBYMdgslkBJuEWD9uCPJqFmtTt8cU5", "jZC4Ivj", "4jv2LQemXeCXPfpssPDUuPD2TleIiZzb"};
            public C7q A00;
            public final C1206Ym A01;
            public final AbstractC05437r<T> A02;
            public final AbstractC05708t<T> A03;

            public static String A01(int i, int i2, int i3) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
                for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
                    int i5 = (bArrCopyOfRange[i4] - i3) - 116;
                    if (A05[7].charAt(12) != 'P') {
                        throw new RuntimeException();
                    }
                    A05[6] = "VTML";
                    bArrCopyOfRange[i4] = (byte) i5;
                }
                return new String(bArrCopyOfRange);
            }

            public static void A02() {
                A04 = new byte[]{31, 28, 47, 28, 29, 28, 46, 32};
            }

            static {
                A02();
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7n != com.facebook.ads.internal.database.AdDatabaseHelper$DatabaseQueryAsyncTask<T> */
            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7r != com.facebook.ads.internal.database.AdDatabaseQuery<T> */
            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8t != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<T> */
            {
                this.A02 = abstractC05437r;
                this.A03 = abstractC05708t;
                this.A01 = c1206Ym;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7n != com.facebook.ads.internal.database.AdDatabaseHelper$DatabaseQueryAsyncTask<T> */
            private final T A00(Void... voidArr) throws Throwable {
                if (KL.A02(this)) {
                    return null;
                }
                if (A05[6].length() == 11) {
                    throw new RuntimeException();
                }
                A05[2] = "4eGiZ19xQ4OxGjIavdFldPBRBlbWR0DL";
                T tA03 = null;
                try {
                    try {
                        tA03 = this.A02.A03();
                        this.A00 = this.A02.A00();
                        return tA03;
                    } catch (Exception e) {
                        this.A01.A07().A9a(A01(0, 8, 71), C8A.A0w, new C8B(e));
                        this.A00 = C7q.A09;
                        return tA03;
                    }
                } catch (Throwable th) {
                    KL.A00(th, this);
                    return null;
                }
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7n != com.facebook.ads.internal.database.AdDatabaseHelper$DatabaseQueryAsyncTask<T> */
            @Override // android.os.AsyncTask
            public final /* bridge */ /* synthetic */ Object doInBackground(Void[] voidArr) throws Throwable {
                if (KL.A02(this)) {
                    return null;
                }
                try {
                    return A00(voidArr);
                } catch (Throwable th) {
                    KL.A00(th, this);
                    return null;
                }
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7n != com.facebook.ads.internal.database.AdDatabaseHelper$DatabaseQueryAsyncTask<T> */
            @Override // android.os.AsyncTask
            public final void onPostExecute(T result) throws Throwable {
                if (KL.A02(this)) {
                    return;
                }
                try {
                    C7q c7q = this.A00;
                    if (c7q == null) {
                        this.A03.A02(result);
                    } else {
                        this.A03.A01(c7q.A02(), this.A00.A03());
                    }
                } catch (Throwable th) {
                    KL.A00(th, this);
                }
            }
        }, new Void[0]);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8t != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<java.lang.String> */
    public final AsyncTask A0G(String str, int i, String str2, double d, double d2, String str3, Map<String, String> data, AbstractC05708t<String> abstractC05708t) {
        return A0F(new EP(this, str2, str, i, d, d2, str3, data), abstractC05708t);
    }

    public final void A0H() {
        Lock lock = A08;
        lock.lock();
        try {
            this.A02.A09();
            this.A03.A09();
            lock.unlock();
        } catch (Throwable th) {
            A08.unlock();
            throw th;
        }
    }

    public final void A0I() {
        Lock lock = A08;
        lock.lock();
        try {
            this.A03.A0D(this.A01);
            lock.unlock();
        } catch (Throwable th) {
            A08.unlock();
            throw th;
        }
    }

    public final boolean A0K(String str) {
        Lock lock = A08;
        lock.lock();
        try {
            boolean zA0F = this.A02.A0F(str);
            lock.unlock();
            String[] strArr = A05;
            if (strArr[7].charAt(23) != strArr[1].charAt(23)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[4] = "8";
            strArr2[5] = "N";
            return zA0F;
        } catch (Throwable th) {
            A08.unlock();
            throw th;
        }
    }

    public final boolean A0L(String str) throws SQLException {
        boolean z;
        A08.lock();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(A05(121, 7, 95)).append(A05(136, 6, 111)).append(A05(44, 5, 67)).append(C1205Yl.A02.A01).append(A05(61, 1, 83)).append(C1205Yl.A02.A01).append(A05(56, 2, 49)).append(A05(49, 7, 11)).append(C1205Yl.A04.A01).append(A05(62, 2, 26));
            A0E().execSQL(sb.toString(), new String[]{str});
            z = true;
        } catch (SQLiteException unused) {
            z = false;
        }
        A08.unlock();
        String[] strArr = A05;
        if (strArr[0].charAt(2) != strArr[6].charAt(2)) {
            throw new RuntimeException();
        }
        A05[2] = "LEhHmvsdsEQXOsQ0B1AVwqczGhJrofDk";
        return z;
    }

    public final AbstractC05447s[] A0M() {
        return new AbstractC05447s[]{this.A03, this.A02};
    }
}
