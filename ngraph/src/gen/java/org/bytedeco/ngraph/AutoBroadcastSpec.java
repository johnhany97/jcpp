// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.ngraph;

import org.bytedeco.ngraph.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ngraph.global.ngraph.*;


        /** \brief Implicit broadcast specification */
        @Namespace("ngraph::op") @NoOffset @Properties(inherit = org.bytedeco.ngraph.presets.ngraph.class)
public class AutoBroadcastSpec extends Pointer {
            static { Loader.load(); }
            /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
            public AutoBroadcastSpec(Pointer p) { super(p); }
        
            public AutoBroadcastSpec() { super((Pointer)null); allocate(); }
            private native void allocate();
            public AutoBroadcastSpec(@Cast("ngraph::op::AutoBroadcastType") int type) { super((Pointer)null); allocate(type); }
            private native void allocate(@Cast("ngraph::op::AutoBroadcastType") int type);
            public AutoBroadcastSpec(@Cast("ngraph::op::AutoBroadcastType") int type, @Cast("size_t") long axis) { super((Pointer)null); allocate(type, axis); }
            private native void allocate(@Cast("ngraph::op::AutoBroadcastType") int type, @Cast("size_t") long axis);

            public native @Cast("ngraph::op::AutoBroadcastType") int m_type(); public native AutoBroadcastSpec m_type(int setter); // Implicit broadcasting algorithm
            public native @Cast("size_t") long m_axis(); public native AutoBroadcastSpec m_axis(long setter);            // Axis to start alignment on
        }
