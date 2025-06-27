package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DefaultComponentBehavior.java */
/* loaded from: classes2.dex */
public class Kbd implements Td {
    @Override // com.bytedance.adsdk.ugeno.core.Td
    public List<mZx> EYQ() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new mZx("Text") { // from class: com.bytedance.adsdk.ugeno.core.Kbd.1
            @Override // com.bytedance.adsdk.ugeno.core.mZx
            public com.bytedance.adsdk.ugeno.component.mZx EYQ(Context context) {
                return new com.bytedance.adsdk.ugeno.component.text.mZx(context);
            }
        });
        arrayList.add(new mZx("Image") { // from class: com.bytedance.adsdk.ugeno.core.Kbd.4
            @Override // com.bytedance.adsdk.ugeno.core.mZx
            public com.bytedance.adsdk.ugeno.component.mZx EYQ(Context context) {
                return new com.bytedance.adsdk.ugeno.component.image.mZx(context);
            }
        });
        arrayList.add(new mZx("FlexLayout") { // from class: com.bytedance.adsdk.ugeno.core.Kbd.5
            @Override // com.bytedance.adsdk.ugeno.core.mZx
            public com.bytedance.adsdk.ugeno.component.mZx EYQ(Context context) {
                return new com.bytedance.adsdk.ugeno.component.flexbox.Kbd(context);
            }
        });
        arrayList.add(new mZx("FrameLayout") { // from class: com.bytedance.adsdk.ugeno.core.Kbd.6
            @Override // com.bytedance.adsdk.ugeno.core.mZx
            public com.bytedance.adsdk.ugeno.component.mZx EYQ(Context context) {
                return new com.bytedance.adsdk.ugeno.component.frame.EYQ(context);
            }
        });
        arrayList.add(new mZx("ScrollLayout") { // from class: com.bytedance.adsdk.ugeno.core.Kbd.7
            @Override // com.bytedance.adsdk.ugeno.core.mZx
            public com.bytedance.adsdk.ugeno.component.mZx EYQ(Context context) {
                return new com.bytedance.adsdk.ugeno.component.scroll.EYQ(context);
            }
        });
        arrayList.add(new mZx("RichText") { // from class: com.bytedance.adsdk.ugeno.core.Kbd.8
            @Override // com.bytedance.adsdk.ugeno.core.mZx
            public com.bytedance.adsdk.ugeno.component.mZx EYQ(Context context) {
                return new com.bytedance.adsdk.ugeno.component.text.EYQ(context);
            }
        });
        arrayList.add(new mZx("Input") { // from class: com.bytedance.adsdk.ugeno.core.Kbd.9
            @Override // com.bytedance.adsdk.ugeno.core.mZx
            public com.bytedance.adsdk.ugeno.component.mZx EYQ(Context context) {
                return new com.bytedance.adsdk.ugeno.component.input.EYQ(context);
            }
        });
        arrayList.add(new mZx("Dislike") { // from class: com.bytedance.adsdk.ugeno.core.Kbd.10
            @Override // com.bytedance.adsdk.ugeno.core.mZx
            public com.bytedance.adsdk.ugeno.component.mZx EYQ(Context context) {
                return new com.bytedance.adsdk.ugeno.component.dislike.EYQ(context);
            }
        });
        arrayList.add(new mZx("RatingBar") { // from class: com.bytedance.adsdk.ugeno.core.Kbd.11
            @Override // com.bytedance.adsdk.ugeno.core.mZx
            public com.bytedance.adsdk.ugeno.component.mZx EYQ(Context context) {
                return new com.bytedance.adsdk.ugeno.component.ratingbar.EYQ(context);
            }
        });
        arrayList.add(new mZx("UgenProgressView") { // from class: com.bytedance.adsdk.ugeno.core.Kbd.2
            @Override // com.bytedance.adsdk.ugeno.core.mZx
            public com.bytedance.adsdk.ugeno.component.mZx EYQ(Context context) {
                return new com.bytedance.adsdk.ugeno.component.progressbar.EYQ(context);
            }
        });
        arrayList.add(new mZx("ProgressButton") { // from class: com.bytedance.adsdk.ugeno.core.Kbd.3
            @Override // com.bytedance.adsdk.ugeno.core.mZx
            public com.bytedance.adsdk.ugeno.component.mZx EYQ(Context context) {
                return new com.bytedance.adsdk.ugeno.component.progressbar.EYQ(context);
            }
        });
        return arrayList;
    }
}
