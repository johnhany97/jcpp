// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.ngraph;

import org.bytedeco.ngraph.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ngraph.global.ngraph.*;


    @Namespace("ngraph") @Properties(inherit = org.bytedeco.ngraph.presets.ngraph.class)
public class unsupported_op extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public unsupported_op(Pointer p) { super(p); }
    
        public unsupported_op(@StdString BytePointer what_arg) { super((Pointer)null); allocate(what_arg); }
        private native void allocate(@StdString BytePointer what_arg);
        public unsupported_op(@StdString String what_arg) { super((Pointer)null); allocate(what_arg); }
        private native void allocate(@StdString String what_arg);
    }
