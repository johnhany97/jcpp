// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cpython.global.python.*;

@Namespace @Name("void") @Opaque @Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyThread_type_sema extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public PyThread_type_sema() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyThread_type_sema(Pointer p) { super(p); }
}
