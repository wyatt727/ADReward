package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.we;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.net.HttpHeaders;

/* loaded from: classes.dex */
abstract class cf {

    /* renamed from: a, reason: collision with root package name */
    static final String[] f330a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", HttpHeaders.TRAILER, "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    public static we.b b(yg ygVar) {
        int iD = ygVar.d() + ygVar.j();
        int iJ = ygVar.j();
        int i = (iJ >> 24) & 255;
        try {
            if (i == 169 || i == 253) {
                int i2 = 16777215 & iJ;
                if (i2 == 6516084) {
                    return a(iJ, ygVar);
                }
                if (i2 == 7233901 || i2 == 7631467) {
                    return b(iJ, "TIT2", ygVar);
                }
                if (i2 == 6516589 || i2 == 7828084) {
                    return b(iJ, "TCOM", ygVar);
                }
                if (i2 == 6578553) {
                    return b(iJ, "TDRC", ygVar);
                }
                if (i2 == 4280916) {
                    return b(iJ, "TPE1", ygVar);
                }
                if (i2 == 7630703) {
                    return b(iJ, "TSSE", ygVar);
                }
                if (i2 == 6384738) {
                    return b(iJ, "TALB", ygVar);
                }
                if (i2 == 7108978) {
                    return b(iJ, "USLT", ygVar);
                }
                if (i2 == 6776174) {
                    return b(iJ, "TCON", ygVar);
                }
                if (i2 == 6779504) {
                    return b(iJ, "TIT1", ygVar);
                }
            } else {
                if (iJ == 1735291493) {
                    return c(ygVar);
                }
                if (iJ == 1684632427) {
                    return a(iJ, "TPOS", ygVar);
                }
                if (iJ == 1953655662) {
                    return a(iJ, "TRCK", ygVar);
                }
                if (iJ == 1953329263) {
                    return a(iJ, "TBPM", ygVar, true, false);
                }
                if (iJ == 1668311404) {
                    return a(iJ, "TCMP", ygVar, true, true);
                }
                if (iJ == 1668249202) {
                    return a(ygVar);
                }
                if (iJ == 1631670868) {
                    return b(iJ, "TPE2", ygVar);
                }
                if (iJ == 1936682605) {
                    return b(iJ, "TSOT", ygVar);
                }
                if (iJ == 1936679276) {
                    return b(iJ, "TSO2", ygVar);
                }
                if (iJ == 1936679282) {
                    return b(iJ, "TSOA", ygVar);
                }
                if (iJ == 1936679265) {
                    return b(iJ, "TSOP", ygVar);
                }
                if (iJ == 1936679791) {
                    return b(iJ, "TSOC", ygVar);
                }
                if (iJ == 1920233063) {
                    return a(iJ, "ITUNESADVISORY", ygVar, false, false);
                }
                if (iJ == 1885823344) {
                    return a(iJ, "ITUNESGAPLESS", ygVar, false, true);
                }
                if (iJ == 1936683886) {
                    return b(iJ, "TVSHOWSORT", ygVar);
                }
                if (iJ == 1953919848) {
                    return b(iJ, "TVSHOW", ygVar);
                }
                if (iJ == 757935405) {
                    return a(ygVar, iD);
                }
            }
            kc.a("MetadataUtil", "Skipped unknown metadata entry: " + i1.a(iJ));
            ygVar.f(iD);
            return null;
        } finally {
            ygVar.f(iD);
        }
    }

    private static s3 a(int i, yg ygVar) {
        int iJ = ygVar.j();
        if (ygVar.j() == 1684108385) {
            ygVar.g(8);
            String strB = ygVar.b(iJ - 16);
            return new s3("und", strB, strB);
        }
        kc.d("MetadataUtil", "Failed to parse comment attribute: " + i1.a(i));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.applovin.impl.ao c(com.applovin.impl.yg r3) {
        /*
            int r3 = d(r3)
            r0 = 0
            if (r3 <= 0) goto L11
            java.lang.String[] r1 = com.applovin.impl.cf.f330a
            int r2 = r1.length
            if (r3 > r2) goto L11
            int r3 = r3 + (-1)
            r3 = r1[r3]
            goto L12
        L11:
            r3 = r0
        L12:
            if (r3 == 0) goto L1c
            com.applovin.impl.ao r1 = new com.applovin.impl.ao
            java.lang.String r2 = "TCON"
            r1.<init>(r2, r0, r3)
            return r1
        L1c:
            java.lang.String r3 = "MetadataUtil"
            java.lang.String r1 = "Failed to parse standard genre code"
            com.applovin.impl.kc.d(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.cf.c(com.applovin.impl.yg):com.applovin.impl.ao");
    }

    private static int d(yg ygVar) {
        ygVar.g(4);
        if (ygVar.j() == 1684108385) {
            ygVar.g(8);
            return ygVar.w();
        }
        kc.d("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    private static u0 a(yg ygVar) {
        int iJ = ygVar.j();
        if (ygVar.j() == 1684108385) {
            int iB = i1.b(ygVar.j());
            String str = iB == 13 ? MimeTypes.IMAGE_JPEG : iB == 14 ? MimeTypes.IMAGE_PNG : null;
            if (str == null) {
                kc.d("MetadataUtil", "Unrecognized cover art flags: " + iB);
                return null;
            }
            ygVar.g(4);
            int i = iJ - 16;
            byte[] bArr = new byte[i];
            ygVar.a(bArr, 0, i);
            return new u0(str, null, 3, bArr);
        }
        kc.d("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    private static ao a(int i, String str, yg ygVar) {
        int iJ = ygVar.j();
        if (ygVar.j() == 1684108385 && iJ >= 22) {
            ygVar.g(10);
            int iC = ygVar.C();
            if (iC > 0) {
                String str2 = "" + iC;
                int iC2 = ygVar.C();
                if (iC2 > 0) {
                    str2 = str2 + "/" + iC2;
                }
                return new ao(str, null, str2);
            }
        }
        kc.d("MetadataUtil", "Failed to parse index/count attribute: " + i1.a(i));
        return null;
    }

    private static ao b(int i, String str, yg ygVar) {
        int iJ = ygVar.j();
        if (ygVar.j() == 1684108385) {
            ygVar.g(8);
            return new ao(str, null, ygVar.b(iJ - 16));
        }
        kc.d("MetadataUtil", "Failed to parse text attribute: " + i1.a(i));
        return null;
    }

    private static ua a(yg ygVar, int i) {
        int i2 = -1;
        int i3 = -1;
        String strB = null;
        String strB2 = null;
        while (ygVar.d() < i) {
            int iD = ygVar.d();
            int iJ = ygVar.j();
            int iJ2 = ygVar.j();
            ygVar.g(4);
            if (iJ2 == 1835360622) {
                strB = ygVar.b(iJ - 12);
            } else if (iJ2 == 1851878757) {
                strB2 = ygVar.b(iJ - 12);
            } else {
                if (iJ2 == 1684108385) {
                    i2 = iD;
                    i3 = iJ;
                }
                ygVar.g(iJ - 12);
            }
        }
        if (strB == null || strB2 == null || i2 == -1) {
            return null;
        }
        ygVar.f(i2);
        ygVar.g(16);
        return new nb(strB, strB2, ygVar.b(i3 - 16));
    }

    public static ad a(yg ygVar, int i, String str) {
        while (true) {
            int iD = ygVar.d();
            if (iD >= i) {
                return null;
            }
            int iJ = ygVar.j();
            if (ygVar.j() == 1684108385) {
                int iJ2 = ygVar.j();
                int iJ3 = ygVar.j();
                int i2 = iJ - 16;
                byte[] bArr = new byte[i2];
                ygVar.a(bArr, 0, i2);
                return new ad(str, bArr, iJ3, iJ2);
            }
            ygVar.f(iD + iJ);
        }
    }

    private static ua a(int i, String str, yg ygVar, boolean z, boolean z2) {
        int iD = d(ygVar);
        if (z2) {
            iD = Math.min(1, iD);
        }
        if (iD >= 0) {
            if (z) {
                return new ao(str, null, Integer.toString(iD));
            }
            return new s3("und", str, Integer.toString(iD));
        }
        kc.d("MetadataUtil", "Failed to parse uint8 attribute: " + i1.a(i));
        return null;
    }

    public static void a(int i, x9 x9Var, d9.b bVar) {
        if (i == 1 && x9Var.a()) {
            bVar.e(x9Var.f1163a).f(x9Var.b);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(int r5, com.applovin.impl.we r6, com.applovin.impl.we r7, com.applovin.impl.d9.b r8, com.applovin.impl.we... r9) {
        /*
            com.applovin.impl.we r0 = new com.applovin.impl.we
            r1 = 0
            com.applovin.impl.we$b[] r2 = new com.applovin.impl.we.b[r1]
            r0.<init>(r2)
            r2 = 1
            if (r5 != r2) goto Le
            if (r6 == 0) goto L3c
            goto L3d
        Le:
            r6 = 2
            if (r5 != r6) goto L3c
            if (r7 == 0) goto L3c
            r5 = r1
        L14:
            int r6 = r7.c()
            if (r5 >= r6) goto L3c
            com.applovin.impl.we$b r6 = r7.a(r5)
            boolean r3 = r6 instanceof com.applovin.impl.ad
            if (r3 == 0) goto L39
            com.applovin.impl.ad r6 = (com.applovin.impl.ad) r6
            java.lang.String r3 = r6.f238a
            java.lang.String r4 = "com.android.capture.fps"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L39
            com.applovin.impl.we r5 = new com.applovin.impl.we
            com.applovin.impl.we$b[] r7 = new com.applovin.impl.we.b[r2]
            r7[r1] = r6
            r5.<init>(r7)
            r6 = r5
            goto L3d
        L39:
            int r5 = r5 + 1
            goto L14
        L3c:
            r6 = r0
        L3d:
            int r5 = r9.length
        L3e:
            if (r1 >= r5) goto L49
            r7 = r9[r1]
            com.applovin.impl.we r6 = r6.a(r7)
            int r1 = r1 + 1
            goto L3e
        L49:
            int r5 = r6.c()
            if (r5 <= 0) goto L52
            r8.a(r6)
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.cf.a(int, com.applovin.impl.we, com.applovin.impl.we, com.applovin.impl.d9$b, com.applovin.impl.we[]):void");
    }
}
