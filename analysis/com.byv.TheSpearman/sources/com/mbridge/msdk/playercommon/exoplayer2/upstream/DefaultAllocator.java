package com.mbridge.msdk.playercommon.exoplayer2.upstream;

import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class DefaultAllocator implements Allocator {
    private static final int AVAILABLE_EXTRA_CAPACITY = 100;
    private int allocatedCount;
    private Allocation[] availableAllocations;
    private int availableCount;
    private final int individualAllocationSize;
    private final byte[] initialAllocationBlock;
    private final Allocation[] singleAllocationReleaseHolder;
    private int targetBufferSize;
    private final boolean trimOnReset;

    public DefaultAllocator(boolean z, int i) {
        this(z, i, 0);
    }

    public DefaultAllocator(boolean z, int i, int i2) {
        Assertions.checkArgument(i > 0);
        Assertions.checkArgument(i2 >= 0);
        this.trimOnReset = z;
        this.individualAllocationSize = i;
        this.availableCount = i2;
        this.availableAllocations = new Allocation[i2 + 100];
        if (i2 > 0) {
            this.initialAllocationBlock = new byte[i2 * i];
            for (int i3 = 0; i3 < i2; i3++) {
                this.availableAllocations[i3] = new Allocation(this.initialAllocationBlock, i3 * i);
            }
        } else {
            this.initialAllocationBlock = null;
        }
        this.singleAllocationReleaseHolder = new Allocation[1];
    }

    public final synchronized void reset() {
        if (this.trimOnReset) {
            setTargetBufferSize(0);
        }
    }

    public final synchronized void setTargetBufferSize(int i) {
        boolean z = i < this.targetBufferSize;
        this.targetBufferSize = i;
        if (z) {
            trim();
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.Allocator
    public final synchronized Allocation allocate() {
        Allocation allocation;
        this.allocatedCount++;
        int i = this.availableCount;
        if (i > 0) {
            Allocation[] allocationArr = this.availableAllocations;
            int i2 = i - 1;
            this.availableCount = i2;
            allocation = allocationArr[i2];
            allocationArr[i2] = null;
        } else {
            allocation = new Allocation(new byte[this.individualAllocationSize], 0);
        }
        return allocation;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.Allocator
    public final synchronized void release(Allocation allocation) {
        Allocation[] allocationArr = this.singleAllocationReleaseHolder;
        allocationArr[0] = allocation;
        release(allocationArr);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.Allocator
    public final synchronized void release(Allocation[] allocationArr) {
        int i = this.availableCount;
        int length = allocationArr.length + i;
        Allocation[] allocationArr2 = this.availableAllocations;
        if (length >= allocationArr2.length) {
            this.availableAllocations = (Allocation[]) Arrays.copyOf(allocationArr2, Math.max(allocationArr2.length * 2, i + allocationArr.length));
        }
        for (Allocation allocation : allocationArr) {
            if (allocation.data != this.initialAllocationBlock && allocation.data.length != this.individualAllocationSize) {
                throw new IllegalArgumentException("Unexpected allocation: " + System.identityHashCode(allocation.data) + ", " + System.identityHashCode(this.initialAllocationBlock) + ", " + allocation.data.length + ", " + this.individualAllocationSize);
            }
            Allocation[] allocationArr3 = this.availableAllocations;
            int i2 = this.availableCount;
            this.availableCount = i2 + 1;
            allocationArr3[i2] = allocation;
        }
        this.allocatedCount -= allocationArr.length;
        notifyAll();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.Allocator
    public final synchronized void trim() {
        int i = 0;
        int iMax = Math.max(0, Util.ceilDivide(this.targetBufferSize, this.individualAllocationSize) - this.allocatedCount);
        int i2 = this.availableCount;
        if (iMax >= i2) {
            return;
        }
        if (this.initialAllocationBlock != null) {
            int i3 = i2 - 1;
            while (i <= i3) {
                Allocation allocation = this.availableAllocations[i];
                if (allocation.data == this.initialAllocationBlock) {
                    i++;
                } else {
                    Allocation allocation2 = this.availableAllocations[i3];
                    if (allocation2.data != this.initialAllocationBlock) {
                        i3--;
                    } else {
                        Allocation[] allocationArr = this.availableAllocations;
                        allocationArr[i] = allocation2;
                        allocationArr[i3] = allocation;
                        i3--;
                        i++;
                    }
                }
            }
            iMax = Math.max(iMax, i);
            if (iMax >= this.availableCount) {
                return;
            }
        }
        Arrays.fill(this.availableAllocations, iMax, this.availableCount, (Object) null);
        this.availableCount = iMax;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.Allocator
    public final synchronized int getTotalBytesAllocated() {
        return this.allocatedCount * this.individualAllocationSize;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.Allocator
    public final int getIndividualAllocationLength() {
        return this.individualAllocationSize;
    }
}
