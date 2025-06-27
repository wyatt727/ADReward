package com.bykv.vk.openvk.preload.b;

import com.bykv.vk.openvk.preload.b.l;
import java.util.List;

/* compiled from: BranchInterceptor.java */
/* loaded from: classes2.dex */
public abstract class a<IN, OUT> extends l<IN, OUT> {
    protected abstract String a(IN in);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.vk.openvk.preload.b.d
    public final Object a(b<OUT> bVar, IN in) throws Exception {
        new m(bVar);
        String strA = a((a<IN, OUT>) in);
        l.a aVar = this.g.get(strA);
        if (aVar == null) {
            throw new IllegalArgumentException("can not found branch, branch name is：".concat(String.valueOf(strA)));
        }
        List<h> list = aVar.f1380a;
        Object objA = c.a(list, ((i) bVar).f1379a, this).a((b) in);
        return !a(list) ? objA : bVar.a((b<OUT>) objA);
    }
}
