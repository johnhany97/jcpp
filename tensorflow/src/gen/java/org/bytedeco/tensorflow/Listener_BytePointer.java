// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Register a listener method that processes printed messages.
//
// If any listeners are registered, the print operator will call all listeners
// with the printed messages and immediately return without writing to the
// logs.
@Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Listener_BytePointer extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Listener_BytePointer(Pointer p) { super(p); }
    protected Listener_BytePointer() { allocate(); }
    private native void allocate();
    public native void call(@Cast("const char*") BytePointer arg0);
}
