package com.google.firebase.remoteconfig.interop.rollouts;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class AutoRolloutAssignmentEncoder implements Configurator {
    public static final int CODEGEN_VERSION = 2;
    public static final Configurator CONFIG = new AutoRolloutAssignmentEncoder();

    private AutoRolloutAssignmentEncoder() {
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig<?> encoderConfig) {
        encoderConfig.registerEncoder(RolloutAssignment.class, RolloutAssignmentEncoder.INSTANCE);
        encoderConfig.registerEncoder(AutoValue_RolloutAssignment.class, RolloutAssignmentEncoder.INSTANCE);
    }

    private static final class RolloutAssignmentEncoder implements ObjectEncoder<RolloutAssignment> {
        static final RolloutAssignmentEncoder INSTANCE = new RolloutAssignmentEncoder();
        private static final FieldDescriptor ROLLOUTID_DESCRIPTOR = FieldDescriptor.of(ConfigContainer.ROLLOUT_METADATA_ID);
        private static final FieldDescriptor VARIANTID_DESCRIPTOR = FieldDescriptor.of("variantId");
        private static final FieldDescriptor PARAMETERKEY_DESCRIPTOR = FieldDescriptor.of("parameterKey");
        private static final FieldDescriptor PARAMETERVALUE_DESCRIPTOR = FieldDescriptor.of("parameterValue");
        private static final FieldDescriptor TEMPLATEVERSION_DESCRIPTOR = FieldDescriptor.of(RemoteConfigConstants.ResponseFieldKey.TEMPLATE_VERSION_NUMBER);

        private RolloutAssignmentEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(RolloutAssignment rolloutAssignment, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(ROLLOUTID_DESCRIPTOR, rolloutAssignment.getRolloutId());
            objectEncoderContext.add(VARIANTID_DESCRIPTOR, rolloutAssignment.getVariantId());
            objectEncoderContext.add(PARAMETERKEY_DESCRIPTOR, rolloutAssignment.getParameterKey());
            objectEncoderContext.add(PARAMETERVALUE_DESCRIPTOR, rolloutAssignment.getParameterValue());
            objectEncoderContext.add(TEMPLATEVERSION_DESCRIPTOR, rolloutAssignment.getTemplateVersion());
        }
    }
}
