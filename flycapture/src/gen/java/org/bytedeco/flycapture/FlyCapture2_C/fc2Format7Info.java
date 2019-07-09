// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2_C;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.flycapture.FlyCapture2.*;
import static org.bytedeco.flycapture.global.FlyCapture2.*;

import static org.bytedeco.flycapture.global.FlyCapture2_C.*;


    /** Format 7 information for a single mode. */
    @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2_C.class)
public class fc2Format7Info extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public fc2Format7Info() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public fc2Format7Info(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public fc2Format7Info(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public fc2Format7Info position(long position) {
            return (fc2Format7Info)super.position(position);
        }
    
        /** Format 7 mode. */
        public native @Cast("fc2Mode") int mode(); public native fc2Format7Info mode(int setter);

        /** Maximum image width. */
        public native @Cast("unsigned int") int maxWidth(); public native fc2Format7Info maxWidth(int setter);
        /** Maximum image height. */
        public native @Cast("unsigned int") int maxHeight(); public native fc2Format7Info maxHeight(int setter);
        /** Horizontal step size for the offset. */
        public native @Cast("unsigned int") int offsetHStepSize(); public native fc2Format7Info offsetHStepSize(int setter);
        /** Vertical step size for the offset. */
        public native @Cast("unsigned int") int offsetVStepSize(); public native fc2Format7Info offsetVStepSize(int setter);
        /** Horizontal step size for the image. */
        public native @Cast("unsigned int") int imageHStepSize(); public native fc2Format7Info imageHStepSize(int setter);
        /** Vertical step size for the image. */
        public native @Cast("unsigned int") int imageVStepSize(); public native fc2Format7Info imageVStepSize(int setter);
        /** Supported pixel formats in a bit field. */
        public native @Cast("unsigned int") int pixelFormatBitField(); public native fc2Format7Info pixelFormatBitField(int setter);
        /** Vendor unique pixel formats in a bit field. */
        public native @Cast("unsigned int") int vendorPixelFormatBitField(); public native fc2Format7Info vendorPixelFormatBitField(int setter);
        /** Current packet size in bytes. */
        public native @Cast("unsigned int") int packetSize(); public native fc2Format7Info packetSize(int setter);
        /** Minimum packet size in bytes for current mode. */
        public native @Cast("unsigned int") int minPacketSize(); public native fc2Format7Info minPacketSize(int setter);
        /** Maximum packet size in bytes for current mode. */
        public native @Cast("unsigned int") int maxPacketSize(); public native fc2Format7Info maxPacketSize(int setter);
        /** Current packet size as a percentage of maximum packet size. */
        public native float percentage(); public native fc2Format7Info percentage(float setter);
        /** Reserved for future use. */
        public native @Cast("unsigned int") int reserved(int i); public native fc2Format7Info reserved(int i, int setter);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();

    }
