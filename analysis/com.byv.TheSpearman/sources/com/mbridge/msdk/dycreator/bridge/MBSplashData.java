package com.mbridge.msdk.dycreator.bridge;

import com.mbridge.msdk.dycreator.f.a.a;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes4.dex */
public class MBSplashData implements a {

    /* renamed from: a, reason: collision with root package name */
    private DyOption f2654a;
    private String b;
    private String c;
    private String d;
    private String e;
    private CampaignEx f;
    private int g;
    private int h;
    private float i;
    private float j;
    private int k = 0;

    public MBSplashData(DyOption dyOption) {
        this.f2654a = dyOption;
        this.f = dyOption.getCampaignEx();
    }

    public DyOption getDyOption() {
        return this.f2654a;
    }

    public int getNoticeImage() {
        return this.g;
    }

    public void setNoticeImage(int i) {
        this.g = i;
    }

    public int getLogoImage() {
        return this.h;
    }

    public void setLogoImage(int i) {
        this.h = i;
    }

    public String getAppInfo() {
        return this.b;
    }

    public void setAppInfo(String str) {
        this.b = str;
    }

    public String getAdClickText() {
        return this.c;
    }

    public void setAdClickText(String str) {
        this.c = str;
    }

    public String getCountDownText() {
        return this.d;
    }

    public void setCountDownText(String str) {
        this.d = str;
    }

    @Override // com.mbridge.msdk.dycreator.f.a.a
    public CampaignEx getBindData() {
        return this.f;
    }

    @Override // com.mbridge.msdk.dycreator.f.a.a
    public DyOption getEffectData() {
        return this.f2654a;
    }

    public float getxInScreen() {
        return this.i;
    }

    public void setxInScreen(float f) {
        this.i = f;
    }

    public float getyInScreen() {
        return this.j;
    }

    public void setyInScreen(float f) {
        this.j = f;
    }

    public int getClickType() {
        return this.k;
    }

    public void setClickType(int i) {
        this.k = i;
    }

    public String getLogoText() {
        return this.e;
    }

    public void setLogoText(String str) {
        this.e = str;
    }
}
