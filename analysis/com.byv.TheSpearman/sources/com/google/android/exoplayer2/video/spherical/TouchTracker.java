package com.google.android.exoplayer2.video.spherical;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.exoplayer2.video.spherical.OrientationListener;

@Deprecated
/* loaded from: classes2.dex */
final class TouchTracker extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, OrientationListener.Listener {
    static final float MAX_PITCH_DEGREES = 45.0f;
    private final GestureDetector gestureDetector;
    private final Listener listener;
    private final float pxPerDegrees;
    private final PointF previousTouchPointPx = new PointF();
    private final PointF accumulatedTouchOffsetDegrees = new PointF();
    private volatile float roll = 3.1415927f;

    public interface Listener {

        /* renamed from: com.google.android.exoplayer2.video.spherical.TouchTracker$Listener$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static boolean $default$onSingleTapUp(Listener _this, MotionEvent motionEvent) {
                return false;
            }
        }

        void onScrollChange(PointF pointF);

        boolean onSingleTapUp(MotionEvent motionEvent);
    }

    public TouchTracker(Context context, Listener listener, float f) {
        this.listener = listener;
        this.pxPerDegrees = f;
        this.gestureDetector = new GestureDetector(context, this);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.gestureDetector.onTouchEvent(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.previousTouchPointPx.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x = (motionEvent2.getX() - this.previousTouchPointPx.x) / this.pxPerDegrees;
        float y = (motionEvent2.getY() - this.previousTouchPointPx.y) / this.pxPerDegrees;
        this.previousTouchPointPx.set(motionEvent2.getX(), motionEvent2.getY());
        double d = this.roll;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        this.accumulatedTouchOffsetDegrees.x -= (fCos * x) - (fSin * y);
        this.accumulatedTouchOffsetDegrees.y += (fSin * x) + (fCos * y);
        PointF pointF = this.accumulatedTouchOffsetDegrees;
        pointF.y = Math.max(-45.0f, Math.min(MAX_PITCH_DEGREES, pointF.y));
        this.listener.onScrollChange(this.accumulatedTouchOffsetDegrees);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.listener.onSingleTapUp(motionEvent);
    }

    @Override // com.google.android.exoplayer2.video.spherical.OrientationListener.Listener
    public void onOrientationChange(float[] fArr, float f) {
        this.roll = -f;
    }
}
