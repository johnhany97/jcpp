// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.ngraph;

import org.bytedeco.ngraph.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ngraph.global.ngraph.*;

        /** \brief Elementwise multiplication operation. */
        @Namespace("ngraph::op") @Properties(inherit = org.bytedeco.ngraph.presets.ngraph.class)
public class Multiply extends BinaryElementwiseArithmetic {
            static { Loader.load(); }
            /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
            public Multiply(Pointer p) { super(p); }
        
            /** \brief Constructs a multiplication operation.
             * 
             *  @param arg0 Node that produces the first input tensor.
             *  @param arg1 Node that produces the second input tensor.
             *  @param autob Auto broadcast specification */
            public Multiply(@Const @SharedPtr @ByRef Node arg0,
                                 @Const @SharedPtr @ByRef Node arg1,
                                 @Const @ByRef(nullValue = "ngraph::op::AutoBroadcastSpec()") AutoBroadcastSpec autob) { super((Pointer)null); allocate(arg0, arg1, autob); }
            private native void allocate(@Const @SharedPtr @ByRef Node arg0,
                                 @Const @SharedPtr @ByRef Node arg1,
                                 @Const @ByRef(nullValue = "ngraph::op::AutoBroadcastSpec()") AutoBroadcastSpec autob);
            public Multiply(@Const @SharedPtr @ByRef Node arg0,
                                 @Const @SharedPtr @ByRef Node arg1) { super((Pointer)null); allocate(arg0, arg1); }
            private native void allocate(@Const @SharedPtr @ByRef Node arg0,
                                 @Const @SharedPtr @ByRef Node arg1);

            public native @SharedPtr @ByVal Node copy_with_new_args(@Const @ByRef NodeVector new_args);
        }
