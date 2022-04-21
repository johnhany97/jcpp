// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;


// Double-precision complex data type compatible with the C99 definition.
@Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class TfLiteComplex128 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TfLiteComplex128() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TfLiteComplex128(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TfLiteComplex128(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TfLiteComplex128 position(long position) {
        return (TfLiteComplex128)super.position(position);
    }
    @Override public TfLiteComplex128 getPointer(long i) {
        return new TfLiteComplex128((Pointer)this).offsetAddress(i);
    }

  public native double re(); public native TfLiteComplex128 re(double setter);
  public native double im(); public native TfLiteComplex128 im(double setter);  // real and imaginary parts, respectively.
}
