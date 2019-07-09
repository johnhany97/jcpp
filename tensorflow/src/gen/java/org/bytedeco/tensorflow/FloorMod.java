// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Returns element-wise remainder of division. When {@code x < 0} xor {@code y < 0} is
 * 
 *  true, this follows Python semantics in that the result here is consistent
 *  with a flooring divide. E.g. {@code floor(x / y) * y + mod(x, y) = x}.
 * 
 *  *NOTE*: {@code FloorMod} supports broadcasting. More about broadcasting
 *  [here](http://docs.scipy.org/doc/numpy/user/basics.broadcasting.html)
 * 
 *  Arguments:
 *  * scope: A Scope object
 * 
 *  Returns:
 *  * {@code Output}: The z tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class FloorMod extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FloorMod(Pointer p) { super(p); }

  public FloorMod(@Const @ByRef Scope scope, @ByVal Input x,
           @ByVal Input y) { super((Pointer)null); allocate(scope, x, y); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input x,
           @ByVal Input y);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native FloorMod operation(Operation setter);
  public native @ByRef Output z(); public native FloorMod z(Output setter);
}
