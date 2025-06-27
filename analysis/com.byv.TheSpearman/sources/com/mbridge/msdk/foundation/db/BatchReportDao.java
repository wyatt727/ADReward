package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.mbridge.msdk.foundation.same.report.BatchReportMessage;
import com.mbridge.msdk.system.NoProGuard;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;

/* loaded from: classes4.dex */
public class BatchReportDao extends a<BatchReportMessage> implements NoProGuard, Serializable {
    private static volatile BatchReportDao instance;
    private final Object lock;

    protected BatchReportDao(g gVar) {
        super(gVar);
        this.lock = new Object();
    }

    public static BatchReportDao getInstance(g gVar) {
        if (instance == null) {
            synchronized (BatchReportDao.class) {
                if (instance == null) {
                    instance = new BatchReportDao(gVar);
                }
            }
        }
        return instance;
    }

    public static BatchReportDao getInstance(Context context) {
        if (instance == null) {
            synchronized (BatchReportDao.class) {
                if (instance == null) {
                    instance = new BatchReportDao(h.a(context));
                }
            }
        }
        return instance;
    }

    public void addReportMessage(String str, int i) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        if (com.mbridge.msdk.f.d.a(writableDatabase)) {
            try {
                synchronized (this.lock) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("report_message", str);
                    contentValues.put("time", Long.valueOf(System.currentTimeMillis()));
                    contentValues.put("uuid", UUID.randomUUID().toString().replace("-", ""));
                    contentValues.put("report_state", (Integer) 0);
                    contentValues.put("type", Integer.valueOf(i));
                    writableDatabase.insert("batch_report", null, contentValues);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void deleteBatchReportMessagesByTimestamp(long j) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        if (com.mbridge.msdk.f.d.a(writableDatabase)) {
            try {
                synchronized (this.lock) {
                    writableDatabase.execSQL("delete from batch_report where time <= " + j);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public ArrayList<BatchReportMessage> getBatchReportMessages(long j, int i) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        Cursor cursor = null;
        if (!com.mbridge.msdk.f.d.a(writableDatabase)) {
            return null;
        }
        ArrayList<BatchReportMessage> arrayList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM ");
        sb.append("batch_report");
        sb.append(" WHERE ");
        sb.append("time");
        sb.append(" <= ");
        sb.append(j);
        sb.append(" AND ");
        sb.append("report_state");
        sb.append(" = 0");
        sb.append(" AND ");
        sb.append("type");
        sb.append(" = " + i);
        sb.append(" ORDER BY ");
        sb.append("time");
        sb.append(" ASC ");
        synchronized (this.lock) {
            try {
                try {
                    Cursor cursorRawQuery = writableDatabase.rawQuery(sb.toString(), null);
                    if (cursorRawQuery != null) {
                        while (cursorRawQuery.moveToNext()) {
                            try {
                                arrayList.add(new BatchReportMessage(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("uuid")), cursorRawQuery.getString(cursorRawQuery.getColumnIndex("report_message")), cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("time"))));
                            } catch (Throwable th) {
                                th = th;
                                cursor = cursorRawQuery;
                                if (cursor != null) {
                                    try {
                                        cursor.close();
                                    } catch (Exception unused) {
                                    }
                                }
                                throw th;
                            }
                        }
                    }
                    if (cursorRawQuery != null) {
                        try {
                            cursorRawQuery.close();
                        } catch (Exception unused2) {
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("report_state", (Integer) 1);
                writableDatabase.update("batch_report", contentValues, "time <= " + j, null);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return arrayList;
    }

    public void updateMessagesReportState(ArrayList<BatchReportMessage> arrayList) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        if (arrayList == null || arrayList.size() == 0 || !com.mbridge.msdk.f.d.a(writableDatabase)) {
            return;
        }
        Iterator<BatchReportMessage> it = arrayList.iterator();
        while (it.hasNext()) {
            BatchReportMessage next = it.next();
            try {
                synchronized (this.lock) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("report_state", (Integer) 0);
                    writableDatabase.update("batch_report", contentValues, "uuid = '" + next.getUuid() + "'", null);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
