package com.apm.insight.runtime;

import com.apm.insight.entity.Header;

/* loaded from: classes.dex */
public class f {
    private static final f b = new f() { // from class: com.apm.insight.runtime.f.1

        /* renamed from: a, reason: collision with root package name */
        Header f136a = null;

        @Override // com.apm.insight.runtime.f
        public Object b(String str) {
            if (this.f136a == null) {
                this.f136a = Header.b(com.apm.insight.i.g());
            }
            return this.f136a.f().opt(str);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private f f135a;

    f() {
        this(b);
    }

    f(f fVar) {
        this.f135a = null;
        this.f135a = fVar;
    }

    public Object a(String str) {
        f fVar = this.f135a;
        if (fVar != null) {
            return fVar.a(str);
        }
        return null;
    }

    public Object b(String str) {
        f fVar = this.f135a;
        if (fVar != null) {
            return fVar.b(str);
        }
        return null;
    }
}
