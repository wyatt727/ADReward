package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.encoders.annotations.Encodable;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
final class AutoValue_CrashlyticsReport_Session extends CrashlyticsReport.Session {
    private final CrashlyticsReport.Session.Application app;
    private final String appQualitySessionId;
    private final boolean crashed;
    private final CrashlyticsReport.Session.Device device;
    private final Long endedAt;
    private final List<CrashlyticsReport.Session.Event> events;
    private final String generator;
    private final int generatorType;
    private final String identifier;
    private final CrashlyticsReport.Session.OperatingSystem os;
    private final long startedAt;
    private final CrashlyticsReport.Session.User user;

    private AutoValue_CrashlyticsReport_Session(String str, String str2, String str3, long j, Long l, boolean z, CrashlyticsReport.Session.Application application, CrashlyticsReport.Session.User user, CrashlyticsReport.Session.OperatingSystem operatingSystem, CrashlyticsReport.Session.Device device, List<CrashlyticsReport.Session.Event> list, int i) {
        this.generator = str;
        this.identifier = str2;
        this.appQualitySessionId = str3;
        this.startedAt = j;
        this.endedAt = l;
        this.crashed = z;
        this.app = application;
        this.user = user;
        this.os = operatingSystem;
        this.device = device;
        this.events = list;
        this.generatorType = i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public String getGenerator() {
        return this.generator;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    @Encodable.Ignore
    public String getIdentifier() {
        return this.identifier;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public String getAppQualitySessionId() {
        return this.appQualitySessionId;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public long getStartedAt() {
        return this.startedAt;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public Long getEndedAt() {
        return this.endedAt;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public boolean isCrashed() {
        return this.crashed;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public CrashlyticsReport.Session.Application getApp() {
        return this.app;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public CrashlyticsReport.Session.User getUser() {
        return this.user;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public CrashlyticsReport.Session.OperatingSystem getOs() {
        return this.os;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public CrashlyticsReport.Session.Device getDevice() {
        return this.device;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public List<CrashlyticsReport.Session.Event> getEvents() {
        return this.events;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public int getGeneratorType() {
        return this.generatorType;
    }

    public String toString() {
        return "Session{generator=" + this.generator + ", identifier=" + this.identifier + ", appQualitySessionId=" + this.appQualitySessionId + ", startedAt=" + this.startedAt + ", endedAt=" + this.endedAt + ", crashed=" + this.crashed + ", app=" + this.app + ", user=" + this.user + ", os=" + this.os + ", device=" + this.device + ", events=" + this.events + ", generatorType=" + this.generatorType + "}";
    }

    public boolean equals(Object obj) {
        String str;
        Long l;
        CrashlyticsReport.Session.User user;
        CrashlyticsReport.Session.OperatingSystem operatingSystem;
        CrashlyticsReport.Session.Device device;
        List<CrashlyticsReport.Session.Event> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session)) {
            return false;
        }
        CrashlyticsReport.Session session = (CrashlyticsReport.Session) obj;
        return this.generator.equals(session.getGenerator()) && this.identifier.equals(session.getIdentifier()) && ((str = this.appQualitySessionId) != null ? str.equals(session.getAppQualitySessionId()) : session.getAppQualitySessionId() == null) && this.startedAt == session.getStartedAt() && ((l = this.endedAt) != null ? l.equals(session.getEndedAt()) : session.getEndedAt() == null) && this.crashed == session.isCrashed() && this.app.equals(session.getApp()) && ((user = this.user) != null ? user.equals(session.getUser()) : session.getUser() == null) && ((operatingSystem = this.os) != null ? operatingSystem.equals(session.getOs()) : session.getOs() == null) && ((device = this.device) != null ? device.equals(session.getDevice()) : session.getDevice() == null) && ((list = this.events) != null ? list.equals(session.getEvents()) : session.getEvents() == null) && this.generatorType == session.getGeneratorType();
    }

    public int hashCode() {
        int iHashCode = (((this.generator.hashCode() ^ 1000003) * 1000003) ^ this.identifier.hashCode()) * 1000003;
        String str = this.appQualitySessionId;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j = this.startedAt;
        int i = (((iHashCode ^ iHashCode2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Long l = this.endedAt;
        int iHashCode3 = (((((i ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.crashed ? 1231 : 1237)) * 1000003) ^ this.app.hashCode()) * 1000003;
        CrashlyticsReport.Session.User user = this.user;
        int iHashCode4 = (iHashCode3 ^ (user == null ? 0 : user.hashCode())) * 1000003;
        CrashlyticsReport.Session.OperatingSystem operatingSystem = this.os;
        int iHashCode5 = (iHashCode4 ^ (operatingSystem == null ? 0 : operatingSystem.hashCode())) * 1000003;
        CrashlyticsReport.Session.Device device = this.device;
        int iHashCode6 = (iHashCode5 ^ (device == null ? 0 : device.hashCode())) * 1000003;
        List<CrashlyticsReport.Session.Event> list = this.events;
        return ((iHashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.generatorType;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public CrashlyticsReport.Session.Builder toBuilder() {
        return new Builder(this);
    }

    static final class Builder extends CrashlyticsReport.Session.Builder {
        private CrashlyticsReport.Session.Application app;
        private String appQualitySessionId;
        private Boolean crashed;
        private CrashlyticsReport.Session.Device device;
        private Long endedAt;
        private List<CrashlyticsReport.Session.Event> events;
        private String generator;
        private Integer generatorType;
        private String identifier;
        private CrashlyticsReport.Session.OperatingSystem os;
        private Long startedAt;
        private CrashlyticsReport.Session.User user;

        Builder() {
        }

        private Builder(CrashlyticsReport.Session session) {
            this.generator = session.getGenerator();
            this.identifier = session.getIdentifier();
            this.appQualitySessionId = session.getAppQualitySessionId();
            this.startedAt = Long.valueOf(session.getStartedAt());
            this.endedAt = session.getEndedAt();
            this.crashed = Boolean.valueOf(session.isCrashed());
            this.app = session.getApp();
            this.user = session.getUser();
            this.os = session.getOs();
            this.device = session.getDevice();
            this.events = session.getEvents();
            this.generatorType = Integer.valueOf(session.getGeneratorType());
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setGenerator(String str) {
            Objects.requireNonNull(str, "Null generator");
            this.generator = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setIdentifier(String str) {
            Objects.requireNonNull(str, "Null identifier");
            this.identifier = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setAppQualitySessionId(String str) {
            this.appQualitySessionId = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setStartedAt(long j) {
            this.startedAt = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setEndedAt(Long l) {
            this.endedAt = l;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setCrashed(boolean z) {
            this.crashed = Boolean.valueOf(z);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setApp(CrashlyticsReport.Session.Application application) {
            Objects.requireNonNull(application, "Null app");
            this.app = application;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setUser(CrashlyticsReport.Session.User user) {
            this.user = user;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setOs(CrashlyticsReport.Session.OperatingSystem operatingSystem) {
            this.os = operatingSystem;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setDevice(CrashlyticsReport.Session.Device device) {
            this.device = device;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setEvents(List<CrashlyticsReport.Session.Event> list) {
            this.events = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setGeneratorType(int i) {
            this.generatorType = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session build() {
            String str = "";
            if (this.generator == null) {
                str = " generator";
            }
            if (this.identifier == null) {
                str = str + " identifier";
            }
            if (this.startedAt == null) {
                str = str + " startedAt";
            }
            if (this.crashed == null) {
                str = str + " crashed";
            }
            if (this.app == null) {
                str = str + " app";
            }
            if (this.generatorType == null) {
                str = str + " generatorType";
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + str);
            }
            return new AutoValue_CrashlyticsReport_Session(this.generator, this.identifier, this.appQualitySessionId, this.startedAt.longValue(), this.endedAt, this.crashed.booleanValue(), this.app, this.user, this.os, this.device, this.events, this.generatorType.intValue());
        }
    }
}
