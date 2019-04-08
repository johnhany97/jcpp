// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cufftw;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import static org.bytedeco.cuda.global.cufft.*;

import static org.bytedeco.cuda.global.cufftw.*;


@Properties(inherit = org.bytedeco.cuda.presets.cufftw.class)
public class fftw_iodim extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public fftw_iodim() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public fftw_iodim(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public fftw_iodim(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public fftw_iodim position(long position) {
        return (fftw_iodim)super.position(position);
    }

    public native int n(); public native fftw_iodim n(int setter);
    public native int is(); public native fftw_iodim is(int setter);
    public native int os(); public native fftw_iodim os(int setter);
}
