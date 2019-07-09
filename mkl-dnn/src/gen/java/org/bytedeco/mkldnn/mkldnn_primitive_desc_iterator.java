// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.mkldnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.mkldnn.global.mklml.*;

import static org.bytedeco.mkldnn.global.mkldnn.*;

// #if 0
// #endif

/** \} */

/** \addtogroup c_api_primitive_desc_iterators Primitive descriptor iterators
 * \{ */

/** \struct mkldnn_primitive_desc_iterator
 * \brief An opaque structure to describe a primitive descriptor iterator. */
@Opaque @Properties(inherit = org.bytedeco.mkldnn.presets.mkldnn.class)
public class mkldnn_primitive_desc_iterator extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public mkldnn_primitive_desc_iterator() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public mkldnn_primitive_desc_iterator(Pointer p) { super(p); }
}
