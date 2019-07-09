// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Returns the argument of a complex number.
 * 
 *  Given a tensor {@code input} of complex numbers, this operation returns a tensor of
 *  type {@code float} that is the argument of each element in {@code input}. All elements in
 *  {@code input} must be complex numbers of the form \(a + bj\), where *a*
 *  is the real part and *b* is the imaginary part.
 * 
 *  The argument returned by this operation is of the form \(atan2(b, a)\).
 * 
 *  For example:
 * 
 *  <pre>{@code
 *  # tensor 'input' is [-2.25 + 4.75j, 3.25 + 5.75j]
 *  tf.angle(input) ==> [2.0132, 1.056]
 *  }</pre>
 * 
 *  \compatibility(numpy)
 *  Equivalent to np.angle.
 *  \end_compatibility
 * 
 *  Arguments:
 *  * scope: A Scope object
 * 
 *  Returns:
 *  * {@code Output}: The output tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Angle extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Angle(Pointer p) { super(p); }

  /** Optional attribute setters for Angle */
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
  
    /** Defaults to DT_FLOAT */
    public native @ByVal Attrs Tout(@Cast("tensorflow::DataType") int x);

    public native @Cast("tensorflow::DataType") int Tout_(); public native Attrs Tout_(int setter);
  }
  public Angle(@Const @ByRef Scope scope, @ByVal Input input) { super((Pointer)null); allocate(scope, input); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input);
  public Angle(@Const @ByRef Scope scope, @ByVal Input input, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs Tout(@Cast("tensorflow::DataType") int x);

  public native @ByRef Operation operation(); public native Angle operation(Operation setter);
  public native @ByRef Output output(); public native Angle output(Output setter);
}
