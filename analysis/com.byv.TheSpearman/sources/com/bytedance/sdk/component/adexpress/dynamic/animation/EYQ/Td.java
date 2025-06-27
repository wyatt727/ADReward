package com.bytedance.sdk.component.adexpress.dynamic.animation.EYQ;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: AnimatorFactory.java */
/* loaded from: classes2.dex */
public class Td {
    private static volatile Td EYQ;

    private Td() {
    }

    public static Td EYQ() {
        if (EYQ == null) {
            synchronized (Td.class) {
                if (EYQ == null) {
                    EYQ = new Td();
                }
            }
        }
        return EYQ;
    }

    public Pm EYQ(View view, com.bytedance.sdk.component.adexpress.dynamic.Td.EYQ eyq) {
        if (eyq == null) {
            return null;
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).setClipChildren(false);
        }
        if (view.getParent().getParent() != null) {
            ((ViewGroup) view.getParent().getParent()).setClipChildren(false);
        }
        if ("scale".equals(eyq.HX())) {
            return new MxO(view, eyq);
        }
        if ("translate".equals(eyq.HX())) {
            return new KO(view, eyq);
        }
        if ("ripple".equals(eyq.HX())) {
            return new QQ(view, eyq);
        }
        if ("marquee".equals(eyq.HX())) {
            return new VwS(view, eyq);
        }
        if ("waggle".equals(eyq.HX())) {
            return new hu(view, eyq);
        }
        if ("shine".equals(eyq.HX())) {
            return new tsL(view, eyq);
        }
        if ("swing".equals(eyq.HX())) {
            return new nWX(view, eyq);
        }
        if ("fade".equals(eyq.HX())) {
            return new EYQ(view, eyq);
        }
        if ("rubIn".equals(eyq.HX())) {
            return new tp(view, eyq);
        }
        if ("rotate".equals(eyq.HX())) {
            return new HX(view, eyq);
        }
        if ("cutIn".equals(eyq.HX())) {
            return new IPb(view, eyq);
        }
        if ("stretch".equals(eyq.HX())) {
            return new pi(view, eyq);
        }
        if ("bounce".equals(eyq.HX())) {
            return new Kbd(view, eyq);
        }
        return null;
    }
}
