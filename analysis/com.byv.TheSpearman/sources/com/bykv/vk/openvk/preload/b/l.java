package com.bykv.vk.openvk.preload.b;

import com.bykv.vk.openvk.preload.b.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: SubBranchInterceptor.java */
/* loaded from: classes2.dex */
public abstract class l<IN, OUT> extends d<IN, OUT> {
    Map<String, a> g;

    l() {
    }

    static boolean a(List<h> list) {
        return !list.isEmpty() && list.get(list.size() - 1).f1377a == f.class;
    }

    @Override // com.bykv.vk.openvk.preload.b.d
    protected final void a(Object... objArr) {
        super.a(objArr);
        if (objArr == null || objArr.length != 1 || objArr[0] == null) {
            throw new IllegalStateException("args error");
        }
        try {
            this.g = (Map) objArr[0];
        } catch (ClassCastException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* compiled from: SubBranchInterceptor.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Map<String, a> f1381a = new HashMap();
        private com.bykv.vk.openvk.preload.b.b.a b;

        public final a a(String str) {
            if (this.f1381a.containsKey(str)) {
                throw new IllegalArgumentException("duplicated branch name");
            }
            a aVar = new a();
            this.f1381a.put(str, aVar);
            return aVar;
        }

        public final h a(Class<? extends l> cls) {
            h.a aVarA = new h.a().a(cls);
            aVarA.c = new Object[]{this.f1381a};
            aVarA.b = this.b;
            return aVarA.a();
        }
    }

    /* compiled from: SubBranchInterceptor.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        List<h> f1380a = new ArrayList();

        public final a a(h hVar) {
            this.f1380a.add(hVar);
            return this;
        }

        public final a a(List<h> list) {
            this.f1380a.addAll(list);
            return this;
        }
    }
}
