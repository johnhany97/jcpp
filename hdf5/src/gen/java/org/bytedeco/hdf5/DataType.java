// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.hdf5.global.hdf5.*;


/** \class DataType
    \brief Class DataType provides generic operations on HDF5 datatypes.
    <p>
    DataType inherits from H5Object because a named datatype is an HDF5
    object and is a base class of ArrayType, AtomType, CompType, EnumType,
    and VarLenType.
*/
//  Inheritance: DataType -> H5Object -> H5Location -> IdComponent
@Namespace("H5") @NoOffset @Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class DataType extends H5Object {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DataType(Pointer p) { super(p); }

        // Creates a datatype given its class and size
        public DataType(@Cast("const H5T_class_t") int type_class, @Cast("size_t") long size) { super((Pointer)null); allocate(type_class, size); }
        private native void allocate(@Cast("const H5T_class_t") int type_class, @Cast("size_t") long size);

        // Copy constructor - same as the original DataType.
        public DataType(@Const @ByRef DataType original) { super((Pointer)null); allocate(original); }
        private native void allocate(@Const @ByRef DataType original);

        // Creates a copy of a predefined type
        public DataType(@Const @ByRef PredType pred_type) { super((Pointer)null); allocate(pred_type); }
        private native void allocate(@Const @ByRef PredType pred_type);

        // Constructors to open a generic named datatype at a given location.
        public DataType(@Const @ByRef H5Location loc, @Cast("const char*") BytePointer name) { super((Pointer)null); allocate(loc, name); }
        private native void allocate(@Const @ByRef H5Location loc, @Cast("const char*") BytePointer name);
        public DataType(@Const @ByRef H5Location loc, String name) { super((Pointer)null); allocate(loc, name); }
        private native void allocate(@Const @ByRef H5Location loc, String name);

        // Creates a datatype by way of dereference.
        public DataType(@Const @ByRef H5Location loc, @Const Pointer ref, @Cast("H5R_type_t") int ref_type/*=H5R_OBJECT*/, @Const @ByRef(nullValue = "H5::PropList::DEFAULT") PropList plist) { super((Pointer)null); allocate(loc, ref, ref_type, plist); }
        private native void allocate(@Const @ByRef H5Location loc, @Const Pointer ref, @Cast("H5R_type_t") int ref_type/*=H5R_OBJECT*/, @Const @ByRef(nullValue = "H5::PropList::DEFAULT") PropList plist);
        public DataType(@Const @ByRef H5Location loc, @Const Pointer ref) { super((Pointer)null); allocate(loc, ref); }
        private native void allocate(@Const @ByRef H5Location loc, @Const Pointer ref);
//        DataType(const Attribute& attr, const void* ref, H5R_type_t ref_type = H5R_OBJECT, const PropList& plist = PropList::DEFAULT);

        // Closes this datatype.
        public native @Name("close") void _close();

        // Copies an existing datatype to this datatype object.
        public native void copy(@Const @ByRef DataType like_type);

        // Copies the datatype of dset to this datatype object.
        public native void copy(@Const @ByRef DataSet dset);

        // Returns a DataType instance by decoding the binary object
        // description of this datatype.
        public native DataType decode();

        // Creates a binary object description of this datatype.
        public native void encode();

        // Returns the datatype class identifier.
        public native @Cast("H5T_class_t") @Name("getClass") int _getClass();

        // Commits a transient datatype to a file; this datatype becomes
        // a named datatype which can be accessed from the location.
        public native void commit(@Const @ByRef H5Location loc, @Cast("const char*") BytePointer name);
        public native void commit(@Const @ByRef H5Location loc, String name);

        // These two overloaded functions are kept for backward compatibility
        // only; they missed the const - removed from 1.8.18 and 1.10.1
        //void commit(H5Location& loc, const char* name);
        //void commit(H5Location& loc, const H5std_string& name);

        // Determines whether this datatype is a named datatype or
        // a transient datatype.
        public native @Cast("bool") boolean committed();

        // Finds a conversion function that can handle the conversion
        // this datatype to the given datatype, dest.
        public native H5T_conv_t find(@Const @ByRef DataType dest, @Cast("H5T_cdata_t**") PointerPointer pcdata);
        public native H5T_conv_t find(@Const @ByRef DataType dest, @ByPtrPtr H5T_cdata_t pcdata);

        // Converts data from between specified datatypes.
        public native void convert(@Const @ByRef DataType dest, @Cast("size_t") long nelmts, Pointer buf, Pointer background, @Const @ByRef(nullValue = "H5::PropList::DEFAULT") PropList plist);
        public native void convert(@Const @ByRef DataType dest, @Cast("size_t") long nelmts, Pointer buf, Pointer background);

        // Assignment operator
        public native @ByRef @Name("operator =") DataType put(@Const @ByRef DataType rhs);

        // Determines whether two datatypes are the same.
        public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef DataType compared_type);

        // Determines whether two datatypes are not the same.
        public native @Cast("bool") @Name("operator !=") boolean notEquals(@Const @ByRef DataType compared_type);

        // Locks a datatype.
        public native void lock();

        // Returns the size of a datatype.
        public native @Cast("size_t") long getSize();

        // Returns the base datatype from which a datatype is derived.
        // Note: not quite right for specific types yet???
        public native @ByVal DataType getSuper();

        // Registers a conversion function.
        public native void registerFunc(@Cast("H5T_pers_t") int pers, @Cast("const char*") BytePointer name, @Const @ByRef DataType dest, H5T_conv_t func);
        public native void registerFunc(@Cast("H5T_pers_t") int pers, String name, @Const @ByRef DataType dest, H5T_conv_t func);

        // Removes a conversion function from all conversion paths.
        public native void unregister(@Cast("H5T_pers_t") int pers, @Cast("const char*") BytePointer name, @Const @ByRef DataType dest, H5T_conv_t func);
        public native void unregister(@Cast("H5T_pers_t") int pers, String name, @Const @ByRef DataType dest, H5T_conv_t func);

        // Tags an opaque datatype.
        public native void setTag(@Cast("const char*") BytePointer tag);
        public native void setTag(String tag);

        // Gets the tag associated with an opaque datatype.
        public native @StdString BytePointer getTag();

        // Checks whether this datatype contains (or is) a certain type class.
        public native @Cast("bool") boolean detectClass(@Cast("H5T_class_t") int cls);
        public static native @Cast("bool") boolean detectClass(@Const @ByRef PredType pred_type, @Cast("H5T_class_t") int cls);

        // Checks whether this datatype is a variable-length string.
        public native @Cast("bool") boolean isVariableStr();

        // Returns a copy of the creation property list of a datatype.
        public native @ByVal PropList getCreatePlist();

        /**\brief Returns this class name. */
        public native @StdString BytePointer fromClass();

        // Creates a copy of an existing DataType using its id
        public DataType(@Cast("const hid_t") long type_id) { super((Pointer)null); allocate(type_id); }
        private native void allocate(@Cast("const hid_t") long type_id);

        // Default constructor
        public DataType() { super((Pointer)null); allocate(); }
        private native void allocate();

        // Determines whether this datatype has a binary object description.
        public native @Cast("bool") boolean hasBinaryDesc();

        // Gets the datatype id.
        public native @Cast("hid_t") long getId();

        // Destructor: properly terminates access to this datatype.

}
