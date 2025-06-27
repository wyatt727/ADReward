package com.json;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class l3 extends SQLiteOpenHelper {
    public l3(Context context) {
        super(context, "reports", (SQLiteDatabase.CursorFactory) null, 1);
    }

    public static Cursor a(int i) throws Throwable {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase readableDatabase = new l3(e3.d().a()).getReadableDatabase();
            try {
                Cursor cursorRawQuery = readableDatabase.rawQuery("SELECT * FROM REPORTSWHERE id= " + i + ";", null);
                readableDatabase.close();
                return cursorRawQuery;
            } catch (Throwable th) {
                th = th;
                sQLiteDatabase = readableDatabase;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void a() {
        SQLiteDatabase writableDatabase;
        try {
            writableDatabase = new l3(e3.d().a()).getWritableDatabase();
            try {
                writableDatabase.execSQL("DELETE FROM REPORTS WHERE id >= 0;");
                writableDatabase.close();
            } catch (Throwable th) {
                th = th;
                if (writableDatabase != null) {
                    writableDatabase.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            writableDatabase = null;
        }
    }

    public static void a(u4 u4Var) {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase writableDatabase = new l3(e3.d().a()).getWritableDatabase();
            try {
                writableDatabase.beginTransaction();
                ContentValues contentValues = new ContentValues();
                String strE = u4Var.e();
                String strB = u4Var.b();
                String strD = u4Var.d();
                contentValues.put("stack_trace", strE);
                contentValues.put("crash_date", strB);
                contentValues.put("crashType", strD);
                writableDatabase.insert("REPORTS", null, contentValues);
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                writableDatabase.close();
            } catch (Throwable th) {
                th = th;
                sQLiteDatabase = writableDatabase;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.endTransaction();
                    sQLiteDatabase.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static u4 b(int i) throws Throwable {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase readableDatabase = new l3(e3.d().a()).getReadableDatabase();
            try {
                Cursor cursorRawQuery = readableDatabase.rawQuery("SELECT * FROM REPORTSWHERE id= " + i + ";", null);
                int i2 = cursorRawQuery.getInt(0);
                String string = cursorRawQuery.getString(1);
                String string2 = cursorRawQuery.getString(2);
                String string3 = cursorRawQuery.getString(3);
                cursorRawQuery.close();
                u4 u4Var = new u4(i2, string, string2, string3);
                readableDatabase.close();
                return u4Var;
            } catch (Throwable th) {
                th = th;
                sQLiteDatabase = readableDatabase;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static List<u4> b() throws Throwable {
        l3 l3Var = new l3(e3.d().a());
        ArrayList arrayList = new ArrayList();
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase readableDatabase = l3Var.getReadableDatabase();
            try {
                Cursor cursorRawQuery = readableDatabase.rawQuery("SELECT * FROM REPORTS ;", null);
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        arrayList.add(new u4(cursorRawQuery.getInt(0), cursorRawQuery.getString(1), cursorRawQuery.getString(2), cursorRawQuery.getString(3)));
                    } while (cursorRawQuery.moveToNext());
                }
                cursorRawQuery.close();
                readableDatabase.close();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                sQLiteDatabase = readableDatabase;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static Cursor c() throws Throwable {
        l3 l3Var = new l3(e3.d().a());
        new ArrayList();
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase readableDatabase = l3Var.getReadableDatabase();
            try {
                Cursor cursorRawQuery = readableDatabase.rawQuery("SELECT * FROM REPORTS;", null);
                readableDatabase.close();
                return cursorRawQuery;
            } catch (Throwable th) {
                th = th;
                sQLiteDatabase = readableDatabase;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS REPORTS(id INTEGER PRIMARY KEY AUTOINCREMENT , stack_trace TEXT NOT NULL, crash_date TEXT NOT NULL,crashType TEXT NOT NULL );");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
