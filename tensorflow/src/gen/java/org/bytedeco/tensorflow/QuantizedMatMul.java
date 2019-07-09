// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Perform a quantized matrix multiplication of  {@code a} by the matrix {@code b}.
 * 
 *  The inputs must be two-dimensional matrices and the inner dimension of
 *  {@code a} (after being transposed if {@code transpose_a} is non-zero) must match the
 *  outer dimension of {@code b} (after being transposed if {@code transposed_b} is
 *  non-zero).
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * a: Must be a two-dimensional tensor.
 *  * b: Must be a two-dimensional tensor.
 *  * min_a: The float value that the lowest quantized {@code a} value represents.
 *  * max_a: The float value that the highest quantized {@code a} value represents.
 *  * min_b: The float value that the lowest quantized {@code b} value represents.
 *  * max_b: The float value that the highest quantized {@code b} value represents.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * transpose_a: If true, {@code a} is transposed before multiplication.
 *  * transpose_b: If true, {@code b} is transposed before multiplication.
 *  * Tactivation: The type of output produced by activation function
 *  following this operation.
 * 
 *  Returns:
 *  * {@code Output} out
 *  * {@code Output} min_out: The float value that the lowest quantized output value represents.
 *  * {@code Output} max_out: The float value that the highest quantized output value represents. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class QuantizedMatMul extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QuantizedMatMul(Pointer p) { super(p); }

  /** Optional attribute setters for QuantizedMatMul */
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
  
    /** Defaults to DT_QINT32 */
    
    ///
    public native @ByVal Attrs Toutput(@Cast("tensorflow::DataType") int x);

    /** If true, {@code a} is transposed before multiplication.
     * 
     *  Defaults to false */
    
    ///
    public native @ByVal Attrs TransposeA(@Cast("bool") boolean x);

    /** If true, {@code b} is transposed before multiplication.
     * 
     *  Defaults to false */
    
    ///
    public native @ByVal Attrs TransposeB(@Cast("bool") boolean x);

    /** The type of output produced by activation function
     *  following this operation.
     * 
     *  Defaults to DT_QUINT8 */
    public native @ByVal Attrs Tactivation(@Cast("tensorflow::DataType") int x);

    public native @Cast("tensorflow::DataType") int Toutput_(); public native Attrs Toutput_(int setter);
    public native @Cast("bool") boolean transpose_a_(); public native Attrs transpose_a_(boolean setter);
    public native @Cast("bool") boolean transpose_b_(); public native Attrs transpose_b_(boolean setter);
    public native @Cast("tensorflow::DataType") int Tactivation_(); public native Attrs Tactivation_(int setter);
  }
  public QuantizedMatMul(@Const @ByRef Scope scope, @ByVal Input a,
                  @ByVal Input b, @ByVal Input min_a,
                  @ByVal Input max_a, @ByVal Input min_b,
                  @ByVal Input max_b) { super((Pointer)null); allocate(scope, a, b, min_a, max_a, min_b, max_b); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input a,
                  @ByVal Input b, @ByVal Input min_a,
                  @ByVal Input max_a, @ByVal Input min_b,
                  @ByVal Input max_b);
  public QuantizedMatMul(@Const @ByRef Scope scope, @ByVal Input a,
                  @ByVal Input b, @ByVal Input min_a,
                  @ByVal Input max_a, @ByVal Input min_b,
                  @ByVal Input max_b, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, a, b, min_a, max_a, min_b, max_b, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input a,
                  @ByVal Input b, @ByVal Input min_a,
                  @ByVal Input max_a, @ByVal Input min_b,
                  @ByVal Input max_b, @Const @ByRef Attrs attrs);

  public static native @ByVal Attrs Toutput(@Cast("tensorflow::DataType") int x);
  public static native @ByVal Attrs TransposeA(@Cast("bool") boolean x);
  public static native @ByVal Attrs TransposeB(@Cast("bool") boolean x);
  public static native @ByVal Attrs Tactivation(@Cast("tensorflow::DataType") int x);

  public native @ByRef Operation operation(); public native QuantizedMatMul operation(Operation setter);
  public native @ByRef Output out(); public native QuantizedMatMul out(Output setter);
  public native @ByRef Output min_out(); public native QuantizedMatMul min_out(Output setter);
  public native @ByRef Output max_out(); public native QuantizedMatMul max_out(Output setter);
}
