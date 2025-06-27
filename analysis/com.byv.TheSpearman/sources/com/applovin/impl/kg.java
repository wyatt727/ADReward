package com.applovin.impl;

import android.view.View;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;

/* loaded from: classes.dex */
public class kg {

    /* renamed from: a, reason: collision with root package name */
    private final View f601a;
    private final FriendlyObstructionPurpose b;
    private final String c;

    public kg(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f601a = view;
        this.b = friendlyObstructionPurpose;
        this.c = str;
    }

    public View c() {
        return this.f601a;
    }

    public FriendlyObstructionPurpose b() {
        return this.b;
    }

    public String a() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        kg kgVar = (kg) obj;
        View view = this.f601a;
        if (view == null ? kgVar.f601a != null : !view.equals(kgVar.f601a)) {
            return false;
        }
        if (this.b != kgVar.b) {
            return false;
        }
        String str = this.c;
        String str2 = kgVar.c;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        View view = this.f601a;
        int iHashCode = (view != null ? view.hashCode() : 0) * 31;
        FriendlyObstructionPurpose friendlyObstructionPurpose = this.b;
        int iHashCode2 = (iHashCode + (friendlyObstructionPurpose != null ? friendlyObstructionPurpose.hashCode() : 0)) * 31;
        String str = this.c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
