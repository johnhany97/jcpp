// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.skia;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.skia.global.Skia.*;

/**
    A sk_data_ holds an immutable data buffer.
*/
@Opaque @Properties(inherit = org.bytedeco.skia.presets.Skia.class)
public class sk_data_t extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public sk_data_t() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public sk_data_t(Pointer p) { super(p); }
}
