package com.facebook.ads.redexgen.uinode;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Ee, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0693Ee extends AbstractC1220Za {
    public static TimeInterpolator A0B;
    public static String[] A0C = {"K3xavpXOVVnTPS8V8FmisIpuez1NdmFn", "QjoCrUVtXYT15qNhmppxWCsnlOvXMRWn", "HVYav4KnfeU3lAWSFDiSVAYelCZD7hW1", "SKhwmHHGUoQzTLK2kw5WKB1efbL3jYLm", "aZpNXGptJoOcjVlsPlgA0RFw1bcc4fI1", "y8DDj9eTKGlZyxtiH83YwnquX80t2qUq", "Eqht3urb", "PkOCx2w9GPXTa0iGANdHxOJetOGxrMw0"};
    public ArrayList<AnonymousClass56> A0A = new ArrayList<>();
    public ArrayList<AnonymousClass56> A07 = new ArrayList<>();
    public ArrayList<C4M> A09 = new ArrayList<>();
    public ArrayList<C4L> A08 = new ArrayList<>();
    public ArrayList<ArrayList<AnonymousClass56>> A01 = new ArrayList<>();
    public ArrayList<ArrayList<C4M>> A05 = new ArrayList<>();
    public ArrayList<ArrayList<C4L>> A03 = new ArrayList<>();
    public ArrayList<AnonymousClass56> A00 = new ArrayList<>();
    public ArrayList<AnonymousClass56> A04 = new ArrayList<>();
    public ArrayList<AnonymousClass56> A06 = new ArrayList<>();
    public ArrayList<AnonymousClass56> A02 = new ArrayList<>();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC04694k
    public final void A0I() {
        for (int size = this.A09.size() - 1; size >= 0; size--) {
            C4M c4m = this.A09.get(size);
            View view = c4m.A04.A0H;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            A0O(c4m.A04);
            this.A09.remove(size);
        }
        for (int size2 = this.A0A.size() - 1; size2 >= 0; size2--) {
            A0P(this.A0A.get(size2));
            this.A0A.remove(size2);
        }
        for (int size3 = this.A07.size() - 1; size3 >= 0; size3--) {
            AnonymousClass56 anonymousClass56 = this.A07.get(size3);
            anonymousClass56.A0H.setAlpha(1.0f);
            A0N(anonymousClass56);
            this.A07.remove(size3);
        }
        for (int size4 = this.A08.size() - 1; size4 >= 0; size4--) {
            A01(this.A08.get(size4));
        }
        this.A08.clear();
        if (A0L()) {
            for (int size5 = this.A05.size() - 1; size5 >= 0; size5--) {
                ArrayList<C4M> arrayList = this.A05.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    C4M c4m2 = arrayList.get(size6);
                    View view2 = c4m2.A04.A0H;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    A0O(c4m2.A04);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.A05.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.A01.size() - 1; size7 >= 0; size7--) {
                ArrayList<AnonymousClass56> arrayList2 = this.A01.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    AnonymousClass56 anonymousClass562 = arrayList2.get(size8);
                    anonymousClass562.A0H.setAlpha(1.0f);
                    A0N(anonymousClass562);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.A01.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.A03.size() - 1; size9 >= 0; size9--) {
                ArrayList<C4L> arrayList3 = this.A03.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    A01(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.A03.remove(arrayList3);
                    }
                }
            }
            A05(this.A06);
            A05(this.A04);
            A05(this.A00);
            A05(this.A02);
            A0A();
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC04694k
    public final void A0J() {
        boolean z = !this.A0A.isEmpty();
        boolean z2 = !this.A09.isEmpty();
        boolean z3 = !this.A08.isEmpty();
        boolean z4 = !this.A07.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<AnonymousClass56> it = this.A0A.iterator();
            while (it.hasNext()) {
                A03(it.next());
            }
            this.A0A.clear();
            if (z2) {
                final ArrayList<C4M> arrayList = new ArrayList<>();
                arrayList.addAll(this.A09);
                this.A05.add(arrayList);
                this.A09.clear();
                Runnable runnable = new Runnable() { // from class: com.facebook.ads.redexgen.X.4D
                    @Override // java.lang.Runnable
                    public final void run() {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            C4M c4m = (C4M) it2.next();
                            this.A00.A0Y(c4m.A04, c4m.A00, c4m.A01, c4m.A02, c4m.A03);
                        }
                        arrayList.clear();
                        this.A00.A05.remove(arrayList);
                    }
                };
                if (z) {
                    C3T.A0E(arrayList.get(0).A04.A0H, runnable, A07());
                } else {
                    runnable.run();
                }
            }
            if (z3) {
                final ArrayList<C4L> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.A08);
                this.A03.add(arrayList2);
                this.A08.clear();
                Runnable runnable2 = new Runnable() { // from class: com.facebook.ads.redexgen.X.4E
                    @Override // java.lang.Runnable
                    public final void run() {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            C4L change = (C4L) it2.next();
                            this.A00.A0W(change);
                        }
                        arrayList2.clear();
                        this.A00.A03.remove(arrayList2);
                    }
                };
                if (z) {
                    C3T.A0E(arrayList2.get(0).A05.A0H, runnable2, A07());
                } else {
                    runnable2.run();
                }
            }
            if (z4) {
                final ArrayList<AnonymousClass56> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.A07);
                this.A01.add(arrayList3);
                this.A07.clear();
                Runnable runnable3 = new Runnable() { // from class: com.facebook.ads.redexgen.X.4F
                    @Override // java.lang.Runnable
                    public final void run() {
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            AnonymousClass56 holder = (AnonymousClass56) it2.next();
                            this.A00.A0X(holder);
                        }
                        arrayList3.clear();
                        this.A00.A01.remove(arrayList3);
                    }
                };
                if (!z && !z2 && !z3) {
                    runnable3.run();
                    return;
                }
                if (A0C[0].charAt(3) == 'S') {
                    throw new RuntimeException();
                }
                String[] strArr = A0C;
                strArr[4] = "oGS3g0YSOogxL8fDiPQ9wWzcLRV8E0qu";
                strArr[3] = "UwBhVdK7HoWqzQqehBBKiWd5H5AJwN9O";
                C3T.A0E(arrayList3.get(0).A0H, runnable3, Math.max(z2 ? A06() : 0L, z3 ? A05() : 0L) + (z ? A07() : 0L));
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC1220Za
    public final boolean A0T(AnonymousClass56 anonymousClass56, int i, int i2, int i3, int i4) {
        View view = anonymousClass56.A0H;
        int translationX = i + ((int) anonymousClass56.A0H.getTranslationX());
        int translationY = i2 + ((int) anonymousClass56.A0H.getTranslationY());
        A04(anonymousClass56);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            A0O(anonymousClass56);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        this.A09.add(new C4M(anonymousClass56, translationX, translationY, i3, i4));
        return true;
    }

    private void A01(C4L c4l) {
        if (c4l.A05 != null) {
            A07(c4l, c4l.A05);
        }
        if (c4l.A04 != null) {
            A07(c4l, c4l.A04);
        }
    }

    private void A03(final AnonymousClass56 anonymousClass56) {
        final View view = anonymousClass56.A0H;
        final ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.A06.add(anonymousClass56);
        ViewPropertyAnimator animation = viewPropertyAnimatorAnimate.setDuration(A07());
        animation.alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.4G
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                viewPropertyAnimatorAnimate.setListener(null);
                view.setAlpha(1.0f);
                this.A02.A0P(anonymousClass56);
                this.A02.A06.remove(anonymousClass56);
                this.A02.A0V();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }
        }).start();
    }

    private void A04(AnonymousClass56 anonymousClass56) {
        if (A0B == null) {
            A0B = new ValueAnimator().getInterpolator();
        }
        anonymousClass56.A0H.animate().setInterpolator(A0B);
        A0K(anonymousClass56);
    }

    private final void A05(List<AnonymousClass56> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).A0H.animate().cancel();
        }
    }

    private void A06(List<C4L> list, AnonymousClass56 anonymousClass56) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C4L changeInfo = list.get(size);
            if (A07(changeInfo, anonymousClass56) && changeInfo.A05 == null && changeInfo.A04 == null) {
                list.remove(changeInfo);
            }
        }
    }

    private boolean A07(C4L c4l, AnonymousClass56 anonymousClass56) {
        boolean z = false;
        if (c4l.A04 == anonymousClass56) {
            c4l.A04 = null;
        } else if (c4l.A05 == anonymousClass56) {
            c4l.A05 = null;
            z = true;
        } else {
            return false;
        }
        anonymousClass56.A0H.setAlpha(1.0f);
        anonymousClass56.A0H.setTranslationX(0.0f);
        anonymousClass56.A0H.setTranslationY(0.0f);
        A0Q(anonymousClass56, z);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d6, code lost:
    
        r5 = r5 - 1;
     */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC04694k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0K(com.facebook.ads.redexgen.uinode.AnonymousClass56 r10) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C0693Ee.A0K(com.facebook.ads.redexgen.X.56):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC04694k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0L() {
        /*
            r4 = this;
            java.util.ArrayList<com.facebook.ads.redexgen.X.56> r0 = r4.A07
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb8
            java.util.ArrayList<com.facebook.ads.redexgen.X.4L> r0 = r4.A08
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb8
            java.util.ArrayList<com.facebook.ads.redexgen.X.4M> r0 = r4.A09
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb8
            java.util.ArrayList<com.facebook.ads.redexgen.X.56> r0 = r4.A0A
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb8
            java.util.ArrayList<com.facebook.ads.redexgen.X.56> r0 = r4.A04
            boolean r3 = r0.isEmpty()
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C0693Ee.A0C
            r0 = 2
            r1 = r2[r0]
            r0 = 5
            r2 = r2[r0]
            r0 = 18
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto La5
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C0693Ee.A0C
            java.lang.String r1 = "HATKbuX1ioRbKjbJza4uRkbMkwnilInw"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "55W5G9gSwoJRpeM2nuMk9rdzPBhIsXI5"
            r0 = 3
            r2[r0] = r1
            if (r3 == 0) goto Lb8
            java.util.ArrayList<com.facebook.ads.redexgen.X.56> r0 = r4.A06
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb8
            java.util.ArrayList<com.facebook.ads.redexgen.X.56> r0 = r4.A00
            boolean r3 = r0.isEmpty()
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C0693Ee.A0C
            r0 = 2
            r1 = r2[r0]
            r0 = 5
            r2 = r2[r0]
            r0 = 18
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto La2
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C0693Ee.A0C
            java.lang.String r1 = "PBqWGImhwZdo7IXQpaNFK9QlBHxMp4wk"
            r0 = 7
            r2[r0] = r1
            if (r3 == 0) goto Lb8
        L73:
            java.util.ArrayList<com.facebook.ads.redexgen.X.56> r0 = r4.A02
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb8
            java.util.ArrayList<java.util.ArrayList<com.facebook.ads.redexgen.X.4M>> r0 = r4.A05
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb8
            java.util.ArrayList<java.util.ArrayList<com.facebook.ads.redexgen.X.56>> r0 = r4.A01
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb8
            java.util.ArrayList<java.util.ArrayList<com.facebook.ads.redexgen.X.4L>> r3 = r4.A03
            java.lang.String[] r1 = com.facebook.ads.redexgen.uinode.C0693Ee.A0C
            r0 = 7
            r1 = r1[r0]
            r0 = 30
            char r1 = r1.charAt(r0)
            r0 = 119(0x77, float:1.67E-43)
            if (r1 == r0) goto Lab
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        La2:
            if (r3 == 0) goto Lb8
            goto L73
        La5:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        Lab:
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C0693Ee.A0C
            java.lang.String r1 = "80rjjAfjuSoUPBYOWBOUrC4mhnJBtDwK"
            r0 = 7
            r2[r0] = r1
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto Lba
        Lb8:
            r0 = 1
        Lb9:
            return r0
        Lba:
            r0 = 0
            goto Lb9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C0693Ee.A0L():boolean");
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC04694k
    public final boolean A0M(AnonymousClass56 anonymousClass56, List<Object> payloads) {
        return !payloads.isEmpty() || super.A0M(anonymousClass56, payloads);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC1220Za
    public final boolean A0R(AnonymousClass56 anonymousClass56) {
        A04(anonymousClass56);
        anonymousClass56.A0H.setAlpha(0.0f);
        this.A07.add(anonymousClass56);
        return true;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC1220Za
    public final boolean A0S(AnonymousClass56 anonymousClass56) {
        A04(anonymousClass56);
        this.A0A.add(anonymousClass56);
        return true;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC1220Za
    public final boolean A0U(AnonymousClass56 anonymousClass56, AnonymousClass56 anonymousClass562, int i, int i2, int i3, int i4) {
        if (anonymousClass56 == anonymousClass562) {
            return A0T(anonymousClass56, i, i2, i3, i4);
        }
        float translationX = anonymousClass56.A0H.getTranslationX();
        float translationY = anonymousClass56.A0H.getTranslationY();
        float prevTranslationY = anonymousClass56.A0H.getAlpha();
        A04(anonymousClass56);
        float prevTranslationX = i3 - i;
        int deltaY = (int) (prevTranslationX - translationX);
        float prevTranslationX2 = i4 - i2;
        int deltaX = (int) (prevTranslationX2 - translationY);
        anonymousClass56.A0H.setTranslationX(translationX);
        anonymousClass56.A0H.setTranslationY(translationY);
        anonymousClass56.A0H.setAlpha(prevTranslationY);
        if (anonymousClass562 != null) {
            A04(anonymousClass562);
            float prevTranslationX3 = -deltaY;
            anonymousClass562.A0H.setTranslationX(prevTranslationX3);
            float prevTranslationX4 = -deltaX;
            anonymousClass562.A0H.setTranslationY(prevTranslationX4);
            anonymousClass562.A0H.setAlpha(0.0f);
        }
        this.A08.add(new C4L(anonymousClass56, anonymousClass562, i, i2, i3, i4));
        return true;
    }

    public final void A0V() {
        if (!A0L()) {
            A0A();
        }
    }

    public final void A0W(final C4L c4l) {
        final View view;
        AnonymousClass56 holder = c4l.A05;
        if (holder == null) {
            view = null;
        } else {
            view = holder.A0H;
        }
        AnonymousClass56 holder2 = c4l.A04;
        final View view2 = holder2 != null ? holder2.A0H : null;
        if (view != null) {
            final ViewPropertyAnimator oldViewAnim = view.animate().setDuration(A05());
            this.A02.add(c4l.A05);
            oldViewAnim.translationX(c4l.A02 - c4l.A00);
            oldViewAnim.translationY(c4l.A03 - c4l.A01);
            oldViewAnim.alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.4J
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    oldViewAnim.setListener(null);
                    view.setAlpha(1.0f);
                    view.setTranslationX(0.0f);
                    view.setTranslationY(0.0f);
                    this.A03.A0Q(c4l.A05, true);
                    this.A03.A02.remove(c4l.A05);
                    this.A03.A0V();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }
            }).start();
        }
        if (view2 != null) {
            final ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.A02.add(c4l.A04);
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(A05()).alpha(1.0f).setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.4K
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    viewPropertyAnimatorAnimate.setListener(null);
                    view2.setAlpha(1.0f);
                    view2.setTranslationX(0.0f);
                    view2.setTranslationY(0.0f);
                    this.A03.A0Q(c4l.A04, false);
                    this.A03.A02.remove(c4l.A04);
                    this.A03.A0V();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }
            }).start();
        }
    }

    public final void A0X(final AnonymousClass56 anonymousClass56) {
        final View view = anonymousClass56.A0H;
        final ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.A00.add(anonymousClass56);
        ViewPropertyAnimator animation = viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(A04());
        animation.setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.4H
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                view.setAlpha(1.0f);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                viewPropertyAnimatorAnimate.setListener(null);
                this.A02.A0N(anonymousClass56);
                this.A02.A00.remove(anonymousClass56);
                this.A02.A0V();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }
        }).start();
    }

    public final void A0Y(final AnonymousClass56 anonymousClass56, int i, int i2, int i3, int i4) {
        final View view = anonymousClass56.A0H;
        final int i5 = i3 - i;
        final int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i6 != 0) {
            view.animate().translationY(0.0f);
        }
        final ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.A04.add(anonymousClass56);
        viewPropertyAnimatorAnimate.setDuration(A06()).setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.4I
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                if (i5 != 0) {
                    view.setTranslationX(0.0f);
                }
                if (i6 != 0) {
                    view.setTranslationY(0.0f);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                viewPropertyAnimatorAnimate.setListener(null);
                this.A04.A0O(anonymousClass56);
                this.A04.A04.remove(anonymousClass56);
                this.A04.A0V();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }
        }).start();
    }
}
