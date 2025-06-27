package okio;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Pipe.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010!\u001a\u00020\"J\u000e\u0010#\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020\u0010J\r\u0010\u0017\u001a\u00020\u0010H\u0007¢\u0006\u0002\b$J\r\u0010\u001b\u001a\u00020\u001cH\u0007¢\u0006\u0002\b%J&\u0010&\u001a\u00020\"*\u00020\u00102\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\"0(¢\u0006\u0002\b)H\u0082\bR\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0017\u001a\u00020\u00108G¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\u0013\u0010\u001b\u001a\u00020\u001c8G¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000e¨\u0006*"}, d2 = {"Lokio/Pipe;", "", "maxBufferSize", "", "(J)V", "buffer", "Lokio/Buffer;", "getBuffer$okio", "()Lokio/Buffer;", "canceled", "", "getCanceled$okio", "()Z", "setCanceled$okio", "(Z)V", "foldedSink", "Lokio/Sink;", "getFoldedSink$okio", "()Lokio/Sink;", "setFoldedSink$okio", "(Lokio/Sink;)V", "getMaxBufferSize$okio", "()J", "sink", "sinkClosed", "getSinkClosed$okio", "setSinkClosed$okio", FirebaseAnalytics.Param.SOURCE, "Lokio/Source;", "()Lokio/Source;", "sourceClosed", "getSourceClosed$okio", "setSourceClosed$okio", "cancel", "", "fold", "-deprecated_sink", "-deprecated_source", ToolBar.FORWARD, "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "okio"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes5.dex */
public final class Pipe {
    private final Buffer buffer = new Buffer();
    private boolean canceled;
    private Sink foldedSink;
    private final long maxBufferSize;
    private final Sink sink;
    private boolean sinkClosed;
    private final Source source;
    private boolean sourceClosed;

    public Pipe(long j) {
        this.maxBufferSize = j;
        if (!(j >= 1)) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("maxBufferSize < 1: ", Long.valueOf(getMaxBufferSize())).toString());
        }
        this.sink = new Sink() { // from class: okio.Pipe.sink.1
            private final Timeout timeout = new Timeout();

            /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
            
                r1 = kotlin.Unit.INSTANCE;
             */
            @Override // okio.Sink
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void write(okio.Buffer r12, long r13) {
                /*
                    Method dump skipped, instructions count: 303
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: okio.Pipe.AnonymousClass1.write(okio.Buffer, long):void");
            }

            @Override // okio.Sink, java.io.Flushable
            public void flush() {
                Sink foldedSink;
                boolean hasDeadline;
                Buffer buffer = Pipe.this.getBuffer();
                Pipe pipe = Pipe.this;
                synchronized (buffer) {
                    if (!(!pipe.getSinkClosed())) {
                        throw new IllegalStateException("closed".toString());
                    }
                    if (pipe.getCanceled()) {
                        throw new IOException("canceled");
                    }
                    foldedSink = pipe.getFoldedSink();
                    if (foldedSink == null) {
                        if (pipe.getSourceClosed() && pipe.getBuffer().size() > 0) {
                            throw new IOException("source is closed");
                        }
                        foldedSink = null;
                    }
                    Unit unit = Unit.INSTANCE;
                }
                if (foldedSink == null) {
                    return;
                }
                Pipe pipe2 = Pipe.this;
                Timeout timeout = foldedSink.getTimeout();
                Timeout timeout2 = pipe2.sink().getTimeout();
                long timeoutNanos = timeout.getTimeoutNanos();
                timeout.timeout(Timeout.INSTANCE.minTimeout(timeout2.getTimeoutNanos(), timeout.getTimeoutNanos()), TimeUnit.NANOSECONDS);
                if (timeout.getHasDeadline()) {
                    long jDeadlineNanoTime = timeout.deadlineNanoTime();
                    if (timeout2.getHasDeadline()) {
                        timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
                    }
                    try {
                        foldedSink.flush();
                        Unit unit2 = Unit.INSTANCE;
                        if (hasDeadline) {
                            return;
                        } else {
                            return;
                        }
                    } finally {
                        timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                        if (timeout2.getHasDeadline()) {
                            timeout.deadlineNanoTime(jDeadlineNanoTime);
                        }
                    }
                }
                if (timeout2.getHasDeadline()) {
                    timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                }
                try {
                    foldedSink.flush();
                    Unit unit3 = Unit.INSTANCE;
                } finally {
                    timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                    if (timeout2.getHasDeadline()) {
                        timeout.clearDeadline();
                    }
                }
            }

            @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                boolean hasDeadline;
                Buffer buffer = Pipe.this.getBuffer();
                Pipe pipe = Pipe.this;
                synchronized (buffer) {
                    if (pipe.getSinkClosed()) {
                        return;
                    }
                    Sink foldedSink = pipe.getFoldedSink();
                    if (foldedSink == null) {
                        if (pipe.getSourceClosed() && pipe.getBuffer().size() > 0) {
                            throw new IOException("source is closed");
                        }
                        pipe.setSinkClosed$okio(true);
                        pipe.getBuffer().notifyAll();
                        foldedSink = null;
                    }
                    Unit unit = Unit.INSTANCE;
                    if (foldedSink == null) {
                        return;
                    }
                    Pipe pipe2 = Pipe.this;
                    Timeout timeout = foldedSink.getTimeout();
                    Timeout timeout2 = pipe2.sink().getTimeout();
                    long timeoutNanos = timeout.getTimeoutNanos();
                    timeout.timeout(Timeout.INSTANCE.minTimeout(timeout2.getTimeoutNanos(), timeout.getTimeoutNanos()), TimeUnit.NANOSECONDS);
                    if (timeout.getHasDeadline()) {
                        long jDeadlineNanoTime = timeout.deadlineNanoTime();
                        if (timeout2.getHasDeadline()) {
                            timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
                        }
                        try {
                            foldedSink.close();
                            Unit unit2 = Unit.INSTANCE;
                            if (hasDeadline) {
                                return;
                            } else {
                                return;
                            }
                        } finally {
                            timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                            if (timeout2.getHasDeadline()) {
                                timeout.deadlineNanoTime(jDeadlineNanoTime);
                            }
                        }
                    }
                    if (timeout2.getHasDeadline()) {
                        timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                    }
                    try {
                        foldedSink.close();
                        Unit unit3 = Unit.INSTANCE;
                    } finally {
                        timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                        if (timeout2.getHasDeadline()) {
                            timeout.clearDeadline();
                        }
                    }
                }
            }

            @Override // okio.Sink
            /* renamed from: timeout, reason: from getter */
            public Timeout getTimeout() {
                return this.timeout;
            }
        };
        this.source = new Source() { // from class: okio.Pipe.source.1
            private final Timeout timeout = new Timeout();

            @Override // okio.Source
            public long read(Buffer sink, long byteCount) {
                Intrinsics.checkNotNullParameter(sink, "sink");
                Buffer buffer = Pipe.this.getBuffer();
                Pipe pipe = Pipe.this;
                synchronized (buffer) {
                    if (!(!pipe.getSourceClosed())) {
                        throw new IllegalStateException("closed".toString());
                    }
                    if (pipe.getCanceled()) {
                        throw new IOException("canceled");
                    }
                    while (pipe.getBuffer().size() == 0) {
                        if (pipe.getSinkClosed()) {
                            return -1L;
                        }
                        this.timeout.waitUntilNotified(pipe.getBuffer());
                        if (pipe.getCanceled()) {
                            throw new IOException("canceled");
                        }
                    }
                    long j2 = pipe.getBuffer().read(sink, byteCount);
                    pipe.getBuffer().notifyAll();
                    return j2;
                }
            }

            @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                Buffer buffer = Pipe.this.getBuffer();
                Pipe pipe = Pipe.this;
                synchronized (buffer) {
                    pipe.setSourceClosed$okio(true);
                    pipe.getBuffer().notifyAll();
                    Unit unit = Unit.INSTANCE;
                }
            }

            @Override // okio.Source
            /* renamed from: timeout, reason: from getter */
            public Timeout getTimeout() {
                return this.timeout;
            }
        };
    }

    /* renamed from: getMaxBufferSize$okio, reason: from getter */
    public final long getMaxBufferSize() {
        return this.maxBufferSize;
    }

    /* renamed from: getBuffer$okio, reason: from getter */
    public final Buffer getBuffer() {
        return this.buffer;
    }

    /* renamed from: getCanceled$okio, reason: from getter */
    public final boolean getCanceled() {
        return this.canceled;
    }

    public final void setCanceled$okio(boolean z) {
        this.canceled = z;
    }

    /* renamed from: getSinkClosed$okio, reason: from getter */
    public final boolean getSinkClosed() {
        return this.sinkClosed;
    }

    public final void setSinkClosed$okio(boolean z) {
        this.sinkClosed = z;
    }

    /* renamed from: getSourceClosed$okio, reason: from getter */
    public final boolean getSourceClosed() {
        return this.sourceClosed;
    }

    public final void setSourceClosed$okio(boolean z) {
        this.sourceClosed = z;
    }

    /* renamed from: getFoldedSink$okio, reason: from getter */
    public final Sink getFoldedSink() {
        return this.foldedSink;
    }

    public final void setFoldedSink$okio(Sink sink) {
        this.foldedSink = sink;
    }

    public final Sink sink() {
        return this.sink;
    }

    public final Source source() {
        return this.source;
    }

    public final void fold(Sink sink) throws IOException {
        boolean sinkClosed;
        Buffer buffer;
        Intrinsics.checkNotNullParameter(sink, "sink");
        while (true) {
            synchronized (this.buffer) {
                if (!(getFoldedSink() == null)) {
                    throw new IllegalStateException("sink already folded".toString());
                }
                if (getCanceled()) {
                    setFoldedSink$okio(sink);
                    throw new IOException("canceled");
                }
                if (getBuffer().exhausted()) {
                    setSourceClosed$okio(true);
                    setFoldedSink$okio(sink);
                    return;
                } else {
                    sinkClosed = getSinkClosed();
                    buffer = new Buffer();
                    buffer.write(getBuffer(), getBuffer().size());
                    getBuffer().notifyAll();
                    Unit unit = Unit.INSTANCE;
                }
            }
            try {
                sink.write(buffer, buffer.size());
                if (sinkClosed) {
                    sink.close();
                } else {
                    sink.flush();
                }
            } catch (Throwable th) {
                synchronized (this.buffer) {
                    setSourceClosed$okio(true);
                    getBuffer().notifyAll();
                    Unit unit2 = Unit.INSTANCE;
                    throw th;
                }
            }
        }
    }

    private final void forward(Sink sink, Function1<? super Sink, Unit> function1) {
        Timeout timeout = sink.getTimeout();
        Timeout timeout2 = sink().getTimeout();
        long timeoutNanos = timeout.getTimeoutNanos();
        timeout.timeout(Timeout.INSTANCE.minTimeout(timeout2.getTimeoutNanos(), timeout.getTimeoutNanos()), TimeUnit.NANOSECONDS);
        if (timeout.getHasDeadline()) {
            long jDeadlineNanoTime = timeout.deadlineNanoTime();
            if (timeout2.getHasDeadline()) {
                timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
            }
            try {
                function1.invoke(sink);
                Unit unit = Unit.INSTANCE;
                return;
            } finally {
                InlineMarker.finallyStart(1);
                timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                if (timeout2.getHasDeadline()) {
                    timeout.deadlineNanoTime(jDeadlineNanoTime);
                }
                InlineMarker.finallyEnd(1);
            }
        }
        if (timeout2.getHasDeadline()) {
            timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
        }
        try {
            function1.invoke(sink);
            Unit unit2 = Unit.INSTANCE;
        } finally {
            InlineMarker.finallyStart(1);
            timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
            if (timeout2.getHasDeadline()) {
                timeout.clearDeadline();
            }
            InlineMarker.finallyEnd(1);
        }
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "sink", imports = {}))
    /* renamed from: -deprecated_sink, reason: not valid java name and from getter */
    public final Sink getSink() {
        return this.sink;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = FirebaseAnalytics.Param.SOURCE, imports = {}))
    /* renamed from: -deprecated_source, reason: not valid java name and from getter */
    public final Source getSource() {
        return this.source;
    }

    public final void cancel() {
        synchronized (this.buffer) {
            setCanceled$okio(true);
            getBuffer().clear();
            getBuffer().notifyAll();
            Unit unit = Unit.INSTANCE;
        }
    }
}
