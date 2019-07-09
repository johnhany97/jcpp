// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.mkldnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.mkldnn.global.mklml.*;

import static org.bytedeco.mkldnn.global.mkldnn.*;


@Namespace("mkldnn") @Properties(inherit = org.bytedeco.mkldnn.presets.mkldnn.class)
public class eltwise_backward extends primitive {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public eltwise_backward(Pointer p) { super(p); }

    @NoOffset public static class desc extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public desc(Pointer p) { super(p); }
    
        public native @ByRef mkldnn_eltwise_desc_t data(); public native desc data(mkldnn_eltwise_desc_t setter);

        public desc(@Cast("mkldnn::algorithm") int alg_kind, @Const @ByRef memory.desc diff_data_desc,
                        @Const @ByRef memory.desc data_desc, float alpha/*=0*/, float beta/*=0*/) { super((Pointer)null); allocate(alg_kind, diff_data_desc, data_desc, alpha, beta); }
        private native void allocate(@Cast("mkldnn::algorithm") int alg_kind, @Const @ByRef memory.desc diff_data_desc,
                        @Const @ByRef memory.desc data_desc, float alpha/*=0*/, float beta/*=0*/);
    }

    public static class primitive_desc extends org.bytedeco.mkldnn.primitive_desc {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public primitive_desc(Pointer p) { super(p); }
    
        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef engine e,
                        @Const @ByRef eltwise_forward.primitive_desc hint_fwd_pd) { super((Pointer)null); allocate(desc, e, hint_fwd_pd); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef engine e,
                        @Const @ByRef eltwise_forward.primitive_desc hint_fwd_pd);

        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr, @Const @ByRef engine e,
                        @Const @ByRef eltwise_forward.primitive_desc hint_fwd_pd) { super((Pointer)null); allocate(desc, attr, e, hint_fwd_pd); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr, @Const @ByRef engine e,
                        @Const @ByRef eltwise_forward.primitive_desc hint_fwd_pd);

        public native @ByVal memory.primitive_desc src_primitive_desc();
        public native @ByVal memory.primitive_desc diff_src_primitive_desc();
        public native @ByVal memory.primitive_desc diff_dst_primitive_desc();
    }

    public eltwise_backward(@Const @ByRef primitive_desc aprimitive_desc,
                @Const @ByRef primitive.at src, @Const @ByRef primitive.at diff_dst,
                @Const @ByRef memory diff_src) { super((Pointer)null); allocate(aprimitive_desc, src, diff_dst, diff_src); }
    private native void allocate(@Const @ByRef primitive_desc aprimitive_desc,
                @Const @ByRef primitive.at src, @Const @ByRef primitive.at diff_dst,
                @Const @ByRef memory diff_src);
}
