// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Stores debug information associated with the Node.
@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class NodeDebugInfo extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NodeDebugInfo(Pointer p) { super(p); }

  @MemberGetter public native @StdString BytePointer name();
  @MemberGetter public native @Const @ByRef StringVector original_node_names();

  public NodeDebugInfo(@Const @ByRef Node n) { super((Pointer)null); allocate(n); }
  private native void allocate(@Const @ByRef Node n);
  public NodeDebugInfo(@Const @ByRef NodeDef ndef) { super((Pointer)null); allocate(ndef); }
  private native void allocate(@Const @ByRef NodeDef ndef);
}
