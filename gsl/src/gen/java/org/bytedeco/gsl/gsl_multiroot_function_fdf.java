// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;


/* Definition of vector-valued functions and gradient with parameters
   based on gsl_vector */

@Name("gsl_multiroot_function_fdf_struct") @Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_multiroot_function_fdf extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_multiroot_function_fdf() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_multiroot_function_fdf(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_multiroot_function_fdf(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_multiroot_function_fdf position(long position) {
        return (gsl_multiroot_function_fdf)super.position(position);
    }

  public static class F_gsl_vector_Pointer_gsl_vector extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    F_gsl_vector_Pointer_gsl_vector(Pointer p) { super(p); }
      protected F_gsl_vector_Pointer_gsl_vector() { allocate(); }
      private native void allocate();
      public native int call(@Const gsl_vector x, Pointer params, gsl_vector f);
  }
  public native F_gsl_vector_Pointer_gsl_vector f(); public native gsl_multiroot_function_fdf f(F_gsl_vector_Pointer_gsl_vector setter);
  public static class Df_gsl_vector_Pointer_gsl_matrix extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Df_gsl_vector_Pointer_gsl_matrix(Pointer p) { super(p); }
      protected Df_gsl_vector_Pointer_gsl_matrix() { allocate(); }
      private native void allocate();
      public native int call(@Const gsl_vector x, Pointer params, gsl_matrix df);
  }
  public native Df_gsl_vector_Pointer_gsl_matrix df(); public native gsl_multiroot_function_fdf df(Df_gsl_vector_Pointer_gsl_matrix setter);
  public static class Fdf_gsl_vector_Pointer_gsl_vector_gsl_matrix extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Fdf_gsl_vector_Pointer_gsl_vector_gsl_matrix(Pointer p) { super(p); }
      protected Fdf_gsl_vector_Pointer_gsl_vector_gsl_matrix() { allocate(); }
      private native void allocate();
      public native int call(@Const gsl_vector x, Pointer params, gsl_vector f, gsl_matrix df);
  }
  public native Fdf_gsl_vector_Pointer_gsl_vector_gsl_matrix fdf(); public native gsl_multiroot_function_fdf fdf(Fdf_gsl_vector_Pointer_gsl_vector_gsl_matrix setter);
  public native @Cast("size_t") long n(); public native gsl_multiroot_function_fdf n(long setter);
  public native Pointer params(); public native gsl_multiroot_function_fdf params(Pointer setter);
}
