package com.pgl.ssdk.ces.out;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes4.dex */
public final class PglSSConfig {
    public static final int COLLECT_MODE_DEFAULT = 0;
    public static final int COLLECT_MODE_ML_MINIMIZE = 1;
    public static final int OVREGION_TYPE_CN = 2;
    public static final int OVREGION_TYPE_SG = 0;
    public static final int OVREGION_TYPE_UNKNOWN = -1;
    public static final int OVREGION_TYPE_VA = 1;

    /* renamed from: a, reason: collision with root package name */
    private String f4311a;
    private final int b;
    private final int c;
    private final int d;
    private Map e;
    private String f;
    private String g;

    public class Builder {

        /* renamed from: a, reason: collision with root package name */
        private String f4312a;
        private int b = -1;
        private int c = 0;
        private int d;

        public PglSSConfig build() {
            if (TextUtils.isEmpty(this.f4312a)) {
                return null;
            }
            int i = this.b;
            if (i != 2 && i != 1 && i != 0) {
                return null;
            }
            int i2 = this.c;
            if (i2 == 0 || i2 == 1) {
                return new PglSSConfig(this.f4312a, i, i2, this.d);
            }
            return null;
        }

        public Builder setAdsdkVersionCode(int i) {
            this.d = i;
            return this;
        }

        public Builder setAppId(String str) {
            this.f4312a = str;
            return this;
        }

        public Builder setCollectMode(int i) {
            this.c = i;
            return this;
        }

        public Builder setOVRegionType(int i) {
            this.b = i;
            return this;
        }
    }

    private PglSSConfig(String str, int i, int i2, int i3) {
        this.f4311a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public static Builder builder() {
        return new Builder();
    }

    public int getAdSdkVersionCode() {
        return this.d;
    }

    public String getAppId() {
        return this.f4311a;
    }

    public String getCnReportUrl() {
        return this.f;
    }

    public String getCnTokenUrl() {
        return this.g;
    }

    public int getCollectMode() {
        return this.c;
    }

    public Map getCustomInfo() {
        return this.e;
    }

    public int getOVRegionType() {
        return this.b;
    }

    public void setCnReportUrl(String str) {
        this.f = str;
    }

    public void setCnTokenUrl(String str) {
        this.g = str;
    }

    public void setCustomInfo(Map map) {
        this.e = map;
    }
}
