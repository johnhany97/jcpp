// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.libfreenect2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.libfreenect2.global.freenect2.*;


@Namespace("libfreenect2") @Opaque @Properties(inherit = org.bytedeco.libfreenect2.presets.freenect2.class)
public class SyncMultiFrameListenerImpl extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public SyncMultiFrameListenerImpl() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SyncMultiFrameListenerImpl(Pointer p) { super(p); }
}
