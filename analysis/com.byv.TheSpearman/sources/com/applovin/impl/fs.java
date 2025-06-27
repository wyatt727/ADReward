package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class fs {
    public static final fs f = new fs();

    /* renamed from: a, reason: collision with root package name */
    private final fs f442a;
    private final String b;
    private final Map c;
    protected String d;
    protected final List e;

    public String toString() {
        return "XmlNode{elementName='" + this.b + "', text='" + this.d + "', attributes=" + this.c + AbstractJsonLexerKt.END_OBJ;
    }

    private fs() {
        this.f442a = null;
        this.b = "";
        this.c = Collections.emptyMap();
        this.d = "";
        this.e = Collections.emptyList();
    }

    public String c() {
        return this.b;
    }

    public fs(String str, Map map, fs fsVar) {
        this.f442a = fsVar;
        this.b = str;
        this.c = Collections.unmodifiableMap(map);
        this.e = new ArrayList();
    }

    public String d() {
        return this.d;
    }

    public List b() {
        return Collections.unmodifiableList(this.e);
    }

    public List a(String str) {
        if (str != null) {
            ArrayList arrayList = new ArrayList(this.e.size());
            for (fs fsVar : this.e) {
                if (str.equalsIgnoreCase(fsVar.c())) {
                    arrayList.add(fsVar);
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException("No name specified.");
    }

    public Map a() {
        return this.c;
    }

    public fs c(String str) {
        if (str != null) {
            for (fs fsVar : this.e) {
                if (str.equalsIgnoreCase(fsVar.c())) {
                    return fsVar;
                }
            }
            return null;
        }
        throw new IllegalArgumentException("No name specified.");
    }

    public fs b(String str) {
        if (str != null) {
            if (this.e.size() <= 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(this);
            while (!arrayList.isEmpty()) {
                fs fsVar = (fs) arrayList.get(0);
                arrayList.remove(0);
                if (str.equalsIgnoreCase(fsVar.c())) {
                    return fsVar;
                }
                arrayList.addAll(fsVar.b());
            }
            return null;
        }
        throw new IllegalArgumentException("No name specified.");
    }
}
