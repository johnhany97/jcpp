// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Computes softmax activations.
 * 
 *  For each batch {@code i} and class {@code j} we have
 * 
 *      $$softmax[i, j] = exp(logits[i, j]) / sum_j(exp(logits[i, j]))$$
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * logits: 2-D with shape {@code [batch_size, num_classes]}.
 * 
 *  Returns:
 *  * {@code Output}: Same shape as {@code logits}. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Softmax extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Softmax(Pointer p) { super(p); }

  public Softmax(@Const @ByRef Scope scope, @ByVal Input logits) { super((Pointer)null); allocate(scope, logits); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input logits);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native Softmax operation(Operation setter);
  public native @ByRef Output softmax(); public native Softmax softmax(Output setter);
}
