package com.bykv.vk.openvk.component.video.EYQ.mZx.Kbd;

import com.bykv.vk.openvk.component.video.EYQ.mZx.HX;
import com.bytedance.sdk.component.mZx.EYQ.KO;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* compiled from: VolleyResponseWrapper.java */
/* loaded from: classes.dex */
public class IPb extends EYQ {
    private KO Td;

    public IPb(KO ko, Kbd kbd) {
        com.bytedance.sdk.component.mZx.EYQ.IPb iPbVwS;
        this.Td = ko;
        this.EYQ = new ArrayList();
        if (ko != null && (iPbVwS = ko.VwS()) != null) {
            for (int i = 0; i < iPbVwS.EYQ(); i++) {
                this.EYQ.add(new HX.mZx(iPbVwS.EYQ(i), iPbVwS.mZx(i)));
            }
        }
        this.mZx = kbd;
    }

    @Override // com.bykv.vk.openvk.component.video.EYQ.mZx.Kbd.EYQ
    public int EYQ() {
        return this.Td.Td();
    }

    @Override // com.bykv.vk.openvk.component.video.EYQ.mZx.Kbd.EYQ
    public boolean mZx() {
        return this.Td.Td() >= 200 && this.Td.Td() < 300;
    }

    @Override // com.bykv.vk.openvk.component.video.EYQ.mZx.Kbd.EYQ
    public String EYQ(String str, String str2) {
        return EYQ(str) != null ? EYQ(str).mZx : str2;
    }

    @Override // com.bykv.vk.openvk.component.video.EYQ.mZx.Kbd.EYQ
    public List<HX.mZx> Td() {
        return this.EYQ;
    }

    @Override // com.bykv.vk.openvk.component.video.EYQ.mZx.Kbd.EYQ
    public InputStream Pm() {
        return this.Td.IPb().Td();
    }

    @Override // com.bykv.vk.openvk.component.video.EYQ.mZx.Kbd.EYQ
    public String Kbd() {
        KO ko = this.Td;
        return (ko == null || ko.QQ() == null) ? "http/1.1" : this.Td.QQ().toString();
    }

    @Override // com.bykv.vk.openvk.component.video.EYQ.mZx.Kbd.EYQ
    public String IPb() {
        return EYQ(this.Td.Td());
    }
}
