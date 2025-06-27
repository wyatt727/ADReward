package org.jacoco.core.internal.analysis;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jacoco.core.analysis.ICounter;

/* loaded from: classes5.dex */
public abstract class CounterImpl implements ICounter {
    public static final CounterImpl COUNTER_0_0;
    public static final CounterImpl COUNTER_0_1;
    public static final CounterImpl COUNTER_1_0;
    private static final CounterImpl[][] SINGLETONS = new CounterImpl[31][];
    private static final int SINGLETON_LIMIT = 30;
    protected int covered;
    protected int missed;

    public abstract CounterImpl increment(int i, int i2);

    static {
        for (int i = 0; i <= 30; i++) {
            SINGLETONS[i] = new CounterImpl[31];
            for (int i2 = 0; i2 <= 30; i2++) {
                SINGLETONS[i][i2] = new Fix(i, i2);
            }
        }
        CounterImpl[][] counterImplArr = SINGLETONS;
        COUNTER_0_0 = counterImplArr[0][0];
        COUNTER_1_0 = counterImplArr[1][0];
        COUNTER_0_1 = counterImplArr[0][1];
    }

    private static class Var extends CounterImpl {
        public Var(int i, int i2) {
            super(i, i2);
        }

        @Override // org.jacoco.core.internal.analysis.CounterImpl
        public CounterImpl increment(int i, int i2) {
            this.missed += i;
            this.covered += i2;
            return this;
        }
    }

    private static class Fix extends CounterImpl {
        public Fix(int i, int i2) {
            super(i, i2);
        }

        @Override // org.jacoco.core.internal.analysis.CounterImpl
        public CounterImpl increment(int i, int i2) {
            return getInstance(this.missed + i, this.covered + i2);
        }
    }

    public static CounterImpl getInstance(int i, int i2) {
        if (i <= 30 && i2 <= 30) {
            return SINGLETONS[i][i2];
        }
        return new Var(i, i2);
    }

    public static CounterImpl getInstance(ICounter iCounter) {
        return getInstance(iCounter.getMissedCount(), iCounter.getCoveredCount());
    }

    protected CounterImpl(int i, int i2) {
        this.missed = i;
        this.covered = i2;
    }

    public CounterImpl increment(ICounter iCounter) {
        return increment(iCounter.getMissedCount(), iCounter.getCoveredCount());
    }

    /* renamed from: org.jacoco.core.internal.analysis.CounterImpl$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$jacoco$core$analysis$ICounter$CounterValue;

        static {
            int[] iArr = new int[ICounter.CounterValue.values().length];
            $SwitchMap$org$jacoco$core$analysis$ICounter$CounterValue = iArr;
            try {
                iArr[ICounter.CounterValue.TOTALCOUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$jacoco$core$analysis$ICounter$CounterValue[ICounter.CounterValue.MISSEDCOUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$jacoco$core$analysis$ICounter$CounterValue[ICounter.CounterValue.COVEREDCOUNT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$jacoco$core$analysis$ICounter$CounterValue[ICounter.CounterValue.MISSEDRATIO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$jacoco$core$analysis$ICounter$CounterValue[ICounter.CounterValue.COVEREDRATIO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Override // org.jacoco.core.analysis.ICounter
    public double getValue(ICounter.CounterValue counterValue) {
        int totalCount;
        int i = AnonymousClass1.$SwitchMap$org$jacoco$core$analysis$ICounter$CounterValue[counterValue.ordinal()];
        if (i == 1) {
            totalCount = getTotalCount();
        } else if (i == 2) {
            totalCount = getMissedCount();
        } else {
            if (i != 3) {
                if (i == 4) {
                    return getMissedRatio();
                }
                if (i == 5) {
                    return getCoveredRatio();
                }
                throw new AssertionError(counterValue);
            }
            totalCount = getCoveredCount();
        }
        return totalCount;
    }

    @Override // org.jacoco.core.analysis.ICounter
    public int getTotalCount() {
        return this.missed + this.covered;
    }

    @Override // org.jacoco.core.analysis.ICounter
    public int getCoveredCount() {
        return this.covered;
    }

    @Override // org.jacoco.core.analysis.ICounter
    public int getMissedCount() {
        return this.missed;
    }

    @Override // org.jacoco.core.analysis.ICounter
    public double getCoveredRatio() {
        return this.covered / (this.missed + r0);
    }

    @Override // org.jacoco.core.analysis.ICounter
    public double getMissedRatio() {
        return this.missed / (r0 + this.covered);
    }

    @Override // org.jacoco.core.analysis.ICounter
    public int getStatus() {
        int i = this.covered > 0 ? 2 : 0;
        return this.missed > 0 ? i | 1 : i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ICounter)) {
            return false;
        }
        ICounter iCounter = (ICounter) obj;
        return this.missed == iCounter.getMissedCount() && this.covered == iCounter.getCoveredCount();
    }

    public int hashCode() {
        return this.missed ^ (this.covered * 17);
    }

    public String toString() {
        return "Counter[" + getMissedCount() + '/' + getCoveredCount() + AbstractJsonLexerKt.END_LIST;
    }
}
