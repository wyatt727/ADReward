package com.facebook.ads.redexgen.uinode;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Nj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnTouchListenerC0921Nj implements View.OnTouchListener {
    public static String[] A01 = {"nw3GK1YJfCGHoT5CzZQuJNL", "qBkNcCq6erHPEIRyhLgAx5qQPhS15kml", "hKPsn6oFoNQxCgWJ0mJ18v2", "6hVkqBVWqkQ2VmwtT15SPhBZDIeIrpUz", "tnTo5ZKyPj8PGNswlDP8K8OWnpseVTAJ", "xAs1p8", "q05N2S", "8Y6yfxdLCMC0pJKiVageEHpnR6mbXY9F"};
    public final /* synthetic */ ViewOnClickListenerC0922Nk A00;

    public ViewOnTouchListenerC0921Nj(ViewOnClickListenerC0922Nk viewOnClickListenerC0922Nk) {
        this.A00 = viewOnClickListenerC0922Nk;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.A00.A00(motionEvent.getX(), motionEvent.getY());
        }
        String[] strArr = A01;
        if (strArr[2].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[2] = "OvxQOl3LXIasYJgnMQDmwFt";
        strArr2[0] = "0CKQQ25ailg1wOWqO8wBF5J";
        return false;
    }
}
