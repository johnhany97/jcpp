// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.cudnn.*;
 /* pointer to the returned workspace size */

@Properties(inherit = org.bytedeco.cuda.presets.cudnn.class)
public class cudnnAlgorithm_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudnnAlgorithm_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cudnnAlgorithm_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudnnAlgorithm_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cudnnAlgorithm_t position(long position) {
        return (cudnnAlgorithm_t)super.position(position);
    }

        @Name("algo.convFwdAlgo") public native @Cast("cudnnConvolutionFwdAlgo_t") int algo_convFwdAlgo(); public native cudnnAlgorithm_t algo_convFwdAlgo(int setter);
        @Name("algo.convBwdFilterAlgo") public native @Cast("cudnnConvolutionBwdFilterAlgo_t") int algo_convBwdFilterAlgo(); public native cudnnAlgorithm_t algo_convBwdFilterAlgo(int setter);
        @Name("algo.convBwdDataAlgo") public native @Cast("cudnnConvolutionBwdDataAlgo_t") int algo_convBwdDataAlgo(); public native cudnnAlgorithm_t algo_convBwdDataAlgo(int setter);
        @Name("algo.RNNAlgo") public native @Cast("cudnnRNNAlgo_t") int algo_RNNAlgo(); public native cudnnAlgorithm_t algo_RNNAlgo(int setter);
        @Name("algo.CTCLossAlgo") public native @Cast("cudnnCTCLossAlgo_t") int algo_CTCLossAlgo(); public native cudnnAlgorithm_t algo_CTCLossAlgo(int setter);
}
