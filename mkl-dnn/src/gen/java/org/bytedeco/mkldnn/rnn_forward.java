// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.mkldnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.mkldnn.global.mklml.*;

import static org.bytedeco.mkldnn.global.mkldnn.*;


@Namespace("mkldnn") @Properties(inherit = org.bytedeco.mkldnn.presets.mkldnn.class)
public class rnn_forward extends primitive {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public rnn_forward(Pointer p) { super(p); }

    @NoOffset public static class desc extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public desc(Pointer p) { super(p); }
    
        public native @ByRef mkldnn_rnn_desc_t data(); public native desc data(mkldnn_rnn_desc_t setter);
        public desc(@Cast("mkldnn::prop_kind") int aprop_kind, @ByVal rnn_cell.desc cell,
                        @Cast("const mkldnn::rnn_direction") int direction,
                        @Const @ByRef memory.desc src_layer_desc,
                        @Const @ByRef memory.desc src_iter_desc,
                        @Const @ByRef memory.desc weights_layer_desc,
                        @Const @ByRef memory.desc weights_iter_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_layer_desc,
                        @Const @ByRef memory.desc dst_iter_desc
                    ) { super((Pointer)null); allocate(aprop_kind, cell, direction, src_layer_desc, src_iter_desc, weights_layer_desc, weights_iter_desc, bias_desc, dst_layer_desc, dst_iter_desc); }
        private native void allocate(@Cast("mkldnn::prop_kind") int aprop_kind, @ByVal rnn_cell.desc cell,
                        @Cast("const mkldnn::rnn_direction") int direction,
                        @Const @ByRef memory.desc src_layer_desc,
                        @Const @ByRef memory.desc src_iter_desc,
                        @Const @ByRef memory.desc weights_layer_desc,
                        @Const @ByRef memory.desc weights_iter_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_layer_desc,
                        @Const @ByRef memory.desc dst_iter_desc
                    );

    }

    public static class primitive_desc extends org.bytedeco.mkldnn.primitive_desc {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public primitive_desc(Pointer p) { super(p); }
    
        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef engine e) { super((Pointer)null); allocate(desc, e); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef engine e);

        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr, @Const @ByRef engine e) { super((Pointer)null); allocate(desc, attr, e); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr, @Const @ByRef engine e);

        public native @ByVal memory.primitive_desc src_layer_primitive_desc();
        public native @ByVal memory.primitive_desc src_iter_primitive_desc();
        public native @ByVal memory.primitive_desc weights_layer_primitive_desc();
        public native @ByVal memory.primitive_desc weights_iter_primitive_desc();
        public native @ByVal memory.primitive_desc bias_primitive_desc();
        public native @ByVal memory.primitive_desc dst_layer_primitive_desc();
        public native @ByVal memory.primitive_desc dst_iter_primitive_desc();
        public native @ByVal memory.primitive_desc workspace_primitive_desc();
    }

    public rnn_forward(@Const @ByRef primitive_desc aprimitive_desc,
                @Const @ByRef primitive.at src_layer, @Const @ByRef primitive.at src_iter,
                @Const @ByRef primitive.at weights_layer,
                @Const @ByRef primitive.at weights_iter, @Const @ByRef primitive.at bias,
                @Const @ByRef memory dst_layer, @Const @ByRef memory dst_iter,
                @Const @ByRef memory workspace) { super((Pointer)null); allocate(aprimitive_desc, src_layer, src_iter, weights_layer, weights_iter, bias, dst_layer, dst_iter, workspace); }
    private native void allocate(@Const @ByRef primitive_desc aprimitive_desc,
                @Const @ByRef primitive.at src_layer, @Const @ByRef primitive.at src_iter,
                @Const @ByRef primitive.at weights_layer,
                @Const @ByRef primitive.at weights_iter, @Const @ByRef primitive.at bias,
                @Const @ByRef memory dst_layer, @Const @ByRef memory dst_iter,
                @Const @ByRef memory workspace);
}
