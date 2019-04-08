// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;


/*  Mixed Radix general-N routines  */

@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_fft_complex_wavetable extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_fft_complex_wavetable() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_fft_complex_wavetable(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_fft_complex_wavetable(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_fft_complex_wavetable position(long position) {
        return (gsl_fft_complex_wavetable)super.position(position);
    }

    public native @Cast("size_t") long n(); public native gsl_fft_complex_wavetable n(long setter);
    public native @Cast("size_t") long nf(); public native gsl_fft_complex_wavetable nf(long setter);
    public native @Cast("size_t") long factor(int i); public native gsl_fft_complex_wavetable factor(int i, long setter);
    @MemberGetter public native @Cast("size_t*") SizeTPointer factor();
    public native gsl_complex twiddle(int i); public native gsl_fft_complex_wavetable twiddle(int i, gsl_complex setter);
    @MemberGetter public native @Cast("gsl_complex**") PointerPointer twiddle();
    public native gsl_complex trig(); public native gsl_fft_complex_wavetable trig(gsl_complex setter);
  }
