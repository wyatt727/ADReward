package com.bytedance.sdk.component.adexpress.EYQ.Td;

import android.text.TextUtils;
import android.util.Pair;
import com.json.t2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: TempPkgModel.java */
/* loaded from: classes2.dex */
public class EYQ {
    private String EYQ;
    private Map<String, EYQ> IPb = new ConcurrentHashMap();
    private mZx Kbd;
    private List<C0089EYQ> Pm;
    private String Td;
    private String mZx;

    public Map<String, EYQ> EYQ() {
        return this.IPb;
    }

    public String mZx() {
        return this.EYQ;
    }

    public void EYQ(String str) {
        this.EYQ = str;
    }

    public String Td() {
        return this.mZx;
    }

    public void mZx(String str) {
        this.mZx = str;
    }

    public String Pm() {
        return this.Td;
    }

    public void Td(String str) {
        this.Td = str;
    }

    public void EYQ(mZx mzx) {
        this.Kbd = mzx;
    }

    public mZx Kbd() {
        return this.Kbd;
    }

    public List<C0089EYQ> IPb() {
        if (this.Pm == null) {
            this.Pm = new ArrayList();
        }
        return this.Pm;
    }

    public void EYQ(List<C0089EYQ> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.Pm = list;
    }

    public boolean VwS() {
        return (TextUtils.isEmpty(Pm()) || TextUtils.isEmpty(Td()) || TextUtils.isEmpty(mZx())) ? false : true;
    }

    public JSONObject QQ() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("name", mZx());
            jSONObject.putOpt("version", Td());
            jSONObject.putOpt(t2.h.Z, Pm());
            JSONArray jSONArray = new JSONArray();
            if (IPb() != null) {
                for (C0089EYQ c0089eyq : IPb()) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.putOpt("url", c0089eyq.EYQ());
                    jSONObject2.putOpt("md5", c0089eyq.mZx());
                    jSONObject2.putOpt("level", Integer.valueOf(c0089eyq.Td()));
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.putOpt("resources", jSONArray);
            if (!this.IPb.isEmpty()) {
                JSONObject jSONObject3 = new JSONObject();
                boolean z = false;
                for (String str : this.IPb.keySet()) {
                    EYQ eyq = this.IPb.get(str);
                    if (eyq != null) {
                        jSONObject3.put(str, eyq.QQ());
                        z = true;
                    }
                }
                if (z) {
                    jSONObject.put("engines", jSONObject3);
                }
            }
            mZx mzxKbd = Kbd();
            if (mzxKbd != null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("url", mzxKbd.EYQ);
                jSONObject4.put("md5", mzxKbd.mZx);
                JSONObject jSONObject5 = new JSONObject();
                List<Pair<String, String>> listMZx = mzxKbd.mZx();
                if (listMZx != null) {
                    for (Pair<String, String> pair : listMZx) {
                        jSONObject5.put((String) pair.first, pair.second);
                    }
                }
                jSONObject4.put("map", jSONObject5);
                jSONObject.putOpt("resources_archive", jSONObject4);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public String HX() {
        JSONObject jSONObjectQQ;
        if (!VwS() || (jSONObjectQQ = QQ()) == null) {
            return null;
        }
        return jSONObjectQQ.toString();
    }

    /* compiled from: TempPkgModel.java */
    /* renamed from: com.bytedance.sdk.component.adexpress.EYQ.Td.EYQ$EYQ, reason: collision with other inner class name */
    public static class C0089EYQ {
        private String EYQ;
        private int Td;
        private String mZx;

        public boolean equals(Object obj) {
            String str;
            if (obj instanceof C0089EYQ) {
                String str2 = this.EYQ;
                if (str2 != null) {
                    C0089EYQ c0089eyq = (C0089EYQ) obj;
                    if (str2.equals(c0089eyq.EYQ()) && (str = this.mZx) != null && str.equals(c0089eyq.mZx())) {
                        return true;
                    }
                }
                return false;
            }
            return super.equals(obj);
        }

        public String EYQ() {
            return this.EYQ;
        }

        public void EYQ(String str) {
            this.EYQ = str;
        }

        public String mZx() {
            return this.mZx;
        }

        public void mZx(String str) {
            this.mZx = str;
        }

        public int Td() {
            return this.Td;
        }

        public void EYQ(int i) {
            this.Td = i;
        }
    }

    /* compiled from: TempPkgModel.java */
    public static class mZx {
        private String EYQ;
        private List<Pair<String, String>> Td;
        private String mZx;

        public String EYQ() {
            return this.EYQ;
        }

        public void EYQ(String str) {
            this.EYQ = str;
        }

        public void mZx(String str) {
            this.mZx = str;
        }

        public void EYQ(List<Pair<String, String>> list) {
            this.Td = list;
        }

        public List<Pair<String, String>> mZx() {
            return this.Td;
        }
    }

    public static EYQ Pm(String str) {
        if (str == null) {
            return null;
        }
        try {
            return EYQ(new JSONObject(str));
        } catch (Exception unused) {
            return null;
        }
    }

    public static EYQ EYQ(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject == null) {
            return null;
        }
        EYQ eyq = new EYQ();
        eyq.EYQ(jSONObject.optString("name"));
        eyq.mZx(jSONObject.optString("version"));
        eyq.Td(jSONObject.optString(t2.h.Z));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("resources");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
                C0089EYQ c0089eyq = new C0089EYQ();
                c0089eyq.EYQ(jSONObjectOptJSONObject2.optString("url"));
                c0089eyq.mZx(jSONObjectOptJSONObject2.optString("md5"));
                c0089eyq.EYQ(jSONObjectOptJSONObject2.optInt("level"));
                arrayList.add(c0089eyq);
            }
        }
        eyq.EYQ(arrayList);
        try {
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("engines");
            if (jSONObjectOptJSONObject3 != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject3.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    EYQ EYQ = EYQ(jSONObjectOptJSONObject3.optJSONObject(next));
                    if (EYQ != null) {
                        eyq.EYQ().put(next, EYQ);
                    }
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
        if (jSONObject.has("resources_archive") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("resources_archive")) != null) {
            mZx mzx = new mZx();
            mzx.EYQ(jSONObjectOptJSONObject.optString("url"));
            mzx.mZx(jSONObjectOptJSONObject.optString("md5"));
            JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject.optJSONObject("map");
            if (jSONObjectOptJSONObject4 != null) {
                Iterator<String> itKeys2 = jSONObjectOptJSONObject4.keys();
                ArrayList arrayList2 = new ArrayList();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    arrayList2.add(new Pair<>(next2, jSONObjectOptJSONObject4.optString(next2)));
                }
                mzx.EYQ(arrayList2);
            }
            eyq.EYQ(mzx);
        }
        if (eyq.VwS()) {
            return eyq;
        }
        return null;
    }
}
