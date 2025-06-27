package com.google.android.gms.internal.ads;

import com.google.common.net.HttpHeaders;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzajr {
    static final String[] zza = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", HttpHeaders.TRAILER, "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};
    public static final /* synthetic */ int zzb = 0;

    /* JADX WARN: Removed duplicated region for block: B:134:0x0267 A[Catch: all -> 0x01f9, TryCatch #0 {all -> 0x01f9, blocks: (B:9:0x002c, B:13:0x0036, B:16:0x003f, B:17:0x004b, B:20:0x0057, B:23:0x0064, B:26:0x0073, B:29:0x0080, B:32:0x008d, B:34:0x0097, B:41:0x00ae, B:42:0x00c4, B:43:0x00d8, B:46:0x00e4, B:49:0x00f1, B:52:0x00fe, B:55:0x010b, B:58:0x0118, B:61:0x0125, B:64:0x0132, B:67:0x013f, B:70:0x014c, B:73:0x015c, B:77:0x0170, B:79:0x0176, B:81:0x018b, B:82:0x0192, B:84:0x0199, B:89:0x01a4, B:94:0x01b0, B:134:0x0267, B:95:0x01c5, B:97:0x01cc, B:99:0x01d6, B:100:0x01ea, B:115:0x0219, B:118:0x0226, B:121:0x0232, B:124:0x023e, B:127:0x024a, B:130:0x0256, B:133:0x0260, B:135:0x0280, B:136:0x0287), top: B:141:0x001e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzbx zza(com.google.android.gms.internal.ads.zzfo r13) {
        /*
            Method dump skipped, instructions count: 661
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajr.zza(com.google.android.gms.internal.ads.zzfo):com.google.android.gms.internal.ads.zzbx");
    }

    private static int zzb(zzfo zzfoVar) {
        zzfoVar.zzL(4);
        if (zzfoVar.zzg() == 1684108385) {
            zzfoVar.zzL(8);
            return zzfoVar.zzm();
        }
        zzfe.zzf("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    private static zzahd zzc(int i, String str, zzfo zzfoVar, boolean z, boolean z2) {
        int iZzb = zzb(zzfoVar);
        if (z2) {
            iZzb = Math.min(1, iZzb);
        }
        if (iZzb >= 0) {
            return z ? new zzahl(str, null, zzfzn.zzn(Integer.toString(iZzb))) : new zzagw("und", str, Integer.toString(iZzb));
        }
        zzfe.zzf("MetadataUtil", "Failed to parse uint8 attribute: ".concat(zzaja.zzf(i)));
        return null;
    }

    private static zzahl zzd(int i, String str, zzfo zzfoVar) {
        int iZzg = zzfoVar.zzg();
        if (zzfoVar.zzg() == 1684108385 && iZzg >= 22) {
            zzfoVar.zzL(10);
            int iZzq = zzfoVar.zzq();
            if (iZzq > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(iZzq);
                String string = sb.toString();
                int iZzq2 = zzfoVar.zzq();
                if (iZzq2 > 0) {
                    string = string + "/" + iZzq2;
                }
                return new zzahl(str, null, zzfzn.zzn(string));
            }
        }
        zzfe.zzf("MetadataUtil", "Failed to parse index/count attribute: ".concat(zzaja.zzf(i)));
        return null;
    }

    private static zzahl zze(int i, String str, zzfo zzfoVar) {
        int iZzg = zzfoVar.zzg();
        if (zzfoVar.zzg() == 1684108385) {
            zzfoVar.zzL(8);
            return new zzahl(str, null, zzfzn.zzn(zzfoVar.zzz(iZzg - 16)));
        }
        zzfe.zzf("MetadataUtil", "Failed to parse text attribute: ".concat(zzaja.zzf(i)));
        return null;
    }
}
