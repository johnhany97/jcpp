// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Optional results that may be returned by ImportGraphDef.
@Namespace("tensorflow") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ImportGraphDefResults extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ImportGraphDefResults() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ImportGraphDefResults(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ImportGraphDefResults(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ImportGraphDefResults position(long position) {
        return (ImportGraphDefResults)super.position(position);
    }

  // The requested tensors associated with
  // ImportGraphDefOptions::return_tensors. Note that the index may be different
  // than the requested index if the returned tensor has been remapped according
  // to `input_map`.
  public native @StdVector NodeIndexPair return_tensors(); public native ImportGraphDefResults return_tensors(NodeIndexPair setter);

  // The requested nodes associated with ImportGraphDefOptions::return_nodes.
  public native @ByRef NodeVector return_nodes(); public native ImportGraphDefResults return_nodes(NodeVector setter);

  // Keys in ImportGraphDefOptions::input_map that don't appear in `gdef` and
  // weren't used as an input to any node in `gdef`. These keys are likely due
  // to typos, and callers may wish to treat their existence as an error.
  public native @StdVector SafeTensorId missing_unused_input_map_keys(); public native ImportGraphDefResults missing_unused_input_map_keys(SafeTensorId setter);
}
