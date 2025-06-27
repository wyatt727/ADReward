package com.applovin.impl;

import com.google.android.exoplayer2.util.MimeTypes;

/* loaded from: classes.dex */
public interface ye {

    /* renamed from: a, reason: collision with root package name */
    public static final ye f1206a = new a();

    boolean a(d9 d9Var);

    xe b(d9 d9Var);

    class a implements ye {
        a() {
        }

        @Override // com.applovin.impl.ye
        public boolean a(d9 d9Var) {
            String str = d9Var.m;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || MimeTypes.APPLICATION_ICY.equals(str) || MimeTypes.APPLICATION_AIT.equals(str);
        }

        @Override // com.applovin.impl.ye
        public xe b(d9 d9Var) {
            String str = d9Var.m;
            if (str != null) {
                str.hashCode();
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new z0();
                    case "application/x-icy":
                        return new qa();
                    case "application/id3":
                        return new ta();
                    case "application/x-emsg":
                        return new v7();
                    case "application/x-scte35":
                        return new qk();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    }
}
