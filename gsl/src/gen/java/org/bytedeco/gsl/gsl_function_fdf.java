// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;


/* Definition of an arbitrary function returning two values, r1, r2 */

@Name("gsl_function_fdf_struct") @Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_function_fdf extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_function_fdf() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_function_fdf(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_function_fdf(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_function_fdf position(long position) {
        return (gsl_function_fdf)super.position(position);
    }

  public static class F_double_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    F_double_Pointer(Pointer p) { super(p); }
      protected F_double_Pointer() { allocate(); }
      private native void allocate();
      public native double call(double x, Pointer params);
  }
  public native F_double_Pointer f(); public native gsl_function_fdf f(F_double_Pointer setter);
  public static class Df_double_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Df_double_Pointer(Pointer p) { super(p); }
      protected Df_double_Pointer() { allocate(); }
      private native void allocate();
      public native double call(double x, Pointer params);
  }
  public native Df_double_Pointer df(); public native gsl_function_fdf df(Df_double_Pointer setter);
  public static class Fdf_double_Pointer_DoublePointer_DoublePointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Fdf_double_Pointer_DoublePointer_DoublePointer(Pointer p) { super(p); }
      protected Fdf_double_Pointer_DoublePointer_DoublePointer() { allocate(); }
      private native void allocate();
      public native void call(double x, Pointer params, DoublePointer f, DoublePointer df);
  }
  public native Fdf_double_Pointer_DoublePointer_DoublePointer fdf(); public native gsl_function_fdf fdf(Fdf_double_Pointer_DoublePointer_DoublePointer setter);
  public native Pointer params(); public native gsl_function_fdf params(Pointer setter);
}
