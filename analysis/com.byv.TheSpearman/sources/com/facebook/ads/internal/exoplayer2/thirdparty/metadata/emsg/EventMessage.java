package com.facebook.ads.internal.exoplayer2.thirdparty.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import com.facebook.ads.redexgen.uinode.C0672Da;
import com.facebook.ads.redexgen.uinode.IF;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class EventMessage implements Metadata.Entry {
    public static byte[] A07;
    public static String[] A08 = {"zkRD1caujdk1JoVOjr6tUdIaVpu", "", "POdYObXd0ULzJifiNOA3", "yHrusy44er6P1jq6MI5ki6tB98jtOUqf", "uxWpqD63G6sASgu", "0Di1TCitrCmUCOaKu", "kjBXWMgfCYwufEyzh3ESsLKVum8z1Gam", "aSUpUrMrA6iV2Bzb23QA3UniMcduWhH2"};
    public static final Parcelable.Creator<EventMessage> CREATOR;
    public int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final String A04;
    public final String A05;
    public final byte[] A06;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 83);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{109, 97, 40, 37, 124, 99, 111, 57, 46, 35, 58, 42, 114, 110, 102, 120, 108, 17, 11, 88, 72, 67, 78, 70, 78, 22};
    }

    static {
        A01();
        CREATOR = new C0672Da();
    }

    public EventMessage(Parcel parcel) {
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        this.A03 = parcel.readLong();
        this.A01 = parcel.readLong();
        this.A02 = parcel.readLong();
        this.A06 = parcel.createByteArray();
    }

    public EventMessage(String str, String str2, long j, long j2, byte[] bArr, long j3) {
        this.A04 = str;
        this.A05 = str2;
        this.A01 = j;
        this.A02 = j2;
        this.A06 = bArr;
        this.A03 = j3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventMessage eventMessage = (EventMessage) obj;
        if (this.A03 == eventMessage.A03) {
            long j = this.A01;
            long j2 = eventMessage.A01;
            String[] strArr = A08;
            if (strArr[4].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A08[6] = "nKObtZcMkxK4vEK0bm4gZxc2MVOzYmgY";
            if (j == j2 && this.A02 == eventMessage.A02 && IF.A0g(this.A04, eventMessage.A04) && IF.A0g(this.A05, eventMessage.A05) && Arrays.equals(this.A06, eventMessage.A06)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            int i = 17 * 31;
            String str = this.A04;
            int result = str != null ? str.hashCode() : 0;
            int i2 = (i + result) * 31;
            String str2 = this.A05;
            String[] strArr = A08;
            String str3 = strArr[1];
            String str4 = strArr[0];
            int result2 = str3.length();
            if (result2 == str4.length()) {
                throw new RuntimeException();
            }
            A08[6] = "JTjMuJ7sW1HkMJoigpA3xgRLiNezyPpc";
            int iHashCode = str2 != null ? str2.hashCode() : 0;
            long j = this.A03;
            int result3 = (int) (j ^ (j >>> 32));
            long j2 = this.A01;
            int i3 = (((((i2 + iHashCode) * 31) + result3) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.A02;
            int result4 = (int) (j3 ^ (j3 >>> 32));
            this.A00 = ((i3 + result4) * 31) + Arrays.hashCode(this.A06);
        }
        int result5 = this.A00;
        return result5;
    }

    public final String toString() {
        return A00(13, 13, 120) + this.A04 + A00(0, 5, 18) + this.A02 + A00(5, 8, 28) + this.A05;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeLong(this.A03);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A02);
        parcel.writeByteArray(this.A06);
    }
}
