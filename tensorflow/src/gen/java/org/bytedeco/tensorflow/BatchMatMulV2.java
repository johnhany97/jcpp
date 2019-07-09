// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Multiplies slices of two tensors in batches.
 * 
 *  Multiplies all slices of {@code Tensor} {@code x} and {@code y} (each slice can be
 *  viewed as an element of a batch), and arranges the individual results
 *  in a single output tensor of the same batch size. Each of the
 *  individual slices can optionally be adjointed (to adjoint a matrix
 *  means to transpose and conjugate it) before multiplication by setting
 *  the {@code adj_x} or {@code adj_y} flag to {@code True}, which are by default {@code False}.
 * 
 *  The input tensors {@code x} and {@code y} are 2-D or higher with shape {@code [..., r_x, c_x]}
 *  and {@code [..., r_y, c_y]}.
 * 
 *  The output tensor is 2-D or higher with shape {@code [..., r_o, c_o]}, where:
 * 
 *      r_o = c_x if adj_x else r_x
 *      c_o = r_y if adj_y else c_y
 * 
 *  It is computed as:
 * 
 *      output[..., :, :] = matrix(x[..., :, :]) * matrix(y[..., :, :])
 * 
 *  *NOTE*: {@code BatchMatMulV2} supports broadcasting in the batch dimensions. More
 *  about broadcasting
 *  [here](http://docs.scipy.org/doc/numpy/user/basics.broadcasting.html).
 * 
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * x: 2-D or higher with shape {@code [..., r_x, c_x]}.
 *  * y: 2-D or higher with shape {@code [..., r_y, c_y]}.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * adj_x: If {@code True}, adjoint the slices of {@code x}. Defaults to {@code False}.
 *  * adj_y: If {@code True}, adjoint the slices of {@code y}. Defaults to {@code False}.
 * 
 *  Returns:
 *  * {@code Output}: 3-D or higher with shape {@code [..., r_o, c_o]} */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class BatchMatMulV2 extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BatchMatMulV2(Pointer p) { super(p); }

  /** Optional attribute setters for BatchMatMulV2 */
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
  
    /** If {@code True}, adjoint the slices of {@code x}. Defaults to {@code False}.
     * 
     *  Defaults to false */
    
    ///
    public native @ByVal Attrs AdjX(@Cast("bool") boolean x);

    /** If {@code True}, adjoint the slices of {@code y}. Defaults to {@code False}.
     * 
     *  Defaults to false */
    public native @ByVal Attrs AdjY(@Cast("bool") boolean x);

    public native @Cast("bool") boolean adj_x_(); public native Attrs adj_x_(boolean setter);
    public native @Cast("bool") boolean adj_y_(); public native Attrs adj_y_(boolean setter);
  }
  public BatchMatMulV2(@Const @ByRef Scope scope, @ByVal Input x,
                @ByVal Input y) { super((Pointer)null); allocate(scope, x, y); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input x,
                @ByVal Input y);
  public BatchMatMulV2(@Const @ByRef Scope scope, @ByVal Input x,
                @ByVal Input y, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, x, y, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input x,
                @ByVal Input y, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs AdjX(@Cast("bool") boolean x);
  public static native @ByVal Attrs AdjY(@Cast("bool") boolean x);

  public native @ByRef Operation operation(); public native BatchMatMulV2 operation(Operation setter);
  public native @ByRef Output output(); public native BatchMatMulV2 output(Output setter);
}
