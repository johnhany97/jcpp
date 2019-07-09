// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Multiply the matrix "a" by the matrix "b".
 * 
 *  The inputs must be two-dimensional matrices and the inner dimension of
 *  "a" (after being transposed if transpose_a is true) must match the
 *  outer dimension of "b" (after being transposed if transposed_b is
 *  true).
 * 
 *  *Note*: The default kernel implementation for MatMul on GPUs uses
 *  cublas.
 * 
 *  Arguments:
 *  * scope: A Scope object
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * transpose_a: If true, "a" is transposed before multiplication.
 *  * transpose_b: If true, "b" is transposed before multiplication.
 * 
 *  Returns:
 *  * {@code Output}: The product tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class MatMul extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MatMul(Pointer p) { super(p); }

  /** Optional attribute setters for MatMul */
  public static class Attrs extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Attrs() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Attrs(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Attrs(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Attrs position(long position) {
          return (Attrs)super.position(position);
      }
  
    /** If true, "a" is transposed before multiplication.
     * 
     *  Defaults to false */
    
    ///
    public native @ByVal Attrs TransposeA(@Cast("bool") boolean x);

    /** If true, "b" is transposed before multiplication.
     * 
     *  Defaults to false */
    public native @ByVal Attrs TransposeB(@Cast("bool") boolean x);

    public native @Cast("bool") boolean transpose_a_(); public native Attrs transpose_a_(boolean setter);
    public native @Cast("bool") boolean transpose_b_(); public native Attrs transpose_b_(boolean setter);
  }
  public MatMul(@Const @ByRef Scope scope, @ByVal Input a,
         @ByVal Input b) { super((Pointer)null); allocate(scope, a, b); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input a,
         @ByVal Input b);
  public MatMul(@Const @ByRef Scope scope, @ByVal Input a,
         @ByVal Input b, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, a, b, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input a,
         @ByVal Input b, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs TransposeA(@Cast("bool") boolean x);
  public static native @ByVal Attrs TransposeB(@Cast("bool") boolean x);

  public native @ByRef Operation operation(); public native MatMul operation(Operation setter);
  public native @ByRef Output product(); public native MatMul product(Output setter);
}
