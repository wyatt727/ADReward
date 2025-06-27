package com.bykv.vk.openvk.component.video.EYQ.EYQ.mZx;

import android.content.Context;
import android.os.Build;
import com.bykv.vk.openvk.component.video.api.Kbd.EYQ;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: VideoFileManager.java */
/* loaded from: classes.dex */
public class Td {
    public static final ConcurrentHashMap<String, mZx> EYQ = new ConcurrentHashMap<>();

    public static synchronized void EYQ(Context context, com.bykv.vk.openvk.component.video.api.Td.Td td, EYQ.InterfaceC0064EYQ interfaceC0064EYQ) {
        if (td == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            ConcurrentHashMap<String, mZx> concurrentHashMap = EYQ;
            mZx mzx = concurrentHashMap.get(td.nWX());
            if (mzx == null) {
                mzx = new mZx(context, td);
                concurrentHashMap.put(td.nWX(), mzx);
                Integer.valueOf(td.Td());
                td.nWX();
            }
            mzx.EYQ(interfaceC0064EYQ);
        }
        Integer.valueOf(td.Td());
        td.nWX();
    }

    public static synchronized void EYQ(com.bykv.vk.openvk.component.video.api.Td.Td td) {
        if (Build.VERSION.SDK_INT >= 23) {
            mZx mzxRemove = EYQ.remove(td.nWX());
            if (mzxRemove != null) {
                mzxRemove.EYQ(true);
            }
            Integer.valueOf(td.Td());
            td.nWX();
        }
    }
}
