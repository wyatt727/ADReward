package com.mbridge.msdk.foundation.same.e;

/* compiled from: CommonTask.java */
/* loaded from: classes4.dex */
public abstract class a implements Runnable {
    public static long id;
    public InterfaceC0268a mListener;
    public b mState = b.READY;

    /* compiled from: CommonTask.java */
    /* renamed from: com.mbridge.msdk.foundation.same.e.a$a, reason: collision with other inner class name */
    public interface InterfaceC0268a {
        void a(b bVar);
    }

    /* compiled from: CommonTask.java */
    public enum b {
        READY,
        RUNNING,
        PAUSE,
        CANCEL,
        FINISH
    }

    public abstract void cancelTask();

    public abstract void pauseTask(boolean z);

    public abstract void runTask();

    public a() {
        id++;
    }

    public final void cancel() {
        if (this.mState != b.CANCEL) {
            setState(b.CANCEL);
            cancelTask();
        }
    }

    public final long getId() {
        return id;
    }

    public b getState() {
        return this.mState;
    }

    private void setState(b bVar) {
        this.mState = bVar;
        InterfaceC0268a interfaceC0268a = this.mListener;
        if (interfaceC0268a != null) {
            interfaceC0268a.a(bVar);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.mState == b.READY) {
                setState(b.RUNNING);
                runTask();
                setState(b.FINISH);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setOnStateChangeListener(InterfaceC0268a interfaceC0268a) {
        this.mListener = interfaceC0268a;
    }

    public final void setPause(boolean z) {
        if (this.mState == b.PAUSE || this.mState == b.CANCEL || this.mState == b.FINISH) {
            return;
        }
        if (z) {
            setState(b.PAUSE);
        } else {
            setState(b.RUNNING);
        }
        pauseTask(z);
    }
}
