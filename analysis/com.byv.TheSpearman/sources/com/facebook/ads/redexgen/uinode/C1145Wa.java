package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.PrivateCommand;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.SpliceInsertCommand;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.SpliceNullCommand;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.SpliceScheduleCommand;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.TimeSignalCommand;
import java.nio.ByteBuffer;

/* renamed from: com.facebook.ads.redexgen.X.Wa, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1145Wa implements DW {
    public IB A00;
    public final C0788Hz A02 = new C0788Hz();
    public final C0787Hy A01 = new C0787Hy();

    @Override // com.facebook.ads.redexgen.uinode.DW
    public final Metadata A51(E3 e3) throws DX {
        if (this.A00 == null || e3.A00 != this.A00.A05()) {
            IB ib = new IB(((C1185Xr) e3).A00);
            this.A00 = ib;
            ib.A06(((C1185Xr) e3).A00 - e3.A00);
        }
        ByteBuffer buffer = e3.A01;
        byte[] bArrArray = buffer.array();
        int iLimit = buffer.limit();
        this.A02.A0b(bArrArray, iLimit);
        this.A01.A0C(bArrArray, iLimit);
        this.A01.A08(39);
        long jA04 = (this.A01.A04(1) << 32) | this.A01.A04(32);
        this.A01.A08(20);
        int spliceCommandType = this.A01.A04(12);
        long ptsAdjustment = this.A01.A04(8);
        Metadata.Entry spliceNullCommand = null;
        this.A02.A0Z(14);
        switch (ptsAdjustment) {
            case 0:
                spliceNullCommand = new SpliceNullCommand();
                break;
            case 4:
                spliceNullCommand = SpliceScheduleCommand.A00(this.A02);
                break;
            case 5:
                spliceNullCommand = SpliceInsertCommand.A00(this.A02, jA04, this.A00);
                break;
            case 6:
                spliceNullCommand = TimeSignalCommand.A01(this.A02, jA04, this.A00);
                break;
            case 255:
                spliceNullCommand = PrivateCommand.A00(this.A02, spliceCommandType, jA04);
                break;
        }
        return spliceNullCommand == null ? new Metadata(new Metadata.Entry[0]) : new Metadata(spliceNullCommand);
    }
}
