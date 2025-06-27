package com.my.target;

import com.my.target.common.models.AudioData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class a3 extends q {
    public final HashMap<String, c5<AudioData>> b;

    public a3() {
        HashMap<String, c5<AudioData>> map = new HashMap<>();
        this.b = map;
        map.put("preroll", c5.a("preroll"));
        map.put("pauseroll", c5.a("pauseroll"));
        map.put("midroll", c5.a("midroll"));
        map.put("postroll", c5.a("postroll"));
    }

    public static a3 e() {
        return new a3();
    }

    @Override // com.my.target.q
    public int a() {
        Iterator<c5<AudioData>> it = this.b.values().iterator();
        int iA = 0;
        while (it.hasNext()) {
            iA += it.next().a();
        }
        return iA;
    }

    public c5<AudioData> a(String str) {
        return this.b.get(str);
    }

    public ArrayList<c5<AudioData>> c() {
        return new ArrayList<>(this.b.values());
    }

    public boolean d() {
        for (c5<AudioData> c5Var : this.b.values()) {
            if (c5Var.a() > 0 || c5Var.i()) {
                return true;
            }
        }
        return false;
    }
}
