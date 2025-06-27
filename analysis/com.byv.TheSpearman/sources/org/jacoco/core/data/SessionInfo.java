package org.jacoco.core.data;

import com.json.t2;

/* loaded from: classes5.dex */
public class SessionInfo implements Comparable<SessionInfo> {
    private final long dump;
    private final String id;
    private final long start;

    public SessionInfo(String str, long j, long j2) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        this.id = str;
        this.start = j;
        this.dump = j2;
    }

    public String getId() {
        return this.id;
    }

    public long getStartTimeStamp() {
        return this.start;
    }

    public long getDumpTimeStamp() {
        return this.dump;
    }

    @Override // java.lang.Comparable
    public int compareTo(SessionInfo sessionInfo) {
        long j = this.dump;
        long j2 = sessionInfo.dump;
        if (j < j2) {
            return -1;
        }
        return j > j2 ? 1 : 0;
    }

    public String toString() {
        return "SessionInfo[" + this.id + t2.i.e;
    }
}
