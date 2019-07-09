// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;


/** @see TermCriteria
 */
@NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class CvTermCriteria extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvTermCriteria(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CvTermCriteria(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public CvTermCriteria position(long position) {
        return (CvTermCriteria)super.position(position);
    }

    /** may be combination of
                         CV_TERMCRIT_ITER
                         CV_TERMCRIT_EPS */
    public native int type(); public native CvTermCriteria type(int setter);
    public native int max_iter(); public native CvTermCriteria max_iter(int setter);
    public native double epsilon(); public native CvTermCriteria epsilon(double setter);
// #if defined(CV__ENABLE_C_API_CTORS) && defined(__cplusplus)
    public CvTermCriteria(int _type/*=0*/, int _iter/*=0*/, double _eps/*=0*/) { super((Pointer)null); allocate(_type, _iter, _eps); }
    private native void allocate(int _type/*=0*/, int _iter/*=0*/, double _eps/*=0*/);
    public CvTermCriteria() { super((Pointer)null); allocate(); }
    private native void allocate();
    public CvTermCriteria(@Const @ByRef TermCriteria t) { super((Pointer)null); allocate(t); }
    private native void allocate(@Const @ByRef TermCriteria t);
// #endif
// #ifdef __cplusplus
    public native @ByVal @Name("operator cv::TermCriteria") TermCriteria asTermCriteria();
// #endif
}
