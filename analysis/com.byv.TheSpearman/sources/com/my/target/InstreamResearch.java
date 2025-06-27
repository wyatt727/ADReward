package com.my.target;

import android.content.Context;
import android.view.View;
import com.json.t2;
import com.my.target.common.BaseAd;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.d3;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class InstreamResearch extends BaseAd {
    private c3 banner;
    private final Context context;
    private final int duration;
    private int lastPosition;
    private InstreamResearchListener listener;
    private r8 researchProgressTracker;
    private v8 researchViewabilityTracker;
    private int state;

    public interface InstreamResearchListener {
        void onLoad(InstreamResearch instreamResearch);

        void onNoData(InstreamResearch instreamResearch, IAdLoadingError iAdLoadingError);
    }

    private InstreamResearch(int i, int i2, Context context) {
        super(i, "instreamresearch");
        this.state = 0;
        this.lastPosition = -1;
        this.duration = i2;
        this.context = context;
        ba.c("Instream research ad created. Version - 5.20.0");
    }

    private String getReadableState(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "unknown" : "completed" : t2.h.f0 : t2.h.e0 : "idle";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleResult(f3 f3Var, IAdLoadingError iAdLoadingError) {
        if (f3Var != null) {
            c3 c3VarC = f3Var.c();
            this.banner = c3VarC;
            if (c3VarC != null) {
                this.researchProgressTracker = r8.a(c3VarC.getStatHolder());
                this.researchViewabilityTracker = v8.a(this.banner.getStatHolder());
                InstreamResearchListener instreamResearchListener = this.listener;
                if (instreamResearchListener != null) {
                    instreamResearchListener.onLoad(this);
                    return;
                }
                return;
            }
        }
        InstreamResearchListener instreamResearchListener2 = this.listener;
        if (instreamResearchListener2 != null) {
            instreamResearchListener2.onNoData(this, iAdLoadingError);
        }
    }

    public static InstreamResearch newResearch(int i, int i2, Context context) {
        return new InstreamResearch(i, i2, context);
    }

    private void trackEvent(String str) {
        c3 c3Var = this.banner;
        if (c3Var != null) {
            ArrayList<u9> arrayListB = c3Var.getStatHolder().b(str);
            if (arrayListB.isEmpty()) {
                return;
            }
            w9.a(arrayListB, this.context);
        }
    }

    public void load() {
        d3.a(this.adConfig, this.metricFactory, this.duration).a(new d3.b() { // from class: com.my.target.InstreamResearch$$ExternalSyntheticLambda0
            @Override // com.my.target.l.b
            public final void a(q qVar, m mVar) {
                this.f$0.handleResult((f3) qVar, mVar);
            }
        }).a(this.metricFactory.a(), this.context);
    }

    public void registerPlayerView(View view) {
        v8 v8Var = this.researchViewabilityTracker;
        if (v8Var != null) {
            v8Var.a(view);
        }
    }

    public void setListener(InstreamResearchListener instreamResearchListener) {
        this.listener = instreamResearchListener;
    }

    public void trackFullscreen(boolean z) {
        trackEvent(z ? "fullscreenOn" : "fullscreenOff");
    }

    public void trackMute(boolean z) {
        trackEvent(z ? "volumeOff" : "volumeOn");
    }

    public void trackPause() {
        if (this.state == 1) {
            trackEvent("playbackPaused");
            this.state = 2;
        } else {
            ba.b("InstreamResearch: Unable to track pause, wrong state " + getReadableState(this.state));
        }
    }

    public void trackProgress(float f) {
        if (this.state < 1) {
            trackEvent("playbackStarted");
            this.state = 1;
        }
        if (this.state > 1) {
            ba.a("InstreamResearch: Unable to track progress while state is - " + getReadableState(this.state));
            return;
        }
        int iRound = Math.round(f);
        int i = this.lastPosition;
        if (iRound < i) {
            trackEvent("rewind");
        } else if (iRound == i) {
            return;
        }
        this.lastPosition = iRound;
        v8 v8Var = this.researchViewabilityTracker;
        if (v8Var != null) {
            v8Var.b(iRound);
        }
        r8 r8Var = this.researchProgressTracker;
        if (r8Var != null) {
            r8Var.a(iRound, this.duration, this.context);
        }
    }

    public void trackResume() {
        if (this.state == 2) {
            trackEvent("playbackResumed");
            this.state = 1;
        } else {
            ba.b("InstreamResearch: VideoAdTracker error - unable to track resume, wrong state " + getReadableState(this.state));
        }
    }

    public void unregisterPlayerView() {
        v8 v8Var = this.researchViewabilityTracker;
        if (v8Var != null) {
            v8Var.a((View) null);
        }
    }
}
