// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cuda.global.cudart.*;


// #if __CUDA_API_VERSION >= 5050
@Opaque @Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class CUlinkState_st extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CUlinkState_st() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUlinkState_st(Pointer p) { super(p); }
}
