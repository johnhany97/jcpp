// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.opencv.global.opencv_core.*;


/** a < b ? -1 : a > b ? 1 : 0 */
@Convention("CV_CDECL") @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class CvCmpFunc extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    CvCmpFunc(Pointer p) { super(p); }
    protected CvCmpFunc() { allocate(); }
    private native void allocate();
    public native int call(@Const Pointer a, @Const Pointer b, Pointer userdata );
}
