package com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.EYQ;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.bytedance.sdk.component.Kbd.EYQ.QQ;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: StatsLogEventRepoImpl.java */
/* loaded from: classes2.dex */
public class VwS extends Td {
    protected List<String> EYQ;
    private com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ Td;

    public byte EYQ() {
        return (byte) 1;
    }

    public byte Td() {
        return (byte) 2;
    }

    public VwS(Context context, com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ eyq) {
        super(context);
        this.EYQ = new ArrayList();
        this.Td = eyq;
        if (eyq == null) {
            this.Td = com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ.Td();
        }
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.EYQ.Td
    public String mZx() {
        return QQ.VwS().Pm().Pm();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0023 A[EXC_TOP_SPLITTER, PHI: r0 r1
      0x0023: PHI (r0v2 int) = (r0v0 int), (r0v6 int) binds: [B:10:0x0028, B:6:0x0021] A[DONT_GENERATE, DONT_INLINE]
      0x0023: PHI (r1v2 android.database.Cursor) = (r1v1 android.database.Cursor), (r1v4 android.database.Cursor) binds: [B:10:0x0028, B:6:0x0021] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int Pm() {
        /*
            r9 = this;
            r0 = 0
            android.content.Context r1 = r9.Kbd()     // Catch: java.lang.Throwable -> L27
            java.lang.String r2 = r9.mZx()     // Catch: java.lang.Throwable -> L27
            java.lang.String r3 = "count(1)"
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch: java.lang.Throwable -> L27
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r1 = com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.Td.EYQ(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto L21
            r1.moveToFirst()     // Catch: java.lang.Throwable -> L28
            int r0 = r1.getInt(r0)     // Catch: java.lang.Throwable -> L28
        L21:
            if (r1 == 0) goto L2b
        L23:
            r1.close()     // Catch: java.lang.Exception -> L2b
            goto L2b
        L27:
            r1 = 0
        L28:
            if (r1 == 0) goto L2b
            goto L23
        L2b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.EYQ.VwS.Pm():int");
    }

    public List<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> EYQ(int i, String str) {
        long jEYQ = com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.EYQ(i, Kbd());
        if (jEYQ <= 0) {
            jEYQ = 1;
        } else if (jEYQ > 100) {
            jEYQ = 100;
        }
        ArrayList arrayList = new ArrayList();
        this.EYQ.clear();
        Cursor cursorEYQ = com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.Td.EYQ(Kbd(), mZx(), new String[]{"id", "value", "encrypt"}, null, null, null, null, str + " DESC limit " + jEYQ);
        if (cursorEYQ != null) {
            while (cursorEYQ.moveToNext()) {
                try {
                    try {
                        String string = cursorEYQ.getString(cursorEYQ.getColumnIndex("id"));
                        String string2 = cursorEYQ.getString(cursorEYQ.getColumnIndex("value"));
                        if (cursorEYQ.getInt(cursorEYQ.getColumnIndex("encrypt")) == 1) {
                            string2 = QQ.VwS().hu().EYQ(string2);
                        }
                        if (TextUtils.isEmpty(string2)) {
                            this.EYQ.add(string);
                        } else {
                            if (arrayList.size() > 100) {
                                break;
                            }
                            com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ.EYQ eyq = new com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ.EYQ(string, new JSONObject(string2));
                            eyq.mZx(Td());
                            eyq.EYQ(EYQ());
                            arrayList.add(eyq);
                        }
                    } catch (Throwable unused) {
                    }
                } catch (Throwable th) {
                    if (cursorEYQ != null) {
                        try {
                            cursorEYQ.close();
                            if (!this.EYQ.isEmpty()) {
                                EYQ(this.EYQ);
                                this.EYQ.clear();
                            }
                        } catch (Exception unused2) {
                        }
                    }
                    throw th;
                }
            }
            if (cursorEYQ != null) {
                try {
                    cursorEYQ.close();
                    if (!this.EYQ.isEmpty()) {
                        EYQ(this.EYQ);
                        this.EYQ.clear();
                    }
                } catch (Exception unused3) {
                }
            }
        }
        return arrayList;
    }

    protected void EYQ(List<String> list) {
        mZx();
        list.size();
        com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.Td.EYQ(Kbd(), "DELETE FROM " + mZx() + " WHERE " + EYQ("id", list, 1000, true));
        com.bytedance.sdk.component.Kbd.EYQ.Td.mZx.EYQ(com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.Pm.Nuq(), list.size());
        Td(list);
    }

    public List<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> mZx(String str) {
        com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ eyq = this.Td;
        if (eyq == null) {
            return new ArrayList();
        }
        return EYQ(eyq.mZx(), str);
    }

    public void mZx(List<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        for (com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ eyq : list) {
            linkedList.add(eyq.Td());
            com.bytedance.sdk.component.Kbd.EYQ.Td.EYQ.tp(eyq);
        }
        mZx();
        linkedList.size();
        com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.Td.EYQ(Kbd(), "DELETE FROM " + mZx() + " WHERE " + EYQ("id", linkedList, 1000, true));
        Td(linkedList);
    }

    public void EYQ(int i, long j) {
        mZx(i, j);
    }

    private void mZx(int i, long j) {
        com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.Td.EYQ(Kbd(), mZx(), "gen_time <? AND retry >?", new String[]{String.valueOf(System.currentTimeMillis() - j), String.valueOf(i)});
    }

    public boolean EYQ(int i) {
        return this.Td != null && Pm() >= this.Td.EYQ();
    }

    public static String Td(String str) {
        return "CREATE TABLE IF NOT EXISTS " + str + " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }

    private static String EYQ(String str, List<?> list, int i, boolean z) {
        int i2;
        String str2 = z ? " IN " : " NOT IN ";
        String str3 = z ? " OR " : " AND ";
        int iMin = Math.min(i, 1000);
        int size = list.size();
        if (size % iMin == 0) {
            i2 = size / iMin;
        } else {
            i2 = (size / iMin) + 1;
        }
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i3 * iMin;
            String strEYQ = EYQ(TextUtils.join("','", list.subList(i4, Math.min(i4 + iMin, size))), "");
            if (i3 != 0) {
                sb.append(str3);
            }
            sb.append(str);
            sb.append(str2);
            sb.append("('");
            sb.append(strEYQ);
            sb.append("')");
        }
        return EYQ(sb.toString(), str + str2 + "('')");
    }

    private static String EYQ(String str, String str2) {
        return !TextUtils.isEmpty(str) ? str : str2;
    }
}
