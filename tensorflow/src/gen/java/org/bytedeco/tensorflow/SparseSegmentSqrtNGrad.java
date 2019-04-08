// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Computes gradients for SparseSegmentSqrtN.
 * 
 *  Returns tensor "output" with same shape as grad, except for dimension 0 whose
 *  value is output_dim0.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * grad: gradient propagated to the SparseSegmentSqrtN op.
 *  * indices: indices passed to the corresponding SparseSegmentSqrtN op.
 *  * segment_ids: segment_ids passed to the corresponding SparseSegmentSqrtN op.
 *  * output_dim0: dimension 0 of "data" passed to SparseSegmentSqrtN op.
 * 
 *  Returns:
 *  * {@code Output}: The output tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class SparseSegmentSqrtNGrad extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SparseSegmentSqrtNGrad(Pointer p) { super(p); }

  public SparseSegmentSqrtNGrad(@Const @ByRef Scope scope, @ByVal Input grad, @ByVal Input indices, @ByVal Input segment_ids, @ByVal Input output_dim0) { super((Pointer)null); allocate(scope, grad, indices, segment_ids, output_dim0); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input grad, @ByVal Input indices, @ByVal Input segment_ids, @ByVal Input output_dim0);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native SparseSegmentSqrtNGrad operation(Operation setter);
  public native @ByRef Output output(); public native SparseSegmentSqrtNGrad output(Output setter);
}
