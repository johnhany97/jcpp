// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;


/* minimization of non-differentiable functions */

@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_multimin_fminimizer_type extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_multimin_fminimizer_type() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_multimin_fminimizer_type(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_multimin_fminimizer_type(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_multimin_fminimizer_type position(long position) {
        return (gsl_multimin_fminimizer_type)super.position(position);
    }

  @MemberGetter public native @Cast("const char*") BytePointer name();
  public native @Cast("size_t") long size(); public native gsl_multimin_fminimizer_type size(long setter);
  public static class Alloc_Pointer_long extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Alloc_Pointer_long(Pointer p) { super(p); }
      protected Alloc_Pointer_long() { allocate(); }
      private native void allocate();
      public native int call(Pointer state, @Cast("size_t") long n);
  }
  public native Alloc_Pointer_long alloc(); public native gsl_multimin_fminimizer_type alloc(Alloc_Pointer_long setter);
  public static class Set_Pointer_gsl_multimin_function_gsl_vector_DoublePointer_gsl_vector extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Set_Pointer_gsl_multimin_function_gsl_vector_DoublePointer_gsl_vector(Pointer p) { super(p); }
      protected Set_Pointer_gsl_multimin_function_gsl_vector_DoublePointer_gsl_vector() { allocate(); }
      private native void allocate();
      public native int call(Pointer state, gsl_multimin_function f,
                @Const gsl_vector x, 
                DoublePointer size,
                @Const gsl_vector step_size);
  }
  public native Set_Pointer_gsl_multimin_function_gsl_vector_DoublePointer_gsl_vector set(); public native gsl_multimin_fminimizer_type set(Set_Pointer_gsl_multimin_function_gsl_vector_DoublePointer_gsl_vector setter);
  public static class Iterate_Pointer_gsl_multimin_function_gsl_vector_DoublePointer_DoublePointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Iterate_Pointer_gsl_multimin_function_gsl_vector_DoublePointer_DoublePointer(Pointer p) { super(p); }
      protected Iterate_Pointer_gsl_multimin_function_gsl_vector_DoublePointer_DoublePointer() { allocate(); }
      private native void allocate();
      public native int call(Pointer state, gsl_multimin_function f, 
                    gsl_vector x, 
                    DoublePointer size,
                    DoublePointer fval);
  }
  public native Iterate_Pointer_gsl_multimin_function_gsl_vector_DoublePointer_DoublePointer iterate(); public native gsl_multimin_fminimizer_type iterate(Iterate_Pointer_gsl_multimin_function_gsl_vector_DoublePointer_DoublePointer setter);
  public static class Free_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Free_Pointer(Pointer p) { super(p); }
      protected Free_Pointer() { allocate(); }
      private native void allocate();
      public native void call(Pointer state);
  }
  public native Free_Pointer free(); public native gsl_multimin_fminimizer_type free(Free_Pointer setter);
}
