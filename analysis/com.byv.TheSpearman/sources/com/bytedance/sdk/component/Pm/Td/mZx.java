package com.bytedance.sdk.component.Pm.Td;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.Pm.KO;
import com.bytedance.sdk.component.Pm.Td.Td;
import com.bytedance.sdk.component.Pm.hYh;
import com.bytedance.sdk.component.Pm.pi;
import com.bytedance.sdk.component.Pm.tp;
import com.bytedance.sdk.openadsdk.ats.ATS;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: ImageLoader.java */
@ATS(single = true, value = {"img_service"})
/* loaded from: classes2.dex */
public class mZx implements KO {
    private volatile IPb EYQ;

    private mZx() {
    }

    public static KO EYQ(Context context, pi piVar) {
        mZx mzx = new mZx();
        mzx.mZx(context, piVar);
        return mzx;
    }

    private void mZx(Context context, pi piVar) {
        if (this.EYQ != null) {
            Log.w("ImageLoader", "already init!");
        }
        if (piVar == null) {
            piVar = Kbd.EYQ(context);
        }
        this.EYQ = new IPb(context, piVar);
    }

    @Override // com.bytedance.sdk.component.Pm.KO
    public tp EYQ(String str) {
        return new Td.mZx(this.EYQ).Td(str);
    }

    @Override // com.bytedance.sdk.component.Pm.KO
    public InputStream EYQ(String str, String str2) throws NoSuchAlgorithmException {
        if (this.EYQ != null) {
            if (TextUtils.isEmpty(str2)) {
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                str2 = com.bytedance.sdk.component.Pm.Td.Td.Td.EYQ(str);
            }
            Collection<hYh> collectionMZx = this.EYQ.mZx();
            if (collectionMZx != null) {
                Iterator<hYh> it = collectionMZx.iterator();
                while (it.hasNext()) {
                    byte[] bArrEYQ = it.next().EYQ(str2);
                    if (bArrEYQ != null) {
                        return new ByteArrayInputStream(bArrEYQ);
                    }
                }
            }
            Collection<com.bytedance.sdk.component.Pm.Td> collectionTd = this.EYQ.Td();
            if (collectionTd != null) {
                Iterator<com.bytedance.sdk.component.Pm.Td> it2 = collectionTd.iterator();
                while (it2.hasNext()) {
                    InputStream inputStreamEYQ = it2.next().EYQ(str2);
                    if (inputStreamEYQ != null) {
                        return inputStreamEYQ;
                    }
                }
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.Pm.KO
    public boolean EYQ(String str, String str2, String str3) throws NoSuchAlgorithmException {
        if (this.EYQ == null || TextUtils.isEmpty(str3)) {
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            str2 = com.bytedance.sdk.component.Pm.Td.Td.Td.EYQ(str);
        }
        com.bytedance.sdk.component.Pm.Td tdEYQ = this.EYQ.EYQ(str3);
        if (tdEYQ != null) {
            return tdEYQ.mZx(str2);
        }
        return false;
    }
}
