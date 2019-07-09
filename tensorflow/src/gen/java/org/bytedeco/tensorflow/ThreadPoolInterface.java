// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

@Namespace("Eigen") @Opaque @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ThreadPoolInterface extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public ThreadPoolInterface() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ThreadPoolInterface(Pointer p) { super(p); }
}
