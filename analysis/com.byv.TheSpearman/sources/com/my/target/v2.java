package com.my.target;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.my.target.instreamads.InstreamAdPlayer;
import com.my.target.w;

/* loaded from: classes4.dex */
public class v2 extends FrameLayout implements InstreamAdPlayer, w.a {

    /* renamed from: a, reason: collision with root package name */
    public final x f4158a;
    public boolean b;
    public InstreamAdPlayer.AdPlayerListener c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public w h;

    public v2(Context context) {
        this(context, null);
    }

    public v2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public v2(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, new x(context));
    }

    public v2(Context context, AttributeSet attributeSet, int i, x xVar) {
        super(context, attributeSet, i);
        this.b = true;
        this.f4158a = xVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        addView(xVar, layoutParams);
    }

    @Override // com.my.target.w.a
    public void a(float f) {
        InstreamAdPlayer.AdPlayerListener adPlayerListener = this.c;
        if (adPlayerListener != null) {
            adPlayerListener.onVolumeChanged(f);
        }
    }

    @Override // com.my.target.w.a
    public void a(float f, float f2) {
    }

    @Override // com.my.target.w.a
    public void a(String str) {
        InstreamAdPlayer.AdPlayerListener adPlayerListener = this.c;
        if (adPlayerListener != null) {
            adPlayerListener.onAdVideoError(str);
        }
    }

    @Override // com.my.target.w.a
    public void d() {
        this.g = true;
        InstreamAdPlayer.AdPlayerListener adPlayerListener = this.c;
        if (adPlayerListener != null) {
            adPlayerListener.onAdVideoPaused();
        }
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer
    public void destroy() {
        w wVar = this.h;
        if (wVar != null) {
            wVar.destroy();
        }
    }

    @Override // com.my.target.w.a
    public void e() {
    }

    @Override // com.my.target.w.a
    public void f() {
        if (this.g) {
            InstreamAdPlayer.AdPlayerListener adPlayerListener = this.c;
            if (adPlayerListener != null) {
                adPlayerListener.onAdVideoResumed();
            }
            this.g = false;
        }
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer
    public InstreamAdPlayer.AdPlayerListener getAdPlayerListener() {
        return this.c;
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer
    public float getAdVideoDuration() {
        w wVar = this.h;
        if (wVar != null) {
            return wVar.getDuration();
        }
        return 0.0f;
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer
    public float getAdVideoPosition() {
        if (this.h != null) {
            return r0.getPosition() / 1000.0f;
        }
        return 0.0f;
    }

    public int getPlaceholderHeight() {
        return this.e;
    }

    public int getPlaceholderWidth() {
        return this.d;
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer
    public View getView() {
        return this;
    }

    @Override // com.my.target.w.a
    public void h() {
    }

    @Override // com.my.target.w.a
    public void i() {
        InstreamAdPlayer.AdPlayerListener adPlayerListener;
        if (this.f || (adPlayerListener = this.c) == null) {
            return;
        }
        adPlayerListener.onAdVideoStarted();
        this.f = true;
    }

    @Override // com.my.target.w.a
    public void n() {
        InstreamAdPlayer.AdPlayerListener adPlayerListener = this.c;
        if (adPlayerListener != null) {
            adPlayerListener.onAdVideoStopped();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0051 A[PHI: r9
      0x0051: PHI (r9v10 int) = (r9v6 int), (r9v6 int), (r9v19 int), (r9v19 int) binds: [B:42:0x0074, B:43:0x0076, B:28:0x004c, B:29:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068 A[PHI: r9
      0x0068: PHI (r9v13 int) = (r9v9 int), (r9v9 int), (r9v22 int), (r9v22 int) binds: [B:35:0x005d, B:36:0x005f, B:24:0x0041, B:25:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r8)
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            int r2 = android.view.View.MeasureSpec.getMode(r9)
            int r3 = android.view.View.MeasureSpec.getSize(r9)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L15
            r0 = r4
        L15:
            if (r2 != 0) goto L18
            r2 = r4
        L18:
            int r5 = r7.e
            if (r5 == 0) goto L8d
            int r6 = r7.d
            if (r6 != 0) goto L22
            goto L8d
        L22:
            float r8 = (float) r6
            float r9 = (float) r5
            float r8 = r8 / r9
            r9 = 0
            if (r3 == 0) goto L2b
            float r9 = (float) r1
            float r5 = (float) r3
            float r9 = r9 / r5
        L2b:
            r5 = 0
            r6 = 1073741824(0x40000000, float:2.0)
            if (r0 != r6) goto L33
            if (r2 != r6) goto L33
            goto L81
        L33:
            if (r0 != r4) goto L53
            if (r2 != r4) goto L53
            int r9 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r9 >= 0) goto L46
            float r9 = (float) r3
            float r9 = r9 * r8
            int r9 = java.lang.Math.round(r9)
            if (r1 <= 0) goto L68
            if (r9 <= r1) goto L68
            goto L61
        L46:
            float r9 = (float) r1
            float r9 = r9 / r8
            int r9 = java.lang.Math.round(r9)
            if (r3 <= 0) goto L51
            if (r9 <= r3) goto L51
            goto L78
        L51:
            r3 = r9
            goto L81
        L53:
            if (r0 != r4) goto L6a
            if (r2 != r6) goto L6a
            float r9 = (float) r3
            float r9 = r9 * r8
            int r9 = java.lang.Math.round(r9)
            if (r1 <= 0) goto L68
            if (r9 <= r1) goto L68
        L61:
            float r9 = (float) r1
            float r9 = r9 / r8
            int r3 = java.lang.Math.round(r9)
            goto L81
        L68:
            r1 = r9
            goto L81
        L6a:
            if (r0 != r6) goto L7f
            if (r2 != r4) goto L7f
            float r9 = (float) r1
            float r9 = r9 / r8
            int r9 = java.lang.Math.round(r9)
            if (r3 <= 0) goto L51
            if (r9 <= r3) goto L51
        L78:
            float r9 = (float) r3
            float r9 = r9 * r8
            int r1 = java.lang.Math.round(r9)
            goto L81
        L7f:
            r1 = r5
            r3 = r1
        L81:
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r6)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r6)
            super.onMeasure(r8, r9)
            return
        L8d:
            super.onMeasure(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.target.v2.onMeasure(int, int):void");
    }

    @Override // com.my.target.w.a
    public void onVideoCompleted() {
        InstreamAdPlayer.AdPlayerListener adPlayerListener = this.c;
        if (adPlayerListener != null) {
            adPlayerListener.onAdVideoCompleted();
        }
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer
    public void pauseAdVideo() {
        w wVar = this.h;
        if (wVar != null) {
            wVar.pause();
        }
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer
    public void playAdVideo(Uri uri, int i, int i2) {
        this.d = i;
        this.e = i2;
        this.f = false;
        if (this.h == null) {
            w wVarA = d5.a(this.b, getContext());
            this.h = wVarA;
            wVarA.a(this);
        }
        this.f4158a.a(i, i2);
        this.h.a(uri, this.f4158a);
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer
    public void playAdVideo(Uri uri, int i, int i2, float f) {
        playAdVideo(uri, i, i2);
        w wVar = this.h;
        if (wVar != null) {
            wVar.seekTo((long) (f * 1000.0f));
        }
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer
    public void resumeAdVideo() {
        w wVar = this.h;
        if (wVar != null) {
            wVar.a();
        }
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer
    public void setAdPlayerListener(InstreamAdPlayer.AdPlayerListener adPlayerListener) {
        this.c = adPlayerListener;
    }

    public void setUseExoPlayer(boolean z) {
        this.b = z;
    }

    public void setVideoPlayer(o1 o1Var) {
        this.h = o1Var;
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer
    public void setVolume(float f) {
        w wVar = this.h;
        if (wVar != null) {
            wVar.setVolume(f);
        }
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer
    public void stopAdVideo() {
        w wVar = this.h;
        if (wVar != null) {
            wVar.stop();
        }
    }
}
