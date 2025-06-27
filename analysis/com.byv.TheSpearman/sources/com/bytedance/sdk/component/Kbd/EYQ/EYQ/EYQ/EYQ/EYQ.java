package com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.EYQ;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.bytedance.sdk.component.Kbd.EYQ.QQ;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: AdEventRepoImpl.java */
/* loaded from: classes2.dex */
public class EYQ extends Td {
    protected List<String> EYQ;
    private com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ Pm;
    private final Context Td;

    public byte Pm() {
        return (byte) 0;
    }

    public byte Td() {
        return (byte) 2;
    }

    public EYQ(Context context, com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ eyq) {
        super(context);
        this.EYQ = new ArrayList();
        this.Td = context;
        this.Pm = eyq;
        if (eyq == null) {
            this.Pm = com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ.Td();
        }
    }

    public int EYQ() {
        int i = 0;
        Cursor cursorEYQ = null;
        try {
            cursorEYQ = com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.Td.EYQ(Kbd(), mZx(), new String[]{"count(1)"}, null, null, null, null, null);
            if (cursorEYQ != null) {
                cursorEYQ.moveToFirst();
                i = cursorEYQ.getInt(0);
            }
        } catch (Exception unused) {
            if (cursorEYQ != null) {
            }
        } catch (Throwable th) {
            if (cursorEYQ != null) {
                try {
                    cursorEYQ.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
        if (cursorEYQ != null) {
            try {
                cursorEYQ.close();
            } catch (Exception unused3) {
            }
        }
        return i;
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.EYQ.Td
    public String mZx() {
        com.bytedance.sdk.component.Kbd.EYQ.EYQ.Kbd kbdPm = QQ.VwS().Pm();
        if (kbdPm != null) {
            return kbdPm.mZx();
        }
        return null;
    }

    public List<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> EYQ(int i, String str) {
        String str2;
        String[] strArr;
        String str3;
        String str4;
        Cursor cursorEYQ;
        long jEYQ = com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.EYQ(i, Kbd());
        mZx();
        if (jEYQ <= 0) {
            jEYQ = 1;
        } else if (jEYQ > 100) {
            jEYQ = 100;
        }
        String str5 = str + " DESC limit " + jEYQ;
        ArrayList arrayList = new ArrayList();
        this.EYQ.clear();
        long jUB = QQ.VwS().UB();
        if (jUB > 0) {
            strArr = new String[]{String.valueOf(System.currentTimeMillis() - jUB)};
            str2 = "gen_time>?";
        } else {
            str2 = null;
            strArr = null;
        }
        if (com.bytedance.sdk.component.Kbd.EYQ.Td.EYQ.Pm() && Pm() == 3) {
            str3 = "id";
            str4 = "value";
            cursorEYQ = com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.Td.EYQ(Kbd(), mZx(), new String[]{"id", "value", "encrypt", "channel"}, str2, strArr, null, null, str5);
        } else {
            str3 = "id";
            str4 = "value";
            cursorEYQ = com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.Td.EYQ(Kbd(), mZx(), new String[]{str3, str4, "encrypt"}, str2, strArr, null, null, str5);
        }
        Cursor cursor = cursorEYQ;
        if (cursor != null) {
            try {
                com.bytedance.sdk.component.Kbd.EYQ.Kbd kbdHu = QQ.VwS().hu();
                while (cursor.moveToNext()) {
                    try {
                        String string = cursor.getString(cursor.getColumnIndex(str3));
                        String string2 = cursor.getString(cursor.getColumnIndex(str4));
                        int i2 = cursor.getInt(cursor.getColumnIndex("encrypt"));
                        int i3 = (com.bytedance.sdk.component.Kbd.EYQ.Td.EYQ.Pm() && Pm() == 3) ? cursor.getInt(cursor.getColumnIndex("channel")) : 0;
                        if (i2 == 1) {
                            try {
                                string2 = kbdHu.EYQ(string2);
                            } catch (Throwable th) {
                                th = th;
                                th.getMessage();
                            }
                        }
                        if (TextUtils.isEmpty(string2)) {
                            this.EYQ.add(string);
                        } else {
                            if (arrayList.size() > 100) {
                                break;
                            }
                            JSONObject jSONObject = new JSONObject(string2);
                            com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ.EYQ eyq = new com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ.EYQ(string, jSONObject);
                            eyq.EYQ(Pm());
                            eyq.mZx(Td());
                            if (com.bytedance.sdk.component.Kbd.EYQ.Td.EYQ.Pm() && Pm() == 3) {
                                eyq.EYQ(i3);
                            }
                            com.bytedance.sdk.component.Kbd.EYQ.Td.EYQ.EYQ(jSONObject, eyq);
                            arrayList.add(eyq);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                if (cursor != null) {
                    try {
                        cursor.close();
                        if (!this.EYQ.isEmpty()) {
                            EYQ(this.EYQ);
                            this.EYQ.clear();
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th3) {
                if (cursor != null) {
                    try {
                        cursor.close();
                        if (!this.EYQ.isEmpty()) {
                            EYQ(this.EYQ);
                            this.EYQ.clear();
                        }
                    } catch (Exception unused2) {
                    }
                }
                throw th3;
            }
        }
        mZx();
        arrayList.size();
        return arrayList;
    }

    public List<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> EYQ(String str) {
        com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ eyq = this.Pm;
        if (eyq == null) {
            return new ArrayList();
        }
        return EYQ(eyq.mZx(), str);
    }

    protected void EYQ(List<String> list) {
        mZx();
        list.size();
        com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.Td.EYQ(Kbd(), "DELETE FROM " + mZx() + " WHERE " + EYQ("id", list, 1000, true));
        com.bytedance.sdk.component.Kbd.EYQ.Td.mZx.EYQ(com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.Pm.Nuq(), list.size());
        Td(list);
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
        if (j > 0 || i > 0) {
            com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.Td.EYQ(Kbd(), mZx(), "gen_time <? OR retry >?", new String[]{String.valueOf(System.currentTimeMillis() - j), String.valueOf(i)});
            mZx();
        }
    }

    public boolean EYQ(int i) {
        if (this.Pm == null) {
            return false;
        }
        int iEYQ = EYQ();
        int iEYQ2 = this.Pm.EYQ();
        mZx();
        return (com.bytedance.sdk.component.Kbd.EYQ.Td.EYQ.Td() && (i == 1 || i == 2)) ? iEYQ > 0 : iEYQ >= iEYQ2;
    }

    public static String mZx(String str) {
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
