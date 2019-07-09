// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Destroys the temporary variable and returns its final value.
 * 
 *  Sets output to the value of the Tensor pointed to by 'ref', then destroys
 *  the temporary variable called 'var_name'.
 *  All other uses of 'ref' *must* have executed before this op.
 *  This is typically achieved by chaining the ref through each assign op, or by
 *  using control dependencies.
 * 
 *  Outputs the final value of the tensor pointed to by 'ref'.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * ref: A reference to the temporary variable tensor.
 *  * var_name: Name of the temporary variable, usually the name of the matching
 *  'TemporaryVariable' op.
 * 
 *  Returns:
 *  * {@code Output}: The value tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class DestroyTemporaryVariable extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DestroyTemporaryVariable(Pointer p) { super(p); }

  public DestroyTemporaryVariable(@Const @ByRef Scope scope, @ByVal Input ref, @StringPiece BytePointer var_name) { super((Pointer)null); allocate(scope, ref, var_name); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input ref, @StringPiece BytePointer var_name);
  public DestroyTemporaryVariable(@Const @ByRef Scope scope, @ByVal Input ref, @StringPiece String var_name) { super((Pointer)null); allocate(scope, ref, var_name); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input ref, @StringPiece String var_name);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native DestroyTemporaryVariable operation(Operation setter);
  public native @ByRef Output value(); public native DestroyTemporaryVariable value(Output setter);
}
