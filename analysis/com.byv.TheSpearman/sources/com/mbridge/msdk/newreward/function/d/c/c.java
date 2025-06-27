package com.mbridge.msdk.newreward.function.d.c;

/* compiled from: BaseCampaignResourceH5Template.java */
/* loaded from: classes4.dex */
public abstract class c extends d<String> {
    protected Boolean b;
    private String c;

    protected abstract boolean a_();

    @Override // com.mbridge.msdk.newreward.function.d.c.d
    protected final boolean f() {
        return false;
    }

    public c(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.a.a aVar) {
        super(bVar, aVar);
        this.b = null;
    }

    public final void a(String str) {
        this.c = str;
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.o
    public final boolean g() {
        Boolean bool = this.b;
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean boolValueOf = Boolean.valueOf(a_());
        this.b = boolValueOf;
        return boolValueOf.booleanValue();
    }
}
