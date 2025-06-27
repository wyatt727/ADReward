package com.bytedance.sdk.openadsdk.api.init;

import android.text.TextUtils;
import com.bykv.vk.openvk.component.video.api.Td;
import com.bytedance.sdk.component.IPb.Pm.Td;
import com.bytedance.sdk.component.utils.pi;
import com.bytedance.sdk.openadsdk.InitConfig;
import com.bytedance.sdk.openadsdk.core.NZ;
import com.bytedance.sdk.openadsdk.utils.FH;
import com.bytedance.sdk.openadsdk.utils.UB;

/* loaded from: classes2.dex */
public final class PAGConfig implements InitConfig {
    private static String tsL;
    private String EYQ;
    private boolean HX;
    private String MxO;
    private boolean QQ;
    private int Td;
    private boolean mZx;
    private String tp;
    private int Pm = -1;
    private int Kbd = -1;
    private int IPb = -1;
    private int VwS = 0;

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getData() {
        return this.MxO;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(String str) {
        this.MxO = str;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getAppId() {
        return this.EYQ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mZx(String str) {
        this.EYQ = str;
    }

    public boolean getDebugLog() {
        return this.mZx;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(boolean z) {
        this.mZx = z;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getAppIconId() {
        return this.Td;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(int i) {
        this.Td = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mZx(int i) {
        if (i < -1 || i > 1) {
            i = -1;
        }
        this.Pm = i;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getCoppa() {
        return this.Pm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Td(int i) {
        if (i < -1 || i > 1) {
            i = -1;
        }
        this.Kbd = i;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getGdpr() {
        return this.Kbd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Pm(int i) {
        if (i < -1 || i > 1) {
            i = -1;
        }
        this.IPb = i;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getCcpa() {
        return this.IPb;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getTitleBarTheme() {
        return this.VwS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Kbd(int i) {
        this.VwS = i;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public boolean isUseTextureView() {
        return this.QQ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mZx(boolean z) {
        this.QQ = z;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public boolean isSupportMultiProcess() {
        return this.HX;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Td(boolean z) {
        this.HX = z;
        Td.EYQ(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Td(String str) {
        this.tp = str;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getPackageName() {
        if (TextUtils.isEmpty(this.tp)) {
            return tsL;
        }
        return this.tp;
    }

    public static void setChildDirected(int i) {
        if (FH.HX("setCoppa")) {
            if (i < -1 || i > 1) {
                i = -1;
            }
            NZ.EYQ().mZx(i);
        }
    }

    public static int getChildDirected() {
        if (FH.HX("getCoppa")) {
            return NZ.EYQ().mZx();
        }
        return -1;
    }

    public static void setGDPRConsent(int i) {
        FH.HX("setGdpr");
        if (i < -1 || i > 1) {
            i = -1;
        }
        NZ.EYQ().Td(i);
    }

    public static int getGDPRConsent() {
        if (!FH.HX("getGdpr")) {
            return -1;
        }
        int iTd = NZ.EYQ().Td();
        if (iTd == 1) {
            return 0;
        }
        if (iTd == 0) {
            return 1;
        }
        return iTd;
    }

    public static void setDoNotSell(int i) {
        if (FH.HX("setCCPA")) {
            if (i < -1 || i > 1) {
                i = -1;
            }
            NZ.EYQ().Pm(i);
        }
    }

    public static int getDoNotSell() {
        if (FH.HX("getCCPA")) {
            return NZ.EYQ().IPb();
        }
        return -1;
    }

    public static void debugLog(boolean z) {
        if (NZ.EYQ() != null) {
            if (z) {
                NZ.EYQ().Kbd(1);
                NZ.EYQ().EYQ();
                return;
            }
            NZ.EYQ().Kbd(0);
            com.bytedance.sdk.component.IPb.Pm.Td.EYQ(Td.EYQ.OFF);
            pi.Td();
            com.bykv.vk.openvk.component.video.api.IPb.Td.mZx();
            UB.mZx();
        }
    }

    public static void setAppIconId(int i) {
        if (NZ.EYQ() != null) {
            NZ.EYQ().IPb(i);
        }
    }

    public static void setUserData(String str) {
        if (NZ.EYQ() != null) {
            NZ.EYQ().mZx(str);
        }
    }

    public static void setPackageName(String str) {
        tsL = str;
    }

    public static class Builder {
        private String EYQ;
        private String MxO;
        private int Td;
        private boolean mZx;
        private String[] tp;
        private String tsL;
        private int Pm = -1;
        private int Kbd = -1;
        private int IPb = -1;
        private int VwS = 0;
        private boolean QQ = true;
        private boolean HX = false;

        public Builder setUserData(String str) {
            this.tsL = str;
            return this;
        }

        public Builder appId(String str) {
            this.EYQ = str;
            return this;
        }

        public Builder debugLog(boolean z) {
            this.mZx = z;
            return this;
        }

        public Builder appIcon(int i) {
            this.Td = i;
            return this;
        }

        public Builder setChildDirected(int i) {
            this.Pm = i;
            return this;
        }

        public Builder setGDPRConsent(int i) {
            this.Kbd = i;
            return this;
        }

        public Builder setDoNotSell(int i) {
            this.IPb = i;
            return this;
        }

        public Builder titleBarTheme(int i) {
            this.VwS = i;
            return this;
        }

        public Builder useTextureView(boolean z) {
            this.QQ = z;
            return this;
        }

        public Builder supportMultiProcess(boolean z) {
            this.HX = z;
            return this;
        }

        public Builder needClearTaskReset(String... strArr) {
            this.tp = strArr;
            return this;
        }

        public Builder setPackageName(String str) {
            this.MxO = str;
            return this;
        }

        public PAGConfig build() {
            PAGConfig pAGConfig = new PAGConfig();
            pAGConfig.mZx(this.EYQ);
            pAGConfig.mZx(this.Pm);
            pAGConfig.EYQ(this.Td);
            pAGConfig.Kbd(this.VwS);
            pAGConfig.mZx(this.QQ);
            pAGConfig.Td(this.HX);
            pAGConfig.Td(this.Kbd);
            pAGConfig.Pm(this.IPb);
            pAGConfig.EYQ(this.mZx);
            pAGConfig.Td(this.MxO);
            pAGConfig.EYQ(this.tsL);
            return pAGConfig;
        }
    }
}
