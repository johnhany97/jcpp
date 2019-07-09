// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.hdf5.global.hdf5.*;


/** \class VarLenType
    \brief VarLenType is a derivative of a DataType and operates on HDF5
    Variable-length Datatypes.
*/
//  Inheritance: DataType -> H5Object -> H5Location -> IdComponent
@Namespace("H5") @Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class VarLenType extends DataType {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public VarLenType(Pointer p) { super(p); }

        // Constructor that creates a variable-length datatype based
        // on the specified base type.
        public VarLenType(@Const @ByRef DataType base_type) { super((Pointer)null); allocate(base_type); }
        private native void allocate(@Const @ByRef DataType base_type);

        // Deprecated - will be removed after 1.10.2

        // Returns an VarLenType object via DataType* by decoding the
        // binary object description of this type.
        public native DataType decode();

        /**\brief Returns this class name. */
        public native @StdString BytePointer fromClass();

        // Copy constructor: same as the original VarLenType.
        public VarLenType(@Const @ByRef VarLenType original) { super((Pointer)null); allocate(original); }
        private native void allocate(@Const @ByRef VarLenType original);

        // Constructor that takes an existing id
        public VarLenType(@Cast("const hid_t") long existing_id) { super((Pointer)null); allocate(existing_id); }
        private native void allocate(@Cast("const hid_t") long existing_id);

        // Constructors that open a variable-length datatype, given a location.
        public VarLenType(@Const @ByRef H5Location loc, @Cast("const char*") BytePointer name) { super((Pointer)null); allocate(loc, name); }
        private native void allocate(@Const @ByRef H5Location loc, @Cast("const char*") BytePointer name);
        public VarLenType(@Const @ByRef H5Location loc, String name) { super((Pointer)null); allocate(loc, name); }
        private native void allocate(@Const @ByRef H5Location loc, String name);

        // Noop destructor

        // Default constructor
        public VarLenType() { super((Pointer)null); allocate(); }
        private native void allocate();

}
