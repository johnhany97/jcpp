// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avutil;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ffmpeg.global.avutil.*;


@Properties(inherit = org.bytedeco.ffmpeg.presets.avutil.class)
public class AVMotionVector extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVMotionVector() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVMotionVector(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVMotionVector(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVMotionVector position(long position) {
        return (AVMotionVector)super.position(position);
    }

    /**
     * Where the current macroblock comes from; negative value when it comes
     * from the past, positive value when it comes from the future.
     * XXX: set exact relative ref frame reference instead of a +/- 1 "direction".
     */
    public native int source(); public native AVMotionVector source(int setter);
    /**
     * Width and height of the block.
     */
    public native @Cast("uint8_t") byte w(); public native AVMotionVector w(byte setter);
    public native @Cast("uint8_t") byte h(); public native AVMotionVector h(byte setter);
    /**
     * Absolute source position. Can be outside the frame area.
     */
    public native short src_x(); public native AVMotionVector src_x(short setter);
    public native short src_y(); public native AVMotionVector src_y(short setter);
    /**
     * Absolute destination position. Can be outside the frame area.
     */
    public native short dst_x(); public native AVMotionVector dst_x(short setter);
    public native short dst_y(); public native AVMotionVector dst_y(short setter);
    /**
     * Extra flag information.
     * Currently unused.
     */
    public native @Cast("uint64_t") long flags(); public native AVMotionVector flags(long setter);
    /**
     * Motion vector
     * src_x = dst_x + motion_x / motion_scale
     * src_y = dst_y + motion_y / motion_scale
     */
    public native int motion_x(); public native AVMotionVector motion_x(int setter);
    public native int motion_y(); public native AVMotionVector motion_y(int setter);
    public native @Cast("uint16_t") short motion_scale(); public native AVMotionVector motion_scale(short setter);
}
