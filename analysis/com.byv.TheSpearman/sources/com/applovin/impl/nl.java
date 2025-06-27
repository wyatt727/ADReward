package com.applovin.impl;

import com.google.android.exoplayer2.text.cea.Cea608Decoder;
import com.google.android.exoplayer2.util.MimeTypes;

/* loaded from: classes.dex */
public interface nl {

    /* renamed from: a, reason: collision with root package name */
    public static final nl f725a = new a();

    boolean a(d9 d9Var);

    ll b(d9 d9Var);

    class a implements nl {
        a() {
        }

        @Override // com.applovin.impl.nl
        public boolean a(d9 d9Var) {
            String str = d9Var.m;
            return "text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str) || MimeTypes.TEXT_EXOPLAYER_CUES.equals(str);
        }

        @Override // com.applovin.impl.nl
        public ll b(d9 d9Var) {
            String str = d9Var.m;
            if (str != null) {
                str.hashCode();
                switch (str) {
                    case "application/dvbsubs":
                        return new h7(d9Var.o);
                    case "application/pgs":
                        return new gh();
                    case "application/x-mp4-vtt":
                        return new lf();
                    case "text/vtt":
                        return new zr();
                    case "application/x-quicktime-tx3g":
                        return new mp(d9Var.o);
                    case "text/x-ssa":
                        return new uk(d9Var.o);
                    case "application/x-mp4-cea-608":
                    case "application/cea-608":
                        return new w2(str, d9Var.E, Cea608Decoder.MIN_DATA_CHANNEL_TIMEOUT_MS);
                    case "text/x-exoplayer-cues":
                        return new g8();
                    case "application/cea-708":
                        return new x2(d9Var.E, d9Var.o);
                    case "application/x-subrip":
                        return new gl();
                    case "application/ttml+xml":
                        return new gp();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    }
}
