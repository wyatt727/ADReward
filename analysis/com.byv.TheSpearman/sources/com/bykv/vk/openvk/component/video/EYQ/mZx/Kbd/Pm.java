package com.bykv.vk.openvk.component.video.EYQ.mZx.Kbd;

import android.text.TextUtils;
import com.bytedance.sdk.component.mZx.EYQ.KO;
import com.bytedance.sdk.component.mZx.EYQ.MxO;
import com.bytedance.sdk.component.mZx.EYQ.pi;
import java.io.IOException;
import java.util.Map;

/* compiled from: NetworkSoureVolleyImpl.java */
/* loaded from: classes.dex */
public class Pm implements mZx {
    private MxO EYQ;

    public Pm() {
        this.EYQ = null;
        this.EYQ = com.bykv.vk.openvk.component.video.api.Td.Pm();
    }

    @Override // com.bykv.vk.openvk.component.video.EYQ.mZx.Kbd.mZx
    public EYQ EYQ(Kbd kbd) throws IOException {
        pi.EYQ eyq = new pi.EYQ();
        try {
            if (kbd.Kbd != null) {
                for (Map.Entry<String, String> entry : kbd.Kbd.entrySet()) {
                    String key = entry.getKey();
                    if (!TextUtils.isEmpty(key)) {
                        String value = entry.getValue();
                        if (value == null) {
                            value = "";
                        }
                        eyq.mZx(key, value);
                    }
                }
            }
            KO koEYQ = this.EYQ.EYQ(eyq.EYQ(kbd.mZx).EYQ().mZx()).EYQ();
            Integer.valueOf(koEYQ.Td());
            return new IPb(koEYQ, kbd);
        } catch (Throwable unused) {
            return null;
        }
    }
}
