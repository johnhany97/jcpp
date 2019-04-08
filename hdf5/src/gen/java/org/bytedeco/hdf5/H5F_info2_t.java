// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.hdf5.global.hdf5.*;


/* Current "global" information about file */
@Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class H5F_info2_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public H5F_info2_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public H5F_info2_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public H5F_info2_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public H5F_info2_t position(long position) {
        return (H5F_info2_t)super.position(position);
    }

	@Name("super.version") public native @Cast("unsigned") int _super_version(); public native H5F_info2_t _super_version(int setter);	/* Superblock version # */
	@Name("super.super_size") public native @Cast("hsize_t") long _super_super_size(); public native H5F_info2_t _super_super_size(long setter);	/* Superblock size */
	@Name("super.super_ext_size") public native @Cast("hsize_t") long _super_super_ext_size(); public native H5F_info2_t _super_super_ext_size(long setter);	/* Superblock extension size */
	@Name("free.version") public native @Cast("unsigned") int free_version(); public native H5F_info2_t free_version(int setter);	/* Version # of file free space management */
	@Name("free.meta_size") public native @Cast("hsize_t") long free_meta_size(); public native H5F_info2_t free_meta_size(long setter);	/* Free space manager metadata size */
	@Name("free.tot_space") public native @Cast("hsize_t") long free_tot_space(); public native H5F_info2_t free_tot_space(long setter);	/* Amount of free space in the file */
	@Name("sohm.version") public native @Cast("unsigned") int sohm_version(); public native H5F_info2_t sohm_version(int setter);	/* Version # of shared object header info */
	@Name("sohm.hdr_size") public native @Cast("hsize_t") long sohm_hdr_size(); public native H5F_info2_t sohm_hdr_size(long setter);       /* Shared object header message header size */
	@Name("sohm.msgs_info") public native @ByRef H5_ih_info_t sohm_msgs_info(); public native H5F_info2_t sohm_msgs_info(H5_ih_info_t setter);      /* Shared object header message index & heap size */
}
