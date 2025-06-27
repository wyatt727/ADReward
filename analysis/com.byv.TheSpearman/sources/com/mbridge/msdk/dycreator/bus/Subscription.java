package com.mbridge.msdk.dycreator.bus;

/* loaded from: classes4.dex */
final class Subscription {

    /* renamed from: a, reason: collision with root package name */
    final Object f2667a;
    final SubscriberMethod b;

    Subscription(Object obj, SubscriberMethod subscriberMethod) {
        this.f2667a = obj;
        this.b = subscriberMethod;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Subscription)) {
            return false;
        }
        Subscription subscription = (Subscription) obj;
        return this.f2667a == subscription.f2667a && this.b.equals(subscription.b);
    }

    public final int hashCode() {
        return this.f2667a.hashCode() + this.b.d.hashCode();
    }
}
