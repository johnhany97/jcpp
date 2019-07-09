// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.ngraph;

import org.bytedeco.ngraph.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ngraph.global.ngraph.*;


    @Namespace("ngraph") @NoOffset @Properties(inherit = org.bytedeco.ngraph.presets.ngraph.class)
public class NodeDescription extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public NodeDescription(Pointer p) { super(p); }
    
        public NodeDescription(@Const @ByRef Node node, @Cast("bool") boolean is_short) { super((Pointer)null); allocate(node, is_short); }
        private native void allocate(@Const @ByRef Node node, @Cast("bool") boolean is_short);

        
        @MemberGetter public native @Const @ByRef Node m_node();
        public native @Cast("bool") boolean m_is_short(); public native NodeDescription m_is_short(boolean setter);
    }
