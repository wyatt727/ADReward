package com.google.firebase.remoteconfig.interop.rollouts;

import java.util.Set;

/* loaded from: classes2.dex */
public abstract class RolloutsState {
    public abstract Set<RolloutAssignment> getRolloutAssignments();

    public static RolloutsState create(Set<RolloutAssignment> set) {
        return new AutoValue_RolloutsState(set);
    }
}
