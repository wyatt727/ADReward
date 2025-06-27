package org.jacoco.core.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public class SessionInfoStore implements ISessionInfoVisitor {
    private final List<SessionInfo> infos = new ArrayList();

    public boolean isEmpty() {
        return this.infos.isEmpty();
    }

    public List<SessionInfo> getInfos() {
        ArrayList arrayList = new ArrayList(this.infos);
        Collections.sort(arrayList);
        return arrayList;
    }

    public SessionInfo getMerged(String str) {
        if (this.infos.isEmpty()) {
            return new SessionInfo(str, 0L, 0L);
        }
        long jMin = Long.MAX_VALUE;
        long jMax = Long.MIN_VALUE;
        for (SessionInfo sessionInfo : this.infos) {
            jMin = Math.min(jMin, sessionInfo.getStartTimeStamp());
            jMax = Math.max(jMax, sessionInfo.getDumpTimeStamp());
        }
        return new SessionInfo(str, jMin, jMax);
    }

    public void accept(ISessionInfoVisitor iSessionInfoVisitor) {
        Iterator<SessionInfo> it = getInfos().iterator();
        while (it.hasNext()) {
            iSessionInfoVisitor.visitSessionInfo(it.next());
        }
    }

    @Override // org.jacoco.core.data.ISessionInfoVisitor
    public void visitSessionInfo(SessionInfo sessionInfo) {
        this.infos.add(sessionInfo);
    }
}
