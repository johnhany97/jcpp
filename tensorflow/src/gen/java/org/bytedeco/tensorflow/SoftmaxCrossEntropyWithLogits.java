// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Computes softmax cross entropy cost and gradients to backpropagate.
 * 
 *  Inputs are the logits, not probabilities.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * features: batch_size x num_classes matrix
 *  * labels: batch_size x num_classes matrix
 *  The caller must ensure that each batch of labels represents a valid
 *  probability distribution.
 * 
 *  Returns:
 *  * {@code Output} loss: Per example loss (batch_size vector).
 *  * {@code Output} backprop: backpropagated gradients (batch_size x num_classes matrix). */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class SoftmaxCrossEntropyWithLogits extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SoftmaxCrossEntropyWithLogits(Pointer p) { super(p); }

  public SoftmaxCrossEntropyWithLogits(@Const @ByRef Scope scope,
                                @ByVal Input features, @ByVal Input labels) { super((Pointer)null); allocate(scope, features, labels); }
  private native void allocate(@Const @ByRef Scope scope,
                                @ByVal Input features, @ByVal Input labels);

  public native @ByRef Operation operation(); public native SoftmaxCrossEntropyWithLogits operation(Operation setter);
  public native @ByRef Output loss(); public native SoftmaxCrossEntropyWithLogits loss(Output setter);
  public native @ByRef Output backprop(); public native SoftmaxCrossEntropyWithLogits backprop(Output setter);
}
