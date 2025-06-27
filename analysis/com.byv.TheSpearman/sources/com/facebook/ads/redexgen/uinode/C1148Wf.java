package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.emsg.EventMessage;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Wf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1148Wf implements DW {
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 23 out of bounds for length 22
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // com.facebook.ads.redexgen.uinode.DW
    public final Metadata A51(E3 e3) {
        ByteBuffer byteBuffer = e3.A01;
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        C0788Hz c0788Hz = new C0788Hz(bArrArray, iLimit);
        String strA0Q = c0788Hz.A0Q();
        String strA0Q2 = c0788Hz.A0Q();
        long jA0M = c0788Hz.A0M();
        return new Metadata(new EventMessage(strA0Q, strA0Q2, IF.A0F(c0788Hz.A0M(), 1000L, jA0M), c0788Hz.A0M(), Arrays.copyOfRange(bArrArray, c0788Hz.A06(), iLimit), IF.A0F(c0788Hz.A0M(), 1000000L, jA0M)));
    }
}
