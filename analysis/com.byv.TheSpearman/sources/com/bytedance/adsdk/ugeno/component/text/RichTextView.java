package com.bytedance.adsdk.ugeno.component.text;

import android.content.Context;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import android.widget.TextView;

/* loaded from: classes2.dex */
public class RichTextView extends TextView {
    public RichTextView(Context context) {
        super(context);
    }

    public void setRichText(String str) {
        Spanned spannedFromHtml;
        if (Build.VERSION.SDK_INT >= 24) {
            spannedFromHtml = Html.fromHtml(str, 0);
        } else {
            spannedFromHtml = Html.fromHtml(str);
        }
        setText(spannedFromHtml);
    }
}
