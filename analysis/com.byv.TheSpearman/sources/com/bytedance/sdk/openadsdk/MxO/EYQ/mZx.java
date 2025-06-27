package com.bytedance.sdk.openadsdk.MxO.EYQ;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.utils.Pm;
import com.bytedance.sdk.component.utils.pi;
import java.util.List;
import java.util.Map;

/* compiled from: GifRequestResult.java */
/* loaded from: classes2.dex */
public class mZx {
    int EYQ;
    private Map<String, String> IPb;
    private List<Object> Kbd;
    private Bitmap Pm;
    private Bitmap Td;
    private byte[] mZx;

    public mZx(byte[] bArr, int i) {
        this.mZx = null;
        this.Td = null;
        this.Pm = null;
        this.Kbd = null;
        this.IPb = null;
        this.mZx = bArr;
        this.EYQ = i;
    }

    public mZx(Bitmap bitmap, Bitmap bitmap2, int i) {
        this.mZx = null;
        this.Td = null;
        this.Pm = null;
        this.Kbd = null;
        this.IPb = null;
        this.Pm = bitmap2;
        this.Td = bitmap;
        this.EYQ = i;
    }

    public Bitmap EYQ() {
        return this.Td;
    }

    public Bitmap mZx() {
        return this.Pm;
    }

    public byte[] Td() {
        try {
            if (this.mZx == null) {
                this.mZx = Pm.EYQ(this.Td);
            }
        } catch (OutOfMemoryError e) {
            pi.EYQ("GifRequestResult", e.getMessage());
        }
        return this.mZx;
    }

    public boolean Pm() {
        if (this.Td != null) {
            return true;
        }
        byte[] bArr = this.mZx;
        return bArr != null && bArr.length > 0;
    }
}
