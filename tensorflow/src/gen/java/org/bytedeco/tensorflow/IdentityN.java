// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Returns a list of tensors with the same shapes and contents as the input
 * 
 *  tensors.
 * 
 *  This op can be used to override the gradient for complicated functions. For
 *  example, suppose y = f(x) and we wish to apply a custom function g for backprop
 *  such that dx = g(dy). In Python,
 * 
 *  <pre>{@code python
 *  with tf.get_default_graph().gradient_override_map(
 *      {'IdentityN': 'OverrideGradientWithG'}):
 *    y, _ = identity_n([f(x), x])
 * 
 *  @tf.RegisterGradient('OverrideGradientWithG')
 *  def ApplyG(op, dy, _):
 *    return [None, g(dy)]  # Do not backprop to f(x).
 *  }</pre>
 * 
 *  Arguments:
 *  * scope: A Scope object
 * 
 *  Returns:
 *  * {@code OutputList}: The output tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class IdentityN extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IdentityN(Pointer p) { super(p); }

  public IdentityN(@Const @ByRef Scope scope, @ByVal InputList input) { super((Pointer)null); allocate(scope, input); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal InputList input);
  public native @ByVal @Name("operator []") Output get(@Cast("size_t") long index);


  public native @ByRef Operation operation(); public native IdentityN operation(Operation setter);
  public native @ByRef @Cast("tensorflow::OutputList*") OutputVector output(); public native IdentityN output(OutputVector setter);
}
