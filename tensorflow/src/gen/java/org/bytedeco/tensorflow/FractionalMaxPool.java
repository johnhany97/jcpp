// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Performs fractional max pooling on the input.
 * 
 *  Fractional max pooling is slightly different than regular max pooling.  In
 *  regular max pooling, you downsize an input set by taking the maximum value of
 *  smaller N x N subsections of the set (often 2x2), and try to reduce the set by
 *  a factor of N, where N is an integer.  Fractional max pooling, as you might
 *  expect from the word "fractional", means that the overall reduction ratio N
 *  does not have to be an integer.
 * 
 *  The sizes of the pooling regions are generated randomly but are fairly uniform.
 *  For example, let's look at the height dimension, and the constraints on the
 *  list of rows that will be pool boundaries.
 * 
 *  First we define the following:
 * 
 *  1.  input_row_length : the number of rows from the input set
 *  2.  output_row_length : which will be smaller than the input
 *  3.  alpha = input_row_length / output_row_length : our reduction ratio
 *  4.  K = floor(alpha)
 *  5.  row_pooling_sequence : this is the result list of pool boundary rows
 * 
 *  Then, row_pooling_sequence should satisfy:
 * 
 *  1.  a[0] = 0 : the first value of the sequence is 0
 *  2.  a[end] = input_row_length : the last value of the sequence is the size
 *  3.  K <= (a[i+1] - a[i]) <= K+1 : all intervals are K or K+1 size
 *  4.  length(row_pooling_sequence) = output_row_length+1
 * 
 *  For more details on fractional max pooling, see this paper:
 *  [Benjamin Graham, Fractional Max-Pooling](http://arxiv.org/abs/1412.6071)
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * value: 4-D with shape {@code [batch, height, width, channels]}.
 *  * pooling_ratio: Pooling ratio for each dimension of {@code value}, currently only
 *  supports row and col dimension and should be >= 1.0. For example, a valid
 *  pooling ratio looks like [1.0, 1.44, 1.73, 1.0]. The first and last elements
 *  must be 1.0 because we don't allow pooling on batch and channels
 *  dimensions. 1.44 and 1.73 are pooling ratio on height and width dimensions
 *  respectively.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * pseudo_random: When set to True, generates the pooling sequence in a
 *  pseudorandom fashion, otherwise, in a random fashion. Check paper [Benjamin
 *  Graham, Fractional Max-Pooling](http://arxiv.org/abs/1412.6071) for
 *  difference between pseudorandom and random.
 *  * overlapping: When set to True, it means when pooling, the values at the boundary
 *  of adjacent pooling cells are used by both cells. For example:
 * 
 *  {@code index  0  1  2  3  4}
 * 
 *  {@code value  20 5  16 3  7}
 * 
 *  If the pooling sequence is [0, 2, 4], then 16, at index 2 will be used twice.
 *  The result would be [20, 16] for fractional max pooling.
 *  * deterministic: When set to True, a fixed pooling region will be used when
 *  iterating over a FractionalMaxPool node in the computation graph. Mainly used
 *  in unit test to make FractionalMaxPool deterministic.
 *  * seed: If either seed or seed2 are set to be non-zero, the random number
 *  generator is seeded by the given seed.  Otherwise, it is seeded by a
 *  random seed.
 *  * seed2: An second seed to avoid seed collision.
 * 
 *  Returns:
 *  * {@code Output} output: output tensor after fractional max pooling.
 *  * {@code Output} row_pooling_sequence: row pooling sequence, needed to calculate gradient.
 *  * {@code Output} col_pooling_sequence: column pooling sequence, needed to calculate gradient. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class FractionalMaxPool extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FractionalMaxPool(Pointer p) { super(p); }

  /** Optional attribute setters for FractionalMaxPool */
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
  
    /** When set to True, generates the pooling sequence in a
     *  pseudorandom fashion, otherwise, in a random fashion. Check paper [Benjamin
     *  Graham, Fractional Max-Pooling](http://arxiv.org/abs/1412.6071) for
     *  difference between pseudorandom and random.
     * 
     *  Defaults to false */
    
    ///
    ///
    ///
    ///
    public native @ByVal Attrs PseudoRandom(@Cast("bool") boolean x);

    /** When set to True, it means when pooling, the values at the boundary
     *  of adjacent pooling cells are used by both cells. For example:
     * 
     *  {@code index  0  1  2  3  4}
     * 
     *  {@code value  20 5  16 3  7}
     * 
     *  If the pooling sequence is [0, 2, 4], then 16, at index 2 will be used twice.
     *  The result would be [20, 16] for fractional max pooling.
     * 
     *  Defaults to false */
    
    ///
    public native @ByVal Attrs Overlapping(@Cast("bool") boolean x);

    /** When set to True, a fixed pooling region will be used when
     *  iterating over a FractionalMaxPool node in the computation graph. Mainly used
     *  in unit test to make FractionalMaxPool deterministic.
     * 
     *  Defaults to false */
    
    ///
    public native @ByVal Attrs Deterministic(@Cast("bool") boolean x);

    /** If either seed or seed2 are set to be non-zero, the random number
     *  generator is seeded by the given seed.  Otherwise, it is seeded by a
     *  random seed.
     * 
     *  Defaults to 0 */
    
    ///
    public native @ByVal Attrs Seed(@Cast("tensorflow::int64") long x);

    /** An second seed to avoid seed collision.
     * 
     *  Defaults to 0 */
    public native @ByVal Attrs Seed2(@Cast("tensorflow::int64") long x);

    public native @Cast("bool") boolean pseudo_random_(); public native Attrs pseudo_random_(boolean setter);
    public native @Cast("bool") boolean overlapping_(); public native Attrs overlapping_(boolean setter);
    public native @Cast("bool") boolean deterministic_(); public native Attrs deterministic_(boolean setter);
    public native @Cast("tensorflow::int64") long seed_(); public native Attrs seed_(long setter);
    public native @Cast("tensorflow::int64") long seed2_(); public native Attrs seed2_(long setter);
  }
  public FractionalMaxPool(@Const @ByRef Scope scope, @ByVal Input value,
                    @ArraySlice FloatPointer pooling_ratio) { super((Pointer)null); allocate(scope, value, pooling_ratio); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input value,
                    @ArraySlice FloatPointer pooling_ratio);
  public FractionalMaxPool(@Const @ByRef Scope scope, @ByVal Input value,
                    @ArraySlice FloatBuffer pooling_ratio) { super((Pointer)null); allocate(scope, value, pooling_ratio); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input value,
                    @ArraySlice FloatBuffer pooling_ratio);
  public FractionalMaxPool(@Const @ByRef Scope scope, @ByVal Input value,
                    @ArraySlice float... pooling_ratio) { super((Pointer)null); allocate(scope, value, pooling_ratio); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input value,
                    @ArraySlice float... pooling_ratio);
  public FractionalMaxPool(@Const @ByRef Scope scope, @ByVal Input value,
                    @ArraySlice FloatPointer pooling_ratio, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, value, pooling_ratio, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input value,
                    @ArraySlice FloatPointer pooling_ratio, @Const @ByRef Attrs attrs);
  public FractionalMaxPool(@Const @ByRef Scope scope, @ByVal Input value,
                    @ArraySlice FloatBuffer pooling_ratio, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, value, pooling_ratio, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input value,
                    @ArraySlice FloatBuffer pooling_ratio, @Const @ByRef Attrs attrs);
  public FractionalMaxPool(@Const @ByRef Scope scope, @ByVal Input value,
                    @ArraySlice float[] pooling_ratio, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, value, pooling_ratio, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input value,
                    @ArraySlice float[] pooling_ratio, @Const @ByRef Attrs attrs);

  public static native @ByVal Attrs PseudoRandom(@Cast("bool") boolean x);
  public static native @ByVal Attrs Overlapping(@Cast("bool") boolean x);
  public static native @ByVal Attrs Deterministic(@Cast("bool") boolean x);
  public static native @ByVal Attrs Seed(@Cast("tensorflow::int64") long x);
  public static native @ByVal Attrs Seed2(@Cast("tensorflow::int64") long x);

  public native @ByRef Operation operation(); public native FractionalMaxPool operation(Operation setter);
  public native @ByRef Output output(); public native FractionalMaxPool output(Output setter);
  public native @ByRef Output row_pooling_sequence(); public native FractionalMaxPool row_pooling_sequence(Output setter);
  public native @ByRef Output col_pooling_sequence(); public native FractionalMaxPool col_pooling_sequence(Output setter);
}
