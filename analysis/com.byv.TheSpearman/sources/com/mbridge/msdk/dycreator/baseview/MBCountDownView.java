package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.mbridge.msdk.dycreator.binding.response.SplashResData;
import com.mbridge.msdk.dycreator.bus.EventBus;
import com.mbridge.msdk.dycreator.listener.action.EAction;
import com.mbridge.msdk.f.a.a;
import com.mbridge.msdk.f.a.b;

/* loaded from: classes4.dex */
public class MBCountDownView extends MBTextView {

    /* renamed from: a, reason: collision with root package name */
    private b f2559a;
    private MBCountDownView b;

    public MBCountDownView(Context context) {
        super(context);
        this.b = this;
    }

    public MBCountDownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = this;
    }

    public MBCountDownView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = this;
    }

    @Override // com.mbridge.msdk.dycreator.baseview.MBTextView, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = this.f2559a;
        if (bVar != null) {
            bVar.b();
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.MBTextView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b bVar = this.f2559a;
        if (bVar != null) {
            bVar.a();
        }
    }

    public void initView(final String str, final String str2, int i) {
        this.f2559a = new b().b(i * 1000).a(1000L).a(new a() { // from class: com.mbridge.msdk.dycreator.baseview.MBCountDownView.1
            @Override // com.mbridge.msdk.f.a.a
            public void onTick(long j) {
                if (str2.startsWith("zh")) {
                    MBCountDownView.this.b.setText((j / 1000) + CmcdHeadersFactory.STREAMING_FORMAT_SS + str);
                    return;
                }
                MBCountDownView.this.b.setText(MBCountDownView.this.b + " " + (j / 1000) + CmcdHeadersFactory.STREAMING_FORMAT_SS);
            }

            @Override // com.mbridge.msdk.f.a.a
            public void onFinish() {
                MBCountDownView.this.f2559a.a();
                SplashResData splashResData = new SplashResData();
                splashResData.seteAction(EAction.CLOSE);
                EventBus.getDefault().post(splashResData);
            }
        });
    }
}
