package com.facebook.ads.redexgen.uinode;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: assets/audience_network.dex */
public final class RY implements Map<String, String> {
    public static byte[] A01;
    public static String[] A02 = {"PF87FPxaVTPso7PkqBpb9R8ptdrOrcnN", "LLxQm2Zb2cHXH3GFymsIhrLJVNNE7YVf", "GuFHMY1Ngi3Kc2EktfHyZFCwamvVcTYP", "RLQ8yg86xneBytoGnRzJJpBSehxbgMLw", "NMpoE2AaAPP7Vgv", "uWFt37UVBdA9eGMxe0FCLaB7SA4moHLj", "Z5zgjYqznpdx1Id", "YNAb6cApL15ElRgBdI6o6I27RW0RMDqg"};
    public Map<String, String> A00;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A02[0].charAt(17) == '0') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[6] = "S05lPw0aRgv2lts";
            strArr[4] = "ULH8g1fEmmBcyVg";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 49);
            i4++;
        }
    }

    public static void A03() {
        A01 = new byte[]{-56, -63, -48, -49, -63, -88, -77};
    }

    static {
        A03();
    }

    public RY() {
        this.A00 = new HashMap();
    }

    public RY(Map<String, String> map) {
        this.A00 = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Map
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final String get(Object obj) {
        return this.A00.get(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Map
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final String remove(Object obj) {
        return this.A00.remove(obj);
    }

    public final RY A04(String str, String str2) {
        this.A00.put(str, str2);
        return this;
    }

    public final RY A05(Map<? extends String, ? extends String> arg) {
        putAll(arg);
        return this;
    }

    public final String A06() {
        if (this.A00 == null) {
            return A00(0, 0, 66);
        }
        StringBuilder sb = new StringBuilder();
        for (String str : this.A00.keySet()) {
            if (sb.length() > 0) {
                String[] strArr = A02;
                String str2 = strArr[5];
                String key = strArr[2];
                if (str2.charAt(2) != key.charAt(2)) {
                    throw new RuntimeException();
                }
                A02[1] = "xulkP76phNp8oPrFkycOZ9oAWaaFvsfs";
                sb.append(A00(0, 1, 113));
            }
            sb.append(str);
            String str3 = this.A00.get(str);
            if (str3 != null) {
                sb.append(A00(1, 1, 83));
                try {
                    sb.append(URLEncoder.encode(str3, A00(2, 5, 74)));
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
        }
        return sb.toString();
    }

    @Override // java.util.Map
    /* renamed from: A07, reason: merged with bridge method [inline-methods] */
    public final String put(String str, String str2) {
        return this.A00.put(str, str2);
    }

    public final byte[] A08() throws UnsupportedEncodingException {
        byte[] bytes = null;
        try {
            bytes = A06().getBytes(A00(2, 5, 74));
            return bytes;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return bytes;
        }
    }

    @Override // java.util.Map
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.A00.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.A00.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, String>> entrySet() {
        return this.A00.entrySet();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.A00.keySet();
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends String> arg) {
        this.A00.putAll(arg);
    }

    @Override // java.util.Map
    public final int size() {
        return this.A00.size();
    }

    @Override // java.util.Map
    public final Collection<String> values() {
        return this.A00.values();
    }
}
