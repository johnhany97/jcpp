// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_imgproc;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;

import static org.bytedeco.opencv.global.opencv_imgproc.*;


/** Freeman chain reader state */
@Properties(inherit = org.bytedeco.opencv.presets.opencv_imgproc.class)
public class CvChainPtReader extends CvSeqReader {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvChainPtReader() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CvChainPtReader(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvChainPtReader(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CvChainPtReader position(long position) {
        return (CvChainPtReader)super.position(position);
    }

    public native int header_size(); public native CvChainPtReader header_size(int setter);
    /** sequence, beign read */
    public native CvSeq seq(); public native CvChainPtReader seq(CvSeq setter);
    /** current block */
    public native CvSeqBlock block(); public native CvChainPtReader block(CvSeqBlock setter);
    /** pointer to element be read next */
    public native @Cast("schar*") BytePointer ptr(); public native CvChainPtReader ptr(BytePointer setter);
    /** pointer to the beginning of block */
    public native @Cast("schar*") BytePointer block_min(); public native CvChainPtReader block_min(BytePointer setter);
    /** pointer to the end of block */
    public native @Cast("schar*") BytePointer block_max(); public native CvChainPtReader block_max(BytePointer setter);
    /** = seq->first->start_index   */
    public native int delta_index(); public native CvChainPtReader delta_index(int setter);
    /** pointer to previous element */
    public native @Cast("schar*") BytePointer prev_elem(); public native CvChainPtReader prev_elem(BytePointer setter);
    public native @Cast("char") byte code(); public native CvChainPtReader code(byte setter);
    public native @ByRef CvPoint pt(); public native CvChainPtReader pt(CvPoint setter);
    public native @Cast("schar") byte deltas(int i, int j); public native CvChainPtReader deltas(int i, int j, byte setter);
    @MemberGetter public native @Cast("schar(* /*[8]*/ )[2]") BytePointer deltas();
}
