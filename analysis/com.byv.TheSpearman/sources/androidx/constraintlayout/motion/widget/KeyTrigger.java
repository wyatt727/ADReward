package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes.dex */
public class KeyTrigger extends Key {
    public static final String CROSS = "CROSS";
    public static final int KEY_TYPE = 5;
    static final String NAME = "KeyTrigger";
    public static final String NEGATIVE_CROSS = "negativeCross";
    public static final String POSITIVE_CROSS = "positiveCross";
    public static final String POST_LAYOUT = "postLayout";
    private static final String TAG = "KeyTrigger";
    public static final String TRIGGER_COLLISION_ID = "triggerCollisionId";
    public static final String TRIGGER_COLLISION_VIEW = "triggerCollisionView";
    public static final String TRIGGER_ID = "triggerID";
    public static final String TRIGGER_RECEIVER = "triggerReceiver";
    public static final String TRIGGER_SLACK = "triggerSlack";
    public static final String VIEW_TRANSITION_ON_CROSS = "viewTransitionOnCross";
    public static final String VIEW_TRANSITION_ON_NEGATIVE_CROSS = "viewTransitionOnNegativeCross";
    public static final String VIEW_TRANSITION_ON_POSITIVE_CROSS = "viewTransitionOnPositiveCross";
    private float mFireLastPos;
    private int mCurveFit = -1;
    private String mCross = null;
    private int mTriggerReceiver = UNSET;
    private String mNegativeCross = null;
    private String mPositiveCross = null;
    private int mTriggerID = UNSET;
    private int mTriggerCollisionId = UNSET;
    private View mTriggerCollisionView = null;
    float mTriggerSlack = 0.1f;
    private boolean mFireCrossReset = true;
    private boolean mFireNegativeReset = true;
    private boolean mFirePositiveReset = true;
    private float mFireThreshold = Float.NaN;
    private boolean mPostLayout = false;
    int mViewTransitionOnNegativeCross = UNSET;
    int mViewTransitionOnPositiveCross = UNSET;
    int mViewTransitionOnCross = UNSET;
    RectF mCollisionRect = new RectF();
    RectF mTargetRect = new RectF();
    HashMap<String, Method> mMethodHashMap = new HashMap<>();

    @Override // androidx.constraintlayout.motion.widget.Key
    public void addValues(HashMap<String, ViewSpline> splines) {
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void getAttributeNames(HashSet<String> attributes) {
    }

    public KeyTrigger() {
        this.mType = 5;
        this.mCustomConstraints = new HashMap<>();
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void load(Context context, AttributeSet attrs) {
        Loader.read(this, context.obtainStyledAttributes(attrs, R.styleable.KeyTrigger), context);
    }

    int getCurveFit() {
        return this.mCurveFit;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void setValue(String tag, Object value) {
        tag.hashCode();
        switch (tag) {
            case "positiveCross":
                this.mPositiveCross = value.toString();
                break;
            case "viewTransitionOnPositiveCross":
                this.mViewTransitionOnPositiveCross = toInt(value);
                break;
            case "triggerCollisionId":
                this.mTriggerCollisionId = toInt(value);
                break;
            case "triggerID":
                this.mTriggerID = toInt(value);
                break;
            case "negativeCross":
                this.mNegativeCross = value.toString();
                break;
            case "triggerCollisionView":
                this.mTriggerCollisionView = (View) value;
                break;
            case "viewTransitionOnNegativeCross":
                this.mViewTransitionOnNegativeCross = toInt(value);
                break;
            case "CROSS":
                this.mCross = value.toString();
                break;
            case "triggerSlack":
                this.mTriggerSlack = toFloat(value);
                break;
            case "viewTransitionOnCross":
                this.mViewTransitionOnCross = toInt(value);
                break;
            case "postLayout":
                this.mPostLayout = toBoolean(value);
                break;
            case "triggerReceiver":
                this.mTriggerReceiver = toInt(value);
                break;
        }
    }

    private void setUpRect(RectF rect, View child, boolean postLayout) {
        rect.top = child.getTop();
        rect.bottom = child.getBottom();
        rect.left = child.getLeft();
        rect.right = child.getRight();
        if (postLayout) {
            child.getMatrix().mapRect(rect);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void conditionallyFire(float r10, android.view.View r11) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.KeyTrigger.conditionallyFire(float, android.view.View):void");
    }

    private void fire(String str, View call) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Method method;
        if (str == null) {
            return;
        }
        if (str.startsWith(".")) {
            fireCustom(str, call);
            return;
        }
        if (this.mMethodHashMap.containsKey(str)) {
            method = this.mMethodHashMap.get(str);
            if (method == null) {
                return;
            }
        } else {
            method = null;
        }
        if (method == null) {
            try {
                method = call.getClass().getMethod(str, new Class[0]);
                this.mMethodHashMap.put(str, method);
            } catch (NoSuchMethodException unused) {
                this.mMethodHashMap.put(str, null);
                Log.e("KeyTrigger", "Could not find method \"" + str + "\"on class " + call.getClass().getSimpleName() + " " + Debug.getName(call));
                return;
            }
        }
        try {
            method.invoke(call, new Object[0]);
        } catch (Exception unused2) {
            Log.e("KeyTrigger", "Exception in call \"" + this.mCross + "\"on class " + call.getClass().getSimpleName() + " " + Debug.getName(call));
        }
    }

    private void fireCustom(String str, View view) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        boolean z = str.length() == 1;
        if (!z) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.mCustomConstraints.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z || lowerCase.matches(str)) {
                ConstraintAttribute constraintAttribute = this.mCustomConstraints.get(str2);
                if (constraintAttribute != null) {
                    constraintAttribute.applyCustom(view);
                }
            }
        }
    }

    private static class Loader {
        private static final int COLLISION = 9;
        private static final int CROSS = 4;
        private static final int FRAME_POS = 8;
        private static final int NEGATIVE_CROSS = 1;
        private static final int POSITIVE_CROSS = 2;
        private static final int POST_LAYOUT = 10;
        private static final int TARGET_ID = 7;
        private static final int TRIGGER_ID = 6;
        private static final int TRIGGER_RECEIVER = 11;
        private static final int TRIGGER_SLACK = 5;
        private static final int VT_CROSS = 12;
        private static final int VT_NEGATIVE_CROSS = 13;
        private static final int VT_POSITIVE_CROSS = 14;
        private static SparseIntArray mAttrMap;

        private Loader() {
        }

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            mAttrMap = sparseIntArray;
            sparseIntArray.append(R.styleable.KeyTrigger_framePosition, 8);
            mAttrMap.append(R.styleable.KeyTrigger_onCross, 4);
            mAttrMap.append(R.styleable.KeyTrigger_onNegativeCross, 1);
            mAttrMap.append(R.styleable.KeyTrigger_onPositiveCross, 2);
            mAttrMap.append(R.styleable.KeyTrigger_motionTarget, 7);
            mAttrMap.append(R.styleable.KeyTrigger_triggerId, 6);
            mAttrMap.append(R.styleable.KeyTrigger_triggerSlack, 5);
            mAttrMap.append(R.styleable.KeyTrigger_motion_triggerOnCollision, 9);
            mAttrMap.append(R.styleable.KeyTrigger_motion_postLayoutCollision, 10);
            mAttrMap.append(R.styleable.KeyTrigger_triggerReceiver, 11);
            mAttrMap.append(R.styleable.KeyTrigger_viewTransitionOnCross, 12);
            mAttrMap.append(R.styleable.KeyTrigger_viewTransitionOnNegativeCross, 13);
            mAttrMap.append(R.styleable.KeyTrigger_viewTransitionOnPositiveCross, 14);
        }

        public static void read(KeyTrigger c, TypedArray a2, Context context) {
            int indexCount = a2.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = a2.getIndex(i);
                switch (mAttrMap.get(index)) {
                    case 1:
                        c.mNegativeCross = a2.getString(index);
                        break;
                    case 2:
                        c.mPositiveCross = a2.getString(index);
                        break;
                    case 3:
                    default:
                        Log.e("KeyTrigger", "unused attribute 0x" + Integer.toHexString(index) + "   " + mAttrMap.get(index));
                        break;
                    case 4:
                        c.mCross = a2.getString(index);
                        break;
                    case 5:
                        c.mTriggerSlack = a2.getFloat(index, c.mTriggerSlack);
                        break;
                    case 6:
                        c.mTriggerID = a2.getResourceId(index, c.mTriggerID);
                        break;
                    case 7:
                        if (MotionLayout.IS_IN_EDIT_MODE) {
                            c.mTargetId = a2.getResourceId(index, c.mTargetId);
                            if (c.mTargetId == -1) {
                                c.mTargetString = a2.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (a2.peekValue(index).type == 3) {
                            c.mTargetString = a2.getString(index);
                            break;
                        } else {
                            c.mTargetId = a2.getResourceId(index, c.mTargetId);
                            break;
                        }
                    case 8:
                        c.mFramePosition = a2.getInteger(index, c.mFramePosition);
                        c.mFireThreshold = (c.mFramePosition + 0.5f) / 100.0f;
                        break;
                    case 9:
                        c.mTriggerCollisionId = a2.getResourceId(index, c.mTriggerCollisionId);
                        break;
                    case 10:
                        c.mPostLayout = a2.getBoolean(index, c.mPostLayout);
                        break;
                    case 11:
                        c.mTriggerReceiver = a2.getResourceId(index, c.mTriggerReceiver);
                        break;
                    case 12:
                        c.mViewTransitionOnCross = a2.getResourceId(index, c.mViewTransitionOnCross);
                        break;
                    case 13:
                        c.mViewTransitionOnNegativeCross = a2.getResourceId(index, c.mViewTransitionOnNegativeCross);
                        break;
                    case 14:
                        c.mViewTransitionOnPositiveCross = a2.getResourceId(index, c.mViewTransitionOnPositiveCross);
                        break;
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public Key copy(Key src) {
        super.copy(src);
        KeyTrigger keyTrigger = (KeyTrigger) src;
        this.mCurveFit = keyTrigger.mCurveFit;
        this.mCross = keyTrigger.mCross;
        this.mTriggerReceiver = keyTrigger.mTriggerReceiver;
        this.mNegativeCross = keyTrigger.mNegativeCross;
        this.mPositiveCross = keyTrigger.mPositiveCross;
        this.mTriggerID = keyTrigger.mTriggerID;
        this.mTriggerCollisionId = keyTrigger.mTriggerCollisionId;
        this.mTriggerCollisionView = keyTrigger.mTriggerCollisionView;
        this.mTriggerSlack = keyTrigger.mTriggerSlack;
        this.mFireCrossReset = keyTrigger.mFireCrossReset;
        this.mFireNegativeReset = keyTrigger.mFireNegativeReset;
        this.mFirePositiveReset = keyTrigger.mFirePositiveReset;
        this.mFireThreshold = keyTrigger.mFireThreshold;
        this.mFireLastPos = keyTrigger.mFireLastPos;
        this.mPostLayout = keyTrigger.mPostLayout;
        this.mCollisionRect = keyTrigger.mCollisionRect;
        this.mTargetRect = keyTrigger.mTargetRect;
        this.mMethodHashMap = keyTrigger.mMethodHashMap;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    /* renamed from: clone */
    public Key mo15clone() {
        return new KeyTrigger().copy(this);
    }
}
