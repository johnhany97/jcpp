// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Computes the grayscale dilation of 4-D {@code input} and 3-D {@code filter} tensors.
 * 
 *  The {@code input} tensor has shape {@code [batch, in_height, in_width, depth]} and the
 *  {@code filter} tensor has shape {@code [filter_height, filter_width, depth]}, i.e., each
 *  input channel is processed independently of the others with its own structuring
 *  function. The {@code output} tensor has shape
 *  {@code [batch, out_height, out_width, depth]}. The spatial dimensions of the output
 *  tensor depend on the {@code padding} algorithm. We currently only support the default
 *  "NHWC" {@code data_format}.
 * 
 *  In detail, the grayscale morphological 2-D dilation is the max-sum correlation
 *  (for consistency with {@code conv2d}, we use unmirrored filters):
 * 
 *      output[b, y, x, c] =
 *         max_{dy, dx} input[b,
 *                            strides[1] * y + rates[1] * dy,
 *                            strides[2] * x + rates[2] * dx,
 *                            c] +
 *                      filter[dy, dx, c]
 * 
 *  Max-pooling is a special case when the filter has size equal to the pooling
 *  kernel size and contains all zeros.
 * 
 *  Note on duality: The dilation of {@code input} by the {@code filter} is equal to the
 *  negation of the erosion of {@code -input} by the reflected {@code filter}.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * input: 4-D with shape {@code [batch, in_height, in_width, depth]}.
 *  * filter: 3-D with shape {@code [filter_height, filter_width, depth]}.
 *  * strides: The stride of the sliding window for each dimension of the input
 *  tensor. Must be: {@code [1, stride_height, stride_width, 1]}.
 *  * rates: The input stride for atrous morphological dilation. Must be:
 *  {@code [1, rate_height, rate_width, 1]}.
 *  * padding: The type of padding algorithm to use.
 * 
 *  Returns:
 *  * {@code Output}: 4-D with shape {@code [batch, out_height, out_width, depth]}. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Dilation2D extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Dilation2D(Pointer p) { super(p); }

  public Dilation2D(@Const @ByRef Scope scope, @ByVal Input input,
             @ByVal Input filter, @ArraySlice IntPointer strides,
             @ArraySlice IntPointer rates, @StringPiece BytePointer padding) { super((Pointer)null); allocate(scope, input, filter, strides, rates, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
             @ByVal Input filter, @ArraySlice IntPointer strides,
             @ArraySlice IntPointer rates, @StringPiece BytePointer padding);
  public Dilation2D(@Const @ByRef Scope scope, @ByVal Input input,
             @ByVal Input filter, @ArraySlice IntBuffer strides,
             @ArraySlice IntBuffer rates, @StringPiece String padding) { super((Pointer)null); allocate(scope, input, filter, strides, rates, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
             @ByVal Input filter, @ArraySlice IntBuffer strides,
             @ArraySlice IntBuffer rates, @StringPiece String padding);
  public Dilation2D(@Const @ByRef Scope scope, @ByVal Input input,
             @ByVal Input filter, @ArraySlice int[] strides,
             @ArraySlice int[] rates, @StringPiece BytePointer padding) { super((Pointer)null); allocate(scope, input, filter, strides, rates, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
             @ByVal Input filter, @ArraySlice int[] strides,
             @ArraySlice int[] rates, @StringPiece BytePointer padding);
  public Dilation2D(@Const @ByRef Scope scope, @ByVal Input input,
             @ByVal Input filter, @ArraySlice IntPointer strides,
             @ArraySlice IntPointer rates, @StringPiece String padding) { super((Pointer)null); allocate(scope, input, filter, strides, rates, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
             @ByVal Input filter, @ArraySlice IntPointer strides,
             @ArraySlice IntPointer rates, @StringPiece String padding);
  public Dilation2D(@Const @ByRef Scope scope, @ByVal Input input,
             @ByVal Input filter, @ArraySlice IntBuffer strides,
             @ArraySlice IntBuffer rates, @StringPiece BytePointer padding) { super((Pointer)null); allocate(scope, input, filter, strides, rates, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
             @ByVal Input filter, @ArraySlice IntBuffer strides,
             @ArraySlice IntBuffer rates, @StringPiece BytePointer padding);
  public Dilation2D(@Const @ByRef Scope scope, @ByVal Input input,
             @ByVal Input filter, @ArraySlice int[] strides,
             @ArraySlice int[] rates, @StringPiece String padding) { super((Pointer)null); allocate(scope, input, filter, strides, rates, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
             @ByVal Input filter, @ArraySlice int[] strides,
             @ArraySlice int[] rates, @StringPiece String padding);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native Dilation2D operation(Operation setter);
  public native @ByRef Output output(); public native Dilation2D output(Output setter);
}
