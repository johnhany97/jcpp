// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Restores tensors from a V2 checkpoint.
 * 
 *  For backward compatibility with the V1 format, this Op currently allows
 *  restoring from a V1 checkpoint as well:
 *    - This Op first attempts to find the V2 index file pointed to by "prefix", and
 *      if found proceed to read it as a V2 checkpoint;
 *    - Otherwise the V1 read path is invoked.
 *  Relying on this behavior is not recommended, as the ability to fall back to read
 *  V1 might be deprecated and eventually removed.
 * 
 *  By default, restores the named tensors in full.  If the caller wishes to restore
 *  specific slices of stored tensors, "shape_and_slices" should be non-empty
 *  strings and correspondingly well-formed.
 * 
 *  Callers must ensure all the named tensors are indeed stored in the checkpoint.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * prefix: Must have a single element.  The prefix of a V2 checkpoint.
 *  * tensor_names: shape {N}.  The names of the tensors to be restored.
 *  * shape_and_slices: shape {N}.  The slice specs of the tensors to be restored.
 *  Empty strings indicate that they are non-partitioned tensors.
 *  * dtypes: shape {N}.  The list of expected dtype for the tensors.  Must match
 *  those stored in the checkpoint.
 * 
 *  Returns:
 *  * {@code OutputList}: shape {N}.  The restored tensors, whose shapes are read from the
 *  checkpoint directly. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class RestoreV2 extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RestoreV2(Pointer p) { super(p); }

  public RestoreV2(@Const @ByRef Scope scope, @ByVal Input prefix,
            @ByVal Input tensor_names, @ByVal Input shape_and_slices, @Cast("const tensorflow::DataTypeSlice*") @ByRef DataTypeVector dtypes) { super((Pointer)null); allocate(scope, prefix, tensor_names, shape_and_slices, dtypes); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input prefix,
            @ByVal Input tensor_names, @ByVal Input shape_and_slices, @Cast("const tensorflow::DataTypeSlice*") @ByRef DataTypeVector dtypes);
  public native @ByVal @Name("operator []") Output get(@Cast("size_t") long index);


  public native @ByRef Operation operation(); public native RestoreV2 operation(Operation setter);
  public native @ByRef @Cast("tensorflow::OutputList*") OutputVector tensors(); public native RestoreV2 tensors(OutputVector setter);
}
