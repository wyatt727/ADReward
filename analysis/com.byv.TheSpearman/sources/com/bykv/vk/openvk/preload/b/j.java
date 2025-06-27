package com.bykv.vk.openvk.preload.b;

import com.bykv.vk.openvk.preload.b.i;
import com.bykv.vk.openvk.preload.b.l;
import java.util.List;

/* compiled from: RetryBranchInterceptor.java */
/* loaded from: classes2.dex */
public abstract class j<IN, OUT> extends l<IN, OUT> {
    private String h;

    protected abstract String a(IN in);

    protected abstract String a(IN in, Throwable th, String str);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.vk.openvk.preload.b.d
    public final Object a(b<OUT> bVar, IN in) throws Throwable {
        new m(bVar);
        this.h = a((j<IN, OUT>) in);
        l.a aVar = this.g.get(this.h);
        while (aVar != null) {
            List<h> list = aVar.f1380a;
            try {
                Object objA = c.a(list, bVar.f1379a, this).a((b) in);
                return !a(list) ? objA : bVar.a((b<OUT>) objA);
            } catch (i.a e) {
                Throwable cause = e.getCause();
                new m(bVar);
                this.h = a(in, cause, this.h);
                aVar = this.g.get(this.h);
            } catch (Throwable th) {
                new m(bVar);
                this.h = a(in, th, this.h);
                aVar = this.g.get(this.h);
            }
        }
        throw new IllegalArgumentException("can not found branch，branch name is：" + this.h);
    }
}
