package com.bytedance.sdk.openadsdk.core.ugen.component;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.zF;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: CommentNumWidget.java */
/* loaded from: classes2.dex */
public class EYQ extends com.bytedance.adsdk.ugeno.component.text.mZx {
    public EYQ(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.component.text.mZx
    public void Kbd(String str) {
        super.Kbd(str);
        if (TextUtils.isEmpty(str) || TextUtils.equals(AbstractJsonLexerKt.NULL, str)) {
            return;
        }
        try {
            String str2 = String.format(zF.EYQ(this.mZx, "tt_comment_num_backup"), Integer.valueOf(Integer.parseInt(str)));
            ((TextView) this.Kbd).setText("(" + str2 + ")");
        } catch (Exception unused) {
        }
    }
}
