// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Reshapes a quantized tensor as per the Reshape op.
 * 
 *  <pre>{@code
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * shape: Defines the shape of the output tensor.
 *  * input_min: The minimum value of the input.
 *  * input_max: The maximum value of the input.
 * 
 *  Returns:
 *  * `Output` output
 *  * `Output` output_min: This value is copied from input_min.
 *  * `Output` output_max: This value is copied from input_max. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class QuantizedReshape extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QuantizedReshape(Pointer p) { super(p); }

  public QuantizedReshape(@Const @ByRef Scope scope, @ByVal Input tensor,
                   @ByVal Input shape, @ByVal Input input_min,
                   @ByVal Input input_max) { super((Pointer)null); allocate(scope, tensor, shape, input_min, input_max); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input tensor,
                   @ByVal Input shape, @ByVal Input input_min,
                   @ByVal Input input_max);

  public native @ByRef Operation operation(); public native QuantizedReshape operation(Operation setter);
  public native @ByRef Output output(); public native QuantizedReshape output(Output setter);
  public native @ByRef Output output_min(); public native QuantizedReshape output_min(Output setter);
  public native @ByRef Output output_max(); public native QuantizedReshape output_max(Output setter);
}
