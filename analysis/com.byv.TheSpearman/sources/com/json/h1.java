package com.json;

import com.json.mediationsdk.e;
import java.net.URL;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class h1 extends e.a {
    public h1(y0 y0Var, URL url, JSONObject jSONObject, boolean z, int i, long j, boolean z2, boolean z3, int i2) {
        super(y0Var, url, jSONObject, z, i, j, z2, z3, i2);
    }

    @Override // com.ironsource.mediationsdk.e.a
    protected void a(boolean z, y0 y0Var, long j) {
        try {
            if (z) {
                ((d1) y0Var).a(this.b, this.f + 1, j, this.j, this.i);
            } else {
                y0Var.a(this.c, this.d, this.f + 1, this.g, j);
            }
        } catch (Exception e) {
            y0Var.a(1009, e.getMessage(), this.f + 1, this.g, j);
        }
    }
}
