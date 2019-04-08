// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.videoinput;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.videoinput.global.videoInputLib.*;

@Opaque @Properties(inherit = org.bytedeco.videoinput.presets.videoInputLib.class)
public class IMediaControl extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public IMediaControl() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IMediaControl(Pointer p) { super(p); }
}
