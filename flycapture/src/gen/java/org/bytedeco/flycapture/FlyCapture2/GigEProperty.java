// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.flycapture.global.FlyCapture2.*;


    /** A GigE property. */
    @Namespace("FlyCapture2") @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2.class)
public class GigEProperty extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public GigEProperty() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public GigEProperty(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public GigEProperty(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public GigEProperty position(long position) {
            return (GigEProperty)super.position(position);
        }
    
        /** The type of property. */
        public native @Cast("FlyCapture2::GigEPropertyType") int propType(); public native GigEProperty propType(int setter);
        /**
         * Whether the property is readable. If this is false, then
         * no other value in this structure is valid.
         */
        public native @Cast("bool") boolean isReadable(); public native GigEProperty isReadable(boolean setter);
        /** Whether the property is writable. */
        public native @Cast("bool") boolean isWritable(); public native GigEProperty isWritable(boolean setter);
        /** Minimum value. */
        public native @Cast("unsigned int") int min(); public native GigEProperty min(int setter);
        /** Maximum value. */
        public native @Cast("unsigned int") int max(); public native GigEProperty max(int setter);
        /** Current value. */
        public native @Cast("unsigned int") int value(); public native GigEProperty value(int setter);
    }
