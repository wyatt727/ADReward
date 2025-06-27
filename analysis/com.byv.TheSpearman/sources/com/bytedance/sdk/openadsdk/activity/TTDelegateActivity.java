package com.bytedance.sdk.openadsdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.sdk.openadsdk.core.QQ;
import com.bytedance.sdk.openadsdk.core.WU;
import com.bytedance.sdk.openadsdk.core.bannerexpress.EYQ;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.pi;
import com.bytedance.sdk.openadsdk.multipro.mZx;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class TTDelegateActivity extends TTBaseActivity {
    private static final Map<String, EYQ.InterfaceC0117EYQ> Td = Collections.synchronizedMap(new HashMap());
    private Intent EYQ;
    private WU mZx;

    public static void EYQ(UB ub, String str, EYQ.InterfaceC0117EYQ interfaceC0117EYQ) {
        if (ub == null) {
            return;
        }
        Intent intent = new Intent(hu.EYQ(), (Class<?>) TTDelegateActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("type", 6);
        intent.putExtra("ext_info", ub.GfQ());
        intent.putExtra("filter_words", com.bytedance.sdk.openadsdk.tool.EYQ.EYQ(ub.VEW()));
        intent.putExtra("creative_info", ub.aEX().toString());
        intent.putExtra("closed_listener_key", str);
        if (interfaceC0117EYQ != null) {
            if (mZx.Td()) {
                QQ.mZx().EYQ(str, interfaceC0117EYQ);
            } else {
                Td.put(str, interfaceC0117EYQ);
            }
        }
        if (hu.EYQ() != null) {
            hu.EYQ().startActivity(intent);
        }
    }

    public static void EYQ(UB ub, String str) {
        EYQ(ub, str, null);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!pi.Kbd()) {
            finish();
            return;
        }
        mZx();
        this.EYQ = getIntent();
        if (hu.EYQ() == null) {
            hu.EYQ(this);
        }
    }

    private void mZx() {
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.alpha = 0.0f;
        window.setAttributes(attributes);
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (hu.EYQ() == null) {
            hu.EYQ(this);
        }
        setIntent(intent);
        this.EYQ = intent;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    protected void onResume() throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        super.onResume();
        WU wu = this.mZx;
        if ((wu == null || ((com.bytedance.sdk.openadsdk.dislike.mZx) wu).EYQ == null || !((com.bytedance.sdk.openadsdk.dislike.mZx) this.mZx).EYQ.isShowing()) && this.EYQ != null) {
            Td();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
    }

    private void Td() {
        int intExtra = this.EYQ.getIntExtra("type", 0);
        if (intExtra != 1) {
            if (intExtra == 6) {
                EYQ(this.EYQ.getStringExtra("ext_info"), this.EYQ.getStringExtra("filter_words"), this.EYQ.getStringExtra("closed_listener_key"), this.EYQ.getStringExtra("creative_info"));
                return;
            }
            finish();
        }
    }

    private void EYQ(String str, String str2, final String str3, String str4) {
        if (str2 != null && str != null && this.mZx == null) {
            com.bytedance.sdk.openadsdk.dislike.mZx mzx = new com.bytedance.sdk.openadsdk.dislike.mZx(this, str, com.bytedance.sdk.openadsdk.tool.EYQ.EYQ(str2), str4);
            this.mZx = mzx;
            mzx.EYQ(str3);
            this.mZx.EYQ(new WU.EYQ() { // from class: com.bytedance.sdk.openadsdk.activity.TTDelegateActivity.1
                @Override // com.bytedance.sdk.openadsdk.core.WU.EYQ
                public void EYQ(int i, String str5) {
                    EYQ.InterfaceC0117EYQ interfaceC0117EYQTd;
                    if (TTDelegateActivity.Td != null && TTDelegateActivity.Td.size() > 0 && !TextUtils.isEmpty(str3) && !mZx.Td()) {
                        EYQ.InterfaceC0117EYQ interfaceC0117EYQ = (EYQ.InterfaceC0117EYQ) TTDelegateActivity.Td.get(str3);
                        if (interfaceC0117EYQ != null) {
                            interfaceC0117EYQ.EYQ();
                        }
                    } else if (!TextUtils.isEmpty(str3) && (interfaceC0117EYQTd = QQ.mZx().Td(str3)) != null) {
                        interfaceC0117EYQTd.EYQ();
                        QQ.mZx().Pm(str3);
                    }
                    TTDelegateActivity.this.EYQ(str3);
                    TTDelegateActivity.this.finish();
                }

                @Override // com.bytedance.sdk.openadsdk.core.WU.EYQ
                public void EYQ() {
                    if (!((com.bytedance.sdk.openadsdk.dislike.mZx) TTDelegateActivity.this.mZx).mZx()) {
                        TTDelegateActivity.this.EYQ(str3);
                        TTDelegateActivity.this.finish();
                    }
                    ((com.bytedance.sdk.openadsdk.dislike.mZx) TTDelegateActivity.this.mZx).EYQ(false);
                }
            });
        }
        WU wu = this.mZx;
        if (wu != null) {
            wu.EYQ();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(String str) {
        Map<String, EYQ.InterfaceC0117EYQ> map = Td;
        if (map == null || TextUtils.isEmpty(str)) {
            return;
        }
        map.remove(str);
        if (com.bytedance.sdk.component.utils.pi.Pm()) {
            map.size();
        }
    }
}
