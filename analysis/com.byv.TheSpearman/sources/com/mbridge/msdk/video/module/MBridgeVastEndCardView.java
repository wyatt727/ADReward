package com.mbridge.msdk.video.module;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.mbridge.msdk.video.signal.factory.b;
import com.mbridge.msdk.widget.a;

/* loaded from: classes4.dex */
public class MBridgeVastEndCardView extends MBridgeBaseView {
    private ViewGroup n;
    private View o;
    private View p;

    public void preLoadData(b bVar) {
    }

    public MBridgeVastEndCardView(Context context) {
        super(context);
    }

    public MBridgeVastEndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
        int iFindLayout = findLayout("mbridge_reward_endcard_vast");
        if (iFindLayout >= 0) {
            this.c.inflate(iFindLayout, this);
            this.n = (ViewGroup) findViewById(findID("mbridge_rl_content"));
            this.o = findViewById(findID("mbridge_iv_vastclose"));
            View viewFindViewById = findViewById(findID("mbridge_iv_vastok"));
            this.p = viewFindViewById;
            this.f = isNotNULL(this.n, this.o, viewFindViewById);
            c();
            if (this.f) {
                setMatchParent();
                setBackgroundResource(findColor("mbridge_reward_endcard_vast_bg"));
                setClickable(true);
                ((RelativeLayout.LayoutParams) this.n.getLayoutParams()).addRule(13, -1);
            }
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    protected final void c() {
        super.c();
        if (this.f) {
            this.o.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeVastEndCardView.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MBridgeVastEndCardView.this.e.a(104, "");
                }
            });
            this.p.setOnClickListener(new a() { // from class: com.mbridge.msdk.video.module.MBridgeVastEndCardView.2
                @Override // com.mbridge.msdk.widget.a
                protected final void a(View view) {
                    MBridgeVastEndCardView.this.e.a(108, MBridgeVastEndCardView.this.d());
                }
            });
        }
    }

    public void notifyShowListener() {
        this.e.a(111, "");
    }
}
