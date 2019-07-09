// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Push an element onto the tensor_array.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * handle: The handle to a TensorArray.
 *  * index: The position to write to inside the TensorArray.
 *  * value: The tensor to write to the TensorArray.
 *  * flow_in: A float scalar that enforces proper chaining of operations.
 * 
 *  Returns:
 *  * {@code Output}: A float scalar that enforces proper chaining of operations. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TensorArrayWrite extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorArrayWrite(Pointer p) { super(p); }

  public TensorArrayWrite(@Const @ByRef Scope scope, @ByVal Input handle,
                   @ByVal Input index, @ByVal Input value,
                   @ByVal Input flow_in) { super((Pointer)null); allocate(scope, handle, index, value, flow_in); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input handle,
                   @ByVal Input index, @ByVal Input value,
                   @ByVal Input flow_in);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native TensorArrayWrite operation(Operation setter);
  public native @ByRef Output flow_out(); public native TensorArrayWrite flow_out(Output setter);
}
