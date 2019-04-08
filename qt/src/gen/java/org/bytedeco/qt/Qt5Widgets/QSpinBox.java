// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.qt.Qt5Widgets;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.qt.Qt5Core.*;
import static org.bytedeco.qt.global.Qt5Core.*;
import org.bytedeco.qt.Qt5Gui.*;
import static org.bytedeco.qt.global.Qt5Gui.*;

import static org.bytedeco.qt.global.Qt5Widgets.*;

// Parsed from QtWidgets/qspinbox.h

@Properties(inherit = org.bytedeco.qt.presets.Qt5Widgets.class)
public class QSpinBox extends QAbstractSpinBox {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QSpinBox(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public QSpinBox(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public QSpinBox position(long position) {
        return (QSpinBox)super.position(position);
    }

    public QSpinBox(QWidget parent/*=nullptr*/) { super((Pointer)null); allocate(parent); }
    private native void allocate(QWidget parent/*=nullptr*/);
    public QSpinBox() { super((Pointer)null); allocate(); }
    private native void allocate();

    public native int value();

    public native @ByVal QString prefix();
    public native void setPrefix(@Const @ByRef QString prefix);

    public native @ByVal QString suffix();
    public native void setSuffix(@Const @ByRef QString suffix);

    public native @ByVal QString cleanText();

    public native int singleStep();
    public native void setSingleStep(int val);

    public native int minimum();
    public native void setMinimum(int min);

    public native int maximum();
    public native void setMaximum(int max);

    public native void setRange(int min, int max);

    public native @ByVal StepType stepType();
    public native void setStepType(@ByVal StepType stepType);

    public native int displayIntegerBase();
    public native void setDisplayIntegerBase(int base);
    public native void setValue(int val);
}
