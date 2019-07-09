// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Computes quantized depthwise Conv2D with Bias, Relu and Requantize.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * input: The original input tensor.
 *  * filter: The original filter tensor.
 *  * bias: The original bias tensor.
 *  * min_input: The float value that the minimum quantized input value represents.
 *  * max_input: The float value that the maximum quantized input value represents.
 *  * min_filter: The float value that the minimum quantized filter value represents.
 *  * max_filter: The float value that the maximum quantized filter value represents.
 *  * min_freezed_output: The minimum float value of the output tensor.
 *  * max_freezed_output: The maximum float value of the output tensor.
 *  * strides: List of stride values.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * out_type: The type of the output.
 *  * dilations: List of dilation values.
 * 
 *  Returns:
 *  * {@code Output} output: The output tensor.
 *  * {@code Output} min_output: The float value that the minimum quantized output value represents.
 *  * {@code Output} max_output: The float value that the maximum quantized output value represents. */
@Namespace("tensorflow::ops::internal") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class QuantizedDepthwiseConv2DWithBiasAndReluAndRequantize extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QuantizedDepthwiseConv2DWithBiasAndReluAndRequantize(Pointer p) { super(p); }

  /** Optional attribute setters for QuantizedDepthwiseConv2DWithBiasAndReluAndRequantize */
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
  
    /** The type of the output.
     * 
     *  Defaults to DT_QUINT8 */
    
    ///
    public native @ByVal Attrs OutType(@Cast("tensorflow::DataType") int x);

    /** List of dilation values.
     * 
     *  Defaults to [1, 1, 1, 1] */
    public native @ByVal Attrs Dilations(@ArraySlice IntPointer x);
    public native @ByVal Attrs Dilations(@ArraySlice IntBuffer x);
    public native @ByVal Attrs Dilations(@ArraySlice int... x);

    public native @Cast("tensorflow::DataType") int out_type_(); public native Attrs out_type_(int setter);
    public native @ArraySlice IntPointer dilations_(); public native Attrs dilations_(IntPointer setter);
  }
  public QuantizedDepthwiseConv2DWithBiasAndReluAndRequantize(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input filter,
                                                       @ByVal Input bias,
                                                       @ByVal Input min_input,
                                                       @ByVal Input max_input,
                                                       @ByVal Input min_filter,
                                                       @ByVal Input max_filter,
                                                       @ByVal Input min_freezed_output,
                                                       @ByVal Input max_freezed_output, @ArraySlice IntPointer strides, @StringPiece BytePointer padding) { super((Pointer)null); allocate(scope, input, filter, bias, min_input, max_input, min_filter, max_filter, min_freezed_output, max_freezed_output, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input filter,
                                                       @ByVal Input bias,
                                                       @ByVal Input min_input,
                                                       @ByVal Input max_input,
                                                       @ByVal Input min_filter,
                                                       @ByVal Input max_filter,
                                                       @ByVal Input min_freezed_output,
                                                       @ByVal Input max_freezed_output, @ArraySlice IntPointer strides, @StringPiece BytePointer padding);
  public QuantizedDepthwiseConv2DWithBiasAndReluAndRequantize(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input filter,
                                                       @ByVal Input bias,
                                                       @ByVal Input min_input,
                                                       @ByVal Input max_input,
                                                       @ByVal Input min_filter,
                                                       @ByVal Input max_filter,
                                                       @ByVal Input min_freezed_output,
                                                       @ByVal Input max_freezed_output, @ArraySlice IntBuffer strides, @StringPiece String padding) { super((Pointer)null); allocate(scope, input, filter, bias, min_input, max_input, min_filter, max_filter, min_freezed_output, max_freezed_output, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input filter,
                                                       @ByVal Input bias,
                                                       @ByVal Input min_input,
                                                       @ByVal Input max_input,
                                                       @ByVal Input min_filter,
                                                       @ByVal Input max_filter,
                                                       @ByVal Input min_freezed_output,
                                                       @ByVal Input max_freezed_output, @ArraySlice IntBuffer strides, @StringPiece String padding);
  public QuantizedDepthwiseConv2DWithBiasAndReluAndRequantize(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input filter,
                                                       @ByVal Input bias,
                                                       @ByVal Input min_input,
                                                       @ByVal Input max_input,
                                                       @ByVal Input min_filter,
                                                       @ByVal Input max_filter,
                                                       @ByVal Input min_freezed_output,
                                                       @ByVal Input max_freezed_output, @ArraySlice int[] strides, @StringPiece BytePointer padding) { super((Pointer)null); allocate(scope, input, filter, bias, min_input, max_input, min_filter, max_filter, min_freezed_output, max_freezed_output, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input filter,
                                                       @ByVal Input bias,
                                                       @ByVal Input min_input,
                                                       @ByVal Input max_input,
                                                       @ByVal Input min_filter,
                                                       @ByVal Input max_filter,
                                                       @ByVal Input min_freezed_output,
                                                       @ByVal Input max_freezed_output, @ArraySlice int[] strides, @StringPiece BytePointer padding);
  public QuantizedDepthwiseConv2DWithBiasAndReluAndRequantize(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input filter,
                                                       @ByVal Input bias,
                                                       @ByVal Input min_input,
                                                       @ByVal Input max_input,
                                                       @ByVal Input min_filter,
                                                       @ByVal Input max_filter,
                                                       @ByVal Input min_freezed_output,
                                                       @ByVal Input max_freezed_output, @ArraySlice IntPointer strides, @StringPiece String padding) { super((Pointer)null); allocate(scope, input, filter, bias, min_input, max_input, min_filter, max_filter, min_freezed_output, max_freezed_output, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input filter,
                                                       @ByVal Input bias,
                                                       @ByVal Input min_input,
                                                       @ByVal Input max_input,
                                                       @ByVal Input min_filter,
                                                       @ByVal Input max_filter,
                                                       @ByVal Input min_freezed_output,
                                                       @ByVal Input max_freezed_output, @ArraySlice IntPointer strides, @StringPiece String padding);
  public QuantizedDepthwiseConv2DWithBiasAndReluAndRequantize(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input filter,
                                                       @ByVal Input bias,
                                                       @ByVal Input min_input,
                                                       @ByVal Input max_input,
                                                       @ByVal Input min_filter,
                                                       @ByVal Input max_filter,
                                                       @ByVal Input min_freezed_output,
                                                       @ByVal Input max_freezed_output, @ArraySlice IntBuffer strides, @StringPiece BytePointer padding) { super((Pointer)null); allocate(scope, input, filter, bias, min_input, max_input, min_filter, max_filter, min_freezed_output, max_freezed_output, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input filter,
                                                       @ByVal Input bias,
                                                       @ByVal Input min_input,
                                                       @ByVal Input max_input,
                                                       @ByVal Input min_filter,
                                                       @ByVal Input max_filter,
                                                       @ByVal Input min_freezed_output,
                                                       @ByVal Input max_freezed_output, @ArraySlice IntBuffer strides, @StringPiece BytePointer padding);
  public QuantizedDepthwiseConv2DWithBiasAndReluAndRequantize(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input filter,
                                                       @ByVal Input bias,
                                                       @ByVal Input min_input,
                                                       @ByVal Input max_input,
                                                       @ByVal Input min_filter,
                                                       @ByVal Input max_filter,
                                                       @ByVal Input min_freezed_output,
                                                       @ByVal Input max_freezed_output, @ArraySlice int[] strides, @StringPiece String padding) { super((Pointer)null); allocate(scope, input, filter, bias, min_input, max_input, min_filter, max_filter, min_freezed_output, max_freezed_output, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input filter,
                                                       @ByVal Input bias,
                                                       @ByVal Input min_input,
                                                       @ByVal Input max_input,
                                                       @ByVal Input min_filter,
                                                       @ByVal Input max_filter,
                                                       @ByVal Input min_freezed_output,
                                                       @ByVal Input max_freezed_output, @ArraySlice int[] strides, @StringPiece String padding);
  public QuantizedDepthwiseConv2DWithBiasAndReluAndRequantize(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input filter,
                                                       @ByVal Input bias,
                                                       @ByVal Input min_input,
                                                       @ByVal Input max_input,
                                                       @ByVal Input min_filter,
                                                       @ByVal Input max_filter,
                                                       @ByVal Input min_freezed_output,
                                                       @ByVal Input max_freezed_output, @ArraySlice IntPointer strides, @StringPiece BytePointer padding, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input, filter, bias, min_input, max_input, min_filter, max_filter, min_freezed_output, max_freezed_output, strides, padding, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input filter,
                                                       @ByVal Input bias,
                                                       @ByVal Input min_input,
                                                       @ByVal Input max_input,
                                                       @ByVal Input min_filter,
                                                       @ByVal Input max_filter,
                                                       @ByVal Input min_freezed_output,
                                                       @ByVal Input max_freezed_output, @ArraySlice IntPointer strides, @StringPiece BytePointer padding, @Const @ByRef Attrs attrs);
  public QuantizedDepthwiseConv2DWithBiasAndReluAndRequantize(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input filter,
                                                       @ByVal Input bias,
                                                       @ByVal Input min_input,
                                                       @ByVal Input max_input,
                                                       @ByVal Input min_filter,
                                                       @ByVal Input max_filter,
                                                       @ByVal Input min_freezed_output,
                                                       @ByVal Input max_freezed_output, @ArraySlice IntBuffer strides, @StringPiece String padding, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input, filter, bias, min_input, max_input, min_filter, max_filter, min_freezed_output, max_freezed_output, strides, padding, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input filter,
                                                       @ByVal Input bias,
                                                       @ByVal Input min_input,
                                                       @ByVal Input max_input,
                                                       @ByVal Input min_filter,
                                                       @ByVal Input max_filter,
                                                       @ByVal Input min_freezed_output,
                                                       @ByVal Input max_freezed_output, @ArraySlice IntBuffer strides, @StringPiece String padding, @Const @ByRef Attrs attrs);
  public QuantizedDepthwiseConv2DWithBiasAndReluAndRequantize(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input filter,
                                                       @ByVal Input bias,
                                                       @ByVal Input min_input,
                                                       @ByVal Input max_input,
                                                       @ByVal Input min_filter,
                                                       @ByVal Input max_filter,
                                                       @ByVal Input min_freezed_output,
                                                       @ByVal Input max_freezed_output, @ArraySlice int[] strides, @StringPiece BytePointer padding, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input, filter, bias, min_input, max_input, min_filter, max_filter, min_freezed_output, max_freezed_output, strides, padding, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input filter,
                                                       @ByVal Input bias,
                                                       @ByVal Input min_input,
                                                       @ByVal Input max_input,
                                                       @ByVal Input min_filter,
                                                       @ByVal Input max_filter,
                                                       @ByVal Input min_freezed_output,
                                                       @ByVal Input max_freezed_output, @ArraySlice int[] strides, @StringPiece BytePointer padding, @Const @ByRef Attrs attrs);
  public QuantizedDepthwiseConv2DWithBiasAndReluAndRequantize(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input filter,
                                                       @ByVal Input bias,
                                                       @ByVal Input min_input,
                                                       @ByVal Input max_input,
                                                       @ByVal Input min_filter,
                                                       @ByVal Input max_filter,
                                                       @ByVal Input min_freezed_output,
                                                       @ByVal Input max_freezed_output, @ArraySlice IntPointer strides, @StringPiece String padding, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input, filter, bias, min_input, max_input, min_filter, max_filter, min_freezed_output, max_freezed_output, strides, padding, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input filter,
                                                       @ByVal Input bias,
                                                       @ByVal Input min_input,
                                                       @ByVal Input max_input,
                                                       @ByVal Input min_filter,
                                                       @ByVal Input max_filter,
                                                       @ByVal Input min_freezed_output,
                                                       @ByVal Input max_freezed_output, @ArraySlice IntPointer strides, @StringPiece String padding, @Const @ByRef Attrs attrs);
  public QuantizedDepthwiseConv2DWithBiasAndReluAndRequantize(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input filter,
                                                       @ByVal Input bias,
                                                       @ByVal Input min_input,
                                                       @ByVal Input max_input,
                                                       @ByVal Input min_filter,
                                                       @ByVal Input max_filter,
                                                       @ByVal Input min_freezed_output,
                                                       @ByVal Input max_freezed_output, @ArraySlice IntBuffer strides, @StringPiece BytePointer padding, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input, filter, bias, min_input, max_input, min_filter, max_filter, min_freezed_output, max_freezed_output, strides, padding, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input filter,
                                                       @ByVal Input bias,
                                                       @ByVal Input min_input,
                                                       @ByVal Input max_input,
                                                       @ByVal Input min_filter,
                                                       @ByVal Input max_filter,
                                                       @ByVal Input min_freezed_output,
                                                       @ByVal Input max_freezed_output, @ArraySlice IntBuffer strides, @StringPiece BytePointer padding, @Const @ByRef Attrs attrs);
  public QuantizedDepthwiseConv2DWithBiasAndReluAndRequantize(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input filter,
                                                       @ByVal Input bias,
                                                       @ByVal Input min_input,
                                                       @ByVal Input max_input,
                                                       @ByVal Input min_filter,
                                                       @ByVal Input max_filter,
                                                       @ByVal Input min_freezed_output,
                                                       @ByVal Input max_freezed_output, @ArraySlice int[] strides, @StringPiece String padding, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input, filter, bias, min_input, max_input, min_filter, max_filter, min_freezed_output, max_freezed_output, strides, padding, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input filter,
                                                       @ByVal Input bias,
                                                       @ByVal Input min_input,
                                                       @ByVal Input max_input,
                                                       @ByVal Input min_filter,
                                                       @ByVal Input max_filter,
                                                       @ByVal Input min_freezed_output,
                                                       @ByVal Input max_freezed_output, @ArraySlice int[] strides, @StringPiece String padding, @Const @ByRef Attrs attrs);

  public static native @ByVal Attrs OutType(@Cast("tensorflow::DataType") int x);
  public static native @ByVal Attrs Dilations(@ArraySlice IntPointer x);
  public static native @ByVal Attrs Dilations(@ArraySlice IntBuffer x);
  public static native @ByVal Attrs Dilations(@ArraySlice int... x);

  public native @ByRef Operation operation(); public native QuantizedDepthwiseConv2DWithBiasAndReluAndRequantize operation(Operation setter);
  public native @ByRef Output output(); public native QuantizedDepthwiseConv2DWithBiasAndReluAndRequantize output(Output setter);
  public native @ByRef Output min_output(); public native QuantizedDepthwiseConv2DWithBiasAndReluAndRequantize min_output(Output setter);
  public native @ByRef Output max_output(); public native QuantizedDepthwiseConv2DWithBiasAndReluAndRequantize max_output(Output setter);
}
