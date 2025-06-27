package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzanl implements zzaoz {
    private final List zza;

    public zzanl() {
        this(0);
    }

    public zzanl(int i, List list) {
        this.zza = list;
    }

    private final zzaop zzb(zzaoy zzaoyVar) {
        return new zzaop(zzd(zzaoyVar));
    }

    private final zzapd zzc(zzaoy zzaoyVar) {
        return new zzapd(zzd(zzaoyVar));
    }

    private final List zzd(zzaoy zzaoyVar) {
        String str;
        int i;
        List listSingletonList;
        zzfo zzfoVar = new zzfo(zzaoyVar.zze);
        List arrayList = this.zza;
        while (zzfoVar.zzb() > 0) {
            int iZzm = zzfoVar.zzm();
            int iZzd = zzfoVar.zzd() + zzfoVar.zzm();
            if (iZzm == 134) {
                arrayList = new ArrayList();
                int iZzm2 = zzfoVar.zzm() & 31;
                for (int i2 = 0; i2 < iZzm2; i2++) {
                    String strZzA = zzfoVar.zzA(3, zzfwd.zzc);
                    int iZzm3 = zzfoVar.zzm();
                    boolean z = (iZzm3 & 128) != 0;
                    if (z) {
                        i = iZzm3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bZzm = (byte) zzfoVar.zzm();
                    zzfoVar.zzL(1);
                    if (z) {
                        int i3 = bZzm & 64;
                        int i4 = zzem.zza;
                        listSingletonList = Collections.singletonList(i3 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    zzak zzakVar = new zzak();
                    zzakVar.zzW(str);
                    zzakVar.zzN(strZzA);
                    zzakVar.zzw(i);
                    zzakVar.zzL(listSingletonList);
                    arrayList.add(zzakVar.zzac());
                }
            }
            zzfoVar.zzK(iZzd);
        }
        return arrayList;
    }

    public zzanl(int i) {
        this.zza = zzfzn.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzaoz
    public final zzapb zza(int i, zzaoy zzaoyVar) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new zzaof(new zzaoc(zzaoyVar.zzb, zzaoyVar.zza()));
            }
            if (i == 21) {
                return new zzaof(new zzaoa());
            }
            if (i == 27) {
                return new zzaof(new zzanx(zzb(zzaoyVar), false, false));
            }
            if (i == 36) {
                return new zzaof(new zzanz(zzb(zzaoyVar)));
            }
            if (i == 89) {
                return new zzaof(new zzann(zzaoyVar.zzd));
            }
            if (i == 172) {
                return new zzaof(new zzanh(zzaoyVar.zzb, zzaoyVar.zza()));
            }
            if (i == 257) {
                return new zzaoo(new zzaoe(MimeTypes.APPLICATION_AIT));
            }
            if (i != 128) {
                if (i != 129) {
                    if (i != 138) {
                        if (i == 139) {
                            return new zzaof(new zzanm(zzaoyVar.zzb, zzaoyVar.zza(), 5408));
                        }
                        switch (i) {
                            case 15:
                                return new zzaof(new zzank(false, zzaoyVar.zzb, zzaoyVar.zza()));
                            case 16:
                                return new zzaof(new zzant(zzc(zzaoyVar)));
                            case 17:
                                return new zzaof(new zzaob(zzaoyVar.zzb, zzaoyVar.zza()));
                            default:
                                switch (i) {
                                    case 134:
                                        return new zzaoo(new zzaoe("application/x-scte35"));
                                    case 135:
                                        break;
                                    case 136:
                                        break;
                                    default:
                                        return null;
                                }
                        }
                    }
                    return new zzaof(new zzanm(zzaoyVar.zzb, zzaoyVar.zza(), 4096));
                }
                return new zzaof(new zzane(zzaoyVar.zzb, zzaoyVar.zza()));
            }
        }
        return new zzaof(new zzanq(zzc(zzaoyVar)));
    }
}
