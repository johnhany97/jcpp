// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.ngraph;

import org.bytedeco.ngraph.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ngraph.global.ngraph.*;


    @Namespace("ngraph") @Properties(inherit = org.bytedeco.ngraph.presets.ngraph.class)
public class NodeValidationError extends AssertionFailure {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public NodeValidationError(Pointer p) { super(p); }
    
        public NodeValidationError(@StdString BytePointer what) { super((Pointer)null); allocate(what); }
        private native void allocate(@StdString BytePointer what);
        public NodeValidationError(@StdString String what) { super((Pointer)null); allocate(what); }
        private native void allocate(@StdString String what);
    }
