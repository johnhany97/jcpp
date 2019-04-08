// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** SpaceToBatch for 4-D tensors of type T.
 * 
 *  This is a legacy version of the more general SpaceToBatchND.
 * 
 *  Zero-pads and then rearranges (permutes) blocks of spatial data into batch.
 *  More specifically, this op outputs a copy of the input tensor where values from
 *  the {@code height} and {@code width} dimensions are moved to the {@code batch} dimension. After
 *  the zero-padding, both {@code height} and {@code width} of the input must be divisible by the
 *  block size.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * input: 4-D with shape {@code [batch, height, width, depth]}.
 *  * paddings: 2-D tensor of non-negative integers with shape {@code [2, 2]}. It specifies
 *    the padding of the input with zeros across the spatial dimensions as follows:
 * 
 *        paddings = [[pad_top, pad_bottom], [pad_left, pad_right]]
 * 
 *    The effective spatial dimensions of the zero-padded input tensor will be:
 * 
 *        height_pad = pad_top + height + pad_bottom
 *        width_pad = pad_left + width + pad_right
 * 
 *  The attr {@code block_size} must be greater than one. It indicates the block size.
 * 
 *    * Non-overlapping blocks of size {@code block_size x block size} in the height and
 *      width dimensions are rearranged into the batch dimension at each location.
 *    * The batch of the output tensor is {@code batch * block_size * block_size}.
 *    * Both height_pad and width_pad must be divisible by block_size.
 * 
 *  The shape of the output will be:
 * 
 *      [batch*block_size*block_size, height_pad/block_size, width_pad/block_size,
 *       depth]
 * 
 *  Some examples:
 * 
 *  (1) For the following input of shape {@code [1, 2, 2, 1]} and block_size of 2:
 * 
 *  <pre>{@code
 *  x = [[[[1], [2]], [[3], [4]]]]
 *  }</pre>
 * 
 *  The output tensor has shape {@code [4, 1, 1, 1]} and value:
 * 
 *  <pre>{@code
 *  [[[[1]]], [[[2]]], [[[3]]], [[[4]]]]
 *  }</pre>
 * 
 *  (2) For the following input of shape {@code [1, 2, 2, 3]} and block_size of 2:
 * 
 *  <pre>{@code
 *  x = [[[[1, 2, 3], [4, 5, 6]],
 *        [[7, 8, 9], [10, 11, 12]]]]
 *  }</pre>
 * 
 *  The output tensor has shape {@code [4, 1, 1, 3]} and value:
 * 
 *  <pre>{@code
 *  [[[1, 2, 3]], [[4, 5, 6]], [[7, 8, 9]], [[10, 11, 12]]]
 *  }</pre>
 * 
 *  (3) For the following input of shape {@code [1, 4, 4, 1]} and block_size of 2:
 * 
 *  <pre>{@code
 *  x = [[[[1],   [2],  [3],  [4]],
 *        [[5],   [6],  [7],  [8]],
 *        [[9],  [10], [11],  [12]],
 *        [[13], [14], [15],  [16]]]]
 *  }</pre>
 * 
 *  The output tensor has shape {@code [4, 2, 2, 1]} and value:
 * 
 *  <pre>{@code
 *  x = [[[[1], [3]], [[9], [11]]],
 *       [[[2], [4]], [[10], [12]]],
 *       [[[5], [7]], [[13], [15]]],
 *       [[[6], [8]], [[14], [16]]]]
 *  }</pre>
 * 
 *  (4) For the following input of shape {@code [2, 2, 4, 1]} and block_size of 2:
 * 
 *  <pre>{@code
 *  x = [[[[1],   [2],  [3],  [4]],
 *        [[5],   [6],  [7],  [8]]],
 *       [[[9],  [10], [11],  [12]],
 *        [[13], [14], [15],  [16]]]]
 *  }</pre>
 * 
 *  The output tensor has shape {@code [8, 1, 2, 1]} and value:
 * 
 *  <pre>{@code
 *  x = [[[[1], [3]]], [[[9], [11]]], [[[2], [4]]], [[[10], [12]]],
 *       [[[5], [7]]], [[[13], [15]]], [[[6], [8]]], [[[14], [16]]]]
 *  }</pre>
 * 
 *  Among others, this operation is useful for reducing atrous convolution into
 *  regular convolution.
 * 
 *  Returns:
 *  * {@code Output}: The output tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class SpaceToBatch extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SpaceToBatch(Pointer p) { super(p); }

  public SpaceToBatch(@Const @ByRef Scope scope, @ByVal Input input,
               @ByVal Input paddings, @Cast("tensorflow::int64") long block_size) { super((Pointer)null); allocate(scope, input, paddings, block_size); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
               @ByVal Input paddings, @Cast("tensorflow::int64") long block_size);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native SpaceToBatch operation(Operation setter);
  public native @ByRef Output output(); public native SpaceToBatch output(Output setter);
}
