package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.lang.reflect.Constructor;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzacy implements zzadm {
    private static final int[] zza = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20};
    private static final zzacx zzc = new zzacx(new zzacw() { // from class: com.google.android.gms.internal.ads.zzacu
        @Override // com.google.android.gms.internal.ads.zzacw
        public final Constructor zza() {
            if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(zzadf.class).getConstructor(Integer.TYPE);
            }
            return null;
        }
    });
    private static final zzacx zzd = new zzacx(new zzacw() { // from class: com.google.android.gms.internal.ads.zzacv
        @Override // com.google.android.gms.internal.ads.zzacw
        public final Constructor zza() {
            return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(zzadf.class).getConstructor(new Class[0]);
        }
    });
    private zzfzn zze;
    private final zzalf zzf = new zzala();

    /* JADX WARN: Removed duplicated region for block: B:107:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01e0 A[Catch: all -> 0x03bf, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0017, B:9:0x001e, B:131:0x01e0, B:132:0x01e3, B:246:0x0391, B:247:0x0394, B:249:0x0399, B:252:0x039f, B:253:0x03a2, B:254:0x03a5, B:255:0x03ac, B:257:0x03b2, B:135:0x01ec, B:137:0x01f4, B:140:0x01fe, B:143:0x020a, B:145:0x0212, B:148:0x021c, B:151:0x0227, B:154:0x0232, B:157:0x023d, B:159:0x0245, B:161:0x024d, B:164:0x0257, B:166:0x0265, B:169:0x026f, B:172:0x027a, B:174:0x0282, B:176:0x0290, B:178:0x029e, B:181:0x02ae, B:183:0x02bc, B:186:0x02c6, B:188:0x02ce, B:190:0x02d6, B:192:0x02de, B:195:0x02e8, B:197:0x02f0, B:200:0x0300, B:202:0x0308, B:205:0x0312, B:207:0x031a, B:210:0x0323, B:212:0x032b, B:215:0x0334, B:218:0x033f, B:221:0x034a, B:224:0x0355, B:226:0x035d, B:229:0x0366, B:14:0x0048, B:15:0x0050, B:108:0x01a9, B:17:0x0055, B:20:0x0061, B:23:0x006c, B:26:0x0078, B:29:0x0084, B:32:0x008f, B:35:0x009b, B:38:0x00a6, B:41:0x00b1, B:44:0x00bd, B:47:0x00c8, B:50:0x00d4, B:53:0x00df, B:56:0x00ea, B:59:0x00f5, B:62:0x0101, B:65:0x010c, B:68:0x0118, B:71:0x0124, B:74:0x0130, B:77:0x013c, B:80:0x0148, B:83:0x0153, B:86:0x015e, B:89:0x0169, B:92:0x0174, B:95:0x017f, B:98:0x0189, B:101:0x0194, B:104:0x019e), top: B:264:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01ec A[Catch: all -> 0x03bf, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0017, B:9:0x001e, B:131:0x01e0, B:132:0x01e3, B:246:0x0391, B:247:0x0394, B:249:0x0399, B:252:0x039f, B:253:0x03a2, B:254:0x03a5, B:255:0x03ac, B:257:0x03b2, B:135:0x01ec, B:137:0x01f4, B:140:0x01fe, B:143:0x020a, B:145:0x0212, B:148:0x021c, B:151:0x0227, B:154:0x0232, B:157:0x023d, B:159:0x0245, B:161:0x024d, B:164:0x0257, B:166:0x0265, B:169:0x026f, B:172:0x027a, B:174:0x0282, B:176:0x0290, B:178:0x029e, B:181:0x02ae, B:183:0x02bc, B:186:0x02c6, B:188:0x02ce, B:190:0x02d6, B:192:0x02de, B:195:0x02e8, B:197:0x02f0, B:200:0x0300, B:202:0x0308, B:205:0x0312, B:207:0x031a, B:210:0x0323, B:212:0x032b, B:215:0x0334, B:218:0x033f, B:221:0x034a, B:224:0x0355, B:226:0x035d, B:229:0x0366, B:14:0x0048, B:15:0x0050, B:108:0x01a9, B:17:0x0055, B:20:0x0061, B:23:0x006c, B:26:0x0078, B:29:0x0084, B:32:0x008f, B:35:0x009b, B:38:0x00a6, B:41:0x00b1, B:44:0x00bd, B:47:0x00c8, B:50:0x00d4, B:53:0x00df, B:56:0x00ea, B:59:0x00f5, B:62:0x0101, B:65:0x010c, B:68:0x0118, B:71:0x0124, B:74:0x0130, B:77:0x013c, B:80:0x0148, B:83:0x0153, B:86:0x015e, B:89:0x0169, B:92:0x0174, B:95:0x017f, B:98:0x0189, B:101:0x0194, B:104:0x019e), top: B:264:0x0003 }] */
    @Override // com.google.android.gms.internal.ads.zzadm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized com.google.android.gms.internal.ads.zzadf[] zza(android.net.Uri r25, java.util.Map r26) {
        /*
            Method dump skipped, instructions count: 1148
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzacy.zza(android.net.Uri, java.util.Map):com.google.android.gms.internal.ads.zzadf[]");
    }

    private final void zzb(int i, List list) {
        switch (i) {
            case 0:
                list.add(new zzand());
                break;
            case 1:
                list.add(new zzang());
                break;
            case 2:
                list.add(new zzanj(0));
                break;
            case 3:
                list.add(new zzaeu(0));
                break;
            case 4:
                zzadf zzadfVarZza = zzc.zza(0);
                if (zzadfVarZza == null) {
                    list.add(new zzafm(0));
                    break;
                } else {
                    list.add(zzadfVarZza);
                    break;
                }
            case 5:
                list.add(new zzafp());
                break;
            case 6:
                list.add(new zzaik(this.zzf, 2));
                break;
            case 7:
                list.add(new zzais(0));
                break;
            case 8:
                list.add(new zzajp(this.zzf, 32));
                list.add(new zzajv(this.zzf, 16));
                break;
            case 9:
                list.add(new zzakm());
                break;
            case 10:
                list.add(new zzaom());
                break;
            case 11:
                if (this.zze == null) {
                    this.zze = zzfzn.zzm();
                }
                list.add(new zzaow(1, 1, this.zzf, new zzfv(0L), new zzanl(0, this.zze), TsExtractor.DEFAULT_TIMESTAMP_SEARCH_BYTES));
                break;
            case 12:
                list.add(new zzapi());
                break;
            case 14:
                list.add(new zzafv(0));
                break;
            case 15:
                zzadf zzadfVarZza2 = zzd.zza(new Object[0]);
                if (zzadfVarZza2 != null) {
                    list.add(zzadfVarZza2);
                    break;
                }
                break;
            case 16:
                list.add(new zzaez(1, this.zzf));
                break;
            case 17:
                list.add(new zzakx());
                break;
            case 18:
                list.add(new zzapn());
                break;
            case 19:
                list.add(new zzafg());
                break;
            case 20:
                list.add(new zzafu());
                break;
        }
    }
}
