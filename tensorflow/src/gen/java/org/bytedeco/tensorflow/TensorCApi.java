// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// #endif

@Namespace("tensorflow") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TensorCApi extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TensorCApi() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TensorCApi(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorCApi(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TensorCApi position(long position) {
        return (TensorCApi)super.position(position);
    }

  public static native TensorBuffer Buffer(@Const @ByRef Tensor tensor);
  public static native @ByVal Tensor MakeTensor(@Cast("TF_DataType") int type, @Const @ByRef TensorShape shape,
                             TensorBuffer buf);
}
