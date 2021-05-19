// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.depthai;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.depthai.global.depthai.*;


@Namespace("dai") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class RawSpatialImgDetections extends RawBuffer {
    static { Loader.load(); }
    /** Default native constructor. */
    public RawSpatialImgDetections() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public RawSpatialImgDetections(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RawSpatialImgDetections(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public RawSpatialImgDetections position(long position) {
        return (RawSpatialImgDetections)super.position(position);
    }
    @Override public RawSpatialImgDetections getPointer(long i) {
        return new RawSpatialImgDetections((Pointer)this).offsetAddress(i);
    }

    public native @StdVector SpatialImgDetection detections(); public native RawSpatialImgDetections detections(SpatialImgDetection setter);

    public native void serialize(@Cast("std::uint8_t*") @StdVector BytePointer metadata, @ByRef @Cast("dai::DatatypeEnum*") IntPointer datatype);
    public native void serialize(@Cast("std::uint8_t*") @StdVector ByteBuffer metadata, @ByRef @Cast("dai::DatatypeEnum*") IntBuffer datatype);
    public native void serialize(@Cast("std::uint8_t*") @StdVector byte[] metadata, @ByRef @Cast("dai::DatatypeEnum*") int[] datatype);
}
