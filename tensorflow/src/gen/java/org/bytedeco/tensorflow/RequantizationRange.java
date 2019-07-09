// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Computes a range that covers the actual values present in a quantized tensor.
 * 
 *  Given a quantized tensor described by {@code (input, input_min, input_max)}, outputs a
 *  range that covers the actual values present in that tensor. This op is typically
 *  used to produce the {@code requested_output_min} and {@code requested_output_max} for
 *  {@code Requantize}.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * input_min: The float value that the minimum quantized input value represents.
 *  * input_max: The float value that the maximum quantized input value represents.
 * 
 *  Returns:
 *  * {@code Output} output_min: The computed min output.
 *  * {@code Output} output_max: the computed max output. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class RequantizationRange extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RequantizationRange(Pointer p) { super(p); }

  public RequantizationRange(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input input_min, @ByVal Input input_max) { super((Pointer)null); allocate(scope, input, input_min, input_max); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input input_min, @ByVal Input input_max);

  public native @ByRef Operation operation(); public native RequantizationRange operation(Operation setter);
  public native @ByRef Output output_min(); public native RequantizationRange output_min(Output setter);
  public native @ByRef Output output_max(); public native RequantizationRange output_max(Output setter);
}
