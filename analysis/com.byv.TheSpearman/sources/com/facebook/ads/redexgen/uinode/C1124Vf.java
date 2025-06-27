package com.facebook.ads.redexgen.uinode;

import java.io.File;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.facebook.ads.redexgen.X.Vf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1124Vf extends HO {
    public static byte[] A00;
    public static final Pattern A01;
    public static final Pattern A02;
    public static final Pattern A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C1124Vf A00(File file, HS hs) throws NumberFormatException {
        String name = file.getName();
        if (!name.endsWith(A06(1, 7, 12))) {
            file = A05(file, hs);
            if (file == null) {
                return null;
            }
            name = file.getName();
        }
        Matcher matcher = A03.matcher(name);
        if (!matcher.matches()) {
            return null;
        }
        long length = file.length();
        String strA0C = hs.A0C(Integer.parseInt(matcher.group(1)));
        if (strA0C == null) {
            return null;
        }
        return new C1124Vf(strA0C, Long.parseLong(matcher.group(2)), length, Long.parseLong(matcher.group(3)), file);
    }

    public static String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 9);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{64, 67, -117, 72, 67, 122, -115, -124, -96, 106, 112, 109, 107, -98, 112, 106, -98, -90, 109, 107, -98, 112, 106, -98, -90, 109, 107, -98, 112, -72, 115, -98, 112, -89, -70, -79, 102, -93, 109, 115, 112, 110, -95, 115, 109, -95, -87, 112, 110, -95, 115, 109, -95, -87, 112, 110, -95, 115, -69, 119, -95, 115, -86, -67, -76, 105, -107, 95, -109, -101, 98, 96, -109, 101, 95, -109, -101, 98, 96, -109, 101, 95, -109, -101, 98, 96, -109, 101, -83, 106, -109, 101, -100, -81, -90, 91};
    }

    static {
        A07();
        A01 = Pattern.compile(A06(8, 29, 57), 32);
        A02 = Pattern.compile(A06(37, 29, 60), 32);
        A03 = Pattern.compile(A06(66, 30, 46), 32);
    }

    public C1124Vf(String str, long j, long j2, long j3, File file) {
        super(str, j, j2, j3, file);
    }

    public static C1124Vf A01(String str, long j) {
        return new C1124Vf(str, j, -1L, -9223372036854775807L, null);
    }

    public static C1124Vf A02(String str, long j) {
        return new C1124Vf(str, j, -1L, -9223372036854775807L, null);
    }

    public static C1124Vf A03(String str, long j, long j2) {
        return new C1124Vf(str, j, j2, -9223372036854775807L, null);
    }

    public static File A04(File file, int i, long j, long j2) {
        StringBuilder sbAppend = new StringBuilder().append(i);
        String strA06 = A06(0, 1, 9);
        return new File(file, sbAppend.append(strA06).append(j).append(strA06).append(j2).append(A06(1, 7, 12)).toString());
    }

    public static File A05(File file, HS hs) throws NumberFormatException {
        String filename;
        String name = file.getName();
        Matcher matcher = A02.matcher(name);
        if (matcher.matches()) {
            String filename2 = matcher.group(1);
            filename = IF.A0O(filename2);
            if (filename == null) {
                return null;
            }
        } else {
            matcher = A01.matcher(name);
            if (!matcher.matches()) {
                return null;
            }
            filename = matcher.group(1);
        }
        File parentFile = file.getParentFile();
        int iA08 = hs.A08(filename);
        String filename3 = matcher.group(2);
        long j = Long.parseLong(filename3);
        String filename4 = matcher.group(3);
        File fileA04 = A04(parentFile, iA08, j, Long.parseLong(filename4));
        if (file.renameTo(fileA04)) {
            return fileA04;
        }
        return null;
    }

    public final C1124Vf A08(int i) {
        AbstractC0763Ha.A04(this.A05);
        long jCurrentTimeMillis = System.currentTimeMillis();
        return new C1124Vf(this.A04, this.A02, this.A01, jCurrentTimeMillis, A04(this.A03.getParentFile(), i, this.A02, jCurrentTimeMillis));
    }
}
