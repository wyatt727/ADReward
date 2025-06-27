package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.json.t2;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfgm {
    private final zzawo zza;

    public zzfgm(zzawo zzawoVar) {
        this.zza = zzawoVar;
    }

    private static final Uri zzb(Uri uri, String str) throws zzawp {
        if (uri != null) {
            try {
                try {
                    String host = uri.getHost();
                    String path = uri.getPath();
                    if (host != null && host.equals("ad.doubleclick.net") && path != null) {
                        if (path.contains(";")) {
                            if (uri.toString().contains("dc_ms=")) {
                                throw new zzawp("Parameter already exists: dc_ms");
                            }
                            String string = uri.toString();
                            int iIndexOf = string.indexOf(";adurl");
                            if (iIndexOf != -1) {
                                int i = iIndexOf + 1;
                                StringBuilder sb = new StringBuilder(string.substring(0, i));
                                sb.append("dc_ms");
                                sb.append(t2.i.b);
                                sb.append(str);
                                sb.append(";");
                                sb.append((CharSequence) string, i, string.length());
                                return Uri.parse(sb.toString());
                            }
                            String encodedPath = uri.getEncodedPath();
                            if (encodedPath == null) {
                                throw new UnsupportedOperationException();
                            }
                            int iIndexOf2 = string.indexOf(encodedPath);
                            StringBuilder sb2 = new StringBuilder(string.substring(0, encodedPath.length() + iIndexOf2));
                            sb2.append(";");
                            sb2.append("dc_ms");
                            sb2.append(t2.i.b);
                            sb2.append(str);
                            sb2.append(";");
                            sb2.append((CharSequence) string, iIndexOf2 + encodedPath.length(), string.length());
                            return Uri.parse(sb2.toString());
                        }
                    }
                } catch (NullPointerException unused) {
                }
            } catch (UnsupportedOperationException unused2) {
                throw new zzawp("Provided Uri is not in a valid state");
            }
        }
        if (uri.getQueryParameter("ms") != null) {
            throw new zzawp("Query parameter already exists: ms");
        }
        if (uri == null) {
            throw new UnsupportedOperationException();
        }
        String string2 = uri.toString();
        int iIndexOf3 = string2.indexOf("&adurl");
        if (iIndexOf3 == -1) {
            iIndexOf3 = string2.indexOf("?adurl");
        }
        if (iIndexOf3 == -1) {
            return uri.buildUpon().appendQueryParameter("ms", str).build();
        }
        int i2 = iIndexOf3 + 1;
        StringBuilder sb3 = new StringBuilder(string2.substring(0, i2));
        sb3.append("ms");
        sb3.append(t2.i.b);
        sb3.append(str);
        sb3.append(t2.i.c);
        sb3.append((CharSequence) string2, i2, string2.length());
        return Uri.parse(sb3.toString());
    }

    public final Uri zza(Uri uri, Context context, View view, Activity activity) throws zzawp {
        try {
            return zzb(uri, this.zza.zzc().zzf(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new zzawp("Provided Uri is not in a valid state");
        }
    }
}
