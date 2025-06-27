package com.applovin.impl;

import com.applovin.impl.we;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class x9 {
    private static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a, reason: collision with root package name */
    public int f1163a = -1;
    public int b = -1;

    public boolean a() {
        return (this.f1163a == -1 || this.b == -1) ? false : true;
    }

    public boolean a(we weVar) {
        for (int i = 0; i < weVar.c(); i++) {
            we.b bVarA = weVar.a(i);
            if (bVarA instanceof s3) {
                s3 s3Var = (s3) bVarA;
                if ("iTunSMPB".equals(s3Var.c) && a(s3Var.d)) {
                    return true;
                }
            } else if (bVarA instanceof nb) {
                nb nbVar = (nb) bVarA;
                if ("com.apple.iTunes".equals(nbVar.b) && "iTunSMPB".equals(nbVar.c) && a(nbVar.d)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public boolean a(int i) {
        int i2 = i >> 12;
        int i3 = i & 4095;
        if (i2 <= 0 && i3 <= 0) {
            return false;
        }
        this.f1163a = i2;
        this.b = i3;
        return true;
    }

    private boolean a(String str) throws NumberFormatException {
        Matcher matcher = c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int i = Integer.parseInt((String) yp.a((Object) matcher.group(1)), 16);
            int i2 = Integer.parseInt((String) yp.a((Object) matcher.group(2)), 16);
            if (i <= 0 && i2 <= 0) {
                return false;
            }
            this.f1163a = i;
            this.b = i2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
