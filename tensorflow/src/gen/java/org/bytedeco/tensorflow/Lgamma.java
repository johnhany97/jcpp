// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Computes the log of the absolute value of {@code Gamma(x)} element-wise.
 * 
 *  Arguments:
 *  * scope: A Scope object
 * 
 *  Returns:
 *  * {@code Output}: The y tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Lgamma extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Lgamma(Pointer p) { super(p); }

  public Lgamma(@Const @ByRef Scope scope, @ByVal Input x) { super((Pointer)null); allocate(scope, x); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input x);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native Lgamma operation(Operation setter);
  public native @ByRef Output y(); public native Lgamma y(Output setter);
}
