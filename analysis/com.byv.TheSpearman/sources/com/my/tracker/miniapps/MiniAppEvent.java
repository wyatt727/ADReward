package com.my.tracker.miniapps;

import com.my.tracker.obfuscated.j0;
import java.util.Map;

/* loaded from: classes4.dex */
public final class MiniAppEvent extends j0 {
    public final String customUserId;
    public final Map<String, String> eventParams;
    public final String miniAppId;
    public final String name;
    public final String platformUserId;
    public final String query;

    MiniAppEvent(int i, String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        super(i);
        this.miniAppId = str;
        this.platformUserId = str2;
        this.query = str3;
        this.customUserId = str4;
        this.name = str5;
        this.eventParams = map;
    }
}
