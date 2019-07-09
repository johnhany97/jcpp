// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Stops gradient computation.
 * 
 *  When executed in a graph, this op outputs its input tensor as-is.
 * 
 *  When building ops to compute gradients, this op prevents the contribution of
 *  its inputs to be taken into account.  Normally, the gradient generator adds ops
 *  to a graph to compute the derivatives of a specified 'loss' by recursively
 *  finding out inputs that contributed to its computation.  If you insert this op
 *  in the graph it inputs are masked from the gradient generator.  They are not
 *  taken into account for computing gradients.
 * 
 *  This is useful any time you want to compute a value with TensorFlow but need
 *  to pretend that the value was a constant. Some examples include:
 * 
 *  *  The *EM* algorithm where the *M-step* should not involve backpropagation
 *     through the output of the *E-step*.
 *  *  Contrastive divergence training of Boltzmann machines where, when
 *     differentiating the energy function, the training must not backpropagate
 *     through the graph that generated the samples from the model.
 *  *  Adversarial training, where no backprop should happen through the adversarial
 *     example generation process.
 * 
 *  Arguments:
 *  * scope: A Scope object
 * 
 *  Returns:
 *  * {@code Output}: The output tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class StopGradient extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StopGradient(Pointer p) { super(p); }

  public StopGradient(@Const @ByRef Scope scope, @ByVal Input input) { super((Pointer)null); allocate(scope, input); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native StopGradient operation(Operation setter);
  public native @ByRef Output output(); public native StopGradient output(Output setter);
}
