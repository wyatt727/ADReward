package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.common.util.CollectionUtils;
import com.json.t2;
import com.my.target.ads.Reward;
import java.util.Set;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbtm extends zzbts {
    static final Set zza = CollectionUtils.setOf(t2.e.c, t2.e.b, "top-center", "center", t2.e.e, t2.e.d, "bottom-center");
    private String zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private final Object zzj;
    private final zzcgm zzk;
    private final Activity zzl;
    private zzcie zzm;
    private ImageView zzn;
    private LinearLayout zzo;
    private final zzbtt zzp;
    private PopupWindow zzq;
    private RelativeLayout zzr;
    private ViewGroup zzs;

    public zzbtm(zzcgm zzcgmVar, zzbtt zzbttVar) {
        super(zzcgmVar, "resize");
        this.zzb = t2.e.b;
        this.zzc = true;
        this.zzd = 0;
        this.zze = 0;
        this.zzf = -1;
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = -1;
        this.zzj = new Object();
        this.zzk = zzcgmVar;
        this.zzl = zzcgmVar.zzi();
        this.zzp = zzbttVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final void zzc(boolean z) throws JSONException {
        this.zzq.dismiss();
        this.zzr.removeView((View) this.zzk);
        ViewGroup viewGroup = this.zzs;
        if (viewGroup != null) {
            viewGroup.removeView(this.zzn);
            this.zzs.addView((View) this.zzk);
            this.zzk.zzah(this.zzm);
        }
        if (z) {
            zzl(Reward.DEFAULT);
            zzbtt zzbttVar = this.zzp;
            if (zzbttVar != null) {
                zzbttVar.zzb();
            }
        }
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzo = null;
    }

    public final void zza(final boolean z) {
        synchronized (this.zzj) {
            if (this.zzq != null) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzky)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                    zzc(z);
                } else {
                    zzcbr.zze.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbtk
                        @Override // java.lang.Runnable
                        public final void run() throws JSONException {
                            this.zza.zzc(z);
                        }
                    });
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:129:0x025e A[Catch: all -> 0x047c, TryCatch #1 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:9:0x0012, B:11:0x001a, B:12:0x001f, B:14:0x0021, B:16:0x002d, B:17:0x0032, B:19:0x0034, B:21:0x003c, B:22:0x0041, B:24:0x0043, B:26:0x0051, B:27:0x0062, B:29:0x0070, B:30:0x0081, B:32:0x008f, B:33:0x00a0, B:35:0x00ae, B:36:0x00bf, B:38:0x00cd, B:39:0x00db, B:41:0x00e9, B:42:0x00eb, B:44:0x00ef, B:46:0x00f3, B:48:0x00fb, B:51:0x0103, B:55:0x0129, B:61:0x0135, B:129:0x025e, B:130:0x0263, B:132:0x0265, B:134:0x0285, B:136:0x0289, B:138:0x0296, B:140:0x02d2, B:172:0x038b, B:179:0x03ba, B:180:0x03d2, B:181:0x03f3, B:183:0x03fb, B:184:0x0402, B:185:0x0428, B:188:0x042b, B:190:0x0450, B:191:0x0465, B:173:0x0392, B:174:0x0399, B:175:0x03a0, B:176:0x03a7, B:177:0x03ad, B:178:0x03b4, B:139:0x02cf, B:193:0x0467, B:194:0x046c, B:62:0x013c, B:64:0x0140, B:92:0x0193, B:100:0x01e3, B:102:0x01ee, B:104:0x01f1, B:106:0x01f4, B:108:0x01f8, B:111:0x01fe, B:93:0x019e, B:95:0x01b4, B:97:0x01bf, B:94:0x01a9, B:96:0x01b7, B:98:0x01c4, B:99:0x01d8, B:101:0x01e6, B:112:0x020f, B:118:0x0239, B:124:0x0249, B:121:0x023f, B:123:0x0247, B:115:0x0231, B:117:0x0237, B:125:0x0250, B:126:0x0256, B:196:0x046e, B:197:0x0473, B:199:0x0475, B:200:0x047a), top: B:207:0x0007, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0265 A[Catch: all -> 0x047c, TryCatch #1 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:9:0x0012, B:11:0x001a, B:12:0x001f, B:14:0x0021, B:16:0x002d, B:17:0x0032, B:19:0x0034, B:21:0x003c, B:22:0x0041, B:24:0x0043, B:26:0x0051, B:27:0x0062, B:29:0x0070, B:30:0x0081, B:32:0x008f, B:33:0x00a0, B:35:0x00ae, B:36:0x00bf, B:38:0x00cd, B:39:0x00db, B:41:0x00e9, B:42:0x00eb, B:44:0x00ef, B:46:0x00f3, B:48:0x00fb, B:51:0x0103, B:55:0x0129, B:61:0x0135, B:129:0x025e, B:130:0x0263, B:132:0x0265, B:134:0x0285, B:136:0x0289, B:138:0x0296, B:140:0x02d2, B:172:0x038b, B:179:0x03ba, B:180:0x03d2, B:181:0x03f3, B:183:0x03fb, B:184:0x0402, B:185:0x0428, B:188:0x042b, B:190:0x0450, B:191:0x0465, B:173:0x0392, B:174:0x0399, B:175:0x03a0, B:176:0x03a7, B:177:0x03ad, B:178:0x03b4, B:139:0x02cf, B:193:0x0467, B:194:0x046c, B:62:0x013c, B:64:0x0140, B:92:0x0193, B:100:0x01e3, B:102:0x01ee, B:104:0x01f1, B:106:0x01f4, B:108:0x01f8, B:111:0x01fe, B:93:0x019e, B:95:0x01b4, B:97:0x01bf, B:94:0x01a9, B:96:0x01b7, B:98:0x01c4, B:99:0x01d8, B:101:0x01e6, B:112:0x020f, B:118:0x0239, B:124:0x0249, B:121:0x023f, B:123:0x0247, B:115:0x0231, B:117:0x0237, B:125:0x0250, B:126:0x0256, B:196:0x046e, B:197:0x0473, B:199:0x0475, B:200:0x047a), top: B:207:0x0007, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0186  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzb(java.util.Map r18) {
        /*
            Method dump skipped, instructions count: 1204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbtm.zzb(java.util.Map):void");
    }

    public final void zzd(int i, int i2, boolean z) {
        synchronized (this.zzj) {
            this.zzd = i;
            this.zze = i2;
        }
    }

    public final void zze(int i, int i2) {
        this.zzd = i;
        this.zze = i2;
    }

    public final boolean zzf() {
        boolean z;
        synchronized (this.zzj) {
            z = this.zzq != null;
        }
        return z;
    }
}
