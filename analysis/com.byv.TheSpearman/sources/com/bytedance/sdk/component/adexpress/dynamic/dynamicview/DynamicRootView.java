package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.Td.IPb;
import com.bytedance.sdk.component.adexpress.dynamic.Td.QQ;
import com.bytedance.sdk.component.adexpress.mZx.MxO;
import com.bytedance.sdk.component.adexpress.mZx.nWX;
import com.bytedance.sdk.component.adexpress.mZx.pi;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class DynamicRootView extends FrameLayout implements com.bytedance.sdk.component.adexpress.dynamic.Pm, com.bytedance.sdk.component.adexpress.theme.EYQ {
    protected final nWX EYQ;
    private ViewGroup HX;
    private com.bytedance.sdk.component.adexpress.dynamic.Kbd.EYQ IPb;
    private pi KO;
    private DynamicBaseWidget Kbd;
    private List<com.bytedance.sdk.component.adexpress.dynamic.Td> MxO;
    private MxO Pm;
    private com.bytedance.sdk.component.adexpress.dynamic.mZx QQ;
    public View Td;
    private String UB;
    private Map<Integer, String> Uc;
    private ThemeStatusBroadcastReceiver VwS;
    private Context hu;
    boolean mZx;
    private int nWX;
    private int pi;
    private int tp;
    private com.bytedance.sdk.component.adexpress.dynamic.Kbd tsL;

    public DynamicRootView(Context context, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z, pi piVar, com.bytedance.sdk.component.adexpress.dynamic.Kbd.EYQ eyq) {
        super(context);
        this.HX = null;
        this.tp = 0;
        this.MxO = new ArrayList();
        this.pi = 0;
        this.nWX = 0;
        this.hu = context;
        nWX nwx = new nWX();
        this.EYQ = nwx;
        nwx.EYQ(2);
        this.IPb = eyq;
        eyq.EYQ(this);
        this.VwS = themeStatusBroadcastReceiver;
        themeStatusBroadcastReceiver.EYQ(this);
        this.mZx = z;
        this.KO = piVar;
    }

    public String getBgColor() {
        return this.UB;
    }

    public void setBgColor(String str) {
        this.UB = str;
    }

    public void setRenderListener(MxO mxO) {
        this.Pm = mxO;
        this.IPb.EYQ(mxO);
    }

    public void EYQ(QQ qq, int i) {
        this.Kbd = EYQ(qq, this, i);
        this.EYQ.EYQ(true);
        this.EYQ.EYQ(this.Kbd.Kbd);
        this.EYQ.mZx(this.Kbd.IPb);
        this.EYQ.EYQ(this.Td);
        this.Pm.EYQ(this.EYQ);
    }

    public DynamicBaseWidget EYQ(QQ qq, ViewGroup viewGroup, int i) {
        if (qq == null) {
            return null;
        }
        List<QQ> listMxO = qq.MxO();
        DynamicBaseWidget dynamicBaseWidgetEYQ = com.bytedance.sdk.component.adexpress.dynamic.EYQ.mZx.EYQ(this.hu, this, qq);
        if (dynamicBaseWidgetEYQ instanceof DynamicUnKnowView) {
            EYQ(i == 3 ? 128 : 118, "unknow widget");
            return null;
        }
        EYQ(qq);
        dynamicBaseWidgetEYQ.Td();
        if (viewGroup != null) {
            viewGroup.addView(dynamicBaseWidgetEYQ);
            EYQ(viewGroup, qq);
        }
        if (listMxO == null || listMxO.size() <= 0) {
            return null;
        }
        Iterator<QQ> it = listMxO.iterator();
        while (it.hasNext()) {
            EYQ(it.next(), dynamicBaseWidgetEYQ, i);
        }
        return dynamicBaseWidgetEYQ;
    }

    private void EYQ(QQ qq) {
        IPb iPbKbd;
        com.bytedance.sdk.component.adexpress.dynamic.Td.Kbd kbdTp = qq.tp();
        if (kbdTp == null || (iPbKbd = kbdTp.Kbd()) == null) {
            return;
        }
        this.EYQ.mZx(iPbKbd.oCs());
    }

    public Map<Integer, String> getBgMaterialCenterCalcColor() {
        return this.Uc;
    }

    public void setBgMaterialCenterCalcColor(Map<Integer, String> map) {
        this.Uc = map;
    }

    private void EYQ(ViewGroup viewGroup, QQ qq) {
        ViewGroup viewGroup2;
        if (viewGroup == null || (viewGroup2 = (ViewGroup) viewGroup.getParent()) == null || !qq.tPj()) {
            return;
        }
        viewGroup2.setClipChildren(false);
        viewGroup2.setClipToPadding(false);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
        if (viewGroup3 != null) {
            viewGroup3.setClipChildren(false);
            viewGroup3.setClipToPadding(false);
        }
    }

    public void EYQ(double d, double d2, double d3, double d4, float f) {
        this.EYQ.Td(d);
        this.EYQ.Pm(d2);
        this.EYQ.Kbd(d3);
        this.EYQ.IPb(d4);
        this.EYQ.EYQ(f);
        this.EYQ.mZx(f);
        this.EYQ.Td(f);
        this.EYQ.Pm(f);
    }

    public void EYQ(int i, String str) {
        this.EYQ.EYQ(false);
        this.EYQ.mZx(i);
        this.EYQ.EYQ(str);
        this.Pm.EYQ(this.EYQ);
    }

    public void setMuteListener(com.bytedance.sdk.component.adexpress.dynamic.mZx mzx) {
        this.QQ = mzx;
    }

    public void setDislikeView(View view) {
        this.IPb.mZx(view);
    }

    public MxO getRenderListener() {
        return this.Pm;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.Kbd.EYQ getDynamicClickListener() {
        return this.IPb;
    }

    @Override // com.bytedance.sdk.component.adexpress.theme.EYQ
    public void EYQ(int i) {
        DynamicBaseWidget dynamicBaseWidget = this.Kbd;
        if (dynamicBaseWidget == null) {
            return;
        }
        dynamicBaseWidget.EYQ(i);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.Pm
    public void EYQ(CharSequence charSequence, int i, int i2, boolean z) {
        for (int i3 = 0; i3 < this.MxO.size(); i3++) {
            if (this.MxO.get(i3) != null) {
                this.MxO.get(i3).EYQ(charSequence, i == 1, i2, z);
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.Pm
    public void setSoundMute(boolean z) {
        com.bytedance.sdk.component.adexpress.dynamic.mZx mzx = this.QQ;
        if (mzx != null) {
            mzx.setSoundMute(z);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.Pm
    public void setTimeUpdate(int i) {
        this.tsL.setTimeUpdate(i);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.Pm
    public void a_() {
        try {
            this.tsL.EYQ();
        } catch (Exception unused) {
        }
    }

    public ViewGroup getTimeOut() {
        return this.HX;
    }

    public void setTimeOut(ViewGroup viewGroup) {
        this.HX = viewGroup;
    }

    public int getTimedown() {
        return this.tp;
    }

    public void setTimedown(int i) {
        this.tp = i;
    }

    public List<com.bytedance.sdk.component.adexpress.dynamic.Td> getTimeOutListener() {
        return this.MxO;
    }

    public void setTimeOutListener(com.bytedance.sdk.component.adexpress.dynamic.Td td) {
        this.MxO.add(td);
    }

    public void setVideoListener(com.bytedance.sdk.component.adexpress.dynamic.Kbd kbd) {
        this.tsL = kbd;
    }

    public int getScoreCountWithIcon() {
        return this.nWX;
    }

    public void setScoreCountWithIcon(int i) {
        this.nWX = i;
    }

    public int getLogoUnionHeight() {
        return this.pi;
    }

    public void setLogoUnionHeight(int i) {
        this.pi = i;
    }

    public pi getRenderRequest() {
        return this.KO;
    }
}
