// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.libfreenect2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.libfreenect2.global.freenect2.*;


/**
 * Library context to find and open devices.
 *
 * You will first find existing devices by calling enumerateDevices().
 *
 * Then you can openDevice() and control the devices with returned Freenect2Device object.
 *
 * You may open devices with custom PacketPipeline.
 * After passing a PacketPipeline object to libfreenect2 do not use or free the object,
 * libfreenect2 will take care. If openDevice() fails the PacketPipeline object will get
 * deleted. A new PacketPipeline object has to be created each time a device is opened.
 */
@Namespace("libfreenect2") @NoOffset @Properties(inherit = org.bytedeco.libfreenect2.presets.freenect2.class)
public class Freenect2 extends Pointer {
    static { Loader.load(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Freenect2(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Freenect2 position(long position) {
        return (Freenect2)super.position(position);
    }

  /**
   * @param usb_context If the libusb context is provided,
   * Freenect2 will use it instead of creating one.
   */
  public Freenect2(Pointer usb_context/*=0*/) { super((Pointer)null); allocate(usb_context); }
  private native void allocate(Pointer usb_context/*=0*/);
  public Freenect2() { super((Pointer)null); allocate(); }
  private native void allocate();

  /** Must be called before doing anything else.
   * @return Number of devices, 0 if none
   */
  public native int enumerateDevices();

  /**
   * @param idx Device index
   * @return Device serial number, or empty if the index is invalid.
   */
  public native @StdString BytePointer getDeviceSerialNumber(int idx);

  /**
   * @return Device serial number, or empty if no device exists.
   */
  public native @StdString BytePointer getDefaultDeviceSerialNumber();

  /** Open device by index with default pipeline.
   * @param idx Index number. Index numbers are not determinstic during enumeration.
   * @return New device object, or NULL on failure
   */
  public native Freenect2Device openDevice(int idx);

  /** Open device by index.
   * @param idx Index number. Index numbers are not determinstic during enumeration.
   * @param factory New PacketPipeline instance. This is always automatically freed.
   * @return New device object, or NULL on failure
   */
  public native Freenect2Device openDevice(int idx, @Const PacketPipeline factory);

  /** Open device by serial number with default pipeline.
   * @param serial Serial number
   * @return New device object, or NULL on failure
   */
  public native Freenect2Device openDevice(@StdString BytePointer serial);
  public native Freenect2Device openDevice(@StdString String serial);

  /** Open device by serial number.
   * @param serial Serial number
   * @param factory New PacketPipeline instance. This is always automatically freed.
   * @return New device object, or NULL on failure
   */
  public native Freenect2Device openDevice(@StdString BytePointer serial, @Const PacketPipeline factory);
  public native Freenect2Device openDevice(@StdString String serial, @Const PacketPipeline factory);

  /** Open the first device with default pipeline.
   * @return New device object, or NULL on failure
   */
  public native Freenect2Device openDefaultDevice();

  /** Open the first device.
   * @param factory New PacketPipeline instance. This is always automatically freed.
   * @return New device object, or NULL on failure
   */
  public native Freenect2Device openDefaultDevice(@Const PacketPipeline factory);
}
