package com.bykv.vk.openvk.component.video.EYQ.mZx;

import android.content.Context;
import android.util.Log;
import com.bykv.vk.openvk.component.video.EYQ.mZx.EYQ.Td;
import com.bytedance.sdk.component.utils.pi;
import java.util.Set;

/* compiled from: Proxy.java */
/* loaded from: classes.dex */
public class Kbd {
    static volatile com.bykv.vk.openvk.component.video.EYQ.mZx.EYQ.mZx EYQ;
    public static volatile Integer HX;
    static volatile boolean IPb;
    private static volatile Context MxO;
    public static volatile boolean Pm;
    static volatile com.bykv.vk.openvk.component.video.EYQ.mZx.EYQ.Td mZx;
    private static volatile com.bykv.vk.openvk.component.video.EYQ.mZx.mZx.Td tp;
    public static final boolean Td = pi.Pm();
    static volatile boolean Kbd = true;
    static volatile int VwS = 0;
    public static volatile int QQ = 3;

    public static Context EYQ() {
        return MxO;
    }

    public static void EYQ(boolean z) {
        Kbd = z;
    }

    public static void mZx(boolean z) {
        IPb = z;
    }

    public static void EYQ(int i) {
        VwS = i;
    }

    public static void EYQ(com.bykv.vk.openvk.component.video.EYQ.mZx.EYQ.Td td, Context context) {
        if (td == null || context == null) {
            throw new IllegalArgumentException("DiskLruCache and Context can't be null !!!");
        }
        MxO = context.getApplicationContext();
        if (mZx != null) {
            return;
        }
        if (EYQ != null) {
            throw null;
        }
        mZx = td;
        tp = com.bykv.vk.openvk.component.video.EYQ.mZx.mZx.Td.EYQ(context);
        mZx.EYQ(new Td.EYQ() { // from class: com.bykv.vk.openvk.component.video.EYQ.mZx.Kbd.1
            @Override // com.bykv.vk.openvk.component.video.EYQ.mZx.EYQ.Td.EYQ
            public void EYQ(String str) {
                if (Kbd.Td) {
                    Log.i("TAG_PROXY_DiskLruCache", "new cache created: ".concat(String.valueOf(str)));
                }
            }

            @Override // com.bykv.vk.openvk.component.video.EYQ.mZx.EYQ.Td.EYQ
            public void EYQ(Set<String> set) {
                Kbd.tp.EYQ(set, 0);
                if (Kbd.Td) {
                    Log.i("TAG_PROXY_DiskLruCache", "cache file removed, ".concat(String.valueOf(set)));
                }
            }
        });
        IPb iPbEYQ = IPb.EYQ();
        iPbEYQ.EYQ(td);
        iPbEYQ.EYQ(tp);
        Pm pmTd = Pm.Td();
        pmTd.EYQ(td);
        pmTd.EYQ(tp);
    }

    public static com.bykv.vk.openvk.component.video.EYQ.mZx.EYQ.Td mZx() {
        return mZx;
    }

    public static com.bykv.vk.openvk.component.video.EYQ.mZx.EYQ.mZx Td() {
        return EYQ;
    }
}
