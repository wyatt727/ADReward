package com.applovin.impl;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class lq {

    /* renamed from: a, reason: collision with root package name */
    private String f633a;
    private String b;
    private String c;
    private long d = -1;
    private int e = -1;

    public String toString() {
        return "VastTracker{identifier='" + this.f633a + "', event='" + this.b + "', uriString='" + this.c + "', offsetSeconds=" + this.d + ", offsetPercent=" + this.e + AbstractJsonLexerKt.END_OBJ;
    }

    private lq() {
    }

    public static lq a(fs fsVar, fq fqVar, com.applovin.impl.sdk.k kVar) {
        List<String> listExplode;
        int size;
        long seconds;
        if (fsVar == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (kVar != null) {
            try {
                String strD = fsVar.d();
                if (StringUtils.isValidString(strD)) {
                    lq lqVar = new lq();
                    lqVar.c = strD;
                    lqVar.f633a = (String) fsVar.a().get("id");
                    lqVar.b = (String) fsVar.a().get(NotificationCompat.CATEGORY_EVENT);
                    lqVar.e = a(lqVar.a(), fqVar);
                    String str = (String) fsVar.a().get(TypedValues.CycleType.S_WAVE_OFFSET);
                    if (StringUtils.isValidString(str)) {
                        String strTrim = str.trim();
                        if (strTrim.contains("%")) {
                            lqVar.e = StringUtils.parseInt(strTrim.substring(0, strTrim.length() - 1));
                        } else if (strTrim.contains(":") && (size = (listExplode = CollectionUtils.explode(strTrim, ":")).size()) > 0) {
                            long j = 0;
                            int i = size - 1;
                            for (int i2 = i; i2 >= 0; i2--) {
                                String str2 = listExplode.get(i2);
                                if (StringUtils.isNumeric(str2)) {
                                    int i3 = Integer.parseInt(str2);
                                    if (i2 == i) {
                                        seconds = i3;
                                    } else if (i2 == size - 2) {
                                        seconds = TimeUnit.MINUTES.toSeconds(i3);
                                    } else if (i2 == size - 3) {
                                        seconds = TimeUnit.HOURS.toSeconds(i3);
                                    }
                                    j += seconds;
                                }
                            }
                            lqVar.d = j;
                            lqVar.e = -1;
                        }
                    }
                    return lqVar;
                }
                kVar.L();
                if (!com.applovin.impl.sdk.t.a()) {
                    return null;
                }
                kVar.L().b("VastTracker", "Unable to create tracker. Could not find URL.");
                return null;
            } catch (Throwable th) {
                kVar.L();
                if (com.applovin.impl.sdk.t.a()) {
                    kVar.L().a("VastTracker", "Error occurred while initializing", th);
                }
                kVar.B().a("VastTracker", th);
                return null;
            }
        }
        throw new IllegalArgumentException("No sdk specified.");
    }

    public String b() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lq)) {
            return false;
        }
        lq lqVar = (lq) obj;
        if (this.d != lqVar.d || this.e != lqVar.e) {
            return false;
        }
        String str = this.f633a;
        if (str == null ? lqVar.f633a != null : !str.equals(lqVar.f633a)) {
            return false;
        }
        String str2 = this.b;
        if (str2 == null ? lqVar.b == null : str2.equals(lqVar.b)) {
            return this.c.equals(lqVar.c);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f633a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.c.hashCode()) * 31;
        long j = this.d;
        return ((iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31) + this.e;
    }

    public String a() {
        return this.b;
    }

    public boolean a(long j, int i) {
        long j2 = this.d;
        boolean z = j2 >= 0;
        boolean z2 = j >= j2;
        int i2 = this.e;
        boolean z3 = i2 >= 0;
        boolean z4 = i >= i2;
        if (z && z2) {
            return true;
        }
        return z3 && z4;
    }

    private static int a(String str, fq fqVar) {
        if ("start".equalsIgnoreCase(str)) {
            return 0;
        }
        if ("firstQuartile".equalsIgnoreCase(str)) {
            return 25;
        }
        if (CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT.equalsIgnoreCase(str)) {
            return 50;
        }
        if ("thirdQuartile".equalsIgnoreCase(str)) {
            return 75;
        }
        if (!CampaignEx.JSON_NATIVE_VIDEO_COMPLETE.equalsIgnoreCase(str)) {
            return -1;
        }
        if (fqVar != null) {
            return fqVar.g();
        }
        return 95;
    }
}
