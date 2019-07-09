// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;

/** Forward declaration of cudaEvent_t. */
@Opaque @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class CUevent_st extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CUevent_st() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUevent_st(Pointer p) { super(p); }
}
