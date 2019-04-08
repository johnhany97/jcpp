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

// Parsed from QtWidgets/qabstractscrollarea.h

@Properties(inherit = org.bytedeco.qt.presets.Qt5Widgets.class)
public class QAbstractScrollArea extends QFrame {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QAbstractScrollArea(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public QAbstractScrollArea(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public QAbstractScrollArea position(long position) {
        return (QAbstractScrollArea)super.position(position);
    }

    public QAbstractScrollArea(QWidget parent/*=nullptr*/) { super((Pointer)null); allocate(parent); }
    private native void allocate(QWidget parent/*=nullptr*/);
    public QAbstractScrollArea() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** enum QAbstractScrollArea::SizeAdjustPolicy */
    public static final int
        AdjustIgnored = 0,
        AdjustToContentsOnFirstShow = 1,
        AdjustToContents = 2;
    

    public native @Cast("Qt::ScrollBarPolicy") int verticalScrollBarPolicy();
    public native void setVerticalScrollBarPolicy(@Cast("Qt::ScrollBarPolicy") int arg0);

    public native @Cast("Qt::ScrollBarPolicy") int horizontalScrollBarPolicy();
    public native void setHorizontalScrollBarPolicy(@Cast("Qt::ScrollBarPolicy") int arg0);

    public native QWidget cornerWidget();
    public native void setCornerWidget(QWidget widget);

    public native void addScrollBarWidget(QWidget widget, @ByVal @Cast("Qt::Alignment") int alignment);

    public native QWidget viewport();
    public native void setViewport(QWidget widget);
    public native @ByVal QSize maximumViewportSize();

    public native @ByVal QSize minimumSizeHint();

    public native @ByVal QSize sizeHint();

    public native void setupViewport(QWidget viewport);

    public native @Cast("QAbstractScrollArea::SizeAdjustPolicy") int sizeAdjustPolicy();
    public native void setSizeAdjustPolicy(@Cast("QAbstractScrollArea::SizeAdjustPolicy") int policy);
}
