// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Compute the pairwise cross product.
 * 
 *  {@code a} and {@code b} must be the same shape; they can either be simple 3-element vectors,
 *  or any shape where the innermost dimension is 3. In the latter case, each pair
 *  of corresponding 3-element vectors is cross-multiplied independently.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * a: A tensor containing 3-element vectors.
 *  * b: Another tensor, of same type and shape as {@code a}.
 * 
 *  Returns:
 *  * {@code Output}: Pairwise cross product of the vectors in {@code a} and {@code b}. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Cross extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Cross(Pointer p) { super(p); }

  public Cross(@Const @ByRef Scope scope, @ByVal Input a,
        @ByVal Input b) { super((Pointer)null); allocate(scope, a, b); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input a,
        @ByVal Input b);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native Cross operation(Operation setter);
  public native @ByRef Output product(); public native Cross product(Output setter);
}
