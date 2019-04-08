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

@Name("gsl_multiset_struct") @Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_multiset extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_multiset() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_multiset(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_multiset(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_multiset position(long position) {
        return (gsl_multiset)super.position(position);
    }

  public native @Cast("size_t") long n(); public native gsl_multiset n(long setter);
  public native @Cast("size_t") long k(); public native gsl_multiset k(long setter);
  public native @Cast("size_t*") SizeTPointer data(); public native gsl_multiset data(SizeTPointer setter);
}
