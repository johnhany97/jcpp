// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Return the shape of s0 op s1 with broadcast.
 * 
 *  Given {@code s0} and {@code s1}, tensors that represent shapes, compute {@code r0}, the
 *  broadcasted shape. {@code s0}, {@code s1} and {@code r0} are all integer vectors.
 * 
 *  Arguments:
 *  * scope: A Scope object
 * 
 *  Returns:
 *  * {@code Output}: The r0 tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class BroadcastDynamicShape extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BroadcastDynamicShape(Pointer p) { super(p); }

  public BroadcastDynamicShape(@Const @ByRef Scope scope, @ByVal Input s0,
                        @ByVal Input s1) { super((Pointer)null); allocate(scope, s0, s1); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input s0,
                        @ByVal Input s1);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native BroadcastDynamicShape operation(Operation setter);
  public native @ByRef Output r0(); public native BroadcastDynamicShape r0(Output setter);
}
