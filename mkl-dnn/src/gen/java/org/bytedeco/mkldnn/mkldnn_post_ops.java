// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.mkldnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.mkldnn.global.mklml.*;

import static org.bytedeco.mkldnn.global.mkldnn.*;


/** \struct mkldnn_post_ops
 * \brief An opaque structure for a chain of post operations.
 *
 * mkldnn_post_ops can be used to perform some (trivial) operations like
 * accumulation or eltwise after certain primitives like convolution.
 *
 * Post operations might be combined together, making a chain of post
 * operations. For instance one can configure convolution followed by
 * accumulation followed by eltwise. This might be especially beneficial
 * for residual learning blocks.
 *
 * \warning
 *      Of course not all combinations are supported, so the user should handle
 *      errors accordingly.
 *
 * Supported post operations:
 *  - accumulation (base primitive: convolution)
 *  - eltwise (base primitive: convolution)
 */
@Opaque @Properties(inherit = org.bytedeco.mkldnn.presets.mkldnn.class)
public class mkldnn_post_ops extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public mkldnn_post_ops() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public mkldnn_post_ops(Pointer p) { super(p); }
}
