// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;


@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_multimin_fdfminimizer extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_multimin_fdfminimizer() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_multimin_fdfminimizer(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_multimin_fdfminimizer(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_multimin_fdfminimizer position(long position) {
        return (gsl_multimin_fdfminimizer)super.position(position);
    }

  /* multi dimensional part */
  @MemberGetter public native @Const gsl_multimin_fdfminimizer_type type();
  public native gsl_multimin_function_fdf fdf(); public native gsl_multimin_fdfminimizer fdf(gsl_multimin_function_fdf setter);

  public native double f(); public native gsl_multimin_fdfminimizer f(double setter);
  public native gsl_vector x(); public native gsl_multimin_fdfminimizer x(gsl_vector setter);
  public native gsl_vector gradient(); public native gsl_multimin_fdfminimizer gradient(gsl_vector setter);
  public native gsl_vector dx(); public native gsl_multimin_fdfminimizer dx(gsl_vector setter);

  public native Pointer state(); public native gsl_multimin_fdfminimizer state(Pointer setter);
}
