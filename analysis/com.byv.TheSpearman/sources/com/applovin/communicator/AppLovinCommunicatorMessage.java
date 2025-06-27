package com.applovin.communicator;

import android.os.Bundle;
import com.applovin.impl.communicator.CommunicatorMessageImpl;

/* loaded from: classes.dex */
public class AppLovinCommunicatorMessage extends CommunicatorMessageImpl {
    public AppLovinCommunicatorMessage(Bundle bundle, String str, AppLovinCommunicatorPublisher appLovinCommunicatorPublisher) {
        super(bundle, str, appLovinCommunicatorPublisher);
    }

    @Override // com.applovin.impl.communicator.CommunicatorMessageImpl
    public Bundle getMessageData() {
        return this.data;
    }

    @Override // com.applovin.impl.communicator.CommunicatorMessageImpl
    public String getPublisherId() {
        AppLovinCommunicatorPublisher appLovinCommunicatorPublisher = this.publisherRef.get();
        return appLovinCommunicatorPublisher != null ? appLovinCommunicatorPublisher.getCommunicatorId() : "";
    }

    @Override // com.applovin.impl.communicator.CommunicatorMessageImpl
    public String getTopic() {
        return getAction();
    }
}
