// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.skia;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.skia.global.Skia.*;

/**
    A sk_picture_t holds recorded canvas drawing commands to be played
    back at a later time.
*/
@Opaque @Properties(inherit = org.bytedeco.skia.presets.Skia.class)
public class sk_picture_t extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public sk_picture_t() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public sk_picture_t(Pointer p) { super(p); }
}
