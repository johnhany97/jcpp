// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.onnx.global.onnx.*;


@Namespace("google::protobuf::io") @Opaque @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class CodedInputStream extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CodedInputStream() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CodedInputStream(Pointer p) { super(p); }
}
