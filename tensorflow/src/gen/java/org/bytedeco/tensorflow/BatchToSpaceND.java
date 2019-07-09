// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** BatchToSpace for N-D tensors of type T.
 * 
 *  This operation reshapes the "batch" dimension 0 into {@code M + 1} dimensions of shape
 *  {@code block_shape + [batch]}, interleaves these blocks back into the grid defined by
 *  the spatial dimensions {@code [1, ..., M]}, to obtain a result with the same rank as
 *  the input.  The spatial dimensions of this intermediate result are then
 *  optionally cropped according to {@code crops} to produce the output.  This is the
 *  reverse of SpaceToBatch.  See below for a precise description.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * input: N-D with shape {@code input_shape = [batch] + spatial_shape + remaining_shape},
 *  where spatial_shape has M dimensions.
 *  * block_shape: 1-D with shape {@code [M]}, all values must be >= 1.
 *  * crops: 2-D with shape {@code [M, 2]}, all values must be >= 0.
 *    {@code crops[i] = [crop_start, crop_end]} specifies the amount to crop from input
 *    dimension {@code i + 1}, which corresponds to spatial dimension {@code i}.  It is
 *    required that
 *    {@code crop_start[i] + crop_end[i] <= block_shape[i] * input_shape[i + 1]}.
 * 
 *  This operation is equivalent to the following steps:
 * 
 *  1. Reshape {@code input} to {@code reshaped} of shape:
 *       [block_shape[0], ..., block_shape[M-1],
 *        batch / prod(block_shape),
 *        input_shape[1], ..., input_shape[N-1]]
 * 
 *  2. Permute dimensions of {@code reshaped} to produce {@code permuted} of shape
 *       [batch / prod(block_shape),
 * 
 *        input_shape[1], block_shape[0],
 *        ...,
 *        input_shape[M], block_shape[M-1],
 * 
 *        input_shape[M+1], ..., input_shape[N-1]]
 * 
 *  3. Reshape {@code permuted} to produce {@code reshaped_permuted} of shape
 *       [batch / prod(block_shape),
 * 
 *        input_shape[1] * block_shape[0],
 *        ...,
 *        input_shape[M] * block_shape[M-1],
 * 
 *        input_shape[M+1],
 *        ...,
 *        input_shape[N-1]]
 * 
 *  4. Crop the start and end of dimensions {@code [1, ..., M]} of
 *     {@code reshaped_permuted} according to {@code crops} to produce the output of shape:
 *       [batch / prod(block_shape),
 * 
 *        input_shape[1] * block_shape[0] - crops[0,0] - crops[0,1],
 *        ...,
 *        input_shape[M] * block_shape[M-1] - crops[M-1,0] - crops[M-1,1],
 * 
 *        input_shape[M+1], ..., input_shape[N-1]]
 * 
 *  Some examples:
 * 
 *  (1) For the following input of shape {@code [4, 1, 1, 1]}, {@code block_shape = [2, 2]}, and
 *      {@code crops = [[0, 0], [0, 0]]}:
 * 
 *  <pre>{@code
 *  [[[[1]]], [[[2]]], [[[3]]], [[[4]]]]
 *  }</pre>
 * 
 *  The output tensor has shape {@code [1, 2, 2, 1]} and value:
 * 
 *  <pre>{@code
 *  x = [[[[1], [2]], [[3], [4]]]]
 *  }</pre>
 * 
 *  (2) For the following input of shape {@code [4, 1, 1, 3]}, {@code block_shape = [2, 2]}, and
 *      {@code crops = [[0, 0], [0, 0]]}:
 * 
 *  <pre>{@code
 *  [[[[1, 2, 3]]], [[[4, 5, 6]]], [[[7, 8, 9]]], [[[10, 11, 12]]]]
 *  }</pre>
 * 
 *  The output tensor has shape {@code [1, 2, 2, 3]} and value:
 * 
 *  <pre>{@code
 *  x = [[[[1, 2, 3], [4, 5, 6]],
 *        [[7, 8, 9], [10, 11, 12]]]]
 *  }</pre>
 * 
 *  (3) For the following input of shape {@code [4, 2, 2, 1]}, {@code block_shape = [2, 2]}, and
 *      {@code crops = [[0, 0], [0, 0]]}:
 * 
 *  <pre>{@code
 *  x = [[[[1], [3]], [[9], [11]]],
 *       [[[2], [4]], [[10], [12]]],
 *       [[[5], [7]], [[13], [15]]],
 *       [[[6], [8]], [[14], [16]]]]
 *  }</pre>
 * 
 *  The output tensor has shape {@code [1, 4, 4, 1]} and value:
 * 
 *  <pre>{@code
 *  x = [[[[1],   [2],  [3],  [4]],
 *       [[5],   [6],  [7],  [8]],
 *       [[9],  [10], [11],  [12]],
 *       [[13], [14], [15],  [16]]]]
 *  }</pre>
 * 
 *  (4) For the following input of shape {@code [8, 1, 3, 1]}, {@code block_shape = [2, 2]}, and
 *      {@code crops = [[0, 0], [2, 0]]}:
 * 
 *  <pre>{@code
 *  x = [[[[0], [1], [3]]], [[[0], [9], [11]]],
 *       [[[0], [2], [4]]], [[[0], [10], [12]]],
 *       [[[0], [5], [7]]], [[[0], [13], [15]]],
 *       [[[0], [6], [8]]], [[[0], [14], [16]]]]
 *  }</pre>
 * 
 *  The output tensor has shape {@code [2, 2, 4, 1]} and value:
 * 
 *  <pre>{@code
 *  x = [[[[1],   [2],  [3],  [4]],
 *        [[5],   [6],  [7],  [8]]],
 *       [[[9],  [10], [11],  [12]],
 *        [[13], [14], [15],  [16]]]]
 *  }</pre>
 * 
 *  Returns:
 *  * {@code Output}: The output tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class BatchToSpaceND extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BatchToSpaceND(Pointer p) { super(p); }

  public BatchToSpaceND(@Const @ByRef Scope scope, @ByVal Input input,
                 @ByVal Input block_shape, @ByVal Input crops) { super((Pointer)null); allocate(scope, input, block_shape, crops); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
                 @ByVal Input block_shape, @ByVal Input crops);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native BatchToSpaceND operation(Operation setter);
  public native @ByRef Output output(); public native BatchToSpaceND output(Output setter);
}
