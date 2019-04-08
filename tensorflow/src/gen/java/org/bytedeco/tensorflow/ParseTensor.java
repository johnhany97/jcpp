// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Transforms a serialized tensorflow.TensorProto proto into a Tensor.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * serialized: A scalar string containing a serialized TensorProto proto.
 *  * out_type: The type of the serialized tensor.  The provided type must match the
 *  type of the serialized tensor and no implicit conversion will take place.
 * 
 *  Returns:
 *  * {@code Output}: A Tensor of type {@code out_type}. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ParseTensor extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ParseTensor(Pointer p) { super(p); }

  public ParseTensor(@Const @ByRef Scope scope, @ByVal Input serialized,
              @Cast("tensorflow::DataType") int out_type) { super((Pointer)null); allocate(scope, serialized, out_type); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input serialized,
              @Cast("tensorflow::DataType") int out_type);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native ParseTensor operation(Operation setter);
  public native @ByRef Output output(); public native ParseTensor output(Output setter);
}
