// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;


// Single-precision complex data type compatible with the C99 definition.
@Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class TfLiteComplex64 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TfLiteComplex64() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TfLiteComplex64(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TfLiteComplex64(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TfLiteComplex64 position(long position) {
        return (TfLiteComplex64)super.position(position);
    }
    @Override public TfLiteComplex64 getPointer(long i) {
        return new TfLiteComplex64((Pointer)this).offsetAddress(i);
    }

  public native float re(); public native TfLiteComplex64 re(float setter);
  public native float im(); public native TfLiteComplex64 im(float setter);  // real and imaginary parts, respectively.
}
