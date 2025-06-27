package com.applovin.impl;

import com.google.android.exoplayer2.extractor.mp4.Atom;
import java.nio.ByteBuffer;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class fi {
    private static a b(byte[] bArr) {
        yg ygVar = new yg(bArr);
        if (ygVar.e() < 32) {
            return null;
        }
        ygVar.f(0);
        if (ygVar.j() != ygVar.a() + 4 || ygVar.j() != 1886614376) {
            return null;
        }
        int iC = i1.c(ygVar.j());
        if (iC > 1) {
            kc.d("PsshAtomUtil", "Unsupported pssh version: " + iC);
            return null;
        }
        UUID uuid = new UUID(ygVar.s(), ygVar.s());
        if (iC == 1) {
            ygVar.g(ygVar.A() * 16);
        }
        int iA = ygVar.A();
        if (iA != ygVar.a()) {
            return null;
        }
        byte[] bArr2 = new byte[iA];
        ygVar.a(bArr2, 0, iA);
        return new a(uuid, iC, bArr2);
    }

    public static byte[] a(UUID uuid, byte[] bArr) {
        return a(uuid, null, bArr);
    }

    public static byte[] a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(Atom.TYPE_pssh);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static UUID c(byte[] bArr) {
        a aVarB = b(bArr);
        if (aVarB == null) {
            return null;
        }
        return aVarB.f432a;
    }

    public static int d(byte[] bArr) {
        a aVarB = b(bArr);
        if (aVarB == null) {
            return -1;
        }
        return aVarB.b;
    }

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private final UUID f432a;
        private final int b;
        private final byte[] c;

        public a(UUID uuid, int i, byte[] bArr) {
            this.f432a = uuid;
            this.b = i;
            this.c = bArr;
        }
    }

    public static boolean a(byte[] bArr) {
        return b(bArr) != null;
    }

    public static byte[] a(byte[] bArr, UUID uuid) {
        a aVarB = b(bArr);
        if (aVarB == null) {
            return null;
        }
        if (uuid.equals(aVarB.f432a)) {
            return aVarB.c;
        }
        kc.d("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + aVarB.f432a + ".");
        return null;
    }
}
