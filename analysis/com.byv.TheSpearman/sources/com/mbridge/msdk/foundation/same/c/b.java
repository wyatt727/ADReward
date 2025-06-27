package com.mbridge.msdk.foundation.same.c;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.c.d;
import com.mbridge.msdk.foundation.same.c.e;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ah;
import com.mbridge.msdk.foundation.tools.ai;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

/* compiled from: CommonImageLoader.java */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static b f2831a;
    private com.mbridge.msdk.foundation.same.a.c<String, Bitmap> c;
    private com.mbridge.msdk.foundation.same.e.b e;
    private LinkedHashMap<String, List<c>> b = new LinkedHashMap<>();
    private Handler d = new Handler(Looper.getMainLooper()) { // from class: com.mbridge.msdk.foundation.same.c.b.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            try {
                if (message.what == 1) {
                    String string = message.getData().getString("message_key");
                    Bitmap bitmapA = a.a(message.getData().getString("message_bitmap"));
                    b.this.a(string, bitmapA);
                    LinkedList linkedList = (LinkedList) b.this.b.get(string);
                    if (linkedList != null) {
                        Iterator it = linkedList.iterator();
                        while (it.hasNext()) {
                            c cVar = (c) it.next();
                            if (cVar != null) {
                                cVar.onSuccessLoad(bitmapA, string);
                            }
                        }
                    }
                    b.this.b.remove(string);
                    return;
                }
                if (message.what == 2) {
                    String string2 = message.getData().getString("message_key");
                    String string3 = message.getData().getString("message_message");
                    LinkedList linkedList2 = (LinkedList) b.this.b.get(string2);
                    if (linkedList2 != null) {
                        Iterator it2 = linkedList2.iterator();
                        while (it2.hasNext()) {
                            c cVar2 = (c) it2.next();
                            if (cVar2 != null) {
                                cVar2.onFailedLoad(string3, string2);
                            }
                        }
                    }
                    b.this.b.remove(string2);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    };

    private b(Context context) {
        this.e = new com.mbridge.msdk.foundation.same.e.b(context);
        com.mbridge.msdk.c.g gVarA = com.mbridge.msdk.c.h.a().a(com.mbridge.msdk.foundation.controller.c.m().k());
        int iQ = gVarA != null ? gVarA.Q() : 10;
        this.c = new com.mbridge.msdk.foundation.same.a.a(((int) Runtime.getRuntime().maxMemory()) / (iQ > 0 ? iQ : 10));
    }

    public static b a(Context context) {
        if (f2831a == null) {
            f2831a = new b(context);
        }
        return f2831a;
    }

    public final Bitmap b(String str) {
        Bitmap bitmapA;
        if (ai.k(str)) {
            return null;
        }
        if (g.c()) {
            return d.a.f2841a.a(str);
        }
        String strA = ah.a(str);
        File file = new File(strA);
        if (d(str) != null) {
            return d(str);
        }
        if (!file.exists() || (bitmapA = a.a(strA)) == null) {
            return null;
        }
        a(str, bitmapA);
        return bitmapA;
    }

    private Bitmap d(String str) {
        return this.c.b(str);
    }

    public final void a(String str, Bitmap bitmap) {
        if (d(str) != null || bitmap == null) {
            return;
        }
        this.c.a(str, bitmap);
    }

    public final boolean c(String str) {
        if (ai.k(str)) {
            return false;
        }
        if (g.c()) {
            return d.a.f2841a.b(str);
        }
        File file = new File(ah.a(str));
        if (d(str) != null) {
            return true;
        }
        return file.exists() && file.isFile() && file.length() > 1;
    }

    private void a(String str, String str2, String str3, boolean z, boolean z2, c cVar) {
        if (!this.b.containsKey(str2)) {
            LinkedList linkedList = new LinkedList();
            linkedList.add(cVar);
            this.b.put(str2, linkedList);
            e.a aVar = new e.a() { // from class: com.mbridge.msdk.foundation.same.c.b.6
                @Override // com.mbridge.msdk.foundation.same.c.e.a
                public final void a(String str4, String str5) {
                    Message messageObtainMessage = b.this.d.obtainMessage();
                    messageObtainMessage.what = 1;
                    Bundle bundle = new Bundle();
                    bundle.putString("message_key", str4);
                    bundle.putString("message_bitmap", str5);
                    messageObtainMessage.setData(bundle);
                    b.this.d.sendMessage(messageObtainMessage);
                }

                @Override // com.mbridge.msdk.foundation.same.c.e.a
                public final void b(String str4, String str5) {
                    Message messageObtainMessage = b.this.d.obtainMessage();
                    messageObtainMessage.what = 2;
                    Bundle bundle = new Bundle();
                    bundle.putString("message_key", str4);
                    bundle.putString("message_message", str5);
                    messageObtainMessage.setData(bundle);
                    b.this.d.sendMessage(messageObtainMessage);
                }
            };
            e eVar = new e(str, str2, str3);
            eVar.a(z);
            eVar.a(aVar);
            this.e.a(eVar);
            return;
        }
        LinkedList linkedList2 = (LinkedList) this.b.get(str2);
        if (linkedList2 == null || linkedList2.contains(cVar)) {
            return;
        }
        linkedList2.add(cVar);
    }

    public static void a() {
        if (g.c()) {
            return;
        }
        f2831a.b();
    }

    public final void b() {
        com.mbridge.msdk.foundation.same.a.c<String, Bitmap> cVar;
        if (g.c() || (cVar = this.c) == null) {
            return;
        }
        cVar.b();
    }

    public final void c() {
        if (g.c()) {
            return;
        }
        this.c.b();
        LinkedHashMap<String, List<c>> linkedHashMap = this.b;
        if (linkedHashMap != null) {
            linkedHashMap.clear();
        }
    }

    public final void a(String str) {
        if (g.c()) {
            return;
        }
        try {
            com.mbridge.msdk.foundation.same.a.c<String, Bitmap> cVar = this.c;
            if (cVar == null || !cVar.a().contains(str)) {
                return;
            }
            this.c.a(str);
        } catch (Throwable th) {
            ad.b("ImageLoader", th.getMessage());
        }
    }

    public final void a(final String str, final c cVar) {
        if (g.c()) {
            d.a.f2841a.a(str, null, cVar);
            return;
        }
        final String strA = ah.a(str);
        if (g.b()) {
            final boolean z = false;
            if (ai.k(str) || ai.k(str) || ai.k(strA)) {
                return;
            }
            if (g.c()) {
                d.a.f2841a.a(str, null, cVar);
                return;
            }
            final h hVar = null;
            g.a().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.same.c.b.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (new File(strA).exists()) {
                        Bitmap bitmapA = a.a(strA);
                        if (bitmapA != null && !bitmapA.isRecycled()) {
                            h hVar2 = hVar;
                            if (hVar2 != null) {
                                try {
                                    Bitmap bitmapA2 = hVar2.a(bitmapA);
                                    if (bitmapA2 != null) {
                                        b.a(b.this, str, bitmapA2, cVar);
                                    } else {
                                        b.a(b.this, str, "image transform failed", cVar);
                                    }
                                    return;
                                } catch (Exception unused) {
                                    b.a(b.this, str, "image transform failed", cVar);
                                    return;
                                }
                            }
                            b.a(b.this, str, bitmapA, cVar);
                            return;
                        }
                        b.a(b.this, str, str, strA, true, z, cVar, hVar);
                        return;
                    }
                    b.a(b.this, str, str, strA, false, z, cVar, hVar);
                }
            });
            return;
        }
        if (ai.k(str) || ai.k(str) || ai.k(strA)) {
            return;
        }
        if (g.c()) {
            d.a.f2841a.a(str, null, cVar);
            return;
        }
        File file = new File(strA);
        Bitmap bitmapD = d(str);
        if (bitmapD != null && !bitmapD.isRecycled()) {
            cVar.onSuccessLoad(bitmapD, str);
            return;
        }
        if (file.exists()) {
            Bitmap bitmapA = a.a(strA);
            if (bitmapA != null && !bitmapA.isRecycled()) {
                a(str, bitmapA);
                cVar.onSuccessLoad(bitmapA, str);
                return;
            } else {
                a(str, str, strA, true, false, cVar);
                return;
            }
        }
        a(str, str, strA, false, false, cVar);
    }

    static /* synthetic */ void a(b bVar, final String str, final Bitmap bitmap, final c cVar) {
        if (MBridgeConstans.DEBUG) {
            ad.a("ImageLoader", "handler image load success event");
        }
        if (cVar == null) {
            return;
        }
        bVar.d.post(new Runnable() { // from class: com.mbridge.msdk.foundation.same.c.b.3
            @Override // java.lang.Runnable
            public final void run() {
                c cVar2 = cVar;
                if (cVar2 != null) {
                    cVar2.onSuccessLoad(bitmap, str);
                    try {
                        LinkedList linkedList = (LinkedList) b.this.b.get(str);
                        if (linkedList != null) {
                            linkedList.remove(cVar);
                            Iterator it = linkedList.iterator();
                            while (it.hasNext()) {
                                c cVar3 = (c) it.next();
                                if (cVar3 != null) {
                                    cVar3.onSuccessLoad(bitmap, str);
                                }
                            }
                        }
                        b.this.b.remove(str);
                    } catch (Throwable th) {
                        ad.b("ImageLoader", th.getMessage());
                    }
                }
            }
        });
    }

    static /* synthetic */ void a(b bVar, final String str, final String str2, final c cVar) {
        if (MBridgeConstans.DEBUG) {
            ad.a("ImageLoader", "handler image load failed event");
        }
        if (cVar == null) {
            return;
        }
        bVar.d.post(new Runnable() { // from class: com.mbridge.msdk.foundation.same.c.b.4
            @Override // java.lang.Runnable
            public final void run() {
                c cVar2 = cVar;
                if (cVar2 != null) {
                    cVar2.onFailedLoad(str2, str);
                    try {
                        LinkedList linkedList = (LinkedList) b.this.b.get(str);
                        if (linkedList != null) {
                            linkedList.remove(cVar);
                            Iterator it = linkedList.iterator();
                            while (it.hasNext()) {
                                c cVar3 = (c) it.next();
                                if (cVar3 != null) {
                                    cVar3.onFailedLoad(str2, str);
                                }
                            }
                        }
                        b.this.b.remove(str);
                    } catch (Throwable th) {
                        ad.b("ImageLoader", th.getMessage());
                    }
                }
            }
        });
    }

    static /* synthetic */ void a(b bVar, final String str, String str2, String str3, boolean z, boolean z2, final c cVar, final h hVar) {
        if (!bVar.b.containsKey(str2)) {
            LinkedList linkedList = new LinkedList();
            linkedList.add(cVar);
            bVar.b.put(str2, linkedList);
            e.a aVar = new e.a() { // from class: com.mbridge.msdk.foundation.same.c.b.5
                @Override // com.mbridge.msdk.foundation.same.c.e.a
                public final void a(String str4, String str5) {
                    Bitmap bitmapA = a.a(str5);
                    if (bitmapA != null && !bitmapA.isRecycled()) {
                        h hVar2 = hVar;
                        if (hVar2 != null) {
                            try {
                                Bitmap bitmapA2 = hVar2.a(bitmapA);
                                if (bitmapA2 != null) {
                                    b.a(b.this, str, bitmapA2, cVar);
                                } else {
                                    b.a(b.this, str, "bitmap transform failed", cVar);
                                }
                                return;
                            } catch (Exception unused) {
                                b.a(b.this, str, "bitmap transform failed", cVar);
                                return;
                            }
                        }
                        b.a(b.this, str, bitmapA, cVar);
                        return;
                    }
                    b.a(b.this, str, "bitmap file not found", cVar);
                }

                @Override // com.mbridge.msdk.foundation.same.c.e.a
                public final void b(String str4, String str5) {
                    b.a(b.this, str, str5, cVar);
                }
            };
            e eVar = new e(str, str2, str3, hVar);
            eVar.a(z);
            eVar.a(aVar);
            com.mbridge.msdk.foundation.same.f.b.d().execute(eVar);
            return;
        }
        LinkedList linkedList2 = (LinkedList) bVar.b.get(str2);
        if (linkedList2 == null || linkedList2.contains(cVar)) {
            return;
        }
        linkedList2.add(cVar);
    }
}
