package com.bytedance.sdk.openadsdk.dislike;

import android.app.Activity;
import android.content.Context;
import com.bytedance.sdk.component.utils.pi;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.WU;
import com.bytedance.sdk.openadsdk.dislike.Kbd;
import com.bytedance.sdk.openadsdk.dislike.Td;
import java.util.List;

/* compiled from: TTAdDislikeImpl.java */
/* loaded from: classes2.dex */
public class mZx implements WU {
    public Kbd EYQ;
    private WU.EYQ Kbd;
    private boolean Pm;
    private Td Td;
    private final Context mZx;

    public mZx(Context context, String str, List<FilterWord> list, String str2) {
        if (!(context instanceof Activity)) {
            pi.mZx("Dislike Initialization must use activity, please pass in TTAdManager.createAdNative(activity)");
        }
        this.mZx = context;
        EYQ(str, list, str2);
    }

    private void EYQ(String str, List<FilterWord> list, String str2) {
        this.Td = new Td(this.mZx, str, list);
        Kbd kbd = new Kbd(this.mZx);
        this.EYQ = kbd;
        kbd.EYQ(str, str2);
        this.EYQ.EYQ(new Kbd.EYQ() { // from class: com.bytedance.sdk.openadsdk.dislike.mZx.1
            @Override // com.bytedance.sdk.openadsdk.dislike.Kbd.EYQ
            public void EYQ() {
            }

            @Override // com.bytedance.sdk.openadsdk.dislike.Kbd.EYQ
            public void mZx() {
                mZx.this.EYQ();
            }

            @Override // com.bytedance.sdk.openadsdk.dislike.Kbd.EYQ
            public void Td() {
                mZx.this.EYQ();
            }

            @Override // com.bytedance.sdk.openadsdk.dislike.Kbd.EYQ
            public void EYQ(int i, FilterWord filterWord) {
                if (mZx.this.Kbd != null) {
                    mZx.this.Kbd.EYQ(i, filterWord.getName());
                }
                if (mZx.this.Kbd != null) {
                    mZx.this.Kbd.EYQ();
                }
            }
        });
        this.Td.EYQ(new Td.EYQ() { // from class: com.bytedance.sdk.openadsdk.dislike.mZx.2
            @Override // com.bytedance.sdk.openadsdk.dislike.Td.EYQ
            public void EYQ() {
                mZx.this.EYQ(true);
                if (mZx.this.Td != null && mZx.this.Td.isShowing()) {
                    mZx.this.Td.dismiss();
                }
                mZx.this.Td();
            }

            @Override // com.bytedance.sdk.openadsdk.dislike.Td.EYQ
            public void EYQ(int i, FilterWord filterWord) {
                try {
                    if (!filterWord.hasSecondOptions() && mZx.this.Kbd != null) {
                        mZx.this.Kbd.EYQ(i, filterWord.getName());
                    }
                    pi.EYQ("TTAdDislikeImpl", "onDislikeSelected: " + i + ", " + filterWord.getName());
                } catch (Throwable th) {
                    pi.EYQ("TTAdDislikeImpl", "dislike callback selected error: ", th);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.dislike.Td.EYQ
            public void mZx() {
                pi.EYQ("TTAdDislikeImpl", "onDislikeDismiss: ");
                try {
                    if (mZx.this.Kbd != null) {
                        mZx.this.Kbd.EYQ();
                    }
                } catch (Throwable th) {
                    pi.EYQ("TTAdDislikeImpl", "dislike callback cancel error: ", th);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.dislike.Td.EYQ
            public void Td() {
                pi.EYQ("TTAdDislikeImpl", "onDislikeOptionBack: ");
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.WU
    public void EYQ() {
        Context context = this.mZx;
        if (!((context instanceof Activity) && !((Activity) context).isFinishing()) || this.Td.isShowing()) {
            return;
        }
        this.Td.show();
    }

    public void EYQ(String str, List<FilterWord> list) {
        this.Td.EYQ(str, list);
    }

    @Override // com.bytedance.sdk.openadsdk.core.WU
    public void EYQ(WU.EYQ eyq) {
        this.Kbd = eyq;
    }

    public void EYQ(String str) {
        Td td = this.Td;
        if (td != null) {
            td.EYQ(str);
        }
    }

    public boolean mZx() {
        return this.Pm;
    }

    public void EYQ(boolean z) {
        this.Pm = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Td() {
        if ((this.mZx instanceof Activity) && (!((Activity) r0).isFinishing()) && !this.EYQ.isShowing()) {
            this.EYQ.show();
        }
    }
}
