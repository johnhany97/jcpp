// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.mkldnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.mkldnn.global.mklml.*;

import static org.bytedeco.mkldnn.global.mkldnn.*;


/** \}
 <p>
 *  \addtogroup cpp_api_eltwise Eltwise
 *  A primitive to compute element-wise operations like parametric rectifier
 *  linear unit (ReLU).
 * 
 *  @see \ref c_api_eltwise in \ref c_api
 *  \{ */

@Namespace("mkldnn") @Properties(inherit = org.bytedeco.mkldnn.presets.mkldnn.class)
public class eltwise_forward extends primitive {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public eltwise_forward(Pointer p) { super(p); }

    @NoOffset public static class desc extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public desc(Pointer p) { super(p); }
    
        public native @ByRef mkldnn_eltwise_desc_t data(); public native desc data(mkldnn_eltwise_desc_t setter);
        public desc(@Cast("mkldnn::prop_kind") int aprop_kind, @Cast("mkldnn::algorithm") int alg_kind,
                        @Const @ByRef memory.desc src_desc, float alpha/*=0*/, float beta/*=0*/) { super((Pointer)null); allocate(aprop_kind, alg_kind, src_desc, alpha, beta); }
        private native void allocate(@Cast("mkldnn::prop_kind") int aprop_kind, @Cast("mkldnn::algorithm") int alg_kind,
                        @Const @ByRef memory.desc src_desc, float alpha/*=0*/, float beta/*=0*/);
    }

    public static class primitive_desc extends org.bytedeco.mkldnn.primitive_desc {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public primitive_desc(Pointer p) { super(p); }
    
        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef engine e) { super((Pointer)null); allocate(desc, e); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef engine e);

        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr, @Const @ByRef engine e) { super((Pointer)null); allocate(desc, attr, e); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr, @Const @ByRef engine e);

        public native @ByVal memory.primitive_desc src_primitive_desc();
        public native @ByVal memory.primitive_desc dst_primitive_desc();
    }

    public eltwise_forward(@Const @ByRef primitive_desc aprimitive_desc,
                @Const @ByRef primitive.at src, @Const @ByRef memory dst) { super((Pointer)null); allocate(aprimitive_desc, src, dst); }
    private native void allocate(@Const @ByRef primitive_desc aprimitive_desc,
                @Const @ByRef primitive.at src, @Const @ByRef memory dst);
}
