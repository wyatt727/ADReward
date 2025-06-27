package com.json;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes4.dex */
public class k0 implements Parcelable {
    public static final Parcelable.Creator<k0> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private String f1835a;
    private String b;
    private String c;
    private boolean d;
    private int e;
    private ArrayList<String> f;
    private ArrayList<String> g;
    private ArrayList<String> h;
    private ArrayList<String> i;
    private String j;
    private String k;
    private Map<String, String> l;
    private boolean m;
    private boolean n;
    private Map<String, String> o;

    class a implements Parcelable.Creator<k0> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public k0 createFromParcel(Parcel parcel) {
            return new k0(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public k0[] newArray(int i) {
            return new k0[i];
        }
    }

    public k0() {
        k();
    }

    private k0(Parcel parcel) {
        k();
        try {
            boolean z = true;
            this.d = parcel.readByte() != 0;
            this.e = parcel.readInt();
            this.f1835a = parcel.readString();
            this.b = parcel.readString();
            this.c = parcel.readString();
            this.j = parcel.readString();
            this.k = parcel.readString();
            this.l = a(parcel.readString());
            this.n = parcel.readByte() != 0;
            if (parcel.readByte() == 0) {
                z = false;
            }
            this.m = z;
            this.o = a(parcel.readString());
        } catch (Throwable unused) {
            k();
        }
    }

    /* synthetic */ k0(Parcel parcel, a aVar) {
        this(parcel);
    }

    private Map<String, String> a(String str) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return map;
    }

    private void k() {
        this.d = false;
        this.e = -1;
        this.f = new ArrayList<>();
        this.g = new ArrayList<>();
        this.h = new ArrayList<>();
        this.i = new ArrayList<>();
        this.m = true;
        this.n = false;
        this.k = "";
        this.j = "";
        this.l = new HashMap();
        this.o = new HashMap();
    }

    public void a() {
        this.e = -1;
    }

    public void a(int i) {
        this.e = i;
    }

    public void a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!z) {
            this.g.remove(str);
        } else if (this.g.indexOf(str) == -1) {
            this.g.add(str);
        }
    }

    public void a(Map<String, String> map) {
        this.l = map;
    }

    public void a(boolean z) {
        this.n = z;
    }

    public String b() {
        return this.c;
    }

    public void b(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!z) {
            this.i.remove(str);
        } else if (this.i.indexOf(str) == -1) {
            this.i.add(str);
        }
    }

    public void b(Map<String, String> map) {
        this.o = map;
    }

    public void b(boolean z) {
        this.m = z;
    }

    public boolean b(String str) {
        return !TextUtils.isEmpty(str) && this.g.indexOf(str) > -1;
    }

    public int c() {
        return this.e;
    }

    public void c(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!z) {
            this.f.remove(str);
        } else if (this.f.indexOf(str) == -1) {
            this.f.add(str);
        }
    }

    public void c(boolean z) {
        this.d = z;
    }

    public boolean c(String str) {
        return !TextUtils.isEmpty(str) && this.i.indexOf(str) > -1;
    }

    public String d() {
        return this.j;
    }

    public void d(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!z) {
            this.h.remove(str);
        } else if (this.h.indexOf(str) == -1) {
            this.h.add(str);
        }
    }

    public boolean d(String str) {
        return !TextUtils.isEmpty(str) && this.f.indexOf(str) > -1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Map<String, String> e() {
        return this.l;
    }

    public boolean e(String str) {
        return !TextUtils.isEmpty(str) && this.h.indexOf(str) > -1;
    }

    public String f() {
        return this.k;
    }

    public void f(String str) {
        this.c = str;
    }

    public Map<String, String> g() {
        return this.o;
    }

    public void g(String str) {
        this.j = str;
    }

    public void h(String str) {
        this.k = str;
    }

    public boolean h() {
        return this.n;
    }

    public String i() {
        return this.f1835a;
    }

    public void i(String str) {
        this.f1835a = str;
    }

    public String j() {
        return this.b;
    }

    public void j(String str) {
        this.b = str;
    }

    public boolean l() {
        return this.m;
    }

    public boolean m() {
        return this.d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("shouldRestore:");
            sb.append(this.d);
            sb.append(", ");
            sb.append("displayedProduct:");
            sb.append(this.e);
            sb.append(", ");
            sb.append("ISReportInit:");
            sb.append(this.f);
            sb.append(", ");
            sb.append("ISInitSuccess:");
            sb.append(this.g);
            sb.append(", ");
            sb.append("ISAppKey");
            sb.append(this.j);
            sb.append(", ");
            sb.append("ISUserId");
            sb.append(this.k);
            sb.append(", ");
            sb.append("ISExtraParams");
            sb.append(this.l);
            sb.append(", ");
            sb.append("OWReportInit");
            sb.append(this.m);
            sb.append(", ");
            sb.append("OWInitSuccess");
            sb.append(this.n);
            sb.append(", ");
            sb.append("OWExtraParams");
            sb.append(this.o);
            sb.append(", ");
        } catch (Throwable unused) {
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        try {
            parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.e);
            parcel.writeString(this.f1835a);
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.j);
            parcel.writeString(this.k);
            parcel.writeString(new JSONObject(this.l).toString());
            parcel.writeByte(this.n ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.m ? (byte) 1 : (byte) 0);
            parcel.writeString(new JSONObject(this.o).toString());
        } catch (Throwable unused) {
        }
    }
}
