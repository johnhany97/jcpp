// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Finds values of the {@code n}-th order statistic for the last dimension.
 * 
 *  If the input is a vector (rank-1), finds the entries which is the nth-smallest
 *  value in the vector and outputs their values as scalar tensor.
 * 
 *  For matrices (resp. higher rank input), computes the entries which is the
 *  nth-smallest value in each row (resp. vector along the last dimension). Thus,
 * 
 *      values.shape = input.shape[:-1]
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * input: 1-D or higher with last dimension at least {@code n+1}.
 *  * n: 0-D. Position of sorted vector to select along the last dimension (along
 *  each row for matrices). Valid range of n is {@code [0, input.shape[:-1])}
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * reverse: When set to True, find the nth-largest value in the vector and vice
 *  versa.
 * 
 *  Returns:
 *  * {@code Output}: The {@code n}-th order statistic along each last dimensional slice. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class NthElement extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NthElement(Pointer p) { super(p); }

  /** Optional attribute setters for NthElement */
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
  
    /** When set to True, find the nth-largest value in the vector and vice
     *  versa.
     * 
     *  Defaults to false */
    public native @ByVal Attrs Reverse(@Cast("bool") boolean x);

    public native @Cast("bool") boolean reverse_(); public native Attrs reverse_(boolean setter);
  }
  public NthElement(@Const @ByRef Scope scope, @ByVal Input input,
             @ByVal Input n) { super((Pointer)null); allocate(scope, input, n); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
             @ByVal Input n);
  public NthElement(@Const @ByRef Scope scope, @ByVal Input input,
             @ByVal Input n, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input, n, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
             @ByVal Input n, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs Reverse(@Cast("bool") boolean x);

  public native @ByRef Operation operation(); public native NthElement operation(Operation setter);
  public native @ByRef Output values(); public native NthElement values(Output setter);
}
