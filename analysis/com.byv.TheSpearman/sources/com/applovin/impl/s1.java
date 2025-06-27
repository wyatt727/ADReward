package com.applovin.impl;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* loaded from: classes.dex */
final class s1 {

    /* renamed from: a, reason: collision with root package name */
    private final a f873a;
    private int b;
    private long c;
    private long d;
    private long e;
    private long f;

    public s1(AudioTrack audioTrack) {
        if (yp.f1214a >= 19) {
            this.f873a = new a(audioTrack);
            f();
        } else {
            this.f873a = null;
            a(3);
        }
    }

    public void e() {
        a(4);
    }

    public void a() {
        if (this.b == 4) {
            f();
        }
    }

    public boolean d() {
        return this.b == 2;
    }

    public void f() {
        if (this.f873a != null) {
            a(0);
        }
    }

    public long c() {
        a aVar = this.f873a;
        if (aVar != null) {
            return aVar.b();
        }
        return -9223372036854775807L;
    }

    public long b() {
        a aVar = this.f873a;
        if (aVar != null) {
            return aVar.a();
        }
        return -1L;
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final AudioTrack f874a;
        private final AudioTimestamp b = new AudioTimestamp();
        private long c;
        private long d;
        private long e;

        public a(AudioTrack audioTrack) {
            this.f874a = audioTrack;
        }

        public boolean c() {
            boolean timestamp = this.f874a.getTimestamp(this.b);
            if (timestamp) {
                long j = this.b.framePosition;
                if (this.d > j) {
                    this.c++;
                }
                this.d = j;
                this.e = j + (this.c << 32);
            }
            return timestamp;
        }

        public long b() {
            return this.b.nanoTime / 1000;
        }

        public long a() {
            return this.e;
        }
    }

    public boolean a(long j) {
        a aVar = this.f873a;
        if (aVar == null || j - this.e < this.d) {
            return false;
        }
        this.e = j;
        boolean zC = aVar.c();
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (zC) {
                        f();
                    }
                } else if (!zC) {
                    f();
                }
            } else if (!zC) {
                f();
            } else if (this.f873a.a() > this.f) {
                a(2);
            }
        } else if (zC) {
            if (this.f873a.b() < this.c) {
                return false;
            }
            this.f = this.f873a.a();
            a(1);
        } else if (j - this.c > 500000) {
            a(3);
        }
        return zC;
    }

    private void a(int i) {
        this.b = i;
        if (i == 0) {
            this.e = 0L;
            this.f = -1L;
            this.c = System.nanoTime() / 1000;
            this.d = 10000L;
            return;
        }
        if (i == 1) {
            this.d = 10000L;
            return;
        }
        if (i == 2 || i == 3) {
            this.d = 10000000L;
        } else {
            if (i != 4) {
                throw new IllegalStateException();
            }
            this.d = 500000L;
        }
    }
}
