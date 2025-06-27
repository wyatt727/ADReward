package com.json.mediationsdk;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.exoplayer2.upstream.cache.ContentMetadata;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.json.environment.StringUtils;
import com.json.mediationsdk.logger.IronLog;
import com.json.mediationsdk.logger.IronSourceLogger;
import com.json.mediationsdk.logger.IronSourceLoggerManager;
import com.json.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class IronSourceSegment {
    public static final String AGE = "age";
    public static final String GENDER = "gen";
    public static final String IAPT = "iapt";
    public static final String LEVEL = "lvl";
    public static final String PAYING = "pay";
    public static final String USER_CREATION_DATE = "ucd";
    private static final String m = "segName";

    /* renamed from: a, reason: collision with root package name */
    private String f1903a;
    private String g;
    private int b = 999999;
    private double c = 999999.99d;
    private final String d = "custom";
    private final int e = 5;
    private int f = -1;
    private int h = -1;
    private AtomicBoolean i = null;
    private double j = -1.0d;
    private long k = 0;
    private ArrayList<Pair<String, String>> l = new ArrayList<>();

    private boolean a(String str) {
        if (str == null) {
            return false;
        }
        return str.matches("^[a-zA-Z0-9]*$");
    }

    private boolean a(String str, int i, int i2) {
        return str != null && str.length() >= i && str.length() <= i2;
    }

    public int getAge() {
        return this.f;
    }

    public String getGender() {
        return this.g;
    }

    public double getIapt() {
        return this.j;
    }

    public AtomicBoolean getIsPaying() {
        return this.i;
    }

    public int getLevel() {
        return this.h;
    }

    public ArrayList<Pair<String, String>> getSegmentData() {
        ArrayList<Pair<String, String>> arrayList = new ArrayList<>();
        if (this.f != -1) {
            arrayList.add(new Pair<>("age", this.f + ""));
        }
        if (!TextUtils.isEmpty(this.g)) {
            arrayList.add(new Pair<>(GENDER, this.g));
        }
        if (this.h != -1) {
            arrayList.add(new Pair<>(LEVEL, this.h + ""));
        }
        if (this.i != null) {
            arrayList.add(new Pair<>(PAYING, this.i + ""));
        }
        if (this.j != -1.0d) {
            arrayList.add(new Pair<>("iapt", this.j + ""));
        }
        if (this.k != 0) {
            arrayList.add(new Pair<>(USER_CREATION_DATE, this.k + ""));
        }
        if (!TextUtils.isEmpty(this.f1903a)) {
            arrayList.add(new Pair<>(m, this.f1903a));
        }
        arrayList.addAll(this.l);
        return arrayList;
    }

    public String getSegmentName() {
        return this.f1903a;
    }

    public long getUcd() {
        return this.k;
    }

    public void setAge(int i) {
        if (i > 0 && i <= 199) {
            this.f = i;
            return;
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setAge( " + i + " ) age must be between 1-199", 2);
    }

    public void setCustom(String str, String str2) {
        try {
            if (a(str) && a(str2) && a(str, 1, 32) && a(str2, 1, 32)) {
                String str3 = ContentMetadata.KEY_CUSTOM_PREFIX + str;
                if (this.l.size() >= 5) {
                    this.l.remove(0);
                }
                this.l.add(new Pair<>(str3, str2));
                return;
            }
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setCustom( " + str + " , " + str2 + " ) key and value must be alphanumeric and 1-32 in length", 2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setGender(String str) {
        if (!TextUtils.isEmpty(str) && (StringUtils.toLowerCase(str).equals(IronSourceConstants.a.b) || StringUtils.toLowerCase(str).equals(IronSourceConstants.a.c))) {
            this.g = str;
            return;
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setGender( " + str + " ) is invalid", 2);
    }

    public void setIAPTotal(double d) {
        if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && d < this.c) {
            this.j = Math.floor(d * 100.0d) / 100.0d;
            return;
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setIAPTotal( " + d + " ) iapt must be between 0-" + this.c, 2);
    }

    public void setIsPaying(boolean z) {
        if (this.i == null) {
            this.i = new AtomicBoolean();
        }
        this.i.set(z);
    }

    public void setLevel(int i) {
        if (i > 0 && i < this.b) {
            this.h = i;
            return;
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setLevel( " + i + " ) level must be between 1-" + this.b, 2);
    }

    public void setSegmentName(String str) {
        if (a(str) && a(str, 1, 32)) {
            this.f1903a = str;
            return;
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setSegmentName( " + str + " ) segment name must be alphanumeric and 1-32 in length", 2);
    }

    public void setUserCreationDate(long j) {
        if (j > 0) {
            this.k = j;
            return;
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setUserCreationDate( " + j + " ) is an invalid timestamp", 2);
    }

    public JSONObject toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Iterator<Pair<String, String>> it = getSegmentData().iterator();
        while (it.hasNext()) {
            Pair<String, String> next = it.next();
            try {
                jSONObject.put((String) next.first, next.second);
            } catch (JSONException e) {
                IronLog.INTERNAL.error("exception " + e.getMessage());
            }
        }
        return jSONObject;
    }
}
