// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.opencv.global.opencv_core.*;

// #endif


///////////////////////////// TermCriteria //////////////////////////////

/** \brief The class defining termination criteria for iterative algorithms.
<p>
You can initialize it by default constructor and then override any parameters, or the structure may
be fully initialized using the advanced variant of the constructor.
*/
@Namespace("cv") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class TermCriteria extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TermCriteria(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TermCriteria(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public TermCriteria position(long position) {
        return (TermCriteria)super.position(position);
    }

    /**
      Criteria type, can be one of: COUNT, EPS or COUNT + EPS
    */
    /** enum cv::TermCriteria::Type */
    public static final int
        /** the maximum number of iterations or elements to compute */
        COUNT = 1,
        /** ditto */
        MAX_ITER = COUNT,
        /** the desired accuracy or change in parameters at which the iterative algorithm stops */
        EPS = 2;

    /** default constructor */
    public TermCriteria() { super((Pointer)null); allocate(); }
    private native void allocate();
    /**
    @param type The type of termination criteria, one of TermCriteria::Type
    @param maxCount The maximum number of iterations or elements to compute.
    @param epsilon The desired accuracy or change in parameters at which the iterative algorithm stops.
    */
    public TermCriteria(int type, int maxCount, double epsilon) { super((Pointer)null); allocate(type, maxCount, epsilon); }
    private native void allocate(int type, int maxCount, double epsilon);

    public native @Cast("bool") boolean isValid();

    /** the type of termination criteria: COUNT, EPS or COUNT + EPS */
    public native int type(); public native TermCriteria type(int setter);
    /** the maximum number of iterations/elements */
    public native int maxCount(); public native TermCriteria maxCount(int setter);
    /** the desired accuracy */
    public native double epsilon(); public native TermCriteria epsilon(double setter);
}
