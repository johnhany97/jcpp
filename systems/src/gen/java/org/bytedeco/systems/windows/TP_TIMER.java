// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Opaque @Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class TP_TIMER extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public TP_TIMER() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TP_TIMER(Pointer p) { super(p); }
}
