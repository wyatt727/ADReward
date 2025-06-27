package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.r;
import com.bykv.vk.openvk.preload.a.t;
import com.bykv.vk.openvk.preload.a.u;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* compiled from: TimeTypeAdapter.java */
/* loaded from: classes.dex */
public final class k extends t<Time> {

    /* renamed from: a, reason: collision with root package name */
    public static final u f1304a = new u() { // from class: com.bykv.vk.openvk.preload.a.b.a.k.1
        @Override // com.bykv.vk.openvk.preload.a.u
        public final <T> t<T> a(com.bykv.vk.openvk.preload.a.f fVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
            if (aVar.b == Time.class) {
                return new k();
            }
            return null;
        }
    };
    private final DateFormat b = new SimpleDateFormat("hh:mm:ss a");

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bykv.vk.openvk.preload.a.t
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public synchronized Time a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
        if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
            aVar.k();
            return null;
        }
        try {
            return new Time(this.b.parse(aVar.i()).getTime());
        } catch (ParseException e) {
            throw new r(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bykv.vk.openvk.preload.a.t
    public synchronized void a(com.bykv.vk.openvk.preload.a.d.c cVar, Time time) throws IOException {
        cVar.b(time == null ? null : this.b.format((Date) time));
    }
}
