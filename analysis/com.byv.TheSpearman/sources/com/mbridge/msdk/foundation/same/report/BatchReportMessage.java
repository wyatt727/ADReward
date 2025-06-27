package com.mbridge.msdk.foundation.same.report;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public class BatchReportMessage implements Parcelable {
    public static final Parcelable.Creator<BatchReportMessage> CREATOR = new Parcelable.Creator<BatchReportMessage>() { // from class: com.mbridge.msdk.foundation.same.report.BatchReportMessage.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ BatchReportMessage[] newArray(int i) {
            return new BatchReportMessage[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BatchReportMessage createFromParcel(Parcel parcel) {
            return new BatchReportMessage(parcel);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private String f2914a;
    private long b;
    private String c;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public BatchReportMessage(String str, String str2, long j) {
        this.c = str;
        this.f2914a = str2;
        this.b = j;
    }

    protected BatchReportMessage(Parcel parcel) {
        this.c = parcel.readString();
        this.f2914a = parcel.readString();
        this.b = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeString(this.f2914a);
        parcel.writeLong(this.b);
    }

    public String getReportMessage() {
        return this.f2914a;
    }

    public void setReportMessage(String str) {
        this.f2914a = str;
    }

    public long getTimestamp() {
        return this.b;
    }

    public void setTimestamp(long j) {
        this.b = j;
    }

    public String getUuid() {
        return this.c;
    }

    public void setUuid(String str) {
        this.c = str;
    }
}
