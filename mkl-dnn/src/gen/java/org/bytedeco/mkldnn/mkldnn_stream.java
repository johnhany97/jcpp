// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.mkldnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.mkldnn.global.mklml.*;

import static org.bytedeco.mkldnn.global.mkldnn.*;


/** \struct mkldnn_stream
 * An opaque structure to describe an execution stream. */
@Opaque @Properties(inherit = org.bytedeco.mkldnn.presets.mkldnn.class)
public class mkldnn_stream extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public mkldnn_stream() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public mkldnn_stream(Pointer p) { super(p); }
}
