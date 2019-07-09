// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.hdf5.global.hdf5.*;


/** \class H5File
    \brief Class H5File represents an HDF5 file and inherits from class Group
    as file is a root group.
*/
//  Inheritance: Group -> CommonFG/H5Object -> H5Location -> IdComponent
@Namespace("H5") @NoOffset @Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class H5File extends Group {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public H5File(Pointer p) { super(p); }

        // Creates or opens an HDF5 file.
        public H5File(@Cast("const char*") BytePointer name, @Cast("unsigned int") int flags,
                   @Const @ByRef(nullValue = "H5::FileCreatPropList::DEFAULT") FileCreatPropList create_plist,
                   @Const @ByRef(nullValue = "H5::FileAccPropList::DEFAULT") FileAccPropList access_plist) { super((Pointer)null); allocate(name, flags, create_plist, access_plist); }
        private native void allocate(@Cast("const char*") BytePointer name, @Cast("unsigned int") int flags,
                   @Const @ByRef(nullValue = "H5::FileCreatPropList::DEFAULT") FileCreatPropList create_plist,
                   @Const @ByRef(nullValue = "H5::FileAccPropList::DEFAULT") FileAccPropList access_plist);
        public H5File(@Cast("const char*") BytePointer name, @Cast("unsigned int") int flags) { super((Pointer)null); allocate(name, flags); }
        private native void allocate(@Cast("const char*") BytePointer name, @Cast("unsigned int") int flags);
        public H5File(String name, @Cast("unsigned int") int flags,
                   @Const @ByRef(nullValue = "H5::FileCreatPropList::DEFAULT") FileCreatPropList create_plist,
                   @Const @ByRef(nullValue = "H5::FileAccPropList::DEFAULT") FileAccPropList access_plist) { super((Pointer)null); allocate(name, flags, create_plist, access_plist); }
        private native void allocate(String name, @Cast("unsigned int") int flags,
                   @Const @ByRef(nullValue = "H5::FileCreatPropList::DEFAULT") FileCreatPropList create_plist,
                   @Const @ByRef(nullValue = "H5::FileAccPropList::DEFAULT") FileAccPropList access_plist);
        public H5File(String name, @Cast("unsigned int") int flags) { super((Pointer)null); allocate(name, flags); }
        private native void allocate(String name, @Cast("unsigned int") int flags);

        // Open the file
        public native void openFile(@StdString BytePointer name, @Cast("unsigned int") int flags,
                    @Const @ByRef(nullValue = "H5::FileAccPropList::DEFAULT") FileAccPropList access_plist);
        public native void openFile(@StdString BytePointer name, @Cast("unsigned int") int flags);
        public native void openFile(@StdString String name, @Cast("unsigned int") int flags,
                    @Const @ByRef(nullValue = "H5::FileAccPropList::DEFAULT") FileAccPropList access_plist);
        public native void openFile(@StdString String name, @Cast("unsigned int") int flags);

        // Close this file.
        public native @Name("close") void _close();

        // Gets a copy of the access property list of this file.
        public native @ByVal FileAccPropList getAccessPlist();

        // Gets a copy of the creation property list of this file.
        public native @ByVal FileCreatPropList getCreatePlist();

        // Gets general information about this file.
        public native void getFileInfo(@ByRef H5F_info2_t file_info);

        // Returns the amount of free space in the file.
        public native @Cast("hssize_t") long getFreeSpace();

        // Returns the number of opened object IDs (files, datasets, groups
        // and datatypes) in the same file.
        public native @Cast("ssize_t") long getObjCount(@Cast("unsigned") int types/*=H5F_OBJ_ALL*/);
        public native @Cast("ssize_t") long getObjCount();

        // Retrieves a list of opened object IDs (files, datasets, groups
        // and datatypes) in the same file.
        public native void getObjIDs(@Cast("unsigned") int types, @Cast("size_t") long max_objs, @Cast("hid_t*") LongPointer oid_list);
        public native void getObjIDs(@Cast("unsigned") int types, @Cast("size_t") long max_objs, @Cast("hid_t*") LongBuffer oid_list);
        public native void getObjIDs(@Cast("unsigned") int types, @Cast("size_t") long max_objs, @Cast("hid_t*") long[] oid_list);

        // Returns the pointer to the file handle of the low-level file driver.
        public native void getVFDHandle(@Cast("void**") PointerPointer file_handle);
        public native void getVFDHandle(@Cast("void**") @ByPtrPtr Pointer file_handle);
        public native void getVFDHandle(@Const @ByRef FileAccPropList fapl, @Cast("void**") PointerPointer file_handle);
        public native void getVFDHandle(@Const @ByRef FileAccPropList fapl, @Cast("void**") @ByPtrPtr Pointer file_handle);
        //void getVFDHandle(FileAccPropList& fapl, void **file_handle) const; // removed from 1.8.18 and 1.10.1

        // Returns the file size of the HDF5 file.
        public native @Cast("hsize_t") long getFileSize();

        // Determines if a file, specified by its name, is in HDF5 format
        public static native @Cast("bool") boolean isHdf5(@Cast("const char*") BytePointer name);
        public static native @Cast("bool") boolean isHdf5(String name);

        // Reopens this file.
        public native void reOpen();  // added for better name

// #ifndef DOXYGEN_SHOULD_SKIP_THIS
        public native void reopen();  // obsolete in favor of reOpen()

        // Creates an H5File using an existing file id.  Not recommended
        // in applications.
        public H5File(@Cast("hid_t") long existing_id) { super((Pointer)null); allocate(existing_id); }
        private native void allocate(@Cast("hid_t") long existing_id);

// #endif // DOXYGEN_SHOULD_SKIP_THIS

        /**\brief Returns this class name. */
        public native @StdString BytePointer fromClass();

        // Throw file exception.
        public native void throwException(@StdString BytePointer func_name, @StdString BytePointer msg);
        public native void throwException(@StdString String func_name, @StdString String msg);

        // For CommonFG to get the file id.
        public native @Cast("hid_t") long getLocId();

        // Default constructor
        public H5File() { super((Pointer)null); allocate(); }
        private native void allocate();

        // Copy constructor: same as the original H5File.
        public H5File(@Const @ByRef H5File original) { super((Pointer)null); allocate(original); }
        private native void allocate(@Const @ByRef H5File original);

        // Gets the HDF5 file id.
        public native @Cast("hid_t") long getId();

        // H5File destructor.

}
