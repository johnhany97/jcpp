// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.librealsense;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.librealsense.global.RealSense.*;


    @Namespace("rs") @NoOffset @Properties(inherit = org.bytedeco.librealsense.presets.RealSense.class)
public class frame extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public frame(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public frame(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public frame position(long position) {
            return (frame)super.position(position);
        }
    
        public frame() { super((Pointer)null); allocate(); }
        private native void allocate();
        public frame(@Const @ByRef frame other) { super((Pointer)null); allocate(other); }
        private native void allocate(@Const @ByRef frame other);
        public frame(rs_device device, rs_frame_ref frame_ref) { super((Pointer)null); allocate(device, frame_ref); }
        private native void allocate(rs_device device, rs_frame_ref frame_ref);
        public native @ByRef @Name("operator =") frame put(@ByVal frame other);
        public native void swap(@ByRef frame other);

        /** retrieve the time at which the frame was captured
         *  @return            the timestamp of the frame, in milliseconds since the device was started */
        public native double get_timestamp();

        /** retrieve the timestamp domain 
         *  @return            timestamp domain (clock name) for timestamp values */
        public native @Cast("rs::timestamp_domain") int get_frame_timestamp_domain();

        /** retrieve the current value of a single frame_metadata
         *  @param frame_metadata [in]  the frame_metadata whose value should be retrieved
         *  @return            the value of the frame_metadata */
        public native double get_frame_metadata(@Cast("rs_frame_metadata") int frame_metadata);

        /** determine if the device allows a specific metadata to be queried
         *  @param frame_metadata [in]  the frame_metadata to check for support
         *  @return            true if the frame_metadata can be queried */
        public native @Cast("bool") boolean supports_frame_metadata(@Cast("rs_frame_metadata") int frame_metadata);

        // retrieve the frame number
        // \return            the frame number
        public native @Cast("unsigned long long") long get_frame_number();

        // retrieve the frame content
        // \return   frame content
        public native @Const Pointer get_data();

        // returns image width in pixels
        public native int get_width(); 

        // returns image height in pixels
        public native int get_height();

        // returns the configured framerate
        public native int get_framerate();

        // retrive frame stride, meaning the actual line width in memory in bytes (not the logical image width)
        public native int get_stride();

        /** retrieve bits per pixel
         *  @return            number of bits per one pixel */
        public native int get_bpp();

        // retrieve the frame format
        // \return    frame format
        public native @Cast("rs::format") int get_format();

        // retrieve the frame stream type
        // \return    frame stream type
        public native @Cast("rs::stream") int get_stream_type();
    }
