// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.ngraph;

import org.bytedeco.ngraph.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ngraph.global.ngraph.*;

        @Namespace("ngraph::runtime") @Opaque @Properties(inherit = org.bytedeco.ngraph.presets.ngraph.class)
public class Manager extends Pointer {
            /** Empty constructor. Calls {@code super((Pointer)null)}. */
            public Manager() { super((Pointer)null); }
            /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
            public Manager(Pointer p) { super(p); }
        }
