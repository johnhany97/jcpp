// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2_C;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.flycapture.FlyCapture2.*;
import static org.bytedeco.flycapture.global.FlyCapture2.*;

import static org.bytedeco.flycapture.global.FlyCapture2_C.*;


    /** MAC address. */
    @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2_C.class)
public class fc2MACAddress extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public fc2MACAddress() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public fc2MACAddress(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public fc2MACAddress(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public fc2MACAddress position(long position) {
            return (fc2MACAddress)super.position(position);
        }
    
        public native @Cast("unsigned char") byte octets(int i); public native fc2MACAddress octets(int i, byte setter);
        @MemberGetter public native @Cast("unsigned char*") BytePointer octets();
    }
