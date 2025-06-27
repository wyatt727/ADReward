package com.bykv.vk.openvk.component.video.api.renderview;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import com.bykv.vk.openvk.component.video.api.renderview.mZx;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class SSRenderSurfaceView extends SSSurfaceView implements SurfaceHolder.Callback, mZx {
    private static final ArrayList<Td> Td = new ArrayList<>();
    private WeakReference<EYQ> EYQ;
    private mZx.EYQ Pm;
    private Td mZx;

    @Override // com.bykv.vk.openvk.component.video.api.renderview.mZx
    public View getView() {
        return this;
    }

    public SSRenderSurfaceView(Context context) {
        super(context);
        EYQ();
    }

    private void EYQ() {
        Td td = new Td(this);
        this.mZx = td;
        Td.add(td);
    }

    @Override // com.bykv.vk.openvk.component.video.api.renderview.mZx
    public void EYQ(EYQ eyq) {
        this.EYQ = new WeakReference<>(eyq);
        SurfaceHolder holder = getHolder();
        holder.setFormat(-3);
        Iterator<Td> it = Td.iterator();
        while (it.hasNext()) {
            Td next = it.next();
            if (next != null && next.EYQ() == null) {
                holder.removeCallback(next);
                it.remove();
            }
        }
        holder.addCallback(this.mZx);
    }

    @Override // com.bykv.vk.openvk.component.video.api.renderview.mZx
    public void EYQ(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
        setLayoutParams(layoutParams);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        WeakReference<EYQ> weakReference = this.EYQ;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.EYQ.get().EYQ(surfaceHolder);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        WeakReference<EYQ> weakReference = this.EYQ;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.EYQ.get().EYQ(surfaceHolder, i, i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        WeakReference<EYQ> weakReference = this.EYQ;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.EYQ.get().mZx(surfaceHolder);
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    public void setWindowVisibilityChangedListener(mZx.EYQ eyq) {
        this.Pm = eyq;
    }
}
