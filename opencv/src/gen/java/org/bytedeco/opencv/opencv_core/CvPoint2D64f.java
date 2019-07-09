// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;

// #endif


@NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class CvPoint2D64f extends AbstractCvPoint2D64f {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvPoint2D64f(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CvPoint2D64f(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public CvPoint2D64f position(long position) {
        return (CvPoint2D64f)super.position(position);
    }

    public native double x(); public native CvPoint2D64f x(double setter);
    public native double y(); public native CvPoint2D64f y(double setter);
// #ifdef CV__VALIDATE_UNUNITIALIZED_VARS
    public CvPoint2D64f() { super((Pointer)null); allocate(); }
    private native void allocate();
// #endif
}
