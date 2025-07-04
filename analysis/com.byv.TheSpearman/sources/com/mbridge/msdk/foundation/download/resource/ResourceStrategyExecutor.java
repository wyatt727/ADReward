package com.mbridge.msdk.foundation.download.resource;

import com.mbridge.msdk.foundation.download.database.IDatabaseHelper;

/* loaded from: classes4.dex */
class ResourceStrategyExecutor implements IResourceStrategy {
    private ResourceStrategy resourceStrategy;

    public ResourceStrategyExecutor(ResourceStrategy resourceStrategy) {
        this.resourceStrategy = resourceStrategy;
    }

    @Override // com.mbridge.msdk.foundation.download.resource.IResourceStrategy
    public String getResourceStrategyName() {
        return this.resourceStrategy.getResourceStrategyName();
    }

    @Override // com.mbridge.msdk.foundation.download.resource.IResourceStrategy
    public void processResource(MBResourceManager mBResourceManager, IDatabaseHelper iDatabaseHelper, ResourceConfig resourceConfig) {
        ResourceStrategy resourceStrategy = this.resourceStrategy;
        if (resourceStrategy != null) {
            try {
                resourceStrategy.processResource(mBResourceManager, iDatabaseHelper, resourceConfig);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
