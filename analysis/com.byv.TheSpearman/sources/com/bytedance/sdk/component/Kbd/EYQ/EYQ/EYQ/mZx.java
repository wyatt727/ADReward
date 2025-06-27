package com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.bytedance.sdk.component.Kbd.EYQ.QQ;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.List;
import org.json.JSONObject;

/* compiled from: DBHelper.java */
/* loaded from: classes2.dex */
class mZx {
    private C0083mZx EYQ;
    private Context mZx;

    mZx(Context context) {
        try {
            this.mZx = context.getApplicationContext();
            if (this.EYQ == null) {
                this.EYQ = new C0083mZx();
            }
        } catch (Throwable unused) {
        }
    }

    /* compiled from: DBHelper.java */
    /* renamed from: com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.mZx$mZx, reason: collision with other inner class name */
    public class C0083mZx {
        private volatile SQLiteDatabase mZx = null;

        public C0083mZx() {
        }

        private void EYQ() {
            try {
                if (this.mZx != null && this.mZx.isOpen()) {
                    return;
                }
                synchronized (this) {
                    if (this.mZx == null || !this.mZx.isOpen()) {
                        this.mZx = QQ.VwS().Pm().EYQ(QQ.VwS().IPb());
                        this.mZx.setLockingEnabled(false);
                    }
                }
            } catch (Throwable th) {
                if (mZx()) {
                    throw th;
                }
            }
        }

        public void EYQ(String str) throws SQLException {
            try {
                EYQ();
                this.mZx.execSQL(str);
            } catch (Throwable th) {
                if (mZx()) {
                    throw th;
                }
            }
        }

        public Cursor EYQ(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
            try {
                EYQ();
                return this.mZx.query(str, strArr, str2, strArr2, str3, str4, str5);
            } catch (Throwable th) {
                EYQ eyq = new EYQ();
                if (mZx()) {
                    throw th;
                }
                return eyq;
            }
        }

        public int EYQ(String str, ContentValues contentValues, String str2, String[] strArr) throws Exception {
            try {
                EYQ();
                return this.mZx.update(str, contentValues, str2, strArr);
            } catch (Exception e) {
                if (mZx()) {
                    throw e;
                }
                return 0;
            }
        }

        public long EYQ(String str, String str2, ContentValues contentValues) throws Exception {
            try {
                EYQ();
                return this.mZx.insert(str, str2, contentValues);
            } catch (Exception e) {
                if (mZx()) {
                    throw e;
                }
                return -1L;
            }
        }

        public synchronized void EYQ(String str, String str2, List<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> list) {
            JSONObject jSONObjectVwS;
            try {
                try {
                    EYQ();
                    this.mZx.beginTransaction();
                    ContentValues contentValues = new ContentValues();
                    for (int i = 0; i < list.size(); i++) {
                        com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ eyq = list.get(i);
                        if (eyq != null && (jSONObjectVwS = eyq.VwS()) != null) {
                            contentValues.put("id", eyq.Td());
                            String strMZx = QQ.VwS().hu().mZx(jSONObjectVwS.toString());
                            if (!TextUtils.isEmpty(strMZx)) {
                                contentValues.put("value", strMZx);
                                contentValues.put("gen_time", Long.valueOf(System.currentTimeMillis()));
                                contentValues.put("retry", (Integer) 0);
                                contentValues.put("encrypt", (Integer) 1);
                                if (com.bytedance.sdk.component.Kbd.EYQ.Td.EYQ.Pm() && eyq.tp() > 0 && (eyq.Pm() == 0 || eyq.Pm() == 3)) {
                                    contentValues.put("channel", Integer.valueOf(eyq.tp()));
                                }
                                this.mZx.insert(str, str2, contentValues);
                            }
                            contentValues.clear();
                        }
                    }
                    this.mZx.setTransactionSuccessful();
                    list.size();
                } catch (Exception e) {
                    list.size();
                    if (mZx()) {
                        throw e;
                    }
                    if (this.mZx != null) {
                        this.mZx.endTransaction();
                    }
                }
            } finally {
                if (this.mZx != null) {
                    this.mZx.endTransaction();
                }
            }
        }

        public int EYQ(String str, String str2, String[] strArr) throws Exception {
            try {
                EYQ();
                return this.mZx.delete(str, str2, strArr);
            } catch (Exception e) {
                if (mZx()) {
                    throw e;
                }
                return 0;
            }
        }

        private boolean mZx() {
            SQLiteDatabase sQLiteDatabase = this.mZx;
            return sQLiteDatabase != null && sQLiteDatabase.inTransaction();
        }
    }

    public C0083mZx EYQ() {
        return this.EYQ;
    }

    /* compiled from: DBHelper.java */
    private class EYQ extends AbstractCursor {
        @Override // android.database.AbstractCursor, android.database.Cursor
        public String[] getColumnNames() {
            return new String[0];
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getCount() {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public double getDouble(int i) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public float getFloat(int i) {
            return 0.0f;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getInt(int i) {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public long getLong(int i) {
            return 0L;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public short getShort(int i) {
            return (short) 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public String getString(int i) {
            return null;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public boolean isNull(int i) {
            return true;
        }

        private EYQ() {
        }
    }
}
