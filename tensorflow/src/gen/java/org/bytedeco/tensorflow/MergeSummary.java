// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Merges summaries.
 * 
 *  This op creates a
 *  [{@code Summary}](https://www.tensorflow.org/code/tensorflow/core/framework/summary.proto)
 *  protocol buffer that contains the union of all the values in the input
 *  summaries.
 * 
 *  When the Op is run, it reports an {@code InvalidArgument} error if multiple values
 *  in the summaries to merge use the same tag.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * inputs: Can be of any shape.  Each must contain serialized {@code Summary} protocol
 *  buffers.
 * 
 *  Returns:
 *  * {@code Output}: Scalar. Serialized {@code Summary} protocol buffer. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class MergeSummary extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MergeSummary(Pointer p) { super(p); }

  public MergeSummary(@Const @ByRef Scope scope, @ByVal InputList inputs) { super((Pointer)null); allocate(scope, inputs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal InputList inputs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native MergeSummary operation(Operation setter);
  public native @ByRef Output summary(); public native MergeSummary summary(Output setter);
}
