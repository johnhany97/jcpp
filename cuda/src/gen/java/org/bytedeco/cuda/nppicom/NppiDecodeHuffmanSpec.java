// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nppicom;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.cuda.nppc.*;
import static org.bytedeco.cuda.global.nppc.*;

import static org.bytedeco.cuda.global.nppicom.*;

                                          
/** \} image_quantization */

// #if defined (__cplusplus)
@Opaque @Properties(inherit = org.bytedeco.cuda.presets.nppicom.class)
public class NppiDecodeHuffmanSpec extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public NppiDecodeHuffmanSpec() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NppiDecodeHuffmanSpec(Pointer p) { super(p); }
}
