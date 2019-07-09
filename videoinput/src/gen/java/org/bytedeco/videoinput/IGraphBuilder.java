// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.videoinput;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.videoinput.global.videoInputLib.*;

@Opaque @Properties(inherit = org.bytedeco.videoinput.presets.videoInputLib.class)
public class IGraphBuilder extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public IGraphBuilder() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IGraphBuilder(Pointer p) { super(p); }
}
