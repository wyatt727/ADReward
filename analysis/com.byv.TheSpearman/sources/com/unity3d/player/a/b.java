package com.unity3d.player.a;

/* loaded from: classes4.dex */
class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String[] f4389a;
    final /* synthetic */ d b;

    b(d dVar, String[] strArr) {
        this.b = dVar;
        this.f4389a = strArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        d dVar = this.b;
        String[] strArr = this.f4389a;
        dVar.getClass();
        for (String str : strArr) {
            dVar.f4391a.onPermissionDenied(str);
        }
    }
}
