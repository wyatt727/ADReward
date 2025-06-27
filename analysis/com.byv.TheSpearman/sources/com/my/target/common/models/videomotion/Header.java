package com.my.target.common.models.videomotion;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public class Header {
    public final String adDisclaimerText;
    public final String ageRestrictionText;
    public final String icon;
    public final String linkText;
    public final String title;

    public Header(String str, String str2, String str3, String str4, String str5) {
        this.icon = str;
        this.title = str2;
        this.linkText = str3;
        this.ageRestrictionText = str4;
        this.adDisclaimerText = str5;
    }

    public String toString() {
        return "Header{icon='" + this.icon + "', title='" + this.title + "', linkText='" + this.linkText + "', ageRestrictionText='" + this.ageRestrictionText + "', adDisclaimerText='" + this.adDisclaimerText + '\'' + AbstractJsonLexerKt.END_OBJ;
    }
}
