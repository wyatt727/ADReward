package com.my.target;

import com.my.target.common.models.ImageData;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class w3 extends p3 {
    private ImageData optimalLandscapeImage;
    private ImageData optimalPortraitImage;
    private final List<ImageData> portraitImages = new ArrayList();
    private final List<ImageData> landscapeImages = new ArrayList();

    private w3() {
    }

    public static w3 fromCompanion(e1 e1Var) {
        w3 w3VarNewBanner = newBanner();
        w3VarNewBanner.setId(e1Var.getId());
        String staticResource = e1Var.getStaticResource();
        if (staticResource != null) {
            w3VarNewBanner.addPortraitImage(ImageData.newImageData(staticResource, e1Var.getWidth(), e1Var.getHeight()));
            w3VarNewBanner.getStatHolder().a(e1Var.getStatHolder(), 0.0f);
            w3VarNewBanner.trackingLink = e1Var.trackingLink;
        }
        return w3VarNewBanner;
    }

    public static w3 newBanner() {
        return new w3();
    }

    public void addLandscapeImage(ImageData imageData) {
        this.landscapeImages.add(imageData);
    }

    public void addPortraitImage(ImageData imageData) {
        this.portraitImages.add(imageData);
    }

    public List<ImageData> getLandscapeImages() {
        return new ArrayList(this.landscapeImages);
    }

    public ImageData getOptimalLandscapeImage() {
        return this.optimalLandscapeImage;
    }

    public ImageData getOptimalPortraitImage() {
        return this.optimalPortraitImage;
    }

    public List<ImageData> getPortraitImages() {
        return new ArrayList(this.portraitImages);
    }

    public void setOptimalLandscapeImage(ImageData imageData) {
        this.optimalLandscapeImage = imageData;
    }

    public void setOptimalPortraitImage(ImageData imageData) {
        this.optimalPortraitImage = imageData;
    }
}
