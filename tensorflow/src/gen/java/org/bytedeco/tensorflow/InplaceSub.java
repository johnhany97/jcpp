// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/**     Subtracts {@code v} into specified rows of {@code x}.
 * 
 *      Computes y = x; y[i, :] -= v; return y.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * x: A {@code Tensor} of type T.
 *  * i: A vector. Indices into the left-most dimension of {@code x}.
 *  * v: A {@code Tensor} of type T. Same dimension sizes as x except the first dimension, which must be the same as i's size.
 * 
 *  Returns:
 *  * {@code Output}: A {@code Tensor} of type T. An alias of {@code x}. The content of {@code y} is undefined if there are duplicates in {@code i}. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class InplaceSub extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public InplaceSub(Pointer p) { super(p); }

  public InplaceSub(@Const @ByRef Scope scope, @ByVal Input x,
             @ByVal Input i, @ByVal Input v) { super((Pointer)null); allocate(scope, x, i, v); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input x,
             @ByVal Input i, @ByVal Input v);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native InplaceSub operation(Operation setter);
  public native @ByRef Output y(); public native InplaceSub y(Output setter);
}
