package com.android.billingclient.api;

/* compiled from: com.android.billingclient:billing@@6.2.1 */
/* loaded from: classes.dex */
public final class QueryPurchasesParams {
    private final String zza;

    /* compiled from: com.android.billingclient:billing@@6.2.1 */
    public static class Builder {
        private String zza;

        private Builder() {
        }

        /* synthetic */ Builder(zzdg zzdgVar) {
        }

        public QueryPurchasesParams build() {
            if (this.zza != null) {
                return new QueryPurchasesParams(this, null);
            }
            throw new IllegalArgumentException("Product type must be set");
        }

        public Builder setProductType(String str) {
            this.zza = str;
            return this;
        }
    }

    /* synthetic */ QueryPurchasesParams(Builder builder, zzdh zzdhVar) {
        this.zza = builder.zza;
    }

    public static Builder newBuilder() {
        return new Builder(null);
    }

    public final String zza() {
        return this.zza;
    }
}
