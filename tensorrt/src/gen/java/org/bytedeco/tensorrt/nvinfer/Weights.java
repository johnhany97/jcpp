// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;


/**
 *  \class Weights
 * 
 *  \brief An array of weights used as a layer parameter.
 * 
 *  The weights are held by reference until the engine has been built. Therefore the data referenced
 *  by \p values field should be preserved until the build is complete.
 *  */
@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class Weights extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public Weights() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Weights(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Weights(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public Weights position(long position) {
        return (Weights)super.position(position);
    }

    /** The type of the weights. */
    public native DataType type(); public native Weights type(DataType setter);
    /** The weight values, in a contiguous array. */
    public native @Const Pointer values(); public native Weights values(Pointer values);
    /** The number of weights in the array. */
    public native @Cast("int64_t") long count(); public native Weights count(long setter);
}
