package com.bykv.vk.openvk.component.video.EYQ.mZx;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Collections;
import java.util.List;

/* compiled from: SkipProxySelector.java */
/* loaded from: classes.dex */
class tp extends ProxySelector {
    private static final List<Proxy> EYQ = Collections.singletonList(Proxy.NO_PROXY);
    private final int Pm;
    private final String Td;
    private final ProxySelector mZx = ProxySelector.getDefault();

    private tp(String str, int i) {
        this.Td = str;
        this.Pm = i;
    }

    @Override // java.net.ProxySelector
    public List<Proxy> select(URI uri) {
        if (uri != null) {
            return (this.Td.equalsIgnoreCase(uri.getHost()) && this.Pm == uri.getPort()) ? EYQ : this.mZx.select(uri);
        }
        throw new IllegalArgumentException("URI can't be null");
    }

    @Override // java.net.ProxySelector
    public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
        this.mZx.connectFailed(uri, socketAddress, iOException);
    }

    static void EYQ(String str, int i) {
        ProxySelector.setDefault(new tp(str, i));
    }
}
