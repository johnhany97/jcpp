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

// Parsed from QtWidgets/qabstractbutton.h

@Properties(inherit = org.bytedeco.qt.presets.Qt5Widgets.class)
public class QAbstractButton extends QWidget {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QAbstractButton(Pointer p) { super(p); }


    public native void setText(@Const @ByRef QString text);
    public native @ByVal QString text();

    public native void setIcon(@Const @ByRef QIcon icon);
    public native @ByVal QIcon icon();

    public native @ByVal QSize iconSize();

// #ifndef QT_NO_SHORTCUT
// #endif

    public native void setCheckable(@Cast("bool") boolean arg0);
    public native @Cast("bool") boolean isCheckable();

    public native @Cast("bool") boolean isChecked();

    public native void setDown(@Cast("bool") boolean arg0);
    public native @Cast("bool") boolean isDown();

    public native void setAutoRepeat(@Cast("bool") boolean arg0);
    public native @Cast("bool") boolean autoRepeat();

    public native void setAutoRepeatDelay(int arg0);
    public native int autoRepeatDelay();

    public native void setAutoRepeatInterval(int arg0);
    public native int autoRepeatInterval();

    public native void setAutoExclusive(@Cast("bool") boolean arg0);
    public native @Cast("bool") boolean autoExclusive();

// #if QT_CONFIG(buttongroup)
    public native void setIconSize(@Const @ByRef QSize size);
    public native void animateClick(int msec/*=100*/);
    public native void animateClick();
    public native void click();
    public native void toggle();
    public native void setChecked(@Cast("bool") boolean arg0);
}
