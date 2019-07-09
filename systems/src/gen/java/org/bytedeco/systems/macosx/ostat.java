// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.systems.macosx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.macosx.*;


// #if !defined(_POSIX_C_SOURCE) || defined(_DARWIN_C_SOURCE)
/*
 * XXX So deprecated, it would make your head spin
 *
 * The old stat structure.  In fact, this is not used by the kernel at all,
 * and should not be used by user space, and should be removed from this
 * header file entirely (along with the unused cvtstat() prototype in
 * vnode_internal.h).
 */
@Properties(inherit = org.bytedeco.systems.presets.macosx.class)
public class ostat extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ostat() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ostat(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ostat(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ostat position(long position) {
        return (ostat)super.position(position);
    }

	public native @Cast("__uint16_t") short st_dev(); public native ostat st_dev(short setter);		/* inode's device */
	public native @Cast("ino_t") long st_ino(); public native ostat st_ino(long setter);		/* inode's number */
	public native @Cast("mode_t") short st_mode(); public native ostat st_mode(short setter);	/* inode protection mode */
	public native @Cast("nlink_t") short st_nlink(); public native ostat st_nlink(short setter);	/* number of hard links */
	public native @Cast("__uint16_t") short st_uid(); public native ostat st_uid(short setter);		/* user ID of the file's owner */
	public native @Cast("__uint16_t") short st_gid(); public native ostat st_gid(short setter);		/* group ID of the file's group */
	public native @Cast("__uint16_t") short st_rdev(); public native ostat st_rdev(short setter);	/* device type */
	public native @Cast("__int32_t") int st_size(); public native ostat st_size(int setter);	/* file size, in bytes */
	public native @ByRef timespec st_atimespec(); public native ostat st_atimespec(timespec setter);	/* time of last access */
	public native @ByRef timespec st_mtimespec(); public native ostat st_mtimespec(timespec setter);	/* time of last data modification */
	public native @ByRef timespec st_ctimespec(); public native ostat st_ctimespec(timespec setter);	/* time of last file status change */
	public native @Cast("__int32_t") int st_blksize(); public native ostat st_blksize(int setter);	/* optimal blocksize for I/O */
	public native @Cast("__int32_t") int st_blocks(); public native ostat st_blocks(int setter);	/* blocks allocated for file */
	public native @Cast("__uint32_t") int st_flags(); public native ostat st_flags(int setter);	/* user defined flags for file */
	public native @Cast("__uint32_t") int st_gen(); public native ostat st_gen(int setter);		/* file generation number */
}
