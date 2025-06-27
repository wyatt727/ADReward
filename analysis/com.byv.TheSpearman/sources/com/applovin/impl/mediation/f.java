package com.applovin.impl.mediation;

import android.text.TextUtils;
import com.applovin.impl.be;
import com.applovin.impl.ke;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapters.MediationAdapterBase;
import com.applovin.sdk.AppLovinSdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class f {
    private final k b;
    private final t c;

    /* renamed from: a, reason: collision with root package name */
    private final Map f688a = Collections.synchronizedMap(new HashMap(16));
    private final Object d = new Object();
    private final Map e = new HashMap();
    private final Set f = new HashSet();
    private final Object g = new Object();
    private final Set h = new HashSet();

    public f(k kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.b = kVar;
        this.c = kVar.L();
    }

    public Collection b() {
        Set setUnmodifiableSet;
        synchronized (this.d) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.f);
        }
        return setUnmodifiableSet;
    }

    public Collection c() {
        Set setUnmodifiableSet;
        synchronized (this.d) {
            HashSet hashSet = new HashSet(this.e.size());
            Iterator it = this.e.values().iterator();
            while (it.hasNext()) {
                hashSet.add(((Class) it.next()).getName());
            }
            setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        }
        return setUnmodifiableSet;
    }

    public void a(String str, String str2, be beVar) {
        synchronized (this.g) {
            this.b.L();
            if (t.a()) {
                this.b.L().b("MediationAdapterManager", "Adding " + str + " to list of disabled adapters.");
            }
            this.h.add(new a(str, str2, beVar, this.b));
        }
    }

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f689a;
        private final String b;
        private final MaxAdFormat c;
        private final JSONObject d;

        JSONObject a() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.f689a.equals(aVar.f689a) || !this.b.equals(aVar.b)) {
                return false;
            }
            MaxAdFormat maxAdFormat = this.c;
            MaxAdFormat maxAdFormat2 = aVar.c;
            return maxAdFormat == null ? maxAdFormat2 == null : maxAdFormat.equals(maxAdFormat2);
        }

        public int hashCode() {
            int iHashCode = ((this.f689a.hashCode() * 31) + this.b.hashCode()) * 31;
            MaxAdFormat maxAdFormat = this.c;
            return iHashCode + (maxAdFormat != null ? maxAdFormat.hashCode() : 0);
        }

        public String toString() {
            return "DisabledAdapterInfo{className='" + this.f689a + "', operationTag='" + this.b + "', format=" + this.c + AbstractJsonLexerKt.END_OBJ;
        }

        a(String str, String str2, be beVar, k kVar) throws JSONException {
            this.f689a = str;
            this.b = str2;
            JSONObject jSONObject = new JSONObject();
            this.d = jSONObject;
            JsonUtils.putString(jSONObject, "class", str);
            JsonUtils.putString(jSONObject, "operation", str2);
            if (beVar != null) {
                this.c = beVar.getFormat();
                JsonUtils.putString(jSONObject, "format", beVar.getFormat().getLabel());
            } else {
                this.c = null;
            }
        }
    }

    g a(ke keVar) {
        return a(keVar, false);
    }

    g a(ke keVar, boolean z) {
        Class clsA;
        g gVar;
        if (keVar != null) {
            String strC = keVar.c();
            String strB = keVar.b();
            if (TextUtils.isEmpty(strC)) {
                if (t.a()) {
                    this.c.b("MediationAdapterManager", "No adapter name provided for " + strB + ", not loading the adapter ");
                }
                return null;
            }
            if (TextUtils.isEmpty(strB)) {
                if (t.a()) {
                    this.c.b("MediationAdapterManager", "Unable to find default className for '" + strC + "'");
                }
                return null;
            }
            if (z && (gVar = (g) this.f688a.get(strB)) != null) {
                return gVar;
            }
            synchronized (this.d) {
                if (!this.f.contains(strB)) {
                    if (this.e.containsKey(strB)) {
                        clsA = (Class) this.e.get(strB);
                    } else {
                        clsA = a(strB);
                        if (clsA == null) {
                            this.f.add(strB);
                            return null;
                        }
                    }
                    g gVarA = a(keVar, clsA, z);
                    if (gVarA != null) {
                        if (t.a()) {
                            this.c.a("MediationAdapterManager", "Loaded " + strC);
                        }
                        this.e.put(strB, clsA);
                        if (z) {
                            this.f688a.put(keVar.b(), gVarA);
                        }
                        return gVarA;
                    }
                    if (t.a()) {
                        this.c.b("MediationAdapterManager", "Failed to load " + strC);
                    }
                    this.f.add(strB);
                    return null;
                }
                if (t.a()) {
                    this.c.a("MediationAdapterManager", "Not attempting to load " + strC + " due to prior errors");
                }
                return null;
            }
        }
        throw new IllegalArgumentException("No adapter spec specified");
    }

    private g a(ke keVar, Class cls, boolean z) {
        try {
            return new g(keVar, (MediationAdapterBase) cls.getConstructor(AppLovinSdk.class).newInstance(this.b.v0()), z, this.b);
        } catch (Throwable th) {
            t.c("MediationAdapterManager", "Failed to load adapter: " + keVar, th);
            return null;
        }
    }

    public Collection a() {
        ArrayList arrayList;
        synchronized (this.g) {
            arrayList = new ArrayList(this.h.size());
            Iterator it = this.h.iterator();
            while (it.hasNext()) {
                arrayList.add(((a) it.next()).a());
            }
        }
        return arrayList;
    }

    private Class a(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (MaxAdapter.class.isAssignableFrom(cls)) {
                return cls.asSubclass(MaxAdapter.class);
            }
            t.h("MediationAdapterManager", str + " error: not an instance of '" + MaxAdapter.class.getName() + "'.");
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
