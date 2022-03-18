// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;

@Opaque @Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyContextVar extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public PyContextVar() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyContextVar(Pointer p) { super(p); }
}
