package com.facebook.ads.redexgen.uinode;

import java.util.ArrayList;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public class PN {
    public final String A00;
    public final ArrayList<String> A01;
    public final ArrayList<String> A02;
    public final ArrayList<String> A03;
    public final JSONObject A04;
    public final boolean A05;

    public PN(JSONObject jSONObject, String str, ArrayList<String> imageUrls, ArrayList<String> videoUrls, ArrayList<String> fileUrls, boolean z) {
        this.A04 = jSONObject;
        this.A00 = str;
        this.A02 = imageUrls;
        this.A03 = videoUrls;
        this.A01 = fileUrls;
        this.A05 = z;
    }
}
