// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Returns x - y element-wise.
 * 
 *  *NOTE*: {@code Subtract} supports broadcasting. More about broadcasting
 *  [here](http://docs.scipy.org/doc/numpy/user/basics.broadcasting.html)
 * 
 *  Arguments:
 *  * scope: A Scope object
 * 
 *  Returns:
 *  * {@code Output}: The z tensor.
 * 
 *  Aliases:
 *  * Sub */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Subtract extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Subtract(Pointer p) { super(p); }

  public Subtract(@Const @ByRef Scope scope, @ByVal Input x,
           @ByVal Input y) { super((Pointer)null); allocate(scope, x, y); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input x,
           @ByVal Input y);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native Subtract operation(Operation setter);
  public native @ByRef Output z(); public native Subtract z(Output setter);
}
