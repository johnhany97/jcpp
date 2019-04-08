// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.mkldnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.mkldnn.global.mklml.*;

import static org.bytedeco.mkldnn.global.mkldnn.*;


@Namespace("mkldnn") @Properties(inherit = org.bytedeco.mkldnn.presets.mkldnn.class)
public class convolution_backward_weights extends primitive {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public convolution_backward_weights(Pointer p) { super(p); }

    @NoOffset public static class desc extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public desc(Pointer p) { super(p); }
    
        public native @ByRef mkldnn_convolution_desc_t data(); public native desc data(mkldnn_convolution_desc_t setter);
        public desc(@Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc diff_weights_desc,
                        @Const @ByRef memory.desc diff_bias_desc,
                        @Const @ByRef memory.desc diff_dst_desc,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer strides,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer padding_l,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer padding_r,
                        @Cast("const mkldnn::padding_kind") int apadding_kind) { super((Pointer)null); allocate(aalgorithm, src_desc, diff_weights_desc, diff_bias_desc, diff_dst_desc, strides, padding_l, padding_r, apadding_kind); }
        private native void allocate(@Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc diff_weights_desc,
                        @Const @ByRef memory.desc diff_bias_desc,
                        @Const @ByRef memory.desc diff_dst_desc,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer strides,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer padding_l,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer padding_r,
                        @Cast("const mkldnn::padding_kind") int apadding_kind);
        public desc(@Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc diff_weights_desc,
                        @Const @ByRef memory.desc diff_bias_desc,
                        @Const @ByRef memory.desc diff_dst_desc,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer strides,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer padding_l,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer padding_r,
                        @Cast("const mkldnn::padding_kind") int apadding_kind) { super((Pointer)null); allocate(aalgorithm, src_desc, diff_weights_desc, diff_bias_desc, diff_dst_desc, strides, padding_l, padding_r, apadding_kind); }
        private native void allocate(@Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc diff_weights_desc,
                        @Const @ByRef memory.desc diff_bias_desc,
                        @Const @ByRef memory.desc diff_dst_desc,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer strides,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer padding_l,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer padding_r,
                        @Cast("const mkldnn::padding_kind") int apadding_kind);
        public desc(@Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc diff_weights_desc,
                        @Const @ByRef memory.desc diff_bias_desc,
                        @Const @ByRef memory.desc diff_dst_desc,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] strides,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] padding_l,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] padding_r,
                        @Cast("const mkldnn::padding_kind") int apadding_kind) { super((Pointer)null); allocate(aalgorithm, src_desc, diff_weights_desc, diff_bias_desc, diff_dst_desc, strides, padding_l, padding_r, apadding_kind); }
        private native void allocate(@Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc diff_weights_desc,
                        @Const @ByRef memory.desc diff_bias_desc,
                        @Const @ByRef memory.desc diff_dst_desc,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] strides,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] padding_l,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] padding_r,
                        @Cast("const mkldnn::padding_kind") int apadding_kind);
        public desc(@Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc diff_weights_desc,
                        @Const @ByRef memory.desc diff_dst_desc,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer strides,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer padding_l,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer padding_r,
                        @Cast("const mkldnn::padding_kind") int apadding_kind) { super((Pointer)null); allocate(aalgorithm, src_desc, diff_weights_desc, diff_dst_desc, strides, padding_l, padding_r, apadding_kind); }
        private native void allocate(@Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc diff_weights_desc,
                        @Const @ByRef memory.desc diff_dst_desc,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer strides,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer padding_l,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer padding_r,
                        @Cast("const mkldnn::padding_kind") int apadding_kind);
        public desc(@Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc diff_weights_desc,
                        @Const @ByRef memory.desc diff_dst_desc,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer strides,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer padding_l,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer padding_r,
                        @Cast("const mkldnn::padding_kind") int apadding_kind) { super((Pointer)null); allocate(aalgorithm, src_desc, diff_weights_desc, diff_dst_desc, strides, padding_l, padding_r, apadding_kind); }
        private native void allocate(@Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc diff_weights_desc,
                        @Const @ByRef memory.desc diff_dst_desc,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer strides,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer padding_l,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer padding_r,
                        @Cast("const mkldnn::padding_kind") int apadding_kind);
        public desc(@Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc diff_weights_desc,
                        @Const @ByRef memory.desc diff_dst_desc,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] strides,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] padding_l,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] padding_r,
                        @Cast("const mkldnn::padding_kind") int apadding_kind) { super((Pointer)null); allocate(aalgorithm, src_desc, diff_weights_desc, diff_dst_desc, strides, padding_l, padding_r, apadding_kind); }
        private native void allocate(@Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc diff_weights_desc,
                        @Const @ByRef memory.desc diff_dst_desc,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] strides,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] padding_l,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] padding_r,
                        @Cast("const mkldnn::padding_kind") int apadding_kind);
        public desc(@Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc diff_weights_desc,
                        @Const @ByRef memory.desc diff_bias_desc,
                        @Const @ByRef memory.desc diff_dst_desc,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer strides,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer dilates,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer padding_l,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer padding_r,
                        @Cast("const mkldnn::padding_kind") int apadding_kind) { super((Pointer)null); allocate(aalgorithm, src_desc, diff_weights_desc, diff_bias_desc, diff_dst_desc, strides, dilates, padding_l, padding_r, apadding_kind); }
        private native void allocate(@Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc diff_weights_desc,
                        @Const @ByRef memory.desc diff_bias_desc,
                        @Const @ByRef memory.desc diff_dst_desc,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer strides,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer dilates,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer padding_l,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer padding_r,
                        @Cast("const mkldnn::padding_kind") int apadding_kind);
        public desc(@Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc diff_weights_desc,
                        @Const @ByRef memory.desc diff_bias_desc,
                        @Const @ByRef memory.desc diff_dst_desc,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer strides,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer dilates,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer padding_l,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer padding_r,
                        @Cast("const mkldnn::padding_kind") int apadding_kind) { super((Pointer)null); allocate(aalgorithm, src_desc, diff_weights_desc, diff_bias_desc, diff_dst_desc, strides, dilates, padding_l, padding_r, apadding_kind); }
        private native void allocate(@Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc diff_weights_desc,
                        @Const @ByRef memory.desc diff_bias_desc,
                        @Const @ByRef memory.desc diff_dst_desc,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer strides,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer dilates,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer padding_l,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer padding_r,
                        @Cast("const mkldnn::padding_kind") int apadding_kind);
        public desc(@Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc diff_weights_desc,
                        @Const @ByRef memory.desc diff_bias_desc,
                        @Const @ByRef memory.desc diff_dst_desc,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] strides,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] dilates,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] padding_l,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] padding_r,
                        @Cast("const mkldnn::padding_kind") int apadding_kind) { super((Pointer)null); allocate(aalgorithm, src_desc, diff_weights_desc, diff_bias_desc, diff_dst_desc, strides, dilates, padding_l, padding_r, apadding_kind); }
        private native void allocate(@Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc diff_weights_desc,
                        @Const @ByRef memory.desc diff_bias_desc,
                        @Const @ByRef memory.desc diff_dst_desc,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] strides,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] dilates,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] padding_l,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] padding_r,
                        @Cast("const mkldnn::padding_kind") int apadding_kind);
        public desc(@Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc diff_weights_desc,
                        @Const @ByRef memory.desc diff_dst_desc,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer strides,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer dilates,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer padding_l,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer padding_r,
                        @Cast("const mkldnn::padding_kind") int apadding_kind) { super((Pointer)null); allocate(aalgorithm, src_desc, diff_weights_desc, diff_dst_desc, strides, dilates, padding_l, padding_r, apadding_kind); }
        private native void allocate(@Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc diff_weights_desc,
                        @Const @ByRef memory.desc diff_dst_desc,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer strides,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer dilates,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer padding_l,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer padding_r,
                        @Cast("const mkldnn::padding_kind") int apadding_kind);
        public desc(@Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc diff_weights_desc,
                        @Const @ByRef memory.desc diff_dst_desc,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer strides,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer dilates,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer padding_l,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer padding_r,
                        @Cast("const mkldnn::padding_kind") int apadding_kind) { super((Pointer)null); allocate(aalgorithm, src_desc, diff_weights_desc, diff_dst_desc, strides, dilates, padding_l, padding_r, apadding_kind); }
        private native void allocate(@Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc diff_weights_desc,
                        @Const @ByRef memory.desc diff_dst_desc,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer strides,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer dilates,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer padding_l,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer padding_r,
                        @Cast("const mkldnn::padding_kind") int apadding_kind);
        public desc(@Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc diff_weights_desc,
                        @Const @ByRef memory.desc diff_dst_desc,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] strides,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] dilates,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] padding_l,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] padding_r,
                        @Cast("const mkldnn::padding_kind") int apadding_kind) { super((Pointer)null); allocate(aalgorithm, src_desc, diff_weights_desc, diff_dst_desc, strides, dilates, padding_l, padding_r, apadding_kind); }
        private native void allocate(@Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc diff_weights_desc,
                        @Const @ByRef memory.desc diff_dst_desc,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] strides,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] dilates,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] padding_l,
                        @Const @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] padding_r,
                        @Cast("const mkldnn::padding_kind") int apadding_kind);

    }

    public static class primitive_desc extends org.bytedeco.mkldnn.primitive_desc {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public primitive_desc(Pointer p) { super(p); }
    
        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef engine e,
                        @Const @ByRef convolution_forward.primitive_desc hint_fwd_pd) { super((Pointer)null); allocate(desc, e, hint_fwd_pd); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef engine e,
                        @Const @ByRef convolution_forward.primitive_desc hint_fwd_pd);

        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr, @Const @ByRef engine e,
                        @Const @ByRef convolution_forward.primitive_desc hint_fwd_pd) { super((Pointer)null); allocate(desc, attr, e, hint_fwd_pd); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr, @Const @ByRef engine e,
                        @Const @ByRef convolution_forward.primitive_desc hint_fwd_pd);

        public native @ByVal memory.primitive_desc src_primitive_desc();
        public native @ByVal memory.primitive_desc diff_weights_primitive_desc();
        public native @ByVal memory.primitive_desc diff_bias_primitive_desc();
        public native @ByVal memory.primitive_desc diff_dst_primitive_desc();
    }

    public convolution_backward_weights(@Const @ByRef primitive_desc aprimitive_desc,
                @Const @ByRef primitive.at src, @Const @ByRef primitive.at diff_dst,
                @Const @ByRef memory diff_weights, @Const @ByRef memory diff_bias) { super((Pointer)null); allocate(aprimitive_desc, src, diff_dst, diff_weights, diff_bias); }
    private native void allocate(@Const @ByRef primitive_desc aprimitive_desc,
                @Const @ByRef primitive.at src, @Const @ByRef primitive.at diff_dst,
                @Const @ByRef memory diff_weights, @Const @ByRef memory diff_bias);
    public convolution_backward_weights(@Const @ByRef primitive_desc aprimitive_desc,
                @Const @ByRef primitive.at src, @Const @ByRef primitive.at diff_dst,
                @Const @ByRef memory diff_weights) { super((Pointer)null); allocate(aprimitive_desc, src, diff_dst, diff_weights); }
    private native void allocate(@Const @ByRef primitive_desc aprimitive_desc,
                @Const @ByRef primitive.at src, @Const @ByRef primitive.at diff_dst,
                @Const @ByRef memory diff_weights);
}
