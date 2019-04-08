// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;

// #else
// #endif

@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_ntuple extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_ntuple() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_ntuple(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_ntuple(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_ntuple position(long position) {
        return (gsl_ntuple)super.position(position);
    }

    public native FILE file(); public native gsl_ntuple file(FILE setter);
    public native Pointer ntuple_data(); public native gsl_ntuple ntuple_data(Pointer setter);
    public native @Cast("size_t") long size(); public native gsl_ntuple size(long setter);
}
