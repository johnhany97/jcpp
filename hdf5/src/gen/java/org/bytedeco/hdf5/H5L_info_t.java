// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.hdf5.global.hdf5.*;
  /* Link ids at or above this value are "user-defined" link types. */

/* Information struct for link (for H5Lget_info/H5Lget_info_by_idx) */
@Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class H5L_info_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public H5L_info_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public H5L_info_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public H5L_info_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public H5L_info_t position(long position) {
        return (H5L_info_t)super.position(position);
    }

    public native @Cast("H5L_type_t") int type(); public native H5L_info_t type(int setter);           /* Type of link                   */
    public native @Cast("hbool_t") boolean corder_valid(); public native H5L_info_t corder_valid(boolean setter);   /* Indicate if creation order is valid */
    public native @Cast("int64_t") long corder(); public native H5L_info_t corder(long setter);         /* Creation order                 */
    public native @Cast("H5T_cset_t") int cset(); public native H5L_info_t cset(int setter);           /* Character set of link name     */
        @Name("u.address") public native @Cast("haddr_t") long u_address(); public native H5L_info_t u_address(long setter);        /* Address hard link points to    */
        @Name("u.val_size") public native @Cast("size_t") long u_val_size(); public native H5L_info_t u_val_size(long setter);       /* Size of a soft link or UD link value */
}
