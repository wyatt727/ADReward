package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.widget.R;
import java.util.HashMap;

/* loaded from: classes.dex */
public class KeyPosition extends KeyPositionBase {
    public static final String DRAWPATH = "drawPath";
    static final int KEY_TYPE = 2;
    static final String NAME = "KeyPosition";
    public static final String PERCENT_HEIGHT = "percentHeight";
    public static final String PERCENT_WIDTH = "percentWidth";
    public static final String PERCENT_X = "percentX";
    public static final String PERCENT_Y = "percentY";
    public static final String SIZE_PERCENT = "sizePercent";
    private static final String TAG = "KeyPosition";
    public static final String TRANSITION_EASING = "transitionEasing";
    public static final int TYPE_CARTESIAN = 0;
    public static final int TYPE_PATH = 1;
    public static final int TYPE_SCREEN = 2;
    String mTransitionEasing = null;
    int mPathMotionArc = UNSET;
    int mDrawPath = 0;
    float mPercentWidth = Float.NaN;
    float mPercentHeight = Float.NaN;
    float mPercentX = Float.NaN;
    float mPercentY = Float.NaN;
    float mAltPercentX = Float.NaN;
    float mAltPercentY = Float.NaN;
    int mPositionType = 0;
    private float mCalculatedPositionX = Float.NaN;
    private float mCalculatedPositionY = Float.NaN;

    @Override // androidx.constraintlayout.motion.widget.Key
    public void addValues(HashMap<String, ViewSpline> splines) {
    }

    public KeyPosition() {
        this.mType = 2;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void load(Context context, AttributeSet attrs) {
        Loader.read(this, context.obtainStyledAttributes(attrs, R.styleable.KeyPosition));
    }

    public void setType(int type) {
        this.mPositionType = type;
    }

    @Override // androidx.constraintlayout.motion.widget.KeyPositionBase
    void calcPosition(int layoutWidth, int layoutHeight, float start_x, float start_y, float end_x, float end_y) {
        int i = this.mPositionType;
        if (i == 1) {
            calcPathPosition(start_x, start_y, end_x, end_y);
        } else if (i == 2) {
            calcScreenPosition(layoutWidth, layoutHeight);
        } else {
            calcCartesianPosition(start_x, start_y, end_x, end_y);
        }
    }

    private void calcScreenPosition(int layoutWidth, int layoutHeight) {
        float f = this.mPercentX;
        float f2 = 0;
        this.mCalculatedPositionX = ((layoutWidth - 0) * f) + f2;
        this.mCalculatedPositionY = ((layoutHeight - 0) * f) + f2;
    }

    private void calcPathPosition(float start_x, float start_y, float end_x, float end_y) {
        float f = end_x - start_x;
        float f2 = end_y - start_y;
        float f3 = this.mPercentX;
        float f4 = this.mPercentY;
        this.mCalculatedPositionX = start_x + (f * f3) + ((-f2) * f4);
        this.mCalculatedPositionY = start_y + (f2 * f3) + (f * f4);
    }

    private void calcCartesianPosition(float start_x, float start_y, float end_x, float end_y) {
        float f = end_x - start_x;
        float f2 = end_y - start_y;
        float f3 = Float.isNaN(this.mPercentX) ? 0.0f : this.mPercentX;
        float f4 = Float.isNaN(this.mAltPercentY) ? 0.0f : this.mAltPercentY;
        float f5 = Float.isNaN(this.mPercentY) ? 0.0f : this.mPercentY;
        this.mCalculatedPositionX = (int) (start_x + (f3 * f) + ((Float.isNaN(this.mAltPercentX) ? 0.0f : this.mAltPercentX) * f2));
        this.mCalculatedPositionY = (int) (start_y + (f * f4) + (f2 * f5));
    }

    @Override // androidx.constraintlayout.motion.widget.KeyPositionBase
    float getPositionX() {
        return this.mCalculatedPositionX;
    }

    @Override // androidx.constraintlayout.motion.widget.KeyPositionBase
    float getPositionY() {
        return this.mCalculatedPositionY;
    }

    @Override // androidx.constraintlayout.motion.widget.KeyPositionBase
    public void positionAttributes(View view, RectF start, RectF end, float x, float y, String[] attribute, float[] value) {
        int i = this.mPositionType;
        if (i == 1) {
            positionPathAttributes(start, end, x, y, attribute, value);
        } else if (i == 2) {
            positionScreenAttributes(view, start, end, x, y, attribute, value);
        } else {
            positionCartAttributes(start, end, x, y, attribute, value);
        }
    }

    void positionPathAttributes(RectF start, RectF end, float x, float y, String[] attribute, float[] value) {
        float fCenterX = start.centerX();
        float fCenterY = start.centerY();
        float fCenterX2 = end.centerX() - fCenterX;
        float fCenterY2 = end.centerY() - fCenterY;
        float fHypot = (float) Math.hypot(fCenterX2, fCenterY2);
        if (fHypot < 1.0E-4d) {
            System.out.println("distance ~ 0");
            value[0] = 0.0f;
            value[1] = 0.0f;
            return;
        }
        float f = fCenterX2 / fHypot;
        float f2 = fCenterY2 / fHypot;
        float f3 = y - fCenterY;
        float f4 = x - fCenterX;
        float f5 = ((f * f3) - (f4 * f2)) / fHypot;
        float f6 = ((f * f4) + (f2 * f3)) / fHypot;
        if (attribute[0] != null) {
            if ("percentX".equals(attribute[0])) {
                value[0] = f6;
                value[1] = f5;
                return;
            }
            return;
        }
        attribute[0] = "percentX";
        attribute[1] = "percentY";
        value[0] = f6;
        value[1] = f5;
    }

    void positionScreenAttributes(View view, RectF start, RectF end, float x, float y, String[] attribute, float[] value) {
        start.centerX();
        start.centerY();
        end.centerX();
        end.centerY();
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int width = viewGroup.getWidth();
        int height = viewGroup.getHeight();
        if (attribute[0] != null) {
            if ("percentX".equals(attribute[0])) {
                value[0] = x / width;
                value[1] = y / height;
                return;
            } else {
                value[1] = x / width;
                value[0] = y / height;
                return;
            }
        }
        attribute[0] = "percentX";
        value[0] = x / width;
        attribute[1] = "percentY";
        value[1] = y / height;
    }

    void positionCartAttributes(RectF start, RectF end, float x, float y, String[] attribute, float[] value) {
        float fCenterX = start.centerX();
        float fCenterY = start.centerY();
        float fCenterX2 = end.centerX() - fCenterX;
        float fCenterY2 = end.centerY() - fCenterY;
        if (attribute[0] != null) {
            if ("percentX".equals(attribute[0])) {
                value[0] = (x - fCenterX) / fCenterX2;
                value[1] = (y - fCenterY) / fCenterY2;
                return;
            } else {
                value[1] = (x - fCenterX) / fCenterX2;
                value[0] = (y - fCenterY) / fCenterY2;
                return;
            }
        }
        attribute[0] = "percentX";
        value[0] = (x - fCenterX) / fCenterX2;
        attribute[1] = "percentY";
        value[1] = (y - fCenterY) / fCenterY2;
    }

    @Override // androidx.constraintlayout.motion.widget.KeyPositionBase
    public boolean intersects(int layoutWidth, int layoutHeight, RectF start, RectF end, float x, float y) {
        calcPosition(layoutWidth, layoutHeight, start.centerX(), start.centerY(), end.centerX(), end.centerY());
        return Math.abs(x - this.mCalculatedPositionX) < 20.0f && Math.abs(y - this.mCalculatedPositionY) < 20.0f;
    }

    private static class Loader {
        private static final int CURVE_FIT = 4;
        private static final int DRAW_PATH = 5;
        private static final int FRAME_POSITION = 2;
        private static final int PATH_MOTION_ARC = 10;
        private static final int PERCENT_HEIGHT = 12;
        private static final int PERCENT_WIDTH = 11;
        private static final int PERCENT_X = 6;
        private static final int PERCENT_Y = 7;
        private static final int SIZE_PERCENT = 8;
        private static final int TARGET_ID = 1;
        private static final int TRANSITION_EASING = 3;
        private static final int TYPE = 9;
        private static SparseIntArray mAttrMap;

        private Loader() {
        }

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            mAttrMap = sparseIntArray;
            sparseIntArray.append(R.styleable.KeyPosition_motionTarget, 1);
            mAttrMap.append(R.styleable.KeyPosition_framePosition, 2);
            mAttrMap.append(R.styleable.KeyPosition_transitionEasing, 3);
            mAttrMap.append(R.styleable.KeyPosition_curveFit, 4);
            mAttrMap.append(R.styleable.KeyPosition_drawPath, 5);
            mAttrMap.append(R.styleable.KeyPosition_percentX, 6);
            mAttrMap.append(R.styleable.KeyPosition_percentY, 7);
            mAttrMap.append(R.styleable.KeyPosition_keyPositionType, 9);
            mAttrMap.append(R.styleable.KeyPosition_sizePercent, 8);
            mAttrMap.append(R.styleable.KeyPosition_percentWidth, 11);
            mAttrMap.append(R.styleable.KeyPosition_percentHeight, 12);
            mAttrMap.append(R.styleable.KeyPosition_pathMotionArc, 10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void read(KeyPosition c, TypedArray a2) {
            int indexCount = a2.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = a2.getIndex(i);
                switch (mAttrMap.get(index)) {
                    case 1:
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
                    case 2:
                        c.mFramePosition = a2.getInt(index, c.mFramePosition);
                        break;
                    case 3:
                        if (a2.peekValue(index).type == 3) {
                            c.mTransitionEasing = a2.getString(index);
                            break;
                        } else {
                            c.mTransitionEasing = Easing.NAMED_EASING[a2.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        c.mCurveFit = a2.getInteger(index, c.mCurveFit);
                        break;
                    case 5:
                        c.mDrawPath = a2.getInt(index, c.mDrawPath);
                        break;
                    case 6:
                        c.mPercentX = a2.getFloat(index, c.mPercentX);
                        break;
                    case 7:
                        c.mPercentY = a2.getFloat(index, c.mPercentY);
                        break;
                    case 8:
                        float f = a2.getFloat(index, c.mPercentHeight);
                        c.mPercentWidth = f;
                        c.mPercentHeight = f;
                        break;
                    case 9:
                        c.mPositionType = a2.getInt(index, c.mPositionType);
                        break;
                    case 10:
                        c.mPathMotionArc = a2.getInt(index, c.mPathMotionArc);
                        break;
                    case 11:
                        c.mPercentWidth = a2.getFloat(index, c.mPercentWidth);
                        break;
                    case 12:
                        c.mPercentHeight = a2.getFloat(index, c.mPercentHeight);
                        break;
                    default:
                        Log.e("KeyPosition", "unused attribute 0x" + Integer.toHexString(index) + "   " + mAttrMap.get(index));
                        break;
                }
            }
            if (c.mFramePosition == -1) {
                Log.e("KeyPosition", "no frame position");
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void setValue(String tag, Object value) {
        tag.hashCode();
        switch (tag) {
            case "transitionEasing":
                this.mTransitionEasing = value.toString();
                break;
            case "percentWidth":
                this.mPercentWidth = toFloat(value);
                break;
            case "percentHeight":
                this.mPercentHeight = toFloat(value);
                break;
            case "drawPath":
                this.mDrawPath = toInt(value);
                break;
            case "sizePercent":
                float f = toFloat(value);
                this.mPercentWidth = f;
                this.mPercentHeight = f;
                break;
            case "percentX":
                this.mPercentX = toFloat(value);
                break;
            case "percentY":
                this.mPercentY = toFloat(value);
                break;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public Key copy(Key src) {
        super.copy(src);
        KeyPosition keyPosition = (KeyPosition) src;
        this.mTransitionEasing = keyPosition.mTransitionEasing;
        this.mPathMotionArc = keyPosition.mPathMotionArc;
        this.mDrawPath = keyPosition.mDrawPath;
        this.mPercentWidth = keyPosition.mPercentWidth;
        this.mPercentHeight = Float.NaN;
        this.mPercentX = keyPosition.mPercentX;
        this.mPercentY = keyPosition.mPercentY;
        this.mAltPercentX = keyPosition.mAltPercentX;
        this.mAltPercentY = keyPosition.mAltPercentY;
        this.mCalculatedPositionX = keyPosition.mCalculatedPositionX;
        this.mCalculatedPositionY = keyPosition.mCalculatedPositionY;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    /* renamed from: clone */
    public Key mo15clone() {
        return new KeyPosition().copy(this);
    }
}
