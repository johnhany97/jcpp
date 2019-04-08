// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.hdf5.global.hdf5.*;


/* Exception handler.  If an exception like overflow happenes during conversion,
 * this function is called if it's registered through H5Pset_type_conv_cb.
 */
@Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class H5T_conv_except_func_t extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    H5T_conv_except_func_t(Pointer p) { super(p); }
    protected H5T_conv_except_func_t() { allocate(); }
    private native void allocate();
    public native @Cast("H5T_conv_ret_t") int call(@Cast("H5T_conv_except_t") int except_type,
    @Cast("hid_t") long src_id, @Cast("hid_t") long dst_id, Pointer src_buf, Pointer dst_buf, Pointer user_data);
}
