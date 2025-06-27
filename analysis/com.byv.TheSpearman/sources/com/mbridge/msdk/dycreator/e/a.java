package com.mbridge.msdk.dycreator.e;

/* compiled from: AttributeUtil.java */
/* loaded from: classes4.dex */
public final class a {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01fd A[Catch: Exception -> 0x06f2, TRY_LEAVE, TryCatch #11 {Exception -> 0x06f2, blocks: (B:6:0x000c, B:8:0x0016, B:11:0x001e, B:13:0x0029, B:16:0x003d, B:20:0x0051, B:21:0x0061, B:22:0x0071, B:23:0x0081, B:24:0x0091, B:25:0x00a1, B:28:0x00b6, B:29:0x00c6, B:100:0x01f4, B:104:0x01fd, B:107:0x020a, B:133:0x02f6, B:134:0x02ff, B:136:0x0303, B:190:0x0482, B:191:0x048b, B:193:0x048f, B:216:0x04f8, B:217:0x0501, B:220:0x0507, B:248:0x0591, B:249:0x059a, B:251:0x059e, B:266:0x062e, B:267:0x0637, B:269:0x063b, B:270:0x0640, B:273:0x0648, B:283:0x066d, B:284:0x0676, B:286:0x067a, B:287:0x067f, B:289:0x0683, B:303:0x06aa, B:304:0x06b2, B:306:0x06b7, B:313:0x06d8, B:314:0x06e0, B:316:0x06e4, B:42:0x00ef, B:43:0x00f7, B:54:0x011f, B:55:0x0127, B:85:0x01b2, B:86:0x01ba, B:99:0x01ed, B:221:0x050a, B:225:0x051a, B:227:0x051f, B:229:0x0529, B:230:0x0536, B:232:0x0540, B:234:0x0548, B:236:0x054e, B:238:0x0554, B:239:0x0559, B:241:0x0563, B:243:0x056b, B:244:0x0571, B:245:0x0582, B:252:0x05a1, B:254:0x05ab, B:256:0x05b0, B:257:0x05ce, B:258:0x05df, B:259:0x05ed, B:260:0x05f7, B:261:0x0615, B:263:0x061f, B:87:0x01c2, B:89:0x01c8, B:94:0x01de, B:96:0x01e4, B:90:0x01ce, B:92:0x01d6, B:274:0x064b, B:277:0x0657, B:279:0x0661, B:280:0x0667, B:307:0x06ba, B:310:0x06c7, B:194:0x0492, B:199:0x04a4, B:201:0x04ae, B:203:0x04b6, B:204:0x04bd, B:206:0x04c5, B:207:0x04cc, B:209:0x04d4, B:210:0x04db, B:212:0x04e3, B:213:0x04ea, B:108:0x020d, B:109:0x0215, B:111:0x0219, B:112:0x021d, B:114:0x0227, B:116:0x023b, B:117:0x023f, B:118:0x026f, B:120:0x0279, B:121:0x0282, B:123:0x028c, B:124:0x029a, B:125:0x02ab, B:126:0x02b5, B:127:0x02bf, B:129:0x02c6, B:130:0x02e4, B:44:0x00fd, B:46:0x0103, B:48:0x010b, B:49:0x0110, B:51:0x0118, B:137:0x0306, B:138:0x030e, B:139:0x0311, B:141:0x0316, B:142:0x0327, B:144:0x0331, B:145:0x0337, B:147:0x033f, B:148:0x0359, B:149:0x0362, B:150:0x036c, B:151:0x037d, B:154:0x0389, B:157:0x039f, B:158:0x03a4, B:159:0x03c9, B:161:0x03d3, B:162:0x03dc, B:164:0x03e6, B:165:0x03f4, B:166:0x0405, B:167:0x040f, B:168:0x0419, B:170:0x0423, B:172:0x042b, B:173:0x0430, B:175:0x0438, B:176:0x043d, B:178:0x0445, B:179:0x044a, B:181:0x0452, B:182:0x0459, B:184:0x0463, B:186:0x046b, B:187:0x047c), top: B:345:0x000c, inners: #0, #3, #4, #5, #8, #9, #10, #12, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b0 A[PHI: r8 r9 r10 r11
      0x00b0: PHI (r8v2 int) = (r8v1 int), (r8v1 int), (r8v1 int), (r8v1 int), (r8v1 int), (r8v9 int), (r8v1 int), (r8v1 int), (r8v1 int) binds: [B:18:0x004d, B:31:0x00ce, B:28:0x00b6, B:25:0x00a1, B:24:0x0091, B:23:0x0081, B:22:0x0071, B:21:0x0061, B:20:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x00b0: PHI (r9v2 int) = (r9v1 int), (r9v1 int), (r9v1 int), (r9v1 int), (r9v1 int), (r9v1 int), (r9v6 int), (r9v1 int), (r9v1 int) binds: [B:18:0x004d, B:31:0x00ce, B:28:0x00b6, B:25:0x00a1, B:24:0x0091, B:23:0x0081, B:22:0x0071, B:21:0x0061, B:20:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x00b0: PHI (r10v2 int) = (r10v1 int), (r10v1 int), (r10v1 int), (r10v1 int), (r10v6 int), (r10v1 int), (r10v1 int), (r10v1 int), (r10v1 int) binds: [B:18:0x004d, B:31:0x00ce, B:28:0x00b6, B:25:0x00a1, B:24:0x0091, B:23:0x0081, B:22:0x0071, B:21:0x0061, B:20:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x00b0: PHI (r11v2 int) = (r11v1 int), (r11v1 int), (r11v1 int), (r11v6 int), (r11v1 int), (r11v1 int), (r11v1 int), (r11v1 int), (r11v1 int) binds: [B:18:0x004d, B:31:0x00ce, B:28:0x00b6, B:25:0x00a1, B:24:0x0091, B:23:0x0081, B:22:0x0071, B:21:0x0061, B:20:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015d A[Catch: Exception -> 0x01ad, PHI: r19
      0x015d: PHI (r19v4 int) = (r19v5 int), (r19v6 int) binds: [B:71:0x0156, B:64:0x0143] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {Exception -> 0x01ad, blocks: (B:68:0x014a, B:70:0x014e, B:72:0x0158, B:73:0x015d, B:74:0x016a, B:76:0x0174, B:77:0x0181, B:79:0x0187), top: B:327:0x014a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.view.View r20, android.util.AttributeSet r21) {
        /*
            Method dump skipped, instructions count: 1898
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.dycreator.e.a.a(android.view.View, android.util.AttributeSet):void");
    }
}
