// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.libfreenect;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.libfreenect.global.freenect.*;

/** Typedef for stream chunk processing callbacks */
@Properties(inherit = org.bytedeco.libfreenect.presets.freenect.class)
public class freenect_chunk_cb extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    freenect_chunk_cb(Pointer p) { super(p); }
    protected freenect_chunk_cb() { allocate(); }
    private native void allocate();
    public native void call(Pointer buffer, Pointer pkt_data, int pkt_num, int datalen, Pointer user_data);
}
