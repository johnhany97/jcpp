// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cublas;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.cublas.*;

// #endif /* __cplusplus */

@Opaque @Properties(inherit = org.bytedeco.cuda.presets.cublas.class)
public class cublasXtContext extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public cublasXtContext() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cublasXtContext(Pointer p) { super(p); }
}
