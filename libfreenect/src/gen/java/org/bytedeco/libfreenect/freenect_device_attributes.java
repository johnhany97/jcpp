// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.libfreenect;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.libfreenect.global.freenect.*;


/** A struct used in enumeration to give access to serial numbers, so you can
 *  open a particular device by serial rather than depending on index.  This
 *  is most useful if you have more than one Kinect. */
@Properties(inherit = org.bytedeco.libfreenect.presets.freenect.class)
public class freenect_device_attributes extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public freenect_device_attributes() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public freenect_device_attributes(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public freenect_device_attributes(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public freenect_device_attributes position(long position) {
        return (freenect_device_attributes)super.position(position);
    }

	public native freenect_device_attributes next(); public native freenect_device_attributes next(freenect_device_attributes setter); // Next device in the linked list
	public native @Cast("const char*") BytePointer camera_serial(); public native freenect_device_attributes camera_serial(BytePointer setter);               // Serial number of camera or audio subdevice
}
