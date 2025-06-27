package com.bykv.vk.openvk.component.video.EYQ;

import android.content.Context;
import android.os.Build;
import com.bykv.vk.openvk.component.video.api.EYQ.mZx;
import org.json.JSONObject;

/* compiled from: MediaConfig.java */
/* loaded from: classes.dex */
public class EYQ {
    public static int EYQ = 10;
    private static mZx Kbd = null;
    public static int Pm = 10;
    public static int Td = 10;
    public static int mZx = 10;

    public static void EYQ(Context context) {
        com.bykv.vk.openvk.component.video.api.IPb.EYQ.EYQ(context);
        if (Build.VERSION.SDK_INT < 23) {
            com.bykv.vk.openvk.component.video.EYQ.mZx.IPb.EYQ.EYQ();
        }
    }

    public static void EYQ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            EYQ = jSONObject.optInt("splash", 10);
            mZx = jSONObject.optInt("reward", 10);
            Td = jSONObject.optInt("brand", 10);
            int iOptInt = jSONObject.optInt("other", 10);
            Pm = iOptInt;
            if (EYQ < 0) {
                EYQ = 10;
            }
            if (mZx < 0) {
                mZx = 10;
            }
            if (Td < 0) {
                Td = 10;
            }
            if (iOptInt < 0) {
                Pm = 10;
            }
            Integer.valueOf(EYQ);
            Integer.valueOf(mZx);
            Integer.valueOf(Td);
            Integer.valueOf(Pm);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public static void EYQ(mZx mzx) {
        Kbd = mzx;
    }

    public static void EYQ() {
        mZx mzx = Kbd;
        if (mzx != null) {
            mzx.Pm();
        }
    }

    public static int mZx() {
        return EYQ;
    }

    public static int Td() {
        return mZx;
    }

    public static int Pm() {
        return Td;
    }

    public static int Kbd() {
        return Pm;
    }
}
